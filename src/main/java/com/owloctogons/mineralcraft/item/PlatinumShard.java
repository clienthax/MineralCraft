package com.owloctogons.mineralcraft.item;

import com.owloctogons.mineralcraft.main;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class PlatinumShard extends Item {

	public PlatinumShard()
	{
		setUnlocalizedName(main.MODID + "_" + "platinumShard");
		setCreativeTab(main.tabMineralCraft);
		setTextureName(main.MODID + ":" + "platinumShard");
	}
}
