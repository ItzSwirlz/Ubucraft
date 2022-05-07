package com.github.ItzSwirlz.Ubucraft;

import net.minecraftforge.common.ForgeTier;

public class UTiers {
	// Explanation
	// Level: 4 - the 4 as in '4.10'
	// Uses: 2004 - needs to be an int with a high enough number to be better than diamond and weaker than netherite - 2004 for release year
	// Speed: 10.0 - just like uses, needs balance, so the 10 in '4.10'
	// Damage: Stronger than Netherite for the sake of 4.10
	// Enchantment Value: 10 in the '4.10'
	// TODO: ATM you can't set Ingredient.of(UItems.UBUNTU_INGOT). This may cause issues when smelting back to the ingot
	public static final ForgeTier UBUNTU = new ForgeTier(4, 2004, 10.0F, 4.1F, 10, null, null);
}
