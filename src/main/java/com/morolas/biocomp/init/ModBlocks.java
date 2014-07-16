package com.morolas.biocomp.init;

import com.morolas.biocomp.block.BlockBioComp;
import com.morolas.biocomp.block.BlockTest;
import com.morolas.biocomp.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {
    public static final BlockBioComp test = new BlockTest();

    public static void init()
    {
        GameRegistry.registerBlock(test, "test");
    }
}
