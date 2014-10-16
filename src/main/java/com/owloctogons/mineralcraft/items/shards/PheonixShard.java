package com.owloctogons.mineralcraft.items.shards;

import com.owloctogons.mineralcraft.MineralCraft;

import com.owloctogons.mineralcraft.config.Constants;
import com.owloctogons.mineralcraft.config.CreativeTabs;
import net.minecraft.item.Item;

public class PheonixShard extends Item {
	
	public PheonixShard()
	{
		setUnlocalizedName("pheonixShard");
		setCreativeTab(CreativeTabs.tabMineralCraft);
		setTextureName(Constants.MODID + ":" + "pheonixShard");
	}

}