package com.owloctogons.mineralcraft.items.ingots;

import com.owloctogons.mineralcraft.MineralCraft;

import com.owloctogons.mineralcraft.config.Constants;
import com.owloctogons.mineralcraft.config.CreativeTabs;
import net.minecraft.item.Item;

public class UltimaIngot extends Item {
	
	public UltimaIngot()
	{
		setUnlocalizedName("ultimaIngot");
		setCreativeTab(CreativeTabs.tabMineralCraft);
		setTextureName(Constants.MODID + ":" + "ultimaIngot");
	}
}
