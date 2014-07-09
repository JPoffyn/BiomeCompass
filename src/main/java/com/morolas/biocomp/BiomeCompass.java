package com.morolas.biocomp;

import com.morolas.biocomp.proxy.IProxy;
import com.morolas.biocomp.reference.Reference;
import cpw.mods.fml.common.*;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid= Reference.MOD_ID, name=Reference.MOD_NAME, version=Reference.VERSION)

public class BiomeCompass {

    @Mod.Instance(Reference.MOD_ID)
    public static BiomeCompass instance;

    @SidedProxy(clientSide = "com.morolas.biocomp.proxy.ClientProxy", serverSide="com.morolas.biocomp.proxy.ServerProxy")
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event){

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){

    }
}

