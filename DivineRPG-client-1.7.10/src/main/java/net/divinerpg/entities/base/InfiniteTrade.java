/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.item.ItemStack
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraft.village.MerchantRecipe
 */
package net.divinerpg.entities.base;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.village.MerchantRecipe;

public class InfiniteTrade
extends MerchantRecipe {
    public InfiniteTrade(NBTTagCompound tag) {
        super(tag);
    }

    public InfiniteTrade(ItemStack buy, ItemStack sell) {
        super(buy, sell);
    }

    public InfiniteTrade(ItemStack buy, ItemStack buy2, ItemStack sell) {
        super(buy, buy2, sell);
    }

    public boolean isRecipeDisabled() {
        return false;
    }
}

