package com.leadfreecandy.firstmod.items;

import com.leadfreecandy.firstmod.Main;
import com.leadfreecandy.firstmod.init.ModItems;
import com.leadfreecandy.firstmod.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;


public class ItemBase extends Item implements IHasModel {

    public ItemBase(String name){

        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.MATERIALS);

        ModItems.ITEMS.add(this);

    }
    @Override
    public void registerModels() {

        Main.proxy.regsiterItemRenderer(this, 0, "inventory");

    }
}

//test
