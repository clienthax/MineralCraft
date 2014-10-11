package com.owloctogons.mineralcraft.item;

import java.util.Random;

import com.owloctogons.mineralcraft.main;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class PlatinumBlock extends Block {

	public PlatinumBlock() 
	{
		super(Material.rock);
		setBlockName(main.MODID + "_" + "platinumBlock");
		setBlockTextureName(main.MODID + ":" + "platinumBlock");
		setCreativeTab(main.tabMineralCraft);
	}	
}

