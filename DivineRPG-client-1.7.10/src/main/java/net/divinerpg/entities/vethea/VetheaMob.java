/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.world.World
 */
package net.divinerpg.entities.vethea;

import net.divinerpg.entities.base.EntityDivineRPGMob;
import net.minecraft.world.World;

public abstract class VetheaMob
extends EntityDivineRPGMob {
    public VetheaMob(World w) {
        super(w);
    }

    public abstract int getSpawnLayer();

    @Override
    public boolean getCanSpawnHere() {
        return this.posY < 48.0 * (double)this.getSpawnLayer() && this.posY > 48.0 * (double)(this.getSpawnLayer() - 1) && super.getCanSpawnHere();
    }
}

