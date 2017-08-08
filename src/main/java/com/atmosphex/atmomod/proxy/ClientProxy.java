package com.atmosphex.atmomod.proxy;

import com.atmosphex.atmomod.init.ModBlocks;
import com.atmosphex.atmomod.init.ModItems;

import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Mod.EventBusSubscriber(Side.CLIENT)
public class ClientProxy  implements CommonProxy{


	@SideOnly(Side.CLIENT)

	
	public void preInit() {

		
	}
    @SubscribeEvent
    public static void onModelRegister(ModelRegistryEvent event) {
        //Register the model
    }
	@Override
	public void init() {
		// TODO Auto-generated method stub
		ModItems.registerRenders();
		ModBlocks.registerRenders();
	}
}
