/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.init.Items
 *  net.minecraft.item.EnumAction
 *  net.minecraft.item.ItemStack
 *  net.minecraft.world.World
 */
package net.divinerpg.items.iceika;

import net.divinerpg.items.base.ItemModFood;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemEggNog
extends ItemModFood {
    public ItemEggNog(String name) {
        super(4, 5.0f, false, name);
        this.setMaxStackSize(1);
    }

    @Override
    public ItemStack onEaten(ItemStack item, World world, EntityPlayer player) {
        super.onEaten(item, world, player);
        return new ItemStack(Items.bucket);
    }

    public EnumAction getItemUseAction(ItemStack stack) {
        return EnumAction.drink;
    }
}

