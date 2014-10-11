package com.owloctogons.mineralcraft.item;

import net.minecraft.init.Items;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;

import com.owloctogons.mineralcraft.main;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

public class FireDagger extends ItemSpade{
	
	public FireDagger(ToolMaterial material)
	{
		super(material);
		setUnlocalizedName(main.MODID + "_" + "fireDagger");
		setCreativeTab(main.tabRockTools);
		setTextureName(main.MODID + ":" + "fireDagger");
	}
}
