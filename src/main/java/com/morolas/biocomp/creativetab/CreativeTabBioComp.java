package com.morolas.biocomp.creativetab;

import com.morolas.biocomp.init.ModItems;
import com.morolas.biocomp.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabBioComp
{
    public static final CreativeTabs BioComp_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase())
    {
        @Override
        public Item getTabIconItem()
        {
            return ModItems.BiomeCompass;
        }
    };
}
