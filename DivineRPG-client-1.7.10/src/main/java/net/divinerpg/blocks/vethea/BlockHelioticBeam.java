/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.world.World
 */
package net.divinerpg.blocks.vethea;

import java.util.Random;
import net.divinerpg.blocks.base.BlockMod;
import net.divinerpg.entities.vethea.projectile.EntityZoragonBomb;
import net.divinerpg.utils.tabs.DivineRPGTabs;
import net.minecraft.entity.Entity;
import net.minecraft.world.World;

public class BlockHelioticBeam
extends BlockMod {
    public BlockHelioticBeam(String name) {
        super(name, false, DivineRPGTabs.vethea);
    }

    public int quantityDropped(Random par1Random) {
        return 0;
    }

    public void dispense(World w, int x, int y, int z) {
        double var5 = x;
        double var7 = y;
        double var9 = z;
        EntityZoragonBomb var11 = new EntityZoragonBomb(w, var5 + 0.5, var7 - 0.5, var9 + 0.5);
        var11.motionX = 0.0;
        var11.motionY = -0.1;
        var11.motionZ = 0.0;
        w.spawnEntityInWorld((Entity)var11);
    }
}

