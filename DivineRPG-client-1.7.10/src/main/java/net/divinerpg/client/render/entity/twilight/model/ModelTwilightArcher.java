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

public class ModelTwilightArcher
extends ModelBase {
    ModelRenderer head;
    ModelRenderer body1;
    ModelRenderer rightarmext;
    ModelRenderer leftfoot;
    ModelRenderer bodymain;
    ModelRenderer body2;
    ModelRenderer body3;
    ModelRenderer body4;
    ModelRenderer body6;
    ModelRenderer body5;
    public ModelRenderer rightarm;
    ModelRenderer rightarmcap;
    ModelRenderer leftarm;
    ModelRenderer leftarmext;
    ModelRenderer leftarmcap;
    ModelRenderer leftleg;
    ModelRenderer leftlegcap;
    ModelRenderer rightfoot;
    ModelRenderer rightleg;
    ModelRenderer rightlegcap;
    ModelRenderer Shape1;
    ModelRenderer Shape2;
    ModelRenderer Shape3;
    ModelRenderer Shape4;
    ModelRenderer Shape5;
    ModelRenderer Shape6;
    ModelRenderer Shape7;
    ModelRenderer Shape8;
    ModelRenderer Shape9;
    ModelRenderer Shape10;
    ModelRenderer Shape11;
    ModelRenderer Shape12;
    ModelRenderer Shape13;
    ModelRenderer Shape14;
    ModelRenderer Shape15;
    ModelRenderer Shape16;
    ModelRenderer Shape17;
    ModelRenderer Shape18;
    ModelRenderer Shape19;
    ModelRenderer Shape20;
    ModelRenderer body12;
    ModelRenderer body7;
    ModelRenderer body8;
    ModelRenderer body9;
    ModelRenderer body10;
    ModelRenderer body11;
    ModelRenderer head2;
    ModelRenderer Shape21;
    ModelRenderer Shape22;
    ModelRenderer Shape23;
    ModelRenderer Shape24;
    ModelRenderer Shape25;
    ModelRenderer Shape26;
    ModelRenderer Shape27;
    ModelRenderer Shape28;
    ModelRenderer Shape29;
    ModelRenderer Shape30;
    ModelRenderer Shape31;
    ModelRenderer Shape32;
    ModelRenderer Shape33;
    ModelRenderer Shape34;
    ModelRenderer Shape35;
    ModelRenderer Shape36;
    ModelRenderer Shape37;
    ModelRenderer Shape38;
    ModelRenderer Shape39;
    ModelRenderer Shape40;

    public ModelTwilightArcher() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.head = new ModelRenderer((ModelBase)this, 0, 0);
        this.head.addBox(-4.0f, -8.0f, -4.0f, 8, 8, 8);
        this.head.setRotationPoint(-5.0f, -16.0f, -19.0f);
        this.head.setTextureSize(64, 32);
        this.head.mirror = true;
        this.setRotation(this.head, 0.0f, 0.0f, 0.0f);
        this.body1 = new ModelRenderer((ModelBase)this, 0, 22);
        this.body1.addBox(-4.0f, 0.0f, -2.0f, 8, 6, 4);
        this.body1.setRotationPoint(-5.0f, -12.0f, -2.0f);
        this.body1.setTextureSize(64, 32);
        this.body1.mirror = true;
        this.setRotation(this.body1, 0.261799f, 0.0f, 0.0f);
        this.rightarmext = new ModelRenderer((ModelBase)this, 40, 10);
        this.rightarmext.addBox(-7.0f, -2.0f, -2.0f, 8, 4, 4);
        this.rightarmext.setRotationPoint(-10.0f, -16.0f, -6.0f);
        this.rightarmext.setTextureSize(64, 32);
        this.rightarmext.mirror = true;
        this.setRotation(this.rightarmext, 0.0f, 0.0f, 0.0f);
        this.leftfoot = new ModelRenderer((ModelBase)this, 28, 15);
        this.leftfoot.addBox(-3.0f, 17.0f, -9.0f, 6, 5, 12);
        this.leftfoot.setRotationPoint(10.0f, 2.0f, 0.0f);
        this.leftfoot.setTextureSize(64, 32);
        this.leftfoot.mirror = true;
        this.setRotation(this.leftfoot, 0.0f, 0.0f, 0.0f);
        this.bodymain = new ModelRenderer((ModelBase)this, 28, 10);
        this.bodymain.addBox(-4.0f, 0.0f, -2.0f, 14, 18, 4);
        this.bodymain.setRotationPoint(-3.0f, -6.0f, 0.0f);
        this.bodymain.setTextureSize(64, 32);
        this.bodymain.mirror = true;
        this.setRotation(this.bodymain, 0.0f, 0.0f, 0.0f);
        this.body2 = new ModelRenderer((ModelBase)this, 0, 22);
        this.body2.addBox(-4.0f, 0.0f, -2.0f, 8, 6, 4);
        this.body2.setRotationPoint(-5.0f, -21.0f, -14.0f);
        this.body2.setTextureSize(64, 32);
        this.body2.mirror = true;
        this.setRotation(this.body2, 1.308997f, 0.0f, 0.0f);
        this.body3 = new ModelRenderer((ModelBase)this, 16, 16);
        this.body3.addBox(-4.0f, 0.0f, -2.0f, 4, 3, 4);
        this.body3.setRotationPoint(-3.0f, -21.0f, -16.0f);
        this.body3.setTextureSize(64, 32);
        this.body3.mirror = true;
        this.setRotation(this.body3, 1.570796f, 0.0f, 0.0f);
        this.body4 = new ModelRenderer((ModelBase)this, 0, 22);
        this.body4.addBox(-4.0f, 0.0f, -2.0f, 4, 3, 4);
        this.body4.setRotationPoint(-3.0f, -14.0f, -3.0f);
        this.body4.setTextureSize(64, 32);
        this.body4.mirror = true;
        this.setRotation(this.body4, 0.5235988f, 0.0f, 0.0f);
        this.body6 = new ModelRenderer((ModelBase)this, 0, 22);
        this.body6.addBox(-4.0f, 0.0f, -2.0f, 8, 6, 4);
        this.body6.setRotationPoint(-5.0f, -18.0f, -7.0f);
        this.body6.setTextureSize(64, 32);
        this.body6.mirror = true;
        this.setRotation(this.body6, 0.7853982f, 0.0f, 0.0f);
        this.body5 = new ModelRenderer((ModelBase)this, 0, 22);
        this.body5.addBox(-4.0f, 0.0f, -2.0f, 4, 3, 4);
        this.body5.setRotationPoint(-3.0f, -19.0f, -9.0f);
        this.body5.setTextureSize(64, 32);
        this.body5.mirror = true;
        this.setRotation(this.body5, 1.047198f, 0.0f, 0.0f);
        this.rightarm = new ModelRenderer((ModelBase)this, 40, 10);
        this.rightarm.addBox(-11.0f, -2.0f, -2.0f, 4, 18, 4);
        this.rightarm.setRotationPoint(-10.0f, -16.0f, -6.0f);
        this.rightarm.setTextureSize(64, 32);
        this.rightarm.mirror = true;
        this.setRotation(this.rightarm, 0.0f, 0.0f, 0.0f);
        this.rightarmcap = new ModelRenderer((ModelBase)this, 40, 10);
        this.rightarmcap.addBox(-12.0f, -3.0f, -3.0f, 6, 6, 6);
        this.rightarmcap.setRotationPoint(-10.0f, -16.0f, -6.0f);
        this.rightarmcap.setTextureSize(64, 32);
        this.rightarmcap.mirror = true;
        this.setRotation(this.rightarmcap, 0.0f, 0.0f, 0.0f);
        this.leftarm = new ModelRenderer((ModelBase)this, 40, 10);
        this.leftarm.addBox(7.0f, -2.0f, -2.0f, 4, 18, 4);
        this.leftarm.setRotationPoint(10.0f, -16.0f, -7.0f);
        this.leftarm.setTextureSize(64, 32);
        this.leftarm.mirror = true;
        this.setRotation(this.leftarm, 0.0f, 0.0f, 0.0f);
        this.leftarmext = new ModelRenderer((ModelBase)this, 40, 10);
        this.leftarmext.addBox(-1.0f, -2.0f, -2.0f, 8, 4, 4);
        this.leftarmext.setRotationPoint(10.0f, -16.0f, -7.0f);
        this.leftarmext.setTextureSize(64, 32);
        this.leftarmext.mirror = true;
        this.setRotation(this.leftarmext, 0.0f, 0.0f, 0.0f);
        this.leftarmcap = new ModelRenderer((ModelBase)this, 40, 10);
        this.leftarmcap.addBox(6.0f, -3.0f, -3.0f, 6, 6, 6);
        this.leftarmcap.setRotationPoint(10.0f, -16.0f, -7.0f);
        this.leftarmcap.setTextureSize(64, 32);
        this.leftarmcap.mirror = true;
        this.setRotation(this.leftarmcap, 0.0f, 0.0f, 0.0f);
        this.leftleg = new ModelRenderer((ModelBase)this, 37, 6);
        this.leftleg.addBox(-2.0f, 0.0f, -2.0f, 4, 22, 4);
        this.leftleg.setRotationPoint(10.0f, 2.0f, 0.0f);
        this.leftleg.setTextureSize(64, 32);
        this.leftleg.mirror = true;
        this.setRotation(this.leftleg, 0.0f, 0.0f, 0.0f);
        this.leftlegcap = new ModelRenderer((ModelBase)this, 37, 6);
        this.leftlegcap.addBox(-3.0f, -2.0f, -3.0f, 6, 5, 6);
        this.leftlegcap.setRotationPoint(10.0f, 2.0f, 0.0f);
        this.leftlegcap.setTextureSize(64, 32);
        this.leftlegcap.mirror = true;
        this.setRotation(this.leftlegcap, 0.0f, 0.0f, 0.0f);
        this.rightfoot = new ModelRenderer((ModelBase)this, 28, 15);
        this.rightfoot.addBox(-3.0f, 17.0f, -9.0f, 6, 5, 12);
        this.rightfoot.setRotationPoint(-10.0f, 2.0f, 0.0f);
        this.rightfoot.setTextureSize(64, 32);
        this.rightfoot.mirror = true;
        this.setRotation(this.rightfoot, 0.0f, 0.0f, 0.0f);
        this.rightleg = new ModelRenderer((ModelBase)this, 37, 6);
        this.rightleg.addBox(-2.0f, 0.0f, -2.0f, 4, 22, 4);
        this.rightleg.setRotationPoint(-10.0f, 2.0f, 0.0f);
        this.rightleg.setTextureSize(64, 32);
        this.rightleg.mirror = true;
        this.setRotation(this.rightleg, 0.0f, 0.0f, 0.0f);
        this.rightlegcap = new ModelRenderer((ModelBase)this, 37, 6);
        this.rightlegcap.addBox(-3.0f, -2.0f, -3.0f, 6, 5, 6);
        this.rightlegcap.setRotationPoint(-10.0f, 2.0f, 0.0f);
        this.rightlegcap.setTextureSize(64, 32);
        this.rightlegcap.mirror = true;
        this.setRotation(this.rightlegcap, 0.0f, 0.0f, 0.0f);
        this.Shape1 = new ModelRenderer((ModelBase)this, 35, 14);
        this.Shape1.addBox(0.0f, 0.0f, 0.0f, 4, 9, 1);
        this.Shape1.setRotationPoint(-7.0f, -31.0f, -13.0f);
        this.Shape1.setTextureSize(64, 32);
        this.Shape1.mirror = true;
        this.setRotation(this.Shape1, 0.0f, 0.0f, 0.0f);
        this.Shape2 = new ModelRenderer((ModelBase)this, 35, 14);
        this.Shape2.addBox(0.0f, 0.0f, 0.0f, 4, 9, 1);
        this.Shape2.setRotationPoint(-7.0f, -29.0f, -11.0f);
        this.Shape2.setTextureSize(64, 32);
        this.Shape2.mirror = true;
        this.setRotation(this.Shape2, 0.0f, 0.0f, 0.0f);
        this.Shape3 = new ModelRenderer((ModelBase)this, 35, 14);
        this.Shape3.addBox(0.0f, 0.0f, 0.0f, 4, 9, 1);
        this.Shape3.setRotationPoint(-7.0f, -27.0f, -9.0f);
        this.Shape3.setTextureSize(64, 32);
        this.Shape3.mirror = true;
        this.setRotation(this.Shape3, 0.0f, 0.0f, 0.0f);
        this.Shape4 = new ModelRenderer((ModelBase)this, 35, 14);
        this.Shape4.addBox(0.0f, 0.0f, 0.0f, 4, 9, 1);
        this.Shape4.setRotationPoint(-6.0f, -8.0f, 8.0f);
        this.Shape4.setTextureSize(64, 32);
        this.Shape4.mirror = true;
        this.setRotation(this.Shape4, -1.047198f, 0.0f, 0.0f);
        this.Shape5 = new ModelRenderer((ModelBase)this, 35, 14);
        this.Shape5.addBox(4.0f, 0.0f, 0.0f, 4, 9, 1);
        this.Shape5.setRotationPoint(-9.0f, -5.0f, 10.0f);
        this.Shape5.setTextureSize(64, 32);
        this.Shape5.mirror = true;
        this.setRotation(this.Shape5, -1.308997f, 0.0f, 0.0f);
        this.Shape6 = new ModelRenderer((ModelBase)this, 35, 14);
        this.Shape6.addBox(5.0f, 0.0f, 0.0f, 4, 9, 1);
        this.Shape6.setRotationPoint(-12.0f, -24.0f, -2.0f);
        this.Shape6.setTextureSize(64, 32);
        this.Shape6.mirror = true;
        this.setRotation(this.Shape6, -0.261799f, 0.0f, 0.0f);
        this.Shape7 = new ModelRenderer((ModelBase)this, 35, 14);
        this.Shape7.addBox(5.0f, 0.0f, 0.0f, 4, 9, 1);
        this.Shape7.setRotationPoint(-12.0f, -25.0f, -4.0f);
        this.Shape7.setTextureSize(64, 32);
        this.Shape7.mirror = true;
        this.setRotation(this.Shape7, -0.261799f, 0.0f, 0.0f);
        this.Shape8 = new ModelRenderer((ModelBase)this, 35, 14);
        this.Shape8.addBox(6.0f, 0.0f, 0.0f, 2, 9, 1);
        this.Shape8.setRotationPoint(-12.0f, -20.0f, 3.0f);
        this.Shape8.setTextureSize(64, 32);
        this.Shape8.mirror = true;
        this.setRotation(this.Shape8, -0.5235988f, 0.0f, 0.0f);
        this.Shape9 = new ModelRenderer((ModelBase)this, 35, 14);
        this.Shape9.addBox(0.0f, 0.0f, 0.0f, 4, 9, 1);
        this.Shape9.setRotationPoint(-6.0f, -12.0f, 7.0f);
        this.Shape9.setTextureSize(64, 32);
        this.Shape9.mirror = true;
        this.setRotation(this.Shape9, -0.7853982f, 0.0f, 0.0f);
        this.Shape10 = new ModelRenderer((ModelBase)this, 35, 14);
        this.Shape10.addBox(0.0f, 0.0f, 0.0f, 4, 9, 1);
        this.Shape10.setRotationPoint(-6.0f, -15.0f, 6.0f);
        this.Shape10.setTextureSize(64, 32);
        this.Shape10.mirror = true;
        this.setRotation(this.Shape10, -0.7853982f, 0.0f, 0.0f);
        this.Shape11 = new ModelRenderer((ModelBase)this, 35, 14);
        this.Shape11.addBox(0.0f, 0.0f, 0.0f, 2, 9, 1);
        this.Shape11.setRotationPoint(-5.0f, -18.0f, 5.0f);
        this.Shape11.setTextureSize(64, 32);
        this.Shape11.mirror = true;
        this.setRotation(this.Shape11, -0.7853982f, 0.0f, 0.0f);
        this.Shape12 = new ModelRenderer((ModelBase)this, 35, 14);
        this.Shape12.addBox(0.0f, 0.0f, 0.0f, 4, 9, 1);
        this.Shape12.setRotationPoint(-4.0f, 10.0f, 10.0f);
        this.Shape12.setTextureSize(64, 32);
        this.Shape12.mirror = true;
        this.setRotation(this.Shape12, -1.570796f, 0.0f, 0.0f);
        this.Shape13 = new ModelRenderer((ModelBase)this, 35, 14);
        this.Shape13.addBox(0.0f, 0.0f, 0.0f, 4, 9, 1);
        this.Shape13.setRotationPoint(-4.0f, 8.0f, 10.0f);
        this.Shape13.setTextureSize(64, 32);
        this.Shape13.mirror = true;
        this.setRotation(this.Shape13, -1.570796f, 0.0f, 0.0f);
        this.Shape14 = new ModelRenderer((ModelBase)this, 35, 14);
        this.Shape14.addBox(0.0f, 0.0f, 0.0f, 4, 9, 1);
        this.Shape14.setRotationPoint(-4.0f, 6.0f, 10.0f);
        this.Shape14.setTextureSize(64, 32);
        this.Shape14.mirror = true;
        this.setRotation(this.Shape14, -1.570796f, 0.0f, 0.0f);
        this.Shape15 = new ModelRenderer((ModelBase)this, 35, 14);
        this.Shape15.addBox(0.0f, 0.0f, 0.0f, 4, 9, 1);
        this.Shape15.setRotationPoint(-4.0f, 4.0f, 10.0f);
        this.Shape15.setTextureSize(64, 32);
        this.Shape15.mirror = true;
        this.setRotation(this.Shape15, -1.570796f, 0.0f, 0.0f);
        this.Shape16 = new ModelRenderer((ModelBase)this, 35, 14);
        this.Shape16.addBox(4.0f, 0.0f, 0.0f, 4, 9, 1);
        this.Shape16.setRotationPoint(-9.0f, 2.0f, 10.0f);
        this.Shape16.setTextureSize(64, 32);
        this.Shape16.mirror = true;
        this.setRotation(this.Shape16, -1.570796f, 0.0f, 0.0f);
        this.Shape17 = new ModelRenderer((ModelBase)this, 35, 14);
        this.Shape17.addBox(4.0f, 0.0f, 0.0f, 4, 9, 1);
        this.Shape17.setRotationPoint(-9.0f, 0.0f, 10.0f);
        this.Shape17.setTextureSize(64, 32);
        this.Shape17.mirror = true;
        this.setRotation(this.Shape17, -1.570796f, 0.0f, 0.0f);
        this.Shape18 = new ModelRenderer((ModelBase)this, 35, 14);
        this.Shape18.addBox(4.0f, 0.0f, 0.0f, 4, 9, 1);
        this.Shape18.setRotationPoint(-9.0f, -2.0f, 10.0f);
        this.Shape18.setTextureSize(64, 32);
        this.Shape18.mirror = true;
        this.setRotation(this.Shape18, -1.570796f, 0.0f, 0.0f);
        this.Shape19 = new ModelRenderer((ModelBase)this, 35, 14);
        this.Shape19.addBox(1.0f, 0.0f, 0.0f, 2, 9, 1);
        this.Shape19.setRotationPoint(-7.0f, -26.0f, -6.0f);
        this.Shape19.setTextureSize(64, 32);
        this.Shape19.mirror = true;
        this.setRotation(this.Shape19, -0.261799f, 0.0f, 0.0f);
        this.Shape20 = new ModelRenderer((ModelBase)this, 35, 14);
        this.Shape20.addBox(6.0f, 0.0f, 0.0f, 2, 9, 1);
        this.Shape20.setRotationPoint(-12.0f, -22.0f, 1.0f);
        this.Shape20.setTextureSize(64, 32);
        this.Shape20.mirror = true;
        this.setRotation(this.Shape20, -0.5235988f, 0.0f, 0.0f);
        this.body12 = new ModelRenderer((ModelBase)this, 0, 22);
        this.body12.addBox(-4.0f, 0.0f, -2.0f, 8, 6, 4);
        this.body12.setRotationPoint(5.0f, -21.0f, -14.0f);
        this.body12.setTextureSize(64, 32);
        this.body12.mirror = true;
        this.setRotation(this.body12, 1.308997f, 0.0f, 0.0f);
        this.body7 = new ModelRenderer((ModelBase)this, 0, 22);
        this.body7.addBox(-4.0f, 0.0f, -2.0f, 4, 3, 4);
        this.body7.setRotationPoint(7.0f, -19.0f, -9.0f);
        this.body7.setTextureSize(64, 32);
        this.body7.mirror = true;
        this.setRotation(this.body7, 1.047198f, 0.0f, 0.0f);
        this.body8 = new ModelRenderer((ModelBase)this, 0, 22);
        this.body8.addBox(-4.0f, 0.0f, -2.0f, 8, 6, 4);
        this.body8.setRotationPoint(5.0f, -18.0f, -7.0f);
        this.body8.setTextureSize(64, 32);
        this.body8.mirror = true;
        this.setRotation(this.body8, 0.7853982f, 0.0f, 0.0f);
        this.body9 = new ModelRenderer((ModelBase)this, 0, 22);
        this.body9.addBox(-4.0f, 0.0f, -2.0f, 4, 3, 4);
        this.body9.setRotationPoint(7.0f, -14.0f, -3.0f);
        this.body9.setTextureSize(64, 32);
        this.body9.mirror = true;
        this.setRotation(this.body9, 0.5235988f, 0.0f, 0.0f);
        this.body10 = new ModelRenderer((ModelBase)this, 0, 22);
        this.body10.addBox(-4.0f, 0.0f, -2.0f, 8, 6, 4);
        this.body10.setRotationPoint(5.0f, -12.0f, -2.0f);
        this.body10.setTextureSize(64, 32);
        this.body10.mirror = true;
        this.setRotation(this.body10, 0.261799f, 0.0f, 0.0f);
        this.body11 = new ModelRenderer((ModelBase)this, 16, 16);
        this.body11.addBox(-4.0f, 0.0f, -2.0f, 4, 3, 4);
        this.body11.setRotationPoint(7.0f, -21.0f, -16.0f);
        this.body11.setTextureSize(64, 32);
        this.body11.mirror = true;
        this.setRotation(this.body11, 1.570796f, 0.0f, 0.0f);
        this.head2 = new ModelRenderer((ModelBase)this, 0, 0);
        this.head2.addBox(-4.0f, -8.0f, -4.0f, 8, 8, 8);
        this.head2.setRotationPoint(5.0f, -16.0f, -19.0f);
        this.head2.setTextureSize(64, 32);
        this.head2.mirror = true;
        this.setRotation(this.head2, 0.0f, 0.0f, 0.0f);
        this.Shape21 = new ModelRenderer((ModelBase)this, 35, 14);
        this.Shape21.addBox(0.0f, 0.0f, 0.0f, 4, 9, 1);
        this.Shape21.setRotationPoint(3.0f, -31.0f, -13.0f);
        this.Shape21.setTextureSize(64, 32);
        this.Shape21.mirror = true;
        this.setRotation(this.Shape21, 0.0f, 0.0f, 0.0f);
        this.Shape22 = new ModelRenderer((ModelBase)this, 35, 14);
        this.Shape22.addBox(0.0f, 0.0f, 0.0f, 4, 9, 1);
        this.Shape22.setRotationPoint(3.0f, -29.0f, -11.0f);
        this.Shape22.setTextureSize(64, 32);
        this.Shape22.mirror = true;
        this.setRotation(this.Shape22, 0.0f, 0.0f, 0.0f);
        this.Shape23 = new ModelRenderer((ModelBase)this, 35, 14);
        this.Shape23.addBox(0.0f, 0.0f, 0.0f, 4, 9, 1);
        this.Shape23.setRotationPoint(3.0f, -27.0f, -9.0f);
        this.Shape23.setTextureSize(64, 32);
        this.Shape23.mirror = true;
        this.setRotation(this.Shape23, 0.0f, 0.0f, 0.0f);
        this.Shape24 = new ModelRenderer((ModelBase)this, 35, 14);
        this.Shape24.addBox(1.0f, 0.0f, 0.0f, 2, 9, 1);
        this.Shape24.setRotationPoint(3.0f, -26.0f, -6.0f);
        this.Shape24.setTextureSize(64, 32);
        this.Shape24.mirror = true;
        this.setRotation(this.Shape24, -0.261799f, 0.0f, 0.0f);
        this.Shape25 = new ModelRenderer((ModelBase)this, 35, 14);
        this.Shape25.addBox(5.0f, 0.0f, 0.0f, 4, 9, 1);
        this.Shape25.setRotationPoint(-2.0f, -25.0f, -4.0f);
        this.Shape25.setTextureSize(64, 32);
        this.Shape25.mirror = true;
        this.setRotation(this.Shape25, -0.261799f, 0.0f, 0.0f);
        this.Shape26 = new ModelRenderer((ModelBase)this, 35, 14);
        this.Shape26.addBox(5.0f, 0.0f, 0.0f, 4, 9, 1);
        this.Shape26.setRotationPoint(-2.0f, -24.0f, -2.0f);
        this.Shape26.setTextureSize(64, 32);
        this.Shape26.mirror = true;
        this.setRotation(this.Shape26, -0.261799f, 0.0f, 0.0f);
        this.Shape27 = new ModelRenderer((ModelBase)this, 35, 14);
        this.Shape27.addBox(6.0f, 0.0f, 0.0f, 2, 9, 1);
        this.Shape27.setRotationPoint(-2.0f, -22.0f, 1.0f);
        this.Shape27.setTextureSize(64, 32);
        this.Shape27.mirror = true;
        this.setRotation(this.Shape27, -0.5235988f, 0.0f, 0.0f);
        this.Shape28 = new ModelRenderer((ModelBase)this, 35, 14);
        this.Shape28.addBox(6.0f, 0.0f, 0.0f, 2, 9, 1);
        this.Shape28.setRotationPoint(-2.0f, -20.0f, 3.0f);
        this.Shape28.setTextureSize(64, 32);
        this.Shape28.mirror = true;
        this.setRotation(this.Shape28, -0.5235988f, 0.0f, 0.0f);
        this.Shape29 = new ModelRenderer((ModelBase)this, 35, 14);
        this.Shape29.addBox(0.0f, 0.0f, 0.0f, 2, 9, 1);
        this.Shape29.setRotationPoint(3.0f, -18.0f, 5.0f);
        this.Shape29.setTextureSize(64, 32);
        this.Shape29.mirror = true;
        this.setRotation(this.Shape29, -0.7853982f, 0.0f, 0.0f);
        this.Shape30 = new ModelRenderer((ModelBase)this, 35, 14);
        this.Shape30.addBox(0.0f, 0.0f, 0.0f, 4, 9, 1);
        this.Shape30.setRotationPoint(2.0f, -15.0f, 6.0f);
        this.Shape30.setTextureSize(64, 32);
        this.Shape30.mirror = true;
        this.setRotation(this.Shape30, -0.7853982f, 0.0f, 0.0f);
        this.Shape31 = new ModelRenderer((ModelBase)this, 35, 14);
        this.Shape31.addBox(0.0f, 0.0f, 0.0f, 4, 9, 1);
        this.Shape31.setRotationPoint(2.0f, -12.0f, 7.0f);
        this.Shape31.setTextureSize(64, 32);
        this.Shape31.mirror = true;
        this.setRotation(this.Shape31, -0.7853982f, 0.0f, 0.0f);
        this.Shape32 = new ModelRenderer((ModelBase)this, 35, 14);
        this.Shape32.addBox(0.0f, 0.0f, 0.0f, 4, 9, 1);
        this.Shape32.setRotationPoint(2.0f, -8.0f, 8.0f);
        this.Shape32.setTextureSize(64, 32);
        this.Shape32.mirror = true;
        this.setRotation(this.Shape32, -1.047198f, 0.0f, 0.0f);
        this.Shape33 = new ModelRenderer((ModelBase)this, 35, 14);
        this.Shape33.addBox(4.0f, 0.0f, 0.0f, 4, 9, 1);
        this.Shape33.setRotationPoint(-2.0f, -5.0f, 10.0f);
        this.Shape33.setTextureSize(64, 32);
        this.Shape33.mirror = true;
        this.setRotation(this.Shape33, -1.308997f, 0.0f, 0.0f);
        this.Shape34 = new ModelRenderer((ModelBase)this, 35, 14);
        this.Shape34.addBox(4.0f, 0.0f, 0.0f, 4, 9, 1);
        this.Shape34.setRotationPoint(-2.0f, -2.0f, 10.0f);
        this.Shape34.setTextureSize(64, 32);
        this.Shape34.mirror = true;
        this.setRotation(this.Shape34, -1.570796f, 0.0f, 0.0f);
        this.Shape35 = new ModelRenderer((ModelBase)this, 35, 14);
        this.Shape35.addBox(4.0f, 0.0f, 0.0f, 4, 9, 1);
        this.Shape35.setRotationPoint(-2.0f, 0.0f, 10.0f);
        this.Shape35.setTextureSize(64, 32);
        this.Shape35.mirror = true;
        this.setRotation(this.Shape35, -1.570796f, 0.0f, 0.0f);
        this.Shape36 = new ModelRenderer((ModelBase)this, 35, 14);
        this.Shape36.addBox(4.0f, 0.0f, 0.0f, 4, 9, 1);
        this.Shape36.setRotationPoint(-2.0f, 2.0f, 10.0f);
        this.Shape36.setTextureSize(64, 32);
        this.Shape36.mirror = true;
        this.setRotation(this.Shape36, -1.570796f, 0.0f, 0.0f);
        this.Shape37 = new ModelRenderer((ModelBase)this, 35, 14);
        this.Shape37.addBox(0.0f, 0.0f, 0.0f, 4, 9, 1);
        this.Shape37.setRotationPoint(2.0f, 4.0f, 10.0f);
        this.Shape37.setTextureSize(64, 32);
        this.Shape37.mirror = true;
        this.setRotation(this.Shape37, -1.570796f, 0.0f, 0.0f);
        this.Shape38 = new ModelRenderer((ModelBase)this, 35, 14);
        this.Shape38.addBox(0.0f, 0.0f, 0.0f, 4, 9, 1);
        this.Shape38.setRotationPoint(2.0f, 6.0f, 10.0f);
        this.Shape38.setTextureSize(64, 32);
        this.Shape38.mirror = true;
        this.setRotation(this.Shape38, -1.570796f, 0.0f, 0.0f);
        this.Shape39 = new ModelRenderer((ModelBase)this, 35, 14);
        this.Shape39.addBox(0.0f, 0.0f, 0.0f, 4, 9, 1);
        this.Shape39.setRotationPoint(2.0f, 8.0f, 10.0f);
        this.Shape39.setTextureSize(64, 32);
        this.Shape39.mirror = true;
        this.setRotation(this.Shape39, -1.570796f, 0.0f, 0.0f);
        this.Shape40 = new ModelRenderer((ModelBase)this, 35, 14);
        this.Shape40.addBox(0.0f, 0.0f, 0.0f, 4, 9, 1);
        this.Shape40.setRotationPoint(2.0f, 10.0f, 10.0f);
        this.Shape40.setTextureSize(64, 32);
        this.Shape40.mirror = true;
        this.setRotation(this.Shape40, -1.570796f, 0.0f, 0.0f);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        this.setRotationAngles(f, f1, f2, f3, f4, f5);
        this.head.render(f5);
        this.body1.render(f5);
        this.rightarmext.render(f5);
        this.leftfoot.render(f5);
        this.bodymain.render(f5);
        this.body2.render(f5);
        this.body3.render(f5);
        this.body4.render(f5);
        this.body6.render(f5);
        this.body5.render(f5);
        this.rightarm.render(f5);
        this.rightarmcap.render(f5);
        this.leftarm.render(f5);
        this.leftarmext.render(f5);
        this.leftarmcap.render(f5);
        this.leftleg.render(f5);
        this.leftlegcap.render(f5);
        this.rightfoot.render(f5);
        this.rightleg.render(f5);
        this.rightlegcap.render(f5);
        this.Shape1.render(f5);
        this.Shape2.render(f5);
        this.Shape3.render(f5);
        this.Shape4.render(f5);
        this.Shape5.render(f5);
        this.Shape6.render(f5);
        this.Shape7.render(f5);
        this.Shape8.render(f5);
        this.Shape9.render(f5);
        this.Shape10.render(f5);
        this.Shape11.render(f5);
        this.Shape12.render(f5);
        this.Shape13.render(f5);
        this.Shape14.render(f5);
        this.Shape15.render(f5);
        this.Shape16.render(f5);
        this.Shape17.render(f5);
        this.Shape18.render(f5);
        this.Shape19.render(f5);
        this.Shape20.render(f5);
        this.body12.render(f5);
        this.body7.render(f5);
        this.body8.render(f5);
        this.body9.render(f5);
        this.body10.render(f5);
        this.body11.render(f5);
        this.head2.render(f5);
        this.Shape21.render(f5);
        this.Shape22.render(f5);
        this.Shape23.render(f5);
        this.Shape24.render(f5);
        this.Shape25.render(f5);
        this.Shape26.render(f5);
        this.Shape27.render(f5);
        this.Shape28.render(f5);
        this.Shape29.render(f5);
        this.Shape30.render(f5);
        this.Shape31.render(f5);
        this.Shape32.render(f5);
        this.Shape33.render(f5);
        this.Shape34.render(f5);
        this.Shape35.render(f5);
        this.Shape36.render(f5);
        this.Shape37.render(f5);
        this.Shape38.render(f5);
        this.Shape39.render(f5);
        this.Shape40.render(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    public void setRotationAngles(float var1, float var2, float var3, float var4, float var5, float var6) {
        this.head.rotateAngleY = var4 / 57.295776f;
        this.head.rotateAngleX = var5 / 57.295776f;
        this.head2.rotateAngleY = var4 / 57.295776f;
        this.head2.rotateAngleX = var5 / 57.295776f;
        this.rightarm.rotateAngleX = MathHelper.cos((float)(var1 * 0.6662f + 3.141593f)) * 2.0f * var2 * 0.5f;
        this.rightarmcap.rotateAngleX = MathHelper.cos((float)(var1 * 0.6662f + 3.141593f)) * 2.0f * var2 * 0.5f;
        this.rightarmext.rotateAngleX = MathHelper.cos((float)(var1 * 0.6662f + 3.141593f)) * 2.0f * var2 * 0.5f;
        this.leftarm.rotateAngleX = MathHelper.cos((float)(var1 * 0.6662f)) * 2.0f * var2 * 0.5f;
        this.leftarmcap.rotateAngleX = MathHelper.cos((float)(var1 * 0.6662f)) * 2.0f * var2 * 0.5f;
        this.leftarmext.rotateAngleX = MathHelper.cos((float)(var1 * 0.6662f)) * 2.0f * var2 * 0.5f;
        this.rightarm.rotateAngleZ = 0.0f;
        this.rightarmcap.rotateAngleZ = 0.0f;
        this.rightarmext.rotateAngleZ = 0.0f;
        this.leftarm.rotateAngleZ = 0.0f;
        this.leftarmcap.rotateAngleZ = 0.0f;
        this.leftarmext.rotateAngleZ = 0.0f;
        this.rightleg.rotateAngleX = MathHelper.cos((float)(var1 * 0.6662f)) * 1.4f * var2;
        this.rightlegcap.rotateAngleX = MathHelper.cos((float)(var1 * 0.6662f)) * 1.4f * var2;
        this.rightfoot.rotateAngleX = MathHelper.cos((float)(var1 * 0.6662f)) * 1.4f * var2;
        this.leftleg.rotateAngleX = MathHelper.cos((float)((float)((double)(var1 * 0.6662f) + Math.PI))) * 1.4f * var2;
        this.leftlegcap.rotateAngleX = MathHelper.cos((float)((float)((double)(var1 * 0.6662f) + Math.PI))) * 1.4f * var2;
        this.leftfoot.rotateAngleX = MathHelper.cos((float)((float)((double)(var1 * 0.6662f) + Math.PI))) * 1.4f * var2;
        this.rightleg.rotateAngleY = 0.0f;
        this.rightlegcap.rotateAngleY = 0.0f;
        this.rightfoot.rotateAngleY = 0.0f;
        this.leftleg.rotateAngleY = 0.0f;
        this.leftlegcap.rotateAngleY = 0.0f;
        this.leftfoot.rotateAngleY = 0.0f;
        this.rightarm.rotateAngleY = 0.0f;
        this.rightarmcap.rotateAngleY = 0.0f;
        this.rightarmext.rotateAngleY = 0.0f;
        this.leftarm.rotateAngleY = 0.0f;
        this.leftarmcap.rotateAngleY = 0.0f;
        this.leftarmext.rotateAngleY = 0.0f;
        this.rightarm.rotateAngleZ += MathHelper.cos((float)(var3 * 0.09f)) * 0.05f + 0.05f;
        this.rightarmcap.rotateAngleZ += MathHelper.cos((float)(var3 * 0.09f)) * 0.05f + 0.05f;
        this.rightarmext.rotateAngleZ += MathHelper.cos((float)(var3 * 0.09f)) * 0.05f + 0.05f;
        this.leftarm.rotateAngleZ -= MathHelper.cos((float)(var3 * 0.09f)) * 0.05f + 0.05f;
        this.leftarmcap.rotateAngleZ -= MathHelper.cos((float)(var3 * 0.09f)) * 0.05f + 0.05f;
        this.leftarmext.rotateAngleZ -= MathHelper.cos((float)(var3 * 0.09f)) * 0.05f + 0.05f;
        this.rightarm.rotateAngleX += MathHelper.sin((float)(var3 * 0.067f)) * 0.05f;
        this.rightarmcap.rotateAngleX += MathHelper.sin((float)(var3 * 0.067f)) * 0.05f;
        this.rightarmext.rotateAngleX += MathHelper.sin((float)(var3 * 0.067f)) * 0.05f;
        this.leftarm.rotateAngleX -= MathHelper.sin((float)(var3 * 0.067f)) * 0.05f;
        this.leftarmcap.rotateAngleX -= MathHelper.sin((float)(var3 * 0.067f)) * 0.05f;
        this.leftarmext.rotateAngleX -= MathHelper.sin((float)(var3 * 0.067f)) * 0.05f;
    }
}

