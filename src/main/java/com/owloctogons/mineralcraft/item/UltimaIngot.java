package com.owloctogons.mineralcraft.item;

import com.owloctogons.mineralcraft.main;

import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class UltimaIngot extends Item {
	
	public UltimaIngot()
	{
		setUnlocalizedName(main.MODID + "_" + "ultimaIngot");
		setCreativeTab(main.tabMineralCraft);
		setTextureName(main.MODID + ":" + "ultimaIngot");
	}
}
