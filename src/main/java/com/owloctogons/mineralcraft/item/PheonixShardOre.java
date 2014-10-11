package com.owloctogons.mineralcraft.item;

import java.util.Random;

import com.owloctogons.mineralcraft.main;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class PheonixShardOre extends Block {

	public PheonixShardOre() 
	{
		super(Material.rock);
		setBlockName(main.MODID + "_" + "pheonixShardOre").setBlockTextureName(main.MODID + ":" + "pheonixShardOre").setCreativeTab(main.tabMineralCraft).setHardness(50.0F).setResistance(2000.0F).setStepSound(soundTypeStone);
	}
	
	@Override
	public Item getItemDropped(int metadata, Random rand, int fortune){
		return main.pheonixShard;
		
	}
	@Override
	public int quantityDropped(Random rand){
		return 1 + rand.nextInt(1);
	}
	public int getLightValue(){
		return 15;
	};
}