/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityCreature
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.SharedMonsterAttributes
 *  net.minecraft.entity.ai.EntityAIBase
 *  net.minecraft.entity.ai.EntityAINearestAttackableTarget
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.item.Item
 *  net.minecraft.world.World
 */
package net.divinerpg.entities.twilight;

import net.divinerpg.entities.base.EntityDivineRPGMob;
import net.divinerpg.entities.base.EntityStats;
import net.divinerpg.entities.twilight.projectile.EntityTwilightMageShot;
import net.divinerpg.libs.Sounds;
import net.divinerpg.utils.items.ItemsFood;
import net.divinerpg.utils.items.TwilightItemsOther;
import net.divinerpg.utils.items.VanillaItemsOther;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class EntityMage
extends EntityDivineRPGMob {
    public EntityMage(World var1) {
        super(var1);
        this.setSize(0.5f, 2.0f);
        this.targetTasks.addTask(2, (EntityAIBase)new EntityAINearestAttackableTarget((EntityCreature)this, EntityPlayer.class, 0, true));
    }

    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(EntityStats.mageHealth);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(EntityStats.mageDamage);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(EntityStats.mageSpeed);
        this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(EntityStats.mageFollowRange);
    }

    protected String getLivingSound() {
        return Sounds.getSoundName(Sounds.insect);
    }

    protected String getHurtSound() {
        return this.getLivingSound();
    }

    public void onUpdate() {
        super.onUpdate();
        if (this.ticksExisted % 30 == 0) {
            this.entityToAttack = this.worldObj.getClosestVulnerablePlayerToEntity((Entity)this, 16.0);
            if (this.entityToAttack != null && !this.worldObj.isRemote) {
                double tx = this.entityToAttack.posX - this.posX;
                double ty = this.entityToAttack.boundingBox.minY - this.posY;
                double tz = this.entityToAttack.posZ - this.posZ;
                EntityTwilightMageShot e = new EntityTwilightMageShot(this.worldObj, (EntityLivingBase)this, 62, 212, 254);
                e.setThrowableHeading(tx, ty, tz, 1.6f, 0.0f);
                this.worldObj.spawnEntityInWorld((Entity)e);
                this.worldObj.playSoundAtEntity(this.entityToAttack, Sounds.mageFire.getPrefixedName(), 1.0f, 1.0f);
            }
        }
    }

    public boolean isValidLightLevel() {
        return true;
    }

    protected void dropFewItems(boolean var1, int var2) {
        super.dropFewItems(var1, var2);
        this.dropItem(ItemsFood.magicMeat, 1);
        this.dropItem(TwilightItemsOther.wildwoodSoul, this.rand.nextInt(5) + var2 + 1);
        if (this.rand.nextInt(2) == 0) {
            this.dropItem(VanillaItemsOther.blueShard, 1);
        }
    }

    protected Item getDropItem() {
        return TwilightItemsOther.wildwoodSoul;
    }

    @Override
    public String mobName() {
        return "Mage";
    }
}

