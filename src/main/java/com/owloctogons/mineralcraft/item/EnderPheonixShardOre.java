package com.owloctogons.mineralcraft.item;

import java.util.Random;

import com.owloctogons.mineralcraft.main;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class EnderPheonixShardOre extends Block {

	public EnderPheonixShardOre() 
	{
		super(Material.rock);
		setBlockName(main.MODID + "_" + "enderPheonixShardOre");
		setBlockTextureName(main.MODID + ":" + "enderPheonixShardOre");
		setCreativeTab(main.tabMineralCraft);
	}
	
	@Override
	public Item getItemDropped(int metadata, Random rand, int fortune){
		return main.pheonixShard;
		
	}
	@Override
	public int quantityDropped(Random rand){
		return 1 + rand.nextInt(1);
	}
}

