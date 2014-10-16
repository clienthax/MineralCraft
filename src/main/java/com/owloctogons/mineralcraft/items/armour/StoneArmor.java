package com.owloctogons.mineralcraft.items.armour;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class StoneArmor extends ItemArmor {

	public StoneArmor(ArmorMaterial armorMaterial, int renderIndex, int armorType) {
		super(armorMaterial, renderIndex, armorType);
	}

	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		if(this.armorType == 2)
		{
			return "mineralcraft:textures/models/armor/stone_layer_2.png";
		}
		return "mineralcraft:textures/models/armor/stone_layer_1.png";
	}
}