/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.model.ModelBase
 *  net.minecraft.client.model.ModelRenderer
 *  net.minecraft.entity.Entity
 *  net.minecraft.util.MathHelper
 */
package net.divinerpg.client.render.entity.vanilla.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelRainbour
extends ModelBase {
    ModelRenderer body;
    ModelRenderer lwing1;
    ModelRenderer head;
    ModelRenderer lwing2;
    ModelRenderer lwing3;
    ModelRenderer lhorn1;
    ModelRenderer rhorn1;
    ModelRenderer snout;
    ModelRenderer lhorn2;
    ModelRenderer rhorn2;
    ModelRenderer tummy;
    ModelRenderer chin;
    ModelRenderer rwing1;
    ModelRenderer rwing2;
    ModelRenderer rwing3;
    ModelRenderer tail1;
    ModelRenderer tail2;
    ModelRenderer tail3;
    ModelRenderer tail4;
    ModelRenderer lhip;
    ModelRenderer rhip;
    ModelRenderer rthigh;
    ModelRenderer lthigh;
    ModelRenderer lfoot;
    ModelRenderer rfoot;
    ModelRenderer hornything;

    public ModelRainbour() {
        this.textureWidth = 128;
        this.textureHeight = 64;
        this.body = new ModelRenderer((ModelBase)this, 0, 0);
        this.body.addBox(-4.0f, -4.0f, 0.0f, 8, 6, 11);
        this.body.setRotationPoint(0.0f, 8.0f, -5.0f);
        this.body.setTextureSize(128, 64);
        this.body.mirror = true;
        this.setRotation(this.body, 0.0f, 0.0f, 0.0f);
        this.lwing1 = new ModelRenderer((ModelBase)this, 0, 18);
        this.lwing1.addBox(0.0f, 0.0f, -2.0f, 9, 1, 7);
        this.lwing1.setRotationPoint(3.0f, 6.0f, -3.0f);
        this.lwing1.setTextureSize(128, 64);
        this.lwing1.mirror = true;
        this.setRotation(this.lwing1, 0.0f, -0.3665191f, 0.0f);
        this.head = new ModelRenderer((ModelBase)this, 0, 27);
        this.head.addBox(-3.0f, -2.0f, -5.0f, 6, 5, 6);
        this.head.setRotationPoint(0.0f, 7.0f, -5.0f);
        this.head.setTextureSize(128, 64);
        this.head.mirror = true;
        this.setRotation(this.head, 0.0f, 0.0f, 0.0f);
        this.lwing2 = new ModelRenderer((ModelBase)this, 0, 39);
        this.lwing2.addBox(4.0f, 0.0f, 0.0f, 8, 1, 9);
        this.lwing2.setRotationPoint(3.0f, 6.0f, -3.0f);
        this.lwing2.setTextureSize(128, 64);
        this.lwing2.mirror = true;
        this.setRotation(this.lwing2, 0.0f, 0.1919862f, 0.0f);
        this.lwing3 = new ModelRenderer((ModelBase)this, 0, 50);
        this.lwing3.addBox(11.0f, 0.0f, -5.0f, 14, 1, 10);
        this.lwing3.setRotationPoint(3.0f, 6.0f, -3.0f);
        this.lwing3.setTextureSize(128, 64);
        this.lwing3.mirror = true;
        this.setRotation(this.lwing3, 0.0f, -0.2617994f, 0.0f);
        this.lhorn1 = new ModelRenderer((ModelBase)this, 24, 27);
        this.lhorn1.addBox(2.5f, -4.0f, -3.5f, 1, 4, 2);
        this.lhorn1.setRotationPoint(0.0f, 7.0f, -5.0f);
        this.lhorn1.setTextureSize(128, 64);
        this.lhorn1.mirror = true;
        this.setRotation(this.lhorn1, -0.6457718f, 0.0f, 0.0f);
        this.rhorn1 = new ModelRenderer((ModelBase)this, 30, 27);
        this.rhorn1.addBox(-3.5f, -4.0f, -3.5f, 1, 3, 2);
        this.rhorn1.setRotationPoint(0.0f, 7.0f, -5.0f);
        this.rhorn1.setTextureSize(128, 64);
        this.rhorn1.mirror = true;
        this.setRotation(this.rhorn1, -0.6457718f, 0.0f, 0.0f);
        this.snout = new ModelRenderer((ModelBase)this, 34, 41);
        this.snout.addBox(-2.0f, -1.2f, -7.0f, 4, 4, 3);
        this.snout.setRotationPoint(0.0f, 7.0f, -5.0f);
        this.snout.setTextureSize(128, 64);
        this.snout.mirror = true;
        this.setRotation(this.snout, 0.0f, 0.0f, 0.0f);
        this.lhorn2 = new ModelRenderer((ModelBase)this, 25, 34);
        this.lhorn2.addBox(2.5f, -6.0f, -2.5f, 1, 4, 1);
        this.lhorn2.setRotationPoint(0.0f, 7.0f, -5.0f);
        this.lhorn2.setTextureSize(128, 64);
        this.lhorn2.mirror = true;
        this.setRotation(this.lhorn2, -0.6457718f, 0.0f, 0.0f);
        this.rhorn2 = new ModelRenderer((ModelBase)this, 30, 34);
        this.rhorn2.addBox(-3.5f, -6.0f, -2.5f, 1, 3, 1);
        this.rhorn2.setRotationPoint(0.0f, 7.0f, -5.0f);
        this.rhorn2.setTextureSize(128, 64);
        this.rhorn2.mirror = true;
        this.setRotation(this.rhorn2, -0.6457718f, 0.0f, 0.0f);
        this.tummy = new ModelRenderer((ModelBase)this, 58, 0);
        this.tummy.addBox(-3.0f, 1.0f, 1.0f, 6, 2, 9);
        this.tummy.setRotationPoint(0.0f, 8.0f, -5.0f);
        this.tummy.setTextureSize(128, 64);
        this.tummy.mirror = true;
        this.setRotation(this.tummy, 0.0f, 0.0f, 0.0f);
        this.chin = new ModelRenderer((ModelBase)this, 39, 11);
        this.chin.addBox(-2.0f, 1.5f, -4.0f, 4, 2, 4);
        this.chin.setRotationPoint(0.0f, 7.0f, -5.0f);
        this.chin.setTextureSize(128, 64);
        this.chin.mirror = true;
        this.setRotation(this.chin, 0.0f, 0.0f, 0.0f);
        this.rwing1 = new ModelRenderer((ModelBase)this, 33, 18);
        this.rwing1.addBox(-9.0f, 0.0f, -2.0f, 9, 1, 7);
        this.rwing1.setRotationPoint(-3.0f, 6.0f, -3.0f);
        this.rwing1.setTextureSize(128, 64);
        this.rwing1.mirror = true;
        this.setRotation(this.rwing1, 0.0f, 0.3665191f, 0.0f);
        this.rwing2 = new ModelRenderer((ModelBase)this, 38, 28);
        this.rwing2.addBox(-12.0f, 0.0f, 0.0f, 8, 1, 9);
        this.rwing2.setRotationPoint(-3.0f, 6.0f, -3.0f);
        this.rwing2.setTextureSize(128, 64);
        this.rwing2.mirror = true;
        this.setRotation(this.rwing2, 0.0f, -0.1919862f, 0.0f);
        this.rwing3 = new ModelRenderer((ModelBase)this, 66, 15);
        this.rwing3.addBox(-25.0f, 0.0f, -5.0f, 14, 1, 10);
        this.rwing3.setRotationPoint(-3.0f, 6.0f, -3.0f);
        this.rwing3.setTextureSize(128, 64);
        this.rwing3.mirror = true;
        this.setRotation(this.rwing3, 0.0f, 0.2617994f, 0.0f);
        this.tail1 = new ModelRenderer((ModelBase)this, 48, 50);
        this.tail1.addBox(-3.0f, -2.5f, 0.0f, 6, 5, 6);
        this.tail1.setRotationPoint(0.0f, 7.0f, 4.0f);
        this.tail1.setTextureSize(128, 64);
        this.tail1.mirror = true;
        this.setRotation(this.tail1, 0.0f, 0.0f, 0.0f);
        this.tail2 = new ModelRenderer((ModelBase)this, 49, 40);
        this.tail2.addBox(-2.0f, -2.0f, 5.0f, 4, 4, 5);
        this.tail2.setRotationPoint(0.0f, 7.0f, 4.0f);
        this.tail2.setTextureSize(128, 64);
        this.tail2.mirror = true;
        this.setRotation(this.tail2, 0.0f, 0.0f, 0.0f);
        this.tail3 = new ModelRenderer((ModelBase)this, 68, 41);
        this.tail3.addBox(-1.5f, -1.5f, 9.0f, 3, 3, 4);
        this.tail3.setRotationPoint(0.0f, 7.0f, 4.0f);
        this.tail3.setTextureSize(128, 64);
        this.tail3.mirror = true;
        this.setRotation(this.tail3, 0.0f, 0.0f, 0.0f);
        this.tail4 = new ModelRenderer((ModelBase)this, 73, 52);
        this.tail4.addBox(-0.5f, -1.0f, 12.0f, 1, 2, 5);
        this.tail4.setRotationPoint(0.0f, 7.0f, 4.0f);
        this.tail4.setTextureSize(128, 64);
        this.tail4.mirror = true;
        this.setRotation(this.tail4, 0.0f, 0.0f, 0.0f);
        this.lhip = new ModelRenderer((ModelBase)this, 73, 28);
        this.lhip.addBox(-1.5f, 0.0f, -1.5f, 3, 5, 3);
        this.lhip.setRotationPoint(3.0f, 9.0f, 2.0f);
        this.lhip.setTextureSize(128, 64);
        this.lhip.mirror = true;
        this.setRotation(this.lhip, -0.2268928f, 0.0f, 0.0f);
        this.rhip = new ModelRenderer((ModelBase)this, 86, 28);
        this.rhip.addBox(-1.5f, 0.0f, -1.5f, 3, 5, 3);
        this.rhip.setRotationPoint(-3.0f, 9.0f, 2.0f);
        this.rhip.setTextureSize(128, 64);
        this.rhip.mirror = true;
        this.setRotation(this.rhip, -0.2268928f, 0.0f, 0.0f);
        this.rthigh = new ModelRenderer((ModelBase)this, 39, 1);
        this.rthigh.addBox(-1.0f, 2.0f, -4.5f, 2, 3, 2);
        this.rthigh.setRotationPoint(-3.0f, 9.0f, 2.0f);
        this.rthigh.setTextureSize(128, 64);
        this.rthigh.mirror = true;
        this.setRotation(this.rthigh, 0.7679449f, 0.0f, 0.0f);
        this.lthigh = new ModelRenderer((ModelBase)this, 99, 29);
        this.lthigh.addBox(-1.0f, 2.0f, -4.5f, 2, 3, 2);
        this.lthigh.setRotationPoint(3.0f, 9.0f, 2.0f);
        this.lthigh.setTextureSize(128, 64);
        this.lthigh.mirror = true;
        this.setRotation(this.lthigh, 0.7679449f, 0.0f, 0.0f);
        this.lfoot = new ModelRenderer((ModelBase)this, 56, 12);
        this.lfoot.addBox(-0.5f, 4.5f, 2.0f, 1, 4, 1);
        this.lfoot.setRotationPoint(3.0f, 9.0f, 2.0f);
        this.lfoot.setTextureSize(128, 64);
        this.lfoot.mirror = true;
        this.setRotation(this.lfoot, -0.3839724f, 0.0f, 0.0f);
        this.rfoot = new ModelRenderer((ModelBase)this, 61, 12);
        this.rfoot.addBox(-0.5f, 4.5f, 2.0f, 1, 4, 1);
        this.rfoot.setRotationPoint(-3.0f, 9.0f, 2.0f);
        this.rfoot.setTextureSize(128, 64);
        this.rfoot.mirror = true;
        this.setRotation(this.rfoot, -0.3839724f, 0.0f, 0.0f);
        this.hornything = new ModelRenderer((ModelBase)this, 49, 0);
        this.hornything.addBox(-1.0f, -0.9f, -4.0f, 2, 2, 2);
        this.hornything.setRotationPoint(0.0f, 7.0f, -5.0f);
        this.hornything.setTextureSize(128, 64);
        this.hornything.mirror = true;
        this.setRotation(this.hornything, -0.8028515f, 0.0f, 0.0f);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        this.setRotationAngles(f, f1, f2, f3, f4, f5);
        this.body.render(f5);
        this.lwing1.render(f5);
        this.head.render(f5);
        this.lwing2.render(f5);
        this.lwing3.render(f5);
        this.lhorn1.render(f5);
        this.rhorn1.render(f5);
        this.snout.render(f5);
        this.lhorn2.render(f5);
        this.rhorn2.render(f5);
        this.tummy.render(f5);
        this.chin.render(f5);
        this.rwing1.render(f5);
        this.rwing2.render(f5);
        this.rwing3.render(f5);
        this.tail1.render(f5);
        this.tail2.render(f5);
        this.tail3.render(f5);
        this.tail4.render(f5);
        this.lhip.render(f5);
        this.rhip.render(f5);
        this.rthigh.render(f5);
        this.lthigh.render(f5);
        this.lfoot.render(f5);
        this.rfoot.render(f5);
        this.hornything.render(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6) {
        this.head.rotateAngleX = par5 / 57.295776f;
        this.head.rotateAngleY = par4 / 57.295776f;
        this.snout.rotateAngleX = par5 / 57.295776f;
        this.snout.rotateAngleY = par4 / 57.295776f;
        this.lhorn1.rotateAngleX = -0.646f + par5 / 57.295776f;
        this.lhorn1.rotateAngleY = par4 / 57.295776f;
        this.lhorn2.rotateAngleX = -0.646f + par5 / 57.295776f;
        this.lhorn2.rotateAngleY = par4 / 57.295776f;
        this.rhorn1.rotateAngleX = -0.646f + par5 / 57.295776f;
        this.rhorn1.rotateAngleY = par4 / 57.295776f;
        this.rhorn2.rotateAngleX = -0.646f + par5 / 57.295776f;
        this.rhorn2.rotateAngleY = par4 / 57.295776f;
        this.chin.rotateAngleX = par5 / 57.295776f;
        this.chin.rotateAngleY = par4 / 57.295776f;
        this.hornything.rotateAngleX = par5 / 57.295776f;
        this.hornything.rotateAngleY = par4 / 57.295776f;
        this.lhip.rotateAngleX = -0.227f + 1.4f * par2;
        this.lthigh.rotateAngleX = 0.768f + 1.4f * par2;
        this.lfoot.rotateAngleX = -0.384f + 1.4f * par2;
        this.rhip.rotateAngleX = -0.227f + 1.4f * par2;
        this.rthigh.rotateAngleX = 0.768f + 1.4f * par2;
        this.rfoot.rotateAngleX = -0.384f + 1.4f * par2;
        this.rwing1.rotateAngleZ = MathHelper.cos((float)(par3 * 0.3f)) * (float)Math.PI * 0.3f;
        this.rwing2.rotateAngleZ = MathHelper.cos((float)(par3 * 0.3f)) * (float)Math.PI * 0.3f;
        this.rwing3.rotateAngleZ = MathHelper.cos((float)(par3 * 0.3f)) * (float)Math.PI * 0.3f;
        this.lwing1.rotateAngleZ = MathHelper.cos((float)(par3 * 0.3f)) * (float)Math.PI * -0.3f;
        this.lwing2.rotateAngleZ = MathHelper.cos((float)(par3 * 0.3f)) * (float)Math.PI * -0.3f;
        this.lwing3.rotateAngleZ = MathHelper.cos((float)(par3 * 0.3f)) * (float)Math.PI * -0.3f;
    }
}

