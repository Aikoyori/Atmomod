package com.atmosphex.atmomod.init;
import net.minecraft.client.Minecraft;

import com.atmosphex.atmomod.Reference;
import com.atmosphex.atmomod.items.ItemAquar;
import com.atmosphex.atmomod.items.ItemBemoji;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	
public static Item aquar;
public static Item bemoji;
public static void init()
{
	aquar = new ItemAquar();
	bemoji = new ItemBemoji();
}
public static void register()
{
	GameRegistry.register(aquar);
	GameRegistry.register(bemoji);
}
public static void registerRenders()
{
	registerRender(aquar);
	registerRender(bemoji);
}
private static void registerRender(Item item) {
	ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));}
}
