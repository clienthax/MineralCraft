package com.owloctogons.mineralcraft.config;

import com.owloctogons.mineralcraft.items.armour.StoneArmor;
import com.owloctogons.mineralcraft.items.ingots.PlatinumIngot;
import com.owloctogons.mineralcraft.items.ingots.UltimaIngot;
import com.owloctogons.mineralcraft.items.shards.PheonixShard;
import com.owloctogons.mineralcraft.items.shards.PlatinumShard;
import com.owloctogons.mineralcraft.items.tools.FireDagger;
import com.owloctogons.mineralcraft.items.tools.UltimaPick;
import com.owloctogons.mineralcraft.items.tools.UltimaSword;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemFood;
import net.minecraftforge.common.util.EnumHelper;

public class Items {

	//ITEM UNLOCALIZED NAMES
	public static Item pheonixShard;
	public static Item ultimaIngot;
	public static Item platinumShard;
	public static Item platinumIngot;

	//FOOD UNLOCALIZED NAMES
	public static Item platinumApple;

	//TOOL UNLOCALIZED NAMES
	public static Item ultimaSword;
	public static Item ultimaPick;
	public static Item fireDagger;

	//ARMOR UNLOCALIZED NAMES
	public static Item stoneHelmet;
	public static Item stoneChestplate;
	public static Item stoneLeggings;
	public static Item stoneBoots;

	//TOOL MATERIALS
	public static final Item.ToolMaterial ultimaToolMaterial = EnumHelper.addToolMaterial("ultimaToolMaterial", 5, 5000, 15.0F, 20.0F, 20);
	public static final Item.ToolMaterial platinumToolMaterial = EnumHelper.addToolMaterial("platinumToolMaterial", 3, 1561, 8.0F, 3.0F, 10);

	//ARMOR MATERIALS
	public static final ItemArmor.ArmorMaterial stoneArmorMaterial = EnumHelper.addArmorMaterial("stoneArmorMaterial", 750, new int[]{5,15,10,5}, (int) 2.5);

	public static void registerItems() {
		//REGISTRYS(ITEMS)
		platinumApple = new ItemFood(8, 1.0F, false).setUnlocalizedName("platinumApple").setCreativeTab(CreativeTabs.tabMineralCraft).setTextureName("apple_golden").setMaxStackSize(1);
		GameRegistry.registerItem(platinumApple, platinumApple.getUnlocalizedName().substring(5));

		platinumIngot = new PlatinumIngot();
		GameRegistry.registerItem(platinumIngot, "platinumIngot");

		platinumShard = new PlatinumShard();
		GameRegistry.registerItem(platinumShard, "platinumShard");

		ultimaIngot = new UltimaIngot();
		GameRegistry.registerItem(ultimaIngot, "ultimaIngot");

		pheonixShard = new PheonixShard();
		GameRegistry.registerItem(pheonixShard, "pheonixShard");

		//REGISTRYS(TOOLS/WEAPONS)
		ultimaPick = new UltimaPick(ultimaToolMaterial);
		GameRegistry.registerItem(ultimaPick, "ultimaPick");

		fireDagger = new FireDagger(ultimaToolMaterial);
		GameRegistry.registerItem(fireDagger, "fireDagger");

		ultimaSword = new UltimaSword(ultimaToolMaterial);
		GameRegistry.registerItem(ultimaSword, "ultimaSword");

		//REGISTRYS(ARMOR)
		stoneHelmet = new StoneArmor(stoneArmorMaterial, 0, 0).setUnlocalizedName("stoneHelmet").setCreativeTab(CreativeTabs.tabMineralCraft).setTextureName("mineralcraft:stoneHelmet");
		stoneChestplate = new StoneArmor(stoneArmorMaterial, 0, 1).setUnlocalizedName("stoneChestplate").setCreativeTab(CreativeTabs.tabMineralCraft).setTextureName("mineralcraft:stoneChestplate");
		stoneLeggings = new StoneArmor(stoneArmorMaterial, 0, 2).setUnlocalizedName("stoneLeggings").setCreativeTab(CreativeTabs.tabMineralCraft).setTextureName("mineralcraft:stoneLeggings");
		stoneBoots = new StoneArmor(stoneArmorMaterial, 0, 3).setUnlocalizedName("stoneBoots").setCreativeTab(CreativeTabs.tabMineralCraft).setTextureName("mineralcraft:stoneBoots");
		GameRegistry.registerItem(stoneHelmet, stoneHelmet.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(stoneChestplate, stoneChestplate.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(stoneLeggings, stoneLeggings.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(stoneBoots, stoneBoots.getUnlocalizedName().substring(5));
	}

}
