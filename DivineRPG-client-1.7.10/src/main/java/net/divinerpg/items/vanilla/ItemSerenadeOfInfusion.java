/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.item.ItemStack
 *  net.minecraft.potion.Potion
 *  net.minecraft.potion.PotionEffect
 *  net.minecraft.world.World
 */
package net.divinerpg.items.vanilla;

import java.util.List;
import net.divinerpg.items.base.ItemMod;
import net.divinerpg.libs.Sounds;
import net.divinerpg.utils.TooltipLocalizer;
import net.divinerpg.utils.tabs.DivineRPGTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemSerenadeOfInfusion
extends ItemMod {
    public ItemSerenadeOfInfusion(String name) {
        super(name);
        this.setCreativeTab(DivineRPGTabs.utility);
        this.setMaxDamage(15);
        this.setMaxStackSize(1);
    }

    @Override
    public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
        world.playSoundAtEntity((Entity)player, Sounds.heal.getPrefixedName(), 1.0f, 1.0f);
        player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 80, 2, true));
        if (!player.capabilities.isCreativeMode) {
            stack.damageItem(1, (EntityLivingBase)player);
        }
        return stack;
    }

    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4) {
        list.add(TooltipLocalizer.usesRemaining(stack.getMaxDamage() - stack.getItemDamage()));
    }
}

