package com.owloctogons.mineralcraft.blocks;

import java.util.Random;

import com.owloctogons.mineralcraft.MineralCraft;

import com.owloctogons.mineralcraft.config.Constants;
import com.owloctogons.mineralcraft.config.CreativeTabs;
import com.owloctogons.mineralcraft.config.Items;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class EnderPheonixShardOre extends Block {

	public EnderPheonixShardOre() 
	{
		super(Material.rock);
		setBlockName("enderPheonixShardOre");
		setBlockTextureName(Constants.MODID + ":" + "enderPheonixShardOre");
		setCreativeTab(CreativeTabs.tabMineralCraft);
	}
	
	@Override
	public Item getItemDropped(int metadata, Random rand, int fortune){
		return Items.pheonixShard;
		
	}
	@Override
	public int quantityDropped(Random rand){
		return 1 + rand.nextInt(1);
	}
}

