package com.leadfreecandy.firstmod.util.handlers;


import com.leadfreecandy.firstmod.init.ModItems;
import com.leadfreecandy.firstmod.util.IHasModel;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.rmi.registry.LocateRegistry;

@Mod.EventBusSubscriber
public class RegistryHandler {
    @SubscribeEvent
    public static void onItemRegister(RegistryEvent.Register<Item> event){

        event.getRegistry().registerAll(ModItems.ITEMS.toArray(new Item[0]));

    }

}
