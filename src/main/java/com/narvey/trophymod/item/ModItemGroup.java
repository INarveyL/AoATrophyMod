package com.narvey.trophymod.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroup {

    public static final ItemGroup Trophies = new ItemGroup("TrophiesMod") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.AOASWORD.get());
        }
    };
}
