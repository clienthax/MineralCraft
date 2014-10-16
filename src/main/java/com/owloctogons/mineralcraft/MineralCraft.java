//PACKAGE
package com.owloctogons.mineralcraft;

import com.owloctogons.mineralcraft.config.*;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Constants.MODID, name = Constants.MODNAME, version = Constants.VERSION)
public class MineralCraft
{
    //PRE-INIT
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
		WorldGenerators.registerWorldGenerators();
		Blocks.registerBlocks();
		Items.registerItems();
		Recipes.registerRecipes();
	}
}