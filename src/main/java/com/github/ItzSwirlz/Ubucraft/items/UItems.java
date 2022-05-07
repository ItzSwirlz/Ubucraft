package com.github.ItzSwirlz.Ubucraft.items;

import com.github.ItzSwirlz.Ubucraft.UTiers;
import com.github.ItzSwirlz.Ubucraft.Ubucraft;

import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class UItems {

	// Create a Forge "DeferredRegister". This variable will contain ALL the items.
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Ubucraft.MODID);

	// Dyes
	public static final RegistryObject<Item> UBUNTU_DYE = ITEMS.register("ubuntu_dye", () -> new Item((new Item.Properties()).tab(CreativeModeTab.TAB_MATERIALS)));
	
	// Ingots and Nuggets
	public static final RegistryObject<Item> UBUNTU_INGOT = ITEMS.register("ubuntu_ingot", () -> new Item((new Item.Properties()).tab(CreativeModeTab.TAB_MATERIALS)));
	public static final RegistryObject<Item> UBUNTU_NUGGET = ITEMS.register("ubuntu_nugget", () -> new Item((new Item.Properties()).tab(CreativeModeTab.TAB_MATERIALS)));
	
	/* --------- */
	//   Tools   //
	/* --------- */

	// Axes
	public static final RegistryObject<Item> UBUNTU_AXE = ITEMS.register("ubuntu_axe", () -> new AxeItem(UTiers.UBUNTU, 5.0F, -3.0F, (new Item.Properties()).tab(CreativeModeTab.TAB_TOOLS)));

	// Hoes
	public static final RegistryObject<Item> UBUNTU_HOE = ITEMS.register("ubuntu_hoe", () -> new HoeItem(UTiers.UBUNTU, -4, 0.0F, (new Item.Properties()).tab(CreativeModeTab.TAB_TOOLS)));

	// Pickaxes
	public static final RegistryObject<Item> UBUNTU_PICKAXE = ITEMS.register("ubuntu_pickaxe", () -> new PickaxeItem(UTiers.UBUNTU, 1, -2.8F, (new Item.Properties()).tab(CreativeModeTab.TAB_TOOLS)));

	// Shovels
	public static final RegistryObject<Item> UBUNTU_SHOVEL = ITEMS.register("ubuntu_shovel", () -> new ShovelItem(UTiers.UBUNTU, 1.5F, -3.0F, (new Item.Properties()).tab(CreativeModeTab.TAB_TOOLS)));
	
	// Swords
	public static final RegistryObject<Item> UBUNTU_SWORD = ITEMS.register("ubuntu_sword", () -> new SwordItem(UTiers.UBUNTU, 3, -2.4F, (new Item.Properties()).tab(CreativeModeTab.TAB_TOOLS)));


	public static void registerUbucraftItems() {
		ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
	}
}