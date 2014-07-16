package com.morolas.biocomp.init;

import com.morolas.biocomp.item.ItemBioComp;
import com.morolas.biocomp.item.ItemBiomeCompass;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems
{
    public static final ItemBioComp BiomeCompass = new ItemBiomeCompass();

    public static void init()
    {
        GameRegistry.registerItem(BiomeCompass, "BiomeCompass");
    }
}
