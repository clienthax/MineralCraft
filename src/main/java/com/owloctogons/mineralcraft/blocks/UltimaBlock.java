package com.owloctogons.mineralcraft.blocks;

import com.owloctogons.mineralcraft.MineralCraft;

import com.owloctogons.mineralcraft.config.Constants;
import com.owloctogons.mineralcraft.config.CreativeTabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class UltimaBlock extends Block {

	public UltimaBlock() 
	{
		super(Material.rock);
		setBlockName("ultimaBlock");
		setBlockTextureName(Constants.MODID + ":" + "ultimaBlock");
		setCreativeTab(CreativeTabs.tabMineralCraft);
	}	
}