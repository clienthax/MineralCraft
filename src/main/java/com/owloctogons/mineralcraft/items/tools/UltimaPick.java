package com.owloctogons.mineralcraft.items.tools;

import com.owloctogons.mineralcraft.MineralCraft;
import com.owloctogons.mineralcraft.config.Constants;
import com.owloctogons.mineralcraft.config.CreativeTabs;
import net.minecraft.item.ItemPickaxe;

public class UltimaPick extends ItemPickaxe{
	
	public UltimaPick(ToolMaterial material)
	{
		super(material);
		setUnlocalizedName("ultimaPick");
		setCreativeTab(CreativeTabs.tabRockTools);
		setTextureName(Constants.MODID + ":" + "ultimaPick");
	}
}
