package com.owloctogons.mineralcraft.item;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

import com.owloctogons.mineralcraft.main;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

public class UltimaSword extends ItemSword{

	public UltimaSword(ToolMaterial material)
	{
		super(material);
		setUnlocalizedName(main.MODID + "_" + "ultimaSword");
		setCreativeTab(main.tabRockTools);
		setTextureName(main.MODID + ":" + "ultimaSword");
	}
}
