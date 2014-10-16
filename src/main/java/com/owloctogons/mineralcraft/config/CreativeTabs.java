package com.owloctogons.mineralcraft.config;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class CreativeTabs {

	//CREATIVE TABS
	public static net.minecraft.creativetab.CreativeTabs tabMineralCraft = new net.minecraft.creativetab.CreativeTabs("tabMineralCraft"){
		@Override
		public Item getTabIconItem(){return new ItemStack(Items.ultimaIngot).getItem();
		}
	};
	public static net.minecraft.creativetab.CreativeTabs tabRockTools = new net.minecraft.creativetab.CreativeTabs("tabRockTools"){
		@Override
		public Item getTabIconItem(){return new ItemStack(Items.fireDagger).getItem();
		}
	};


}
