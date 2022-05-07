package com.github.ItzSwirlz.Ubucraft;

import com.github.ItzSwirlz.Ubucraft.blocks.UBlocks;
import com.github.ItzSwirlz.Ubucraft.items.UItems;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

@Mod(Ubucraft.MODID)
public class Ubucraft
{
	
	public static final String MODID = "ubucraft";

    public Ubucraft()
    {
    	UBlocks.registerUbucraftBlocks();
    	UItems.registerUbucraftItems();
    	
    	// Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }
}
