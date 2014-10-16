package com.owloctogons.mineralcraft.worldGeneration;

import java.util.Random;

import com.owloctogons.mineralcraft.MineralCraft;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;
import static com.owloctogons.mineralcraft.config.Blocks.pheonixShardOre;

public class GenerateEnderPheonixShardOre implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch (world.provider.dimensionId) {
        case 0: GenerateOverworld(random, chunkX * 16, chunkZ * 16, world); break;
        case 1: GenerateEnd(random, chunkX * 16, chunkZ * 16, world); break;
        case -1: GenerateNether(random, chunkX * 16, chunkZ * 16, world); break;
		}

	}

	private void GenerateNether(Random random, int x, int z, World world) {
		
	}

	private void GenerateEnd(Random random, int x, int z, World world) {
		this.addOreSpawn(pheonixShardOre, world, random, x, z, 4, 20, 5, 0, 256);
	}

	private void GenerateOverworld(Random random, int x, int z, World world) {

	}
	public void addOreSpawn(Block block, World world, Random random, int blockXPos, int blockZPos, int minVeinSize, int maxVeinSize, int chancesToSpawn, int minY, int maxY )
    {
        WorldGenMinable minable = new WorldGenMinable(block, (minVeinSize + random.nextInt(1)), Blocks.end_stone);
        for(int i = 0; i < chancesToSpawn; i++)
        {
            int posX = blockXPos + random.nextInt(16);
            int posY = minY + random.nextInt(maxY - minY);
            int posZ = blockZPos + random.nextInt(16);
            minable.generate(world, random, posX, posY, posZ);
        }
    }
}
