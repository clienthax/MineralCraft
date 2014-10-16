package com.owloctogons.mineralcraft.blocks;

import java.util.Random;

import com.owloctogons.mineralcraft.MineralCraft;

import com.owloctogons.mineralcraft.config.Constants;
import com.owloctogons.mineralcraft.config.CreativeTabs;
import com.owloctogons.mineralcraft.config.Items;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class PheonixShardOre extends Block {

	public PheonixShardOre() 
	{
		super(Material.rock);
		setBlockName("pheonixShardOre");
		setBlockTextureName(Constants.MODID + ":" + "pheonixShardOre");
		setCreativeTab(CreativeTabs.tabMineralCraft);
		setHardness(50.0F);
		setResistance(2000.0F);
		setStepSound(soundTypeStone);
	}
	
	@Override
	public Item getItemDropped(int metadata, Random rand, int fortune){
		return Items.pheonixShard;
		
	}
	@Override
	public int quantityDropped(Random rand){
		return 1 + rand.nextInt(1);
	}
	public int getLightValue(){
		return 15;
	}
}