package com.spacemarine.item;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.spacemarine.SpaceMarineMod;
import com.spacemarine.client.MarineArmorModel;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraftforge.client.extensions.common.IClientItemExtensions;

import java.util.UUID;
import java.util.function.Consumer;

public class MarineArmorItem extends ArmorItem {
    private static final UUID[] STRENGTH_UUID = {
            UUID.fromString("5b0e3f1a-1111-4a2b-9c10-0d5a7e000001"),
            UUID.fromString("5b0e3f1a-1111-4a2b-9c10-0d5a7e000002"),
            UUID.fromString("5b0e3f1a-1111-4a2b-9c10-0d5a7e000003"),
            UUID.fromString("5b0e3f1a-1111-4a2b-9c10-0d5a7e000004")};
    private static final UUID[] SPEED_UUID = {
            UUID.fromString("5b0e3f1a-2222-4a2b-9c10-0d5a7e000001"),
            UUID.fromString("5b0e3f1a-2222-4a2b-9c10-0d5a7e000002"),
            UUID.fromString("5b0e3f1a-2222-4a2b-9c10-0d5a7e000003"),
            UUID.fromString("5b0e3f1a-2222-4a2b-9c10-0d5a7e000004")};

    /** Speed penalty per piece (x4 = -15% in total, about the same as Slowness I). */
    private static final double SPEED_PENALTY_PER_PIECE = -0.0375D;

    private final Multimap<Attribute, AttributeModifier> modifiers;

    public MarineArmorItem(Type type, Properties props, double strength) {
        super(MarineArmorMaterial.INSTANCE, type, props);
        int i = type.ordinal();
        ImmutableMultimap.Builder<Attribute, AttributeModifier> b = ImmutableMultimap.builder();
        b.putAll(super.getDefaultAttributeModifiers(type.getSlot()));
        b.put(Attributes.ATTACK_DAMAGE, new AttributeModifier(STRENGTH_UUID[i], "Space Marine strength",
                strength, AttributeModifier.Operation.ADDITION));
        b.put(Attributes.MOVEMENT_SPEED, new AttributeModifier(SPEED_UUID[i], "Space Marine weight",
                SPEED_PENALTY_PER_PIECE, AttributeModifier.Operation.MULTIPLY_BASE));
        this.modifiers = b.build();
    }

    @Override
    public Multimap<Attribute, AttributeModifier> getDefaultAttributeModifiers(EquipmentSlot slot) {
        if (this.modifiers == null) return super.getDefaultAttributeModifiers(slot);
        return slot == this.getType().getSlot() ? this.modifiers : ImmutableMultimap.of();
    }

    /** Night vision comes from the helmet. */
    @Override
    public void onArmorTick(ItemStack stack, Level level, Player player) {
        if (this.getType() == Type.HELMET && !level.isClientSide && player.tickCount % 20 == 0) {
            MobEffectInstance cur = player.getEffect(MobEffects.NIGHT_VISION);
            if (cur == null || cur.getDuration() < 300) {
                player.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0, true, false, false));
            }
        }
    }

    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
        return SpaceMarineMod.MODID + ":textures/models/armor/ultramarine.png";
    }

    @Override
    public void initializeClient(Consumer<IClientItemExtensions> consumer) {
        consumer.accept(new IClientItemExtensions() {
            private MarineArmorModel model;

            @Override
            public HumanoidModel<?> getHumanoidArmorModel(LivingEntity entity, ItemStack stack,
                                                          EquipmentSlot slot, HumanoidModel<?> original) {
                if (model == null) {
                    model = new MarineArmorModel(
                            Minecraft.getInstance().getEntityModels().bakeLayer(MarineArmorModel.LAYER), slot);
                }
                return model;
            }
        });
    }
}
