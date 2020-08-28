package com.leadfreecandy.firstmod;

import com.leadfreecandy.firstmod.proxy.ClientProxy;
import com.leadfreecandy.firstmod.proxy.CommonProxy;
import com.leadfreecandy.firstmod.util.Reference;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;



@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)

public class Main {

    @Instance
    public static Main instance;




    public static ClientProxy clientProxy = new ClientProxy();
    public static CommonProxy commonProxy = new CommonProxy();


    @EventHandler
    public static void PreInit(FMLPreInitializationEvent event){

    }

    @EventHandler
    public static void Init(FMLInitializationEvent event){

    }

    @EventHandler
    public static void PostInit(FMLPostInitializationEvent event){

    }


//samir dumb and gay

}
