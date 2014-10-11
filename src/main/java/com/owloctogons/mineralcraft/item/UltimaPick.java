package com.owloctogons.mineralcraft.item;

import net.minecraft.init.Items;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;

import com.owloctogons.mineralcraft.main;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

public class UltimaPick extends ItemPickaxe{
	
	public UltimaPick(ToolMaterial material)
	{
		super(material);
		setUnlocalizedName(main.MODID + "_" + "ultimaPick");
		setCreativeTab(main.tabRockTools);
		setTextureName(main.MODID + ":" + "ultimaPick");
	}
}
