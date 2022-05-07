package com.github.ItzSwirlz.Ubucraft;

import java.util.function.Supplier;

import com.github.ItzSwirlz.Ubucraft.items.UItems;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

/*
 * Forge comes with ForgeTier to deal with integration with
 * Minecraft Tiers for tools, but to my knowledge none exists for
 * Armor materials, so we have to do it ourselves.
 * 
 * This code is just a copy and paste of the 'ArmorMaterials' class.
 * Enjoy the missing variable names.
 */
public enum UArmorMaterials implements ArmorMaterial {
   UBUNTU("ubuntu", 34, new int[] {3, 6, 8, 3}, 10, SoundEvents.ARMOR_EQUIP_DIAMOND, 4.0F, 0.0F, () -> {
	   return Ingredient.of(UItems.UBUNTU_INGOT.get());
   });

   private static final int[] HEALTH_PER_SLOT = new int[]{13, 15, 16, 11};
   private final String name;
   private final int durabilityMultiplier;
   private final int[] slotProtections;
   private final int enchantmentValue;
   private final SoundEvent sound;
   private final float toughness;
   private final float knockbackResistance;
   private final LazyLoadedValue<Ingredient> repairIngredient;

   private UArmorMaterials(String p_40474_, int p_40475_, int[] p_40476_, int p_40477_, SoundEvent p_40478_, float p_40479_, float p_40480_, Supplier<Ingredient> p_40481_) {
      this.name = p_40474_;
      this.durabilityMultiplier = p_40475_;
      this.slotProtections = p_40476_;
      this.enchantmentValue = p_40477_;
      this.sound = p_40478_;
      this.toughness = p_40479_;
      this.knockbackResistance = p_40480_;
      this.repairIngredient = new LazyLoadedValue<>(p_40481_);
   }

   public int getDurabilityForSlot(EquipmentSlot p_40484_) {
      return HEALTH_PER_SLOT[p_40484_.getIndex()] * this.durabilityMultiplier;
   }

   public int getDefenseForSlot(EquipmentSlot p_40487_) {
      return this.slotProtections[p_40487_.getIndex()];
   }

   public int getEnchantmentValue() {
      return this.enchantmentValue;
   }

   public SoundEvent getEquipSound() {
      return this.sound;
   }

   public Ingredient getRepairIngredient() {
      return this.repairIngredient.get();
   }

   // OUR ONLY MAIN CHANGE: Our model textures are in our mod assets, not minecrafts
   public String getName() {
      return Ubucraft.MODID + ":" + this.name;
   }

   public float getToughness() {
      return this.toughness;
   }

   public float getKnockbackResistance() {
      return this.knockbackResistance;
   }
}