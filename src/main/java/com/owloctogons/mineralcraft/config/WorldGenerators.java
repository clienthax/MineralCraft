package com.owloctogons.mineralcraft.config;

import com.owloctogons.mineralcraft.worldGeneration.GenerateEnderPheonixShardOre;
import com.owloctogons.mineralcraft.worldGeneration.GeneratePheonixShardOre;
import com.owloctogons.mineralcraft.worldGeneration.GeneratePlatinumOre;
import cpw.mods.fml.common.registry.GameRegistry;

public class WorldGenerators {

	public static void registerWorldGenerators() {
		//WORLDGEN
		GameRegistry.registerWorldGenerator(new GeneratePheonixShardOre(), 0);
		GameRegistry.registerWorldGenerator(new GeneratePlatinumOre(), 1);
		GameRegistry.registerWorldGenerator(new GenerateEnderPheonixShardOre(), 2);
	}
}
