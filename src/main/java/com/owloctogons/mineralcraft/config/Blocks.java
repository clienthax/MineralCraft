package com.owloctogons.mineralcraft.config;

import com.owloctogons.mineralcraft.blocks.*;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

public class Blocks {

	//TILE ENTITY UNLOCALIZED NAMES
	public static Block platinumFurnace;

	//BLOCK UNLOCALIZED NAMES
	public static Block platinumBlock;
	public static Block platinumOre;
	public static Block pheonixShardOre;
	public static Block ultimaBlock;
	public static Block enderPheonixShardOre;

	public static void registerBlocks() {

		//REGISTRYS(TILE ENTITYS)

		//REGISTRYS(BLOCKS)
		enderPheonixShardOre = new EnderPheonixShardOre();
		GameRegistry.registerBlock(enderPheonixShardOre, "enderPheonixShardOre");

		ultimaBlock = new UltimaBlock();
		GameRegistry.registerBlock(ultimaBlock, "ultimaBlock");

		pheonixShardOre = new PheonixShardOre();
		GameRegistry.registerBlock(pheonixShardOre, "pheonixShardOre");

		platinumOre = new PlatinumOre();
		GameRegistry.registerBlock(platinumOre, "platinumOre");

		platinumBlock = new PlatinumBlock();
		GameRegistry.registerBlock(platinumBlock, "platinumBlock");
	}

}
