/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.item.Item
 */
package net.divinerpg.blocks.vanilla;

import net.divinerpg.blocks.base.BlockModCrop;
import net.divinerpg.utils.items.ItemsFood;
import net.divinerpg.utils.items.VanillaItemsOther;
import net.minecraft.item.Item;

public class BlockTomato
extends BlockModCrop {
    public BlockTomato(String name) {
        super(name, 7, "tomato");
    }

    @Override
    public Item getSeeds() {
        return VanillaItemsOther.tomatoSeeds;
    }

    @Override
    public Item getDropItem() {
        return ItemsFood.tomato;
    }
}

