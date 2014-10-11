package com.owloctogons.mineralcraft.item;

import com.owloctogons.mineralcraft.main;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class PheonixShard extends Item {
	
	public PheonixShard()
	{
		setUnlocalizedName(main.MODID + "_" + "pheonixShard");
		setCreativeTab(main.tabMineralCraft);
		setTextureName(main.MODID + ":" + "pheonixShard");
	}

}