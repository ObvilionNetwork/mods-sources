/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.world.World
 */
package net.divinerpg.blocks.vethea;

import java.util.Random;
import net.divinerpg.blocks.base.BlockModLog;
import net.divinerpg.entities.vethea.EntityEnt;
import net.divinerpg.utils.tabs.DivineRPGTabs;
import net.minecraft.entity.Entity;
import net.minecraft.world.World;

public class BlockVetheaLog
extends BlockModLog {
    private Random rand = new Random();

    public BlockVetheaLog(String name) {
        super(name);
        this.setCreativeTab(DivineRPGTabs.vethea);
    }

    public void onBlockDestroyedByPlayer(World w, int x, int y, int z, int meta) {
        super.onBlockDestroyedByPlayer(w, x, y, z, meta);
        if (!w.isRemote && this.rand.nextInt(5) == 0) {
            EntityEnt e = new EntityEnt(w);
            e.setLocationAndAngles(x, y, z, 0.0f, 0.0f);
            w.spawnEntityInWorld((Entity)e);
        }
    }
}

