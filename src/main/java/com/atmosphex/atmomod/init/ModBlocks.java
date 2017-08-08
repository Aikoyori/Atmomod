package com.atmosphex.atmomod.init;

import com.atmosphex.atmomod.blocks.AquarBlock;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {
	public static Block	aquarblock;
	public static void init()
	{
		aquarblock=new AquarBlock();		
	}
	public static void register()
	{
		GameRegistry.register(aquarblock);
	}
	public static void registerRenders()
	{
		registerRender(aquarblock);
	}
	private static void registerRender(Block block) {

		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}
}
