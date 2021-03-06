/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.model.ModelBase
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.monster.EntityMob
 *  net.minecraft.util.ResourceLocation
 *  org.lwjgl.opengl.GL11
 */
package net.divinerpg.client.render;

import net.divinerpg.client.render.RenderLivingCreature;
import net.divinerpg.entities.base.DivineBossStatus;
import net.divinerpg.entities.base.EntityDivineRPGBoss;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class RenderDivineBoss
extends RenderLivingCreature {
    private float scale;
    public int bossTextureID;

    public RenderDivineBoss(ModelBase var1, float var2, ResourceLocation texture, int id) {
        this(var1, var2, 1.0f, texture, id);
    }

    public RenderDivineBoss(ModelBase var1, float var2, float var3, ResourceLocation texture, int id) {
        super(var1, var2 * var3, texture);
        this.bossTextureID = id;
        this.scale = var3;
    }

    public void preRenderScale(EntityMob var1, float var2) {
        GL11.glScalef((float)this.scale, (float)this.scale, (float)this.scale);
    }

    protected void preRenderCallback(EntityLivingBase var1, float var2) {
        this.preRenderScale((EntityDivineRPGBoss)var1, var2);
    }

    public void doRender(Entity par1Entity, double par2, double par4, double par6, float par8, float par9) {
        super.doRender(par1Entity, par2, par4, par6, par8, par9);
        DivineBossStatus.setBossStatus((EntityDivineRPGBoss)par1Entity, this.bossTextureID);
    }
}

