package com.owloctogons.mineralcraft.items.tools;

import com.owloctogons.mineralcraft.MineralCraft;
import com.owloctogons.mineralcraft.config.Constants;
import com.owloctogons.mineralcraft.config.CreativeTabs;
import net.minecraft.item.ItemSpade;

public class FireDagger extends ItemSpade {
	
	public FireDagger(ToolMaterial material)
	{
		super(material);
		setUnlocalizedName("fireDagger");
		setCreativeTab(CreativeTabs.tabRockTools);
		setTextureName(Constants.MODID + ":" + "fireDagger");
	}
}
