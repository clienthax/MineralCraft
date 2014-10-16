package com.owloctogons.mineralcraft.blocks;

import com.owloctogons.mineralcraft.MineralCraft;

import com.owloctogons.mineralcraft.config.Constants;
import com.owloctogons.mineralcraft.config.CreativeTabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class PlatinumBlock extends Block {

	public PlatinumBlock() 
	{
		super(Material.rock);
		setBlockName("platinumBlock");
		setBlockTextureName(Constants.MODID + ":" + "platinumBlock");
		setCreativeTab(CreativeTabs.tabMineralCraft);
	}	
}

