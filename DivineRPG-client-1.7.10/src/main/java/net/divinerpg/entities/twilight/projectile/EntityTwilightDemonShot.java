/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.potion.Potion
 *  net.minecraft.potion.PotionEffect
 *  net.minecraft.util.MovingObjectPosition
 *  net.minecraft.world.World
 */
package net.divinerpg.entities.twilight.projectile;

import java.awt.Color;
import net.divinerpg.client.render.EntityResourceLocation;
import net.divinerpg.entities.twilight.EntityParticleBullet;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityTwilightDemonShot
extends EntityParticleBullet {
    public EntityTwilightDemonShot(World world) {
        super(world);
        this.setMoreParticles();
    }

    public EntityTwilightDemonShot(World world, EntityLivingBase e) {
        super(world, e, 16.0f, EntityResourceLocation.twilightDemonShot.toString(), new Color(0, 0, 0));
        this.setMoreParticles();
        if (this.rand.nextInt(50) == 0) {
            this.setColor(new Color(255, 0, 0));
        }
    }

    public float getGravityVelocity() {
        return 0.0f;
    }

    @Override
    public void onUpdate() {
        super.onUpdate();
        if (!this.worldObj.isRemote && this.ticksExisted > 20) {
            this.setDead();
        }
    }

    @Override
    public void onImpact(MovingObjectPosition pos) {
        super.onImpact(pos);
        if (pos.entityHit != null && pos.entityHit instanceof EntityPlayer) {
            ((EntityPlayer)pos.entityHit).addPotionEffect(new PotionEffect(Potion.confusion.id, 200, 0, true));
        }
    }
}

