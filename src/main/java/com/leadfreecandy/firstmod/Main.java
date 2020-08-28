package com.leadfreecandy.firstmod;

import com.leadfreecandy.firstmod.util.Reference;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;


import com.leadfreecandy.firstmod.proxy.CommonProxy;
import com.leadfreecandy.firstmod.proxy.ClientProxy;




import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)

public class Main {

    @Instance
    public static Main instance;


    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
    public static CommonProxy proxy;


    @EventHandler
    public static void PreInit(FMLPreInitializationEvent event){

    }

    @EventHandler
    public static void Init(FMLInitializationEvent event){

    }

    @EventHandler
    public static void PostInit(FMLPostInitializationEvent event){

    }


<<<<<<< HEAD
    //brain tastes like butt
=======
    //john tastes like butt
>>>>>>> 3efb81be81bbcd3c4d19cfe145f83a56744ba912

}
