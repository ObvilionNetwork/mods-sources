/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.model.ModelBase
 *  net.minecraft.client.model.ModelRenderer
 *  net.minecraft.entity.Entity
 *  net.minecraft.util.MathHelper
 */
package net.divinerpg.client.render.entity.twilight.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelDenseDemon
extends ModelBase {
    ModelRenderer Main_Body;
    ModelRenderer Lower_Body;
    ModelRenderer Legbottom1;
    ModelRenderer Legbottom2;
    ModelRenderer Legbottom3;
    ModelRenderer Legbottom4;
    ModelRenderer Legbottom5;
    ModelRenderer Legbottom6;
    ModelRenderer Legbottom7;
    ModelRenderer Legbottom8;
    ModelRenderer Legbottom9;
    ModelRenderer Legbottom10;
    ModelRenderer Legbottom11;
    ModelRenderer Legbottom12;
    ModelRenderer Legbottom13;
    ModelRenderer Legbottom14;
    ModelRenderer Legbottom15;
    ModelRenderer Legbottom16;
    ModelRenderer Legbottom17;
    ModelRenderer Legbottom18;
    ModelRenderer Legbottom19;
    ModelRenderer Legbottom20;
    ModelRenderer Legbottom21;
    ModelRenderer Legbottom22;
    ModelRenderer Legbottom23;
    ModelRenderer Legbottom24;
    ModelRenderer Legbottom25;

    public ModelDenseDemon() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.Main_Body = new ModelRenderer((ModelBase)this, 0, 0);
        this.Main_Body.addBox(0.0f, 0.0f, 0.0f, 10, 6, 10);
        this.Main_Body.setRotationPoint(-6.0f, 6.0f, 2.0f);
        this.Main_Body.setTextureSize(64, 32);
        this.Main_Body.mirror = true;
        this.setRotation(this.Main_Body, 0.0f, 1.570796f, 0.0f);
        this.Lower_Body = new ModelRenderer((ModelBase)this, 39, 20);
        this.Lower_Body.addBox(0.0f, 0.0f, 0.0f, 6, 6, 6);
        this.Lower_Body.setRotationPoint(-4.0f, 9.0f, 0.0f);
        this.Lower_Body.setTextureSize(64, 32);
        this.Lower_Body.mirror = true;
        this.setRotation(this.Lower_Body, 0.0f, 1.570796f, 0.0f);
        this.Legbottom1 = new ModelRenderer((ModelBase)this, 14, 5);
        this.Legbottom1.addBox(0.0f, 0.0f, 0.0f, 3, 2, 2);
        this.Legbottom1.setRotationPoint(4.0f, 8.0f, 0.0f);
        this.Legbottom1.setTextureSize(64, 32);
        this.Legbottom1.mirror = true;
        this.setRotation(this.Legbottom1, 0.0f, 0.0f, 0.0f);
        this.Legbottom2 = new ModelRenderer((ModelBase)this, 14, 5);
        this.Legbottom2.addBox(0.0f, 0.0f, 0.0f, 3, 2, 2);
        this.Legbottom2.setRotationPoint(4.0f, 8.0f, -7.0f);
        this.Legbottom2.setTextureSize(64, 32);
        this.Legbottom2.mirror = true;
        this.setRotation(this.Legbottom2, 0.0f, 0.0f, 0.0f);
        this.Legbottom3 = new ModelRenderer((ModelBase)this, 14, 18);
        this.Legbottom3.addBox(0.0f, 0.0f, 0.0f, 2, 2, 5);
        this.Legbottom3.setRotationPoint(4.0f, 1.0f, -5.0f);
        this.Legbottom3.setTextureSize(64, 32);
        this.Legbottom3.mirror = true;
        this.setRotation(this.Legbottom3, -1.570796f, 1.570796f, 0.0f);
        this.Legbottom4 = new ModelRenderer((ModelBase)this, 14, 18);
        this.Legbottom4.addBox(0.0f, 0.0f, 0.0f, 2, 2, 5);
        this.Legbottom4.setRotationPoint(4.0f, 1.0f, 2.0f);
        this.Legbottom4.setTextureSize(64, 32);
        this.Legbottom4.mirror = true;
        this.setRotation(this.Legbottom4, -1.570796f, 1.570796f, 0.0f);
        this.Legbottom5 = new ModelRenderer((ModelBase)this, 14, 18);
        this.Legbottom5.addBox(0.0f, 0.0f, 0.0f, 2, 2, 5);
        this.Legbottom5.setRotationPoint(-2.0f, 15.0f, -4.0f);
        this.Legbottom5.setTextureSize(64, 32);
        this.Legbottom5.mirror = true;
        this.setRotation(this.Legbottom5, -1.570796f, 1.570796f, 0.0f);
        this.Legbottom6 = new ModelRenderer((ModelBase)this, 14, 18);
        this.Legbottom6.addBox(0.0f, 0.0f, 0.0f, 2, 2, 5);
        this.Legbottom6.setRotationPoint(2.0f, 15.0f, -4.0f);
        this.Legbottom6.setTextureSize(64, 32);
        this.Legbottom6.mirror = true;
        this.setRotation(this.Legbottom6, -1.570796f, 1.570796f, 0.0f);
        this.Legbottom7 = new ModelRenderer((ModelBase)this, 14, 18);
        this.Legbottom7.addBox(0.0f, 0.0f, 0.0f, 2, 2, 5);
        this.Legbottom7.setRotationPoint(-2.0f, 15.0f, 0.0f);
        this.Legbottom7.setTextureSize(64, 32);
        this.Legbottom7.mirror = true;
        this.setRotation(this.Legbottom7, -1.570796f, 1.570796f, 0.0f);
        this.Legbottom8 = new ModelRenderer((ModelBase)this, 14, 18);
        this.Legbottom8.addBox(0.0f, 0.0f, 0.0f, 2, 2, 5);
        this.Legbottom8.setRotationPoint(2.0f, 15.0f, 0.0f);
        this.Legbottom8.setTextureSize(64, 32);
        this.Legbottom8.mirror = true;
        this.setRotation(this.Legbottom8, -1.570796f, 1.570796f, 0.0f);
        this.Legbottom9 = new ModelRenderer((ModelBase)this, 14, 18);
        this.Legbottom9.addBox(0.0f, 0.0f, 0.0f, 2, 2, 5);
        this.Legbottom9.setRotationPoint(0.0f, 1.0f, 2.0f);
        this.Legbottom9.setTextureSize(64, 32);
        this.Legbottom9.mirror = true;
        this.setRotation(this.Legbottom9, -1.570796f, 1.570796f, 0.0f);
        this.Legbottom10 = new ModelRenderer((ModelBase)this, 14, 18);
        this.Legbottom10.addBox(0.0f, 0.0f, 0.0f, 2, 2, 5);
        this.Legbottom10.setRotationPoint(0.0f, 1.0f, -5.0f);
        this.Legbottom10.setTextureSize(64, 32);
        this.Legbottom10.mirror = true;
        this.setRotation(this.Legbottom10, -1.570796f, 1.570796f, 0.0f);
        this.Legbottom11 = new ModelRenderer((ModelBase)this, 14, 18);
        this.Legbottom11.addBox(0.0f, 0.0f, 0.0f, 2, 2, 5);
        this.Legbottom11.setRotationPoint(4.0f, 1.0f, -2.0f);
        this.Legbottom11.setTextureSize(64, 32);
        this.Legbottom11.mirror = true;
        this.setRotation(this.Legbottom11, -1.570796f, 1.570796f, 0.0f);
        this.Legbottom12 = new ModelRenderer((ModelBase)this, 14, 18);
        this.Legbottom12.addBox(0.0f, 0.0f, 0.0f, 2, 2, 5);
        this.Legbottom12.setRotationPoint(0.0f, 1.0f, -2.0f);
        this.Legbottom12.setTextureSize(64, 32);
        this.Legbottom12.mirror = true;
        this.setRotation(this.Legbottom12, -1.570796f, 1.570796f, 0.0f);
        this.Legbottom13 = new ModelRenderer((ModelBase)this, 14, 5);
        this.Legbottom13.addBox(0.0f, 0.0f, 0.0f, 3, 2, 2);
        this.Legbottom13.setRotationPoint(4.0f, 8.0f, -4.0f);
        this.Legbottom13.setTextureSize(64, 32);
        this.Legbottom13.mirror = true;
        this.setRotation(this.Legbottom13, 0.0f, 0.0f, 0.0f);
        this.Legbottom14 = new ModelRenderer((ModelBase)this, 14, 18);
        this.Legbottom14.addBox(0.0f, 0.0f, 0.0f, 2, 2, 5);
        this.Legbottom14.setRotationPoint(-4.0f, 1.0f, -5.0f);
        this.Legbottom14.setTextureSize(64, 32);
        this.Legbottom14.mirror = true;
        this.setRotation(this.Legbottom14, -1.570796f, 1.570796f, 0.0f);
        this.Legbottom15 = new ModelRenderer((ModelBase)this, 14, 18);
        this.Legbottom15.addBox(0.0f, 0.0f, 0.0f, 2, 2, 5);
        this.Legbottom15.setRotationPoint(-4.0f, 1.0f, -2.0f);
        this.Legbottom15.setTextureSize(64, 32);
        this.Legbottom15.mirror = true;
        this.setRotation(this.Legbottom15, -1.570796f, 1.570796f, 0.0f);
        this.Legbottom16 = new ModelRenderer((ModelBase)this, 14, 18);
        this.Legbottom16.addBox(0.0f, 0.0f, 0.0f, 2, 2, 5);
        this.Legbottom16.setRotationPoint(-4.0f, 1.0f, 2.0f);
        this.Legbottom16.setTextureSize(64, 32);
        this.Legbottom16.mirror = true;
        this.setRotation(this.Legbottom16, -1.570796f, 1.570796f, 0.0f);
        this.Legbottom17 = new ModelRenderer((ModelBase)this, 14, 5);
        this.Legbottom17.addBox(0.0f, 0.0f, 0.0f, 3, 2, 2);
        this.Legbottom17.setRotationPoint(4.0f, 5.0f, -7.0f);
        this.Legbottom17.setTextureSize(64, 32);
        this.Legbottom17.mirror = true;
        this.setRotation(this.Legbottom17, 0.0f, 0.0f, 0.0f);
        this.Legbottom18 = new ModelRenderer((ModelBase)this, 14, 5);
        this.Legbottom18.addBox(0.0f, 0.0f, 0.0f, 3, 2, 2);
        this.Legbottom18.setRotationPoint(4.0f, 5.0f, -4.0f);
        this.Legbottom18.setTextureSize(64, 32);
        this.Legbottom18.mirror = true;
        this.setRotation(this.Legbottom18, 0.0f, 0.0f, 0.0f);
        this.Legbottom19 = new ModelRenderer((ModelBase)this, 14, 5);
        this.Legbottom19.addBox(0.0f, 0.0f, 0.0f, 3, 2, 2);
        this.Legbottom19.setRotationPoint(4.0f, 5.0f, 0.0f);
        this.Legbottom19.setTextureSize(64, 32);
        this.Legbottom19.mirror = true;
        this.setRotation(this.Legbottom19, 0.0f, 0.0f, 0.0f);
        this.Legbottom20 = new ModelRenderer((ModelBase)this, 14, 5);
        this.Legbottom20.addBox(0.0f, 0.0f, 0.0f, 3, 2, 2);
        this.Legbottom20.setRotationPoint(-9.0f, 5.0f, -7.0f);
        this.Legbottom20.setTextureSize(64, 32);
        this.Legbottom20.mirror = true;
        this.setRotation(this.Legbottom20, 0.0f, 0.0f, 0.0f);
        this.Legbottom21 = new ModelRenderer((ModelBase)this, 14, 5);
        this.Legbottom21.addBox(0.0f, 0.0f, 0.0f, 3, 2, 2);
        this.Legbottom21.setRotationPoint(-9.0f, 5.0f, -4.0f);
        this.Legbottom21.setTextureSize(64, 32);
        this.Legbottom21.mirror = true;
        this.setRotation(this.Legbottom21, 0.0f, 0.0f, 0.0f);
        this.Legbottom22 = new ModelRenderer((ModelBase)this, 14, 5);
        this.Legbottom22.addBox(0.0f, 0.0f, 0.0f, 3, 2, 2);
        this.Legbottom22.setRotationPoint(-9.0f, 5.0f, 0.0f);
        this.Legbottom22.setTextureSize(64, 32);
        this.Legbottom22.mirror = true;
        this.setRotation(this.Legbottom22, 0.0f, 0.0f, 0.0f);
        this.Legbottom23 = new ModelRenderer((ModelBase)this, 14, 5);
        this.Legbottom23.addBox(0.0f, 0.0f, 0.0f, 3, 2, 2);
        this.Legbottom23.setRotationPoint(-9.0f, 8.0f, 0.0f);
        this.Legbottom23.setTextureSize(64, 32);
        this.Legbottom23.mirror = true;
        this.setRotation(this.Legbottom23, 0.0f, 0.0f, 0.0f);
        this.Legbottom24 = new ModelRenderer((ModelBase)this, 14, 5);
        this.Legbottom24.addBox(0.0f, 0.0f, 0.0f, 3, 2, 2);
        this.Legbottom24.setRotationPoint(-9.0f, 8.0f, -4.0f);
        this.Legbottom24.setTextureSize(64, 32);
        this.Legbottom24.mirror = true;
        this.setRotation(this.Legbottom24, 0.0f, 0.0f, 0.0f);
        this.Legbottom25 = new ModelRenderer((ModelBase)this, 14, 5);
        this.Legbottom25.addBox(0.0f, 0.0f, 0.0f, 3, 2, 2);
        this.Legbottom25.setRotationPoint(-9.0f, 8.0f, -7.0f);
        this.Legbottom25.setTextureSize(64, 32);
        this.Legbottom25.mirror = true;
        this.setRotation(this.Legbottom25, 0.0f, 0.0f, 0.0f);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        this.setRotationAngles(f, f1, f2, f3, f4, f5);
        this.Main_Body.render(f5);
        this.Lower_Body.render(f5);
        this.Legbottom1.render(f5);
        this.Legbottom2.render(f5);
        this.Legbottom3.render(f5);
        this.Legbottom4.render(f5);
        this.Legbottom5.render(f5);
        this.Legbottom6.render(f5);
        this.Legbottom7.render(f5);
        this.Legbottom8.render(f5);
        this.Legbottom9.render(f5);
        this.Legbottom10.render(f5);
        this.Legbottom11.render(f5);
        this.Legbottom12.render(f5);
        this.Legbottom13.render(f5);
        this.Legbottom14.render(f5);
        this.Legbottom15.render(f5);
        this.Legbottom16.render(f5);
        this.Legbottom17.render(f5);
        this.Legbottom18.render(f5);
        this.Legbottom19.render(f5);
        this.Legbottom20.render(f5);
        this.Legbottom21.render(f5);
        this.Legbottom22.render(f5);
        this.Legbottom23.render(f5);
        this.Legbottom24.render(f5);
        this.Legbottom25.render(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6) {
        this.Legbottom1.rotateAngleX = 0.2f * MathHelper.sin((float)(par3 * 0.3f)) + 0.4f;
        this.Legbottom2.rotateAngleX = 0.2f * MathHelper.sin((float)(par3 * 0.3f)) + 0.4f;
        this.Legbottom3.rotateAngleX = 0.2f * MathHelper.sin((float)(par3 * 0.3f)) + 0.4f;
        this.Legbottom4.rotateAngleX = 0.2f * MathHelper.sin((float)(par3 * 0.3f)) + 0.4f;
        this.Legbottom5.rotateAngleX = 0.2f * MathHelper.sin((float)(par3 * 0.3f)) + 0.4f;
        this.Legbottom6.rotateAngleX = 0.2f * MathHelper.sin((float)(par3 * 0.3f)) + 0.4f;
        this.Legbottom7.rotateAngleX = 0.2f * MathHelper.sin((float)(par3 * 0.3f)) + 0.4f;
        this.Legbottom8.rotateAngleX = 0.2f * MathHelper.sin((float)(par3 * 0.3f)) + 0.4f;
        this.Legbottom9.rotateAngleX = 0.2f * MathHelper.sin((float)(par3 * 0.3f)) + 0.4f;
        this.Legbottom10.rotateAngleX = 0.2f * MathHelper.sin((float)(par3 * 0.3f)) + 0.4f;
        this.Legbottom11.rotateAngleX = 0.2f * MathHelper.sin((float)(par3 * 0.3f)) + 0.4f;
        this.Legbottom12.rotateAngleX = 0.2f * MathHelper.sin((float)(par3 * 0.3f)) + 0.4f;
        this.Legbottom13.rotateAngleX = 0.2f * MathHelper.sin((float)(par3 * 0.3f)) + 0.4f;
        this.Legbottom14.rotateAngleX = 0.2f * MathHelper.sin((float)(par3 * 0.3f)) + 0.4f;
        this.Legbottom15.rotateAngleX = 0.2f * MathHelper.sin((float)(par3 * 0.3f)) + 0.4f;
        this.Legbottom16.rotateAngleX = 0.2f * MathHelper.sin((float)(par3 * 0.3f)) + 0.4f;
        this.Legbottom17.rotateAngleX = 0.2f * MathHelper.sin((float)(par3 * 0.3f)) + 0.4f;
        this.Legbottom18.rotateAngleX = 0.2f * MathHelper.sin((float)(par3 * 0.3f)) + 0.4f;
        this.Legbottom19.rotateAngleX = 0.2f * MathHelper.sin((float)(par3 * 0.3f)) + 0.4f;
        this.Legbottom20.rotateAngleX = 0.2f * MathHelper.sin((float)(par3 * 0.3f)) + 0.4f;
        this.Legbottom21.rotateAngleX = 0.2f * MathHelper.sin((float)(par3 * 0.3f)) + 0.4f;
        this.Legbottom22.rotateAngleX = 0.2f * MathHelper.sin((float)(par3 * 0.3f)) + 0.4f;
        this.Legbottom23.rotateAngleX = 0.2f * MathHelper.sin((float)(par3 * 0.3f)) + 0.4f;
        this.Legbottom24.rotateAngleX = 0.2f * MathHelper.sin((float)(par3 * 0.3f)) + 0.4f;
        this.Legbottom25.rotateAngleX = 0.2f * MathHelper.sin((float)(par3 * 0.3f)) + 0.4f;
    }
}

