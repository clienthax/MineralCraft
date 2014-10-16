package com.owloctogons.mineralcraft.config;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import static com.owloctogons.mineralcraft.config.Blocks.platinumBlock;
import static com.owloctogons.mineralcraft.config.Blocks.ultimaBlock;
import static com.owloctogons.mineralcraft.config.Items.*;

public class Recipes {

	public static void registerRecipes() {
		//BLOCK RECIPES
		GameRegistry.addRecipe(new ItemStack(platinumBlock),
				"AAA",
				"AAA",
				"AAA",
				'A', platinumIngot
		);

		GameRegistry.addRecipe(new ItemStack(ultimaSword),
				"AAA",
				"ABA",
				"AAA",
				'A', ultimaIngot,
				'B', Items.iron_ingot
		);

		//TOOL/WEAPON RECIPES
		GameRegistry.addRecipe(new ItemStack(ultimaSword),
				" A ",
				" A ",
				" B ",
				'A', ultimaBlock,
				'B', Items.blaze_rod
		);

		GameRegistry.addRecipe(new ItemStack(platinumIngot),
				"AAA",
				"AAA",
				"AAA",
				'A', platinumShard
		);

		GameRegistry.addRecipe(new ItemStack(ultimaPick),
				"AAA",
				" B ",
				" B ",
				'A', ultimaIngot,
				'B', Items.blaze_rod
		);

		//ITEM RECIPES
		GameRegistry.addRecipe(new ItemStack(ultimaIngot),
				"AAA",
				"AAA",
				"AAA",
				'A', pheonixShard
		);

		GameRegistry.addRecipe(new ItemStack(fireDagger),
				"A",
				"A",
				"B",
				'A', pheonixShard,
				'B', Items.blaze_rod
		);

		GameRegistry.addRecipe(new ItemStack(ultimaBlock),
				"DDD",
				"CBC",
				"AAA",
				'A', platinumBlock,
				'B', Blocks.furnace,
				'C', platinumIngot,
				'D', platinumShard
		);

		GameRegistry.addRecipe(new ItemStack(ultimaBlock),
				"AAA",
				"AAA",
				"AAA",
				'A', ultimaIngot
		);

		GameRegistry.addRecipe(new ItemStack(platinumApple),
				"AAA",
				"ABA",
				"AAA",
				'A', platinumShard,
				'B', Items.apple
		);


		//EXTRA RECIPES
		GameRegistry.addRecipe(new ItemStack(Items.minecart),
				"   ",
				"   ",
				"ABA",
				'A',Items.iron_ingot,'B',Items.bucket
		);

		//ARMOR RECIPES
		GameRegistry.addRecipe(new ItemStack(stoneBoots),
				"   ",
				"A A",
				"A A",
				'A', Blocks.stone
		);

		GameRegistry.addRecipe(new ItemStack(stoneLeggings),
				"AAA",
				"A A",
				"A A",
				'A',
				Blocks.stone
		);

		GameRegistry.addRecipe(new ItemStack(stoneChestplate),
				"A A",
				"AAA",
				"AAA",
				'A', Blocks.stone
		);

		GameRegistry.addRecipe(new ItemStack(stoneHelmet),
				"AAA",
				"A A",
				"   ",
				'A', Blocks.stone
		);

	}

}
