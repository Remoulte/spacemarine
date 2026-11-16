package com.spacemarine.item;

import com.spacemarine.SpaceMarineMod;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

public class MarineArmorMaterial implements ArmorMaterial {
    public static final MarineArmorMaterial INSTANCE = new MarineArmorMaterial();

    // per type: HELMET, CHESTPLATE, LEGGINGS, BOOTS
    private static final int[] BASE_DURABILITY = {11, 16, 15, 13};
    private static final int[] DEFENSE = {3, 8, 6, 3};
    private static final int DURABILITY_MULTIPLIER = 40;   // netherite is 37

    @Override public int getDurabilityForType(ArmorItem.Type type) { return BASE_DURABILITY[type.ordinal()] * DURABILITY_MULTIPLIER; }
    @Override public int getDefenseForType(ArmorItem.Type type) { return DEFENSE[type.ordinal()]; }
    @Override public int getEnchantmentValue() { return 15; }
    @Override public SoundEvent getEquipSound() { return SoundEvents.ARMOR_EQUIP_NETHERITE; }
    @Override public Ingredient getRepairIngredient() { return Ingredient.of(SpaceMarineMod.KERAMITE_INGOT.get()); }
    @Override public String getName() { return SpaceMarineMod.MODID + ":ultramarine"; }
    @Override public float getToughness() { return 3.0F; }
    @Override public float getKnockbackResistance() { return 0.1F; }
}
