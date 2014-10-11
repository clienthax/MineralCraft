package com.owloctogons.mineralcraft.item;

import com.owloctogons.mineralcraft.main;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class PlatinumIngot extends Item {

	public PlatinumIngot()
	{
		setUnlocalizedName(main.MODID + "_" + "platinumIngot");
		setCreativeTab(main.tabMineralCraft);
		setTextureName(main.MODID + ":" + "platinumIngot");
	}
}
