package com.morolas.biocomp.init;

import com.morolas.biocomp.item.ItemBioComp;
import com.morolas.biocomp.item.ItemBiomeCompass;
import com.morolas.biocomp.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemBioComp BiomeCompass = new ItemBiomeCompass();

    public static void init()
    {
        GameRegistry.registerItem(BiomeCompass, "BiomeCompass");
    }
}
