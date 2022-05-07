package com.github.ItzSwirlz.Ubucraft.blocks;

import com.github.ItzSwirlz.Ubucraft.Ubucraft;
import com.github.ItzSwirlz.Ubucraft.items.UItems;

import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.OreBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class UBlocks {


	// Create a Forge "DeferredRegister". This variable will contain ALL the blocks.
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Ubucraft.MODID);
	
	// Ores
	public static final RegistryObject<Block> UBUNTU_ORE = BLOCKS.register("ubuntu_ore", () -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3.0F, 4.1F), UniformInt.of(4, 10)));
	
	public static void registerUbucraftBlocks() {
		BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
		
		// Block Items
		registerUbucraftBlockItem("ubuntu_ore", UBUNTU_ORE, CreativeModeTab.TAB_MATERIALS);
	}
	
	public static void registerUbucraftBlockItem(String name, RegistryObject<Block> block, CreativeModeTab tab) {
		UItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
