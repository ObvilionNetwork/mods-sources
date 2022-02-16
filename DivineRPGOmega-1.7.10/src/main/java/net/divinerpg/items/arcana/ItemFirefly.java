/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cpw.mods.fml.relauncher.Side
 *  cpw.mods.fml.relauncher.SideOnly
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.item.ItemStack
 *  net.minecraft.world.World
 */
package net.divinerpg.items.arcana;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.divinerpg.entities.arcana.projectile.EntityFirefly;
import net.divinerpg.items.base.ItemMod;
import net.divinerpg.libs.Sounds;
import net.divinerpg.utils.TooltipLocalizer;
import net.divinerpg.utils.events.ArcanaHelper;
import net.divinerpg.utils.tabs.DivineRPGTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemFirefly
extends ItemMod {
    private int arcana = 5;

    public ItemFirefly() {
        super("firefly", DivineRPGTabs.ranged);
        this.setMaxStackSize(1);
        this.setFull3D();
    }

    @Override
    public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
        if (!world.isRemote && ArcanaHelper.getProperties(player).useBar(this.arcana)) {
            Sounds.playSound((Entity)player, world, Sounds.firefly);
            EntityFirefly e = new EntityFirefly(world, (EntityLivingBase)player);
            world.spawnEntityInWorld((Entity)e);
        }
        return stack;
    }

    @SideOnly(value=Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4) {
        list.add(TooltipLocalizer.homingShots());
        list.add(TooltipLocalizer.infiniteAmmo());
        list.add(TooltipLocalizer.arcanaConsumed(this.arcana));
        list.add(TooltipLocalizer.rangedDam(15.0));
        list.add(TooltipLocalizer.infiniteUses());
    }
}

