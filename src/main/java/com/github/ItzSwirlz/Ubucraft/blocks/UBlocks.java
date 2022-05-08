package com.github.ItzSwirlz.Ubucraft.blocks;

import com.github.ItzSwirlz.Ubucraft.Ubucraft;
import com.github.ItzSwirlz.Ubucraft.items.UItems;

import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CandleBlock;
import net.minecraft.world.level.block.OreBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class UBlocks {


	// Create a Forge "DeferredRegister". This variable will contain ALL the blocks.
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Ubucraft.MODID);
	
	// Ores
	public static final RegistryObject<Block> UBUNTU_ORE = BLOCKS.register("ubuntu_ore", () -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE).strength(4.0F).requiresCorrectToolForDrops().strength(3.0F, 4.1F), UniformInt.of(4, 10)));
	public static final RegistryObject<Block> DEEPSLATE_UBUNTU_ORE = BLOCKS.register("deepslate_ubuntu_ore", () ->  new OreBlock(BlockBehaviour.Properties.copy(UBUNTU_ORE.get()).color(MaterialColor.DEEPSLATE).strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE)));

	/* ----------------------- */
	//   Dye-related Blocks    //
	/* ----------------------- */
	
	// Beds
	// Registry issues are causing the textures to not work. To avoid problems, leave this for now. (BlockEntityTypes)
	//public static final RegistryObject<Block> UBUNTU_BED = BLOCKS.register("ubuntu_bed", () -> new UBedBlock(15291424, BlockBehaviour.Properties.of(Material.WOOL).sound(SoundType.WOOD).strength(0.2F).noOcclusion()));

	// Candles
	public static final RegistryObject<Block> UBUNTU_CANDLE = BLOCKS.register("ubuntu_candle", () -> new CandleBlock(BlockBehaviour.Properties.of(Material.DECORATION).noOcclusion().strength(0.1F).sound(SoundType.CANDLE).lightLevel(CandleBlock.LIGHT_EMISSION)));

	public static void registerUbucraftBlocks() {
		BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
		
		// Block Items
		registerUbucraftBlockItem("ubuntu_ore", UBUNTU_ORE, CreativeModeTab.TAB_MATERIALS);
		registerUbucraftBlockItem("ubuntu_candle", UBUNTU_CANDLE, CreativeModeTab.TAB_DECORATIONS);
		
		// Irregular Block Registries
		//UItems.ITEMS.register("ubuntu_bed", () -> new BedItem(UBUNTU_BED.get(), (new Item.Properties()).stacksTo(1).tab(CreativeModeTab.TAB_DECORATIONS)));
	}
	
	public static void registerUbucraftBlockItem(String name, RegistryObject<Block> block, CreativeModeTab tab) {
		UItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}