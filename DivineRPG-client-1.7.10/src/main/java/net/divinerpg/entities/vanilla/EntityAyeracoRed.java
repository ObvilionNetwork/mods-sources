/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.init.Blocks
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraft.util.DamageSource
 *  net.minecraft.world.World
 */
package net.divinerpg.entities.vanilla;

import net.divinerpg.entities.vanilla.EntityAyeraco;
import net.divinerpg.utils.Util;
import net.divinerpg.utils.items.VanillaItemsWeapons;
import net.minecraft.init.Blocks;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class EntityAyeracoRed
extends EntityAyeraco {
    private EntityAyeraco aGreen;
    private EntityAyeraco aBlue;
    private EntityAyeraco aYellow;
    private EntityAyeraco aPurple;
    private String greenUUID;
    private String blueUUID;
    private String yellowUUID;
    private String purpleUUID;
    private int healTick = 0;

    public EntityAyeracoRed(World par1World) {
        super(par1World, "Red");
    }

    public void initOthers(EntityAyeraco par2, EntityAyeraco par3, EntityAyeraco par4, EntityAyeraco par5) {
        this.aGreen = par2;
        this.aBlue = par3;
        this.aYellow = par4;
        this.aPurple = par5;
    }

    public void onDeath(DamageSource par1DamageSource) {
        super.onDeath(par1DamageSource);
        this.worldObj.setBlock(this.beamX, this.beamY, this.beamZ, Blocks.air);
    }

    @Override
    protected boolean canBlockProjectiles() {
        return this.aGreen != null && this.aGreen.abilityActive();
    }

    @Override
    protected void tickAbility() {
        if (this.healTick == 0) {
            if (this.aGreen != null && !this.aGreen.isDead) {
                this.aGreen.heal(1.0f);
            }
            if (this.aBlue != null && !this.aBlue.isDead) {
                this.aBlue.heal(1.0f);
            }
            if (this.aYellow != null && !this.aYellow.isDead) {
                this.aYellow.heal(1.0f);
            }
            if (this.aPurple != null && !this.aPurple.isDead) {
                this.aPurple.heal(1.0f);
            }
        } else {
            --this.healTick;
        }
    }

    @Override
    protected boolean canTeleport() {
        return this.aPurple != null && this.aPurple.abilityActive();
    }

    protected void dropRareDrop(int par1) {
        this.dropItem(VanillaItemsWeapons.redEnderSword, 1);
    }

    @Override
    public void onUpdate() {
        super.onUpdate();
        if (!this.worldObj.isRemote) {
            if (this.aGreen == null && this.greenUUID != null) {
                this.aGreen = (EntityAyeraco)Util.findEntityByUUID(this.greenUUID, this.worldObj);
                this.greenUUID = null;
            }
            if (this.aBlue == null && this.blueUUID != null) {
                this.aBlue = (EntityAyeraco)Util.findEntityByUUID(this.blueUUID, this.worldObj);
                this.blueUUID = null;
            }
            if (this.aYellow == null && this.yellowUUID != null) {
                this.aYellow = (EntityAyeraco)Util.findEntityByUUID(this.yellowUUID, this.worldObj);
                this.yellowUUID = null;
            }
            if (this.aPurple == null && this.purpleUUID != null) {
                this.aPurple = (EntityAyeraco)Util.findEntityByUUID(this.purpleUUID, this.worldObj);
                this.purpleUUID = null;
            }
        }
    }

    public void readFromNBT(NBTTagCompound tag) {
        super.readFromNBT(tag);
        this.greenUUID = tag.getString("greenUUID");
        this.blueUUID = tag.getString("blueUUID");
        this.yellowUUID = tag.getString("yellowUUID");
        this.purpleUUID = tag.getString("purpleUUID");
    }

    public void writeToNBT(NBTTagCompound tag) {
        super.writeToNBT(tag);
        tag.setString("greenUUID", this.aGreen.getPersistentID().toString());
        tag.setString("blueUUID", this.aBlue.getPersistentID().toString());
        tag.setString("yellowUUID", this.aYellow.getPersistentID().toString());
        tag.setString("purpleUUID", this.aPurple.getPersistentID().toString());
    }
}

