/*
 * Decompiled with CFR 0.152.
 */
package com.meteor.extrabotany.common.item.system;

import com.meteor.extrabotany.common.item.system.ItemMod;
import java.util.List;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import vazkii.botania.api.recipe.IFlowerComponent;
import vazkii.botania.client.core.helper.IconHelper;

public class ItemBasicSkill
extends ItemMod
implements IFlowerComponent {
    IIcon[] icons;

    public ItemBasicSkill() {
        this.setHasSubtypes(true);
        this.setUnlocalizedName("skill");
    }

    public IIcon getIconFromDamage(int par1) {
        return this.icons[Math.min(this.icons.length - 1, par1)];
    }

    public void getSubItems(Item par1, CreativeTabs par2CreativeTabs, List par3List) {
        for (int i = 0; i < 16; ++i) {
            par3List.add(new ItemStack(par1, 1, i));
        }
    }

    public String getUnlocalizedName(ItemStack par1ItemStack) {
        return this.getUnlocalizedNameLazy(par1ItemStack) + par1ItemStack.getItemDamage();
    }

    String getUnlocalizedNameLazy(ItemStack par1ItemStack) {
        return super.getUnlocalizedName(par1ItemStack);
    }

    public boolean canFit(ItemStack stack, IInventory apothecary) {
        return true;
    }

    public int getParticleColor(ItemStack stack) {
        return 0xA8A8A8;
    }
}

