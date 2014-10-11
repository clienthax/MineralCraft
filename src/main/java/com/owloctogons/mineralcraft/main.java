//PACKAGE
package com.owloctogons.mineralcraft;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.common.util.EnumHelper;

import com.owloctogons.mineralcraft.item.EnderPheonixShardOre;
import com.owloctogons.mineralcraft.item.FireDagger;
import com.owloctogons.mineralcraft.item.PheonixShard;
import com.owloctogons.mineralcraft.item.PheonixShardOre;
import com.owloctogons.mineralcraft.item.PlatinumBlock;
import com.owloctogons.mineralcraft.item.PlatinumIngot;
import com.owloctogons.mineralcraft.item.PlatinumOre;
import com.owloctogons.mineralcraft.item.PlatinumShard;
import com.owloctogons.mineralcraft.item.StoneArmor;
import com.owloctogons.mineralcraft.item.UltimaBlock;
import com.owloctogons.mineralcraft.item.UltimaIngot;
import com.owloctogons.mineralcraft.item.UltimaPick;
import com.owloctogons.mineralcraft.item.UltimaSword;
import com.owloctogons.mineralcraft.world.generateEnderPheonixShardOre;
import com.owloctogons.mineralcraft.world.generatePheonixShardOre;
import com.owloctogons.mineralcraft.world.generatePlatinumOre;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = main.MODID, version = main.VERSION)
public class main
{
	//MOD INFO
    public static final String MODID = "MineralCraft";
    public static final String VERSION = "0.1.3";
    
    //TILE ENTITY UNLOCALIZED NAMES
    public static Block platinumFurnace;
    
    //BLOCK UNLOCALIZED NAMES
    public static Block platinumBlock;
    public static Block platinumOre;
    public static Block pheonixShardOre;
    public static Block ultimaBlock;
    public static Block enderPheonixShardOre;
    
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

    //PRE-INIT
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {    	
    	//WORLDGEN
    	GameRegistry.registerWorldGenerator(new generatePheonixShardOre(), 0);
    	GameRegistry.registerWorldGenerator(new generatePlatinumOre(), 1);
    	GameRegistry.registerWorldGenerator(new generateEnderPheonixShardOre(), 2);
    	
    	//REGISTRYS(TILE ENTITYS)
    	
    	//REGISTRYS(BLOCKS)    	
    	enderPheonixShardOre = new EnderPheonixShardOre();
    	GameRegistry.registerBlock(enderPheonixShardOre, "enderPheonixShardOre");
    	
    	ultimaBlock = new UltimaBlock();
    	GameRegistry.registerBlock(ultimaBlock, "ultimaBlock");
    	
    	pheonixShardOre = new PheonixShardOre();
    	GameRegistry.registerBlock(pheonixShardOre, "pheonixShardOre");
    
    	platinumOre = new PlatinumOre();
    	GameRegistry.registerBlock(platinumOre, "platinumOre");
    	
    	platinumBlock = new PlatinumBlock();
    	GameRegistry.registerBlock(platinumBlock, "platinumBlock");
    	
    	//REGISTRYS(ITEMS)
    	platinumApple = new ItemFood(8, 1.0F, false).setUnlocalizedName("platinumApple").setCreativeTab(tabMineralCraft).setTextureName("apple_golden").setMaxStackSize(1);
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
    	stoneHelmet = new StoneArmor(stoneArmorMaterial, 0, 0).setUnlocalizedName("stoneHelmet").setCreativeTab(tabMineralCraft).setTextureName("iron_helmet");
    	stoneChestplate = new StoneArmor(stoneArmorMaterial, 0, 1).setUnlocalizedName("stoneChestplate").setCreativeTab(tabMineralCraft).setTextureName("iron_chestplate");
    	stoneLeggings = new StoneArmor(stoneArmorMaterial, 0, 2).setUnlocalizedName("stoneLeggings").setCreativeTab(tabMineralCraft).setTextureName("iron_leggings");
    	stoneBoots = new StoneArmor(stoneArmorMaterial, 0, 3).setUnlocalizedName("stoneBoots").setCreativeTab(tabMineralCraft).setTextureName("iron_boots");
    	GameRegistry.registerItem(stoneHelmet, stoneHelmet.getUnlocalizedName().substring(5));
    	GameRegistry.registerItem(stoneChestplate, stoneChestplate.getUnlocalizedName().substring(5));
    	GameRegistry.registerItem(stoneLeggings, stoneLeggings.getUnlocalizedName().substring(5));
    	GameRegistry.registerItem(stoneBoots, stoneBoots.getUnlocalizedName().substring(5));
    	
    	//BLOCK RECIPES
		GameRegistry.addRecipe(new ItemStack(platinumBlock), new Object[]{
            "AAA",
            "AAA",
            "AAA",
            'A', platinumIngot});
		
		GameRegistry.addRecipe(new ItemStack(ultimaSword), new Object[]{
            "AAA",
            "ABA",
            "AAA",
            'A', ultimaIngot,'B', Items.iron_ingot});

		//TOOL/WEAPON RECIPES
		GameRegistry.addRecipe(new ItemStack(ultimaSword), new Object[]{
            " A ",
            " A ",
            " B ",
            'A', ultimaBlock,'B', Items.blaze_rod});
            
		GameRegistry.addRecipe(new ItemStack(platinumIngot), new Object[]{
            "AAA",
            "AAA",
            "AAA",
            'A', platinumShard});
		GameRegistry.addRecipe(new ItemStack(ultimaPick), new Object[]{
			"AAA",
			" B ",
			" B ",
			'A',ultimaIngot,'B',Items.blaze_rod
		});
		//ITEM RECIPES
		GameRegistry.addRecipe(new ItemStack(ultimaIngot), new Object[]{
            "AAA",
            "AAA",
            "AAA",
            'A', pheonixShard});
		GameRegistry.addRecipe(new ItemStack(fireDagger), new Object[]{
			"A",
			"A",
			"B",
			'A',pheonixShard,'B',Items.blaze_rod});
		GameRegistry.addRecipe(new ItemStack(ultimaBlock), new Object[]{
			"DDD",
			"CBC",
			"AAA",
			'A',platinumBlock,'B',Blocks.furnace,'C',platinumIngot,'D',platinumShard});
		GameRegistry.addRecipe(new ItemStack(ultimaBlock), new Object[]{
			"AAA",
			"AAA",
			"AAA",
			'A',ultimaIngot});
		GameRegistry.addRecipe(new ItemStack(platinumApple), new Object[]{
			"AAA",
			"ABA",
    		"AAA",
    		'A',platinumShard,'B',Items.apple});
		//EXTRA RECIPES
		GameRegistry.addRecipe(new ItemStack(Items.minecart), new Object[]{
		"   ",
		"   ",
		"ABA",
		'A',Items.iron_ingot,'B',Items.bucket});
		//ARMOR RECIPES
		GameRegistry.addRecipe(new ItemStack(stoneBoots), new Object[]{
		"   ",
		"A A",
		"A A",
		'A',Blocks.stone});
		GameRegistry.addRecipe(new ItemStack(stoneLeggings), new Object[]{
		"AAA",
		"A A",
		"A A",
		'A',Blocks.stone});
		GameRegistry.addRecipe(new ItemStack(stoneChestplate), new Object[]{
		"A A",
		"AAA",
		"AAA",
		'A',Blocks.stone});
		GameRegistry.addRecipe(new ItemStack(stoneHelmet), new Object[]{
		"AAA",
		"A A",
		"   ",
		'A',Blocks.stone});
    }
    
    //CREATIVE TABS
	public static CreativeTabs tabMineralCraft = new CreativeTabs("tabMineralCraft"){
    	@Override
    	public Item getTabIconItem(){return new ItemStack(ultimaIngot).getItem();
    	}
    };
    public static CreativeTabs tabRockTools = new CreativeTabs("tabRockTools"){
    	@Override
    	public Item getTabIconItem(){return new ItemStack(fireDagger).getItem();
    	}
    };
}