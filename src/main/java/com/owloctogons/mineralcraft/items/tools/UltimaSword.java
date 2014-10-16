package com.owloctogons.mineralcraft.items.tools;

import com.owloctogons.mineralcraft.MineralCraft;
import com.owloctogons.mineralcraft.config.Constants;
import com.owloctogons.mineralcraft.config.CreativeTabs;
import net.minecraft.item.ItemSword;

public class UltimaSword extends ItemSword{

	public UltimaSword(ToolMaterial material)
	{
		super(material);
		setUnlocalizedName("ultimaSword");
		setCreativeTab(CreativeTabs.tabRockTools);
		setTextureName(Constants.MODID + ":" + "ultimaSword");
	}
}
