/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.projectile.EntityThrowable
 *  net.minecraft.util.DamageSource
 *  net.minecraft.util.MovingObjectPosition
 *  net.minecraft.world.World
 */
package net.divinerpg.entities.vanilla.projectile;

import net.divinerpg.entities.base.EntityStats;
import net.divinerpg.entities.vanilla.EntitySaguaroWorm;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntitySaguaroWormShot
extends EntityThrowable {
    public EntitySaguaroWormShot(World var1) {
        super(var1);
    }

    public EntitySaguaroWormShot(World var1, EntityLivingBase var2) {
        super(var1, var2);
    }

    public EntitySaguaroWormShot(World var1, double var2, double var4, double var6) {
        super(var1, var2, var4, var6);
    }

    protected void onImpact(MovingObjectPosition var1) {
        if (var1.entityHit != null && !(var1.entityHit instanceof EntitySaguaroWorm)) {
            var1.entityHit.attackEntityFrom(DamageSource.causeThrownDamage((Entity)this, (Entity)this.getThrower()), (float)EntityStats.saguaroWormDamage);
        } else if (var1.entityHit == null && !this.worldObj.isRemote) {
            this.setDead();
        }
    }

    public float getGravityVelocity() {
        return 0.0f;
    }

    public void onUpdate() {
        super.onUpdate();
        if (!this.worldObj.isRemote && this.ticksExisted > 30) {
            this.setDead();
        }
    }
}

