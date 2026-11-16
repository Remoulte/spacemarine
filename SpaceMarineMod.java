package com.spacemarine;

import com.spacemarine.client.MarineArmorModel;
import com.spacemarine.item.MarineArmorItem;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.LivingEquipmentChangeEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@Mod(SpaceMarineMod.MODID)
public class SpaceMarineMod {
    public static final String MODID = "spacemarine";

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MODID);

    /** Keramite - heat-resistant ceramic-alloy ingot (made in a heated Create basin with a Mechanical Mixer). */
    public static final RegistryObject<Item> KERAMITE_INGOT =
            ITEMS.register("keramite_ingot", () -> new Item(new Item.Properties()));

    // Strength is split over the pieces: 1.0 + 2.0 + 1.25 + 0.75 = 5.0 attack damage for the full set.
    public static final RegistryObject<Item> HELMET = ITEMS.register("ultramarine_helmet",
            () -> new MarineArmorItem(ArmorItem.Type.HELMET, new Item.Properties(), 1.0D));
    public static final RegistryObject<Item> CHESTPLATE = ITEMS.register("ultramarine_chestplate",
            () -> new MarineArmorItem(ArmorItem.Type.CHESTPLATE, new Item.Properties(), 2.0D));
    public static final RegistryObject<Item> LEGGINGS = ITEMS.register("ultramarine_leggings",
            () -> new MarineArmorItem(ArmorItem.Type.LEGGINGS, new Item.Properties(), 1.25D));
    public static final RegistryObject<Item> BOOTS = ITEMS.register("ultramarine_boots",
            () -> new MarineArmorItem(ArmorItem.Type.BOOTS, new Item.Properties(), 0.75D));

    public static final RegistryObject<CreativeModeTab> TAB = TABS.register("space_marine",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup." + MODID))
                    .icon(() -> new ItemStack(HELMET.get()))
                    .displayItems((params, out) -> {
                        out.accept(KERAMITE_INGOT.get());
                        out.accept(HELMET.get());
                        out.accept(CHESTPLATE.get());
                        out.accept(LEGGINGS.get());
                        out.accept(BOOTS.get());
                    }).build());

    public SpaceMarineMod() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ITEMS.register(bus);
        TABS.register(bus);
        MinecraftForge.EVENT_BUS.register(this);
    }

    /** Take the night vision away again when the helmet is taken off. */
    @SubscribeEvent
    public void onEquipmentChange(LivingEquipmentChangeEvent event) {
        if (event.getSlot() != EquipmentSlot.HEAD) return;
        LivingEntity entity = event.getEntity();
        if (entity.level().isClientSide) return;
        if (event.getFrom().is(HELMET.get()) && !event.getTo().is(HELMET.get())) {
            MobEffectInstance inst = entity.getEffect(MobEffects.NIGHT_VISION);
            // only our effect: ambient, no particles, no icon
            if (inst != null && inst.isAmbient() && !inst.isVisible() && !inst.showIcon()) {
                entity.removeEffect(MobEffects.NIGHT_VISION);
            }
        }
    }

    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientEvents {
        @SubscribeEvent
        public static void registerLayers(EntityRenderersEvent.RegisterLayerDefinitions event) {
            LayerDefinition layer = MarineArmorModel.createBodyLayer();
            event.registerLayerDefinition(MarineArmorModel.LAYER, () -> layer);
        }
    }
}
