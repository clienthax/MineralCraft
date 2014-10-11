package com.owloctogons.mineralcraft.item;

import java.util.Random;

import com.owloctogons.mineralcraft.main;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class PlatinumOre extends Block {
	
	public PlatinumOre() 
	{
		super(Material.rock);
		setBlockName(main.MODID + "_" + "platinumOre");
		setBlockTextureName(main.MODID + ":" + "platinumOre");
		setCreativeTab(main.tabMineralCraft);
	}
	@Override
	public Item getItemDropped(int metadata, Random rand, int fortune){
		return main.platinumShard;
		
	}
	@Override
	public int quantityDropped(Random rand){
		return 1 + rand.nextInt(3);
	}
}

