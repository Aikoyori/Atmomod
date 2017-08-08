package com.atmosphex.atmomod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Reference {
public static final String MOD_ID = "atmo";
public static final String NAME = "The Atmosphex Mod";
public static final String VERSION = "1.0";
public static final String CLIENT_PROXY_CLASS = "com.atmosphex.atmomod.proxy.ClientProxy";
public static final String SERVER_PROXY_CLASS = "com.atmosphex.atmomod.proxy.ServerProxy";
public static final String ACCEPTED_VERSION="[1.11.2]";

public static enum AtmosphexItems
{
	AQUAR("aquar","itemaquar"),
	BEMOJI("bemoji","itembemoji");
	private String unlocalizedName;
	private String registryName;	
	AtmosphexItems(String unlocalizedName,String registryName)
	{
		this.unlocalizedName = unlocalizedName;
		this.registryName = registryName;
	}
	
	
	public String getUnlocalizedName()
	{
		return unlocalizedName;
	}	
	
	
	public String getRegistryName()
	{
		return registryName;
	}
}

public static enum AtmosphexBlocks
{
	AQUARBLOCK("aquar","aquarblock");
	private String unlocalizedName;
	private String registryName;	
	AtmosphexBlocks(String unlocalizedName,String registryName)
	{
		this.unlocalizedName = unlocalizedName;
		this.registryName = registryName;
	}
	
	
	public String getUnlocalizedName()
	{
		return unlocalizedName;
	}	
	
	
	public String getRegistryName()
	{
		return registryName;
	}
}
}
