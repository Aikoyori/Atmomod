package com.atmosphex.atmomod.blocks;

import com.atmosphex.atmomod.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class AquarBlock extends Block {

	public AquarBlock() {
		super(Material.ROCK);
		setUnlocalizedName(Reference.AtmosphexBlocks.AQUARBLOCK.getUnlocalizedName());
		setUnlocalizedName(Reference.AtmosphexBlocks.AQUARBLOCK.getRegistryName());		
	}

}
