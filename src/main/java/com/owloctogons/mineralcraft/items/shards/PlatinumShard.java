package com.owloctogons.mineralcraft.items.shards;

import com.owloctogons.mineralcraft.MineralCraft;

import com.owloctogons.mineralcraft.config.Constants;
import com.owloctogons.mineralcraft.config.CreativeTabs;
import net.minecraft.item.Item;

public class PlatinumShard extends Item {

	public PlatinumShard()
	{
		setUnlocalizedName("platinumShard");
		setCreativeTab(CreativeTabs.tabMineralCraft);
		setTextureName(Constants.MODID + ":" + "platinumShard");
	}
}
