/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.model.ModelBase
 *  net.minecraft.client.model.ModelRenderer
 *  net.minecraft.entity.Entity
 *  net.minecraft.util.MathHelper
 */
package net.divinerpg.client.render.entity.vethea.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class Vhraak
extends ModelBase {
    ModelRenderer part1;
    ModelRenderer part2;
    ModelRenderer Leg1p1;
    ModelRenderer Leg2p1;
    ModelRenderer Tail6;
    ModelRenderer part3;
    ModelRenderer part4;
    ModelRenderer Leg1p2;
    ModelRenderer Leg2p2;
    ModelRenderer Leg1p3;
    ModelRenderer Leg2p3;
    ModelRenderer Leg1p4;
    ModelRenderer Leg2p4;
    ModelRenderer Leg1p5;
    ModelRenderer Leg2p5;
    ModelRenderer Leg1p6;
    ModelRenderer Leg2p6;
    ModelRenderer part5;
    ModelRenderer part6;
    ModelRenderer Leg3p1;
    ModelRenderer Leg3p2;
    ModelRenderer Leg3p3;
    ModelRenderer Leg4p1;
    ModelRenderer Leg4p2;
    ModelRenderer Leg4p3;
    ModelRenderer Leg3p4;
    ModelRenderer Leg4p4;
    ModelRenderer Leg3p5;
    ModelRenderer Leg3p6;
    ModelRenderer Leg4p5;
    ModelRenderer Leg4p6;
    ModelRenderer part7;
    ModelRenderer part8;
    ModelRenderer part9;
    ModelRenderer part10;
    ModelRenderer part11;
    ModelRenderer part12;
    ModelRenderer part13;
    ModelRenderer part14;
    ModelRenderer part15;
    ModelRenderer part16;
    ModelRenderer part17;
    ModelRenderer part18;
    ModelRenderer part19;
    ModelRenderer part20;
    ModelRenderer part21;
    ModelRenderer part22;
    ModelRenderer part23;
    ModelRenderer part24;
    ModelRenderer part25;
    ModelRenderer part26;
    ModelRenderer part27;
    ModelRenderer part28;
    ModelRenderer part29;
    ModelRenderer part30;
    ModelRenderer part31;
    ModelRenderer part32;
    ModelRenderer part33;
    ModelRenderer part34;
    ModelRenderer part35;
    ModelRenderer part36;
    ModelRenderer part37;
    ModelRenderer part38;
    ModelRenderer part39;
    ModelRenderer part40;
    ModelRenderer Tail1;
    ModelRenderer Tail2;
    ModelRenderer Tail3;
    ModelRenderer Tail4;
    ModelRenderer Tail5;
    ModelRenderer part41;
    ModelRenderer part42;
    ModelRenderer part43;
    ModelRenderer part44;
    ModelRenderer part45;
    ModelRenderer part46;

    public Vhraak() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.part1 = new ModelRenderer((ModelBase)this, 0, 0);
        this.part1.addBox(-3.0f, -3.0f, -2.0f, 6, 6, 4);
        this.part1.setRotationPoint(-1.0f, 11.5f, -7.0f);
        this.part1.setTextureSize(64, 32);
        this.part1.mirror = true;
        this.setRotation(this.part1, 0.0f, 0.0f, 0.0f);
        this.part2 = new ModelRenderer((ModelBase)this, 18, 14);
        this.part2.addBox(-4.0f, -2.0f, -3.0f, 6, 9, 6);
        this.part2.setRotationPoint(-3.0f, 12.0f, 15.0f);
        this.part2.setTextureSize(64, 32);
        this.part2.mirror = true;
        this.setRotation(this.part2, 1.570796f, 0.0f, 0.0f);
        this.Leg1p1 = new ModelRenderer((ModelBase)this, 0, 18);
        this.Leg1p1.addBox(-4.0f, -1.0f, -2.0f, 5, 3, 5);
        this.Leg1p1.setRotationPoint(-7.5f, 12.0f, 18.0f);
        this.Leg1p1.setTextureSize(64, 32);
        this.Leg1p1.mirror = true;
        this.setRotation(this.Leg1p1, 0.0f, 0.0f, 0.0f);
        this.Leg2p1 = new ModelRenderer((ModelBase)this, 0, 18);
        this.Leg2p1.addBox(-1.0f, -1.0f, -2.0f, 5, 3, 5);
        this.Leg2p1.setRotationPoint(5.5f, 12.0f, 18.0f);
        this.Leg2p1.setTextureSize(64, 32);
        this.Leg2p1.mirror = true;
        this.setRotation(this.Leg2p1, 0.0f, 0.0f, 0.0f);
        this.Tail6 = new ModelRenderer((ModelBase)this, 9, 18);
        this.Tail6.addBox(-2.0f, 21.0f, -2.0f, 4, 4, 4);
        this.Tail6.setRotationPoint(-1.0f, 12.0f, 21.0f);
        this.Tail6.setTextureSize(64, 32);
        this.Tail6.mirror = true;
        this.setRotation(this.Tail6, 1.130069f, 0.0f, 0.0f);
        this.part3 = new ModelRenderer((ModelBase)this, 18, 14);
        this.part3.addBox(-4.0f, -2.0f, -3.0f, 6, 9, 6);
        this.part3.setRotationPoint(3.0f, 12.0f, 15.0f);
        this.part3.setTextureSize(64, 32);
        this.part3.mirror = true;
        this.setRotation(this.part3, 1.570796f, 0.0f, 0.0f);
        this.part4 = new ModelRenderer((ModelBase)this, 18, 14);
        this.part4.addBox(-4.0f, -2.0f, -3.0f, 4, 9, 2);
        this.part4.setRotationPoint(1.0f, 6.0f, 18.0f);
        this.part4.setTextureSize(64, 32);
        this.part4.mirror = true;
        this.setRotation(this.part4, 1.756689f, 0.0f, 0.0f);
        this.Leg1p2 = new ModelRenderer((ModelBase)this, 0, 18);
        this.Leg1p2.addBox(2.0f, 9.0f, 9.0f, 1, 7, 3);
        this.Leg1p2.setRotationPoint(-7.5f, 12.0f, 18.0f);
        this.Leg1p2.setTextureSize(64, 32);
        this.Leg1p2.mirror = true;
        this.setRotation(this.Leg1p2, -1.570796f, 0.4363323f, 0.0f);
        this.Leg2p2 = new ModelRenderer((ModelBase)this, 0, 18);
        this.Leg2p2.addBox(4.0f, 7.0f, 9.0f, 1, 7, 3);
        this.Leg2p2.setRotationPoint(5.5f, 12.0f, 18.0f);
        this.Leg2p2.setTextureSize(64, 32);
        this.Leg2p2.mirror = true;
        this.setRotation(this.Leg2p2, -1.570796f, 0.4363323f, 0.0f);
        this.Leg1p3 = new ModelRenderer((ModelBase)this, 0, 18);
        this.Leg1p3.addBox(-3.0f, 0.0f, -1.0f, 3, 8, 3);
        this.Leg1p3.setRotationPoint(-7.5f, 12.0f, 18.0f);
        this.Leg1p3.setTextureSize(64, 32);
        this.Leg1p3.mirror = true;
        this.setRotation(this.Leg1p3, -0.7853982f, 0.0f, 0.0f);
        this.Leg2p3 = new ModelRenderer((ModelBase)this, 0, 18);
        this.Leg2p3.addBox(0.0f, 0.0f, -1.0f, 3, 8, 3);
        this.Leg2p3.setRotationPoint(5.5f, 12.0f, 18.0f);
        this.Leg2p3.setTextureSize(64, 32);
        this.Leg2p3.mirror = true;
        this.setRotation(this.Leg2p3, -0.7853982f, 0.0f, 0.0f);
        this.Leg1p4 = new ModelRenderer((ModelBase)this, 0, 18);
        this.Leg1p4.addBox(-3.0f, -7.0f, 8.0f, 3, 8, 2);
        this.Leg1p4.setRotationPoint(-7.5f, 12.0f, 18.0f);
        this.Leg1p4.setTextureSize(64, 32);
        this.Leg1p4.mirror = true;
        this.setRotation(this.Leg1p4, -2.356194f, 0.0f, 0.0f);
        this.Leg2p4 = new ModelRenderer((ModelBase)this, 0, 18);
        this.Leg2p4.addBox(0.0f, -7.0f, 8.0f, 3, 8, 2);
        this.Leg2p4.setRotationPoint(5.5f, 12.0f, 18.0f);
        this.Leg2p4.setTextureSize(64, 32);
        this.Leg2p4.mirror = true;
        this.setRotation(this.Leg2p4, -2.356194f, 0.0f, 0.0f);
        this.Leg1p5 = new ModelRenderer((ModelBase)this, 0, 18);
        this.Leg1p5.addBox(-2.0f, 2.0f, 10.0f, 1, 7, 2);
        this.Leg1p5.setRotationPoint(-7.5f, 12.0f, 18.0f);
        this.Leg1p5.setTextureSize(64, 32);
        this.Leg1p5.mirror = true;
        this.setRotation(this.Leg1p5, -1.570796f, 0.0f, 0.0f);
        this.Leg2p5 = new ModelRenderer((ModelBase)this, 0, 18);
        this.Leg2p5.addBox(1.0f, 2.0f, 10.0f, 1, 7, 2);
        this.Leg2p5.setRotationPoint(5.5f, 12.0f, 18.0f);
        this.Leg2p5.setTextureSize(64, 32);
        this.Leg2p5.mirror = true;
        this.setRotation(this.Leg2p5, -1.570796f, 0.0f, 0.0f);
        this.Leg1p6 = new ModelRenderer((ModelBase)this, 0, 18);
        this.Leg1p6.addBox(-5.0f, 8.0f, 9.0f, 1, 7, 3);
        this.Leg1p6.setRotationPoint(-7.5f, 12.0f, 18.0f);
        this.Leg1p6.setTextureSize(64, 32);
        this.Leg1p6.mirror = true;
        this.setRotation(this.Leg1p6, -1.570796f, -0.4363323f, 0.0f);
        this.Leg2p6 = new ModelRenderer((ModelBase)this, 0, 18);
        this.Leg2p6.addBox(-2.0f, 8.0f, 9.0f, 1, 7, 3);
        this.Leg2p6.setRotationPoint(5.5f, 12.0f, 18.0f);
        this.Leg2p6.setTextureSize(64, 32);
        this.Leg2p6.mirror = true;
        this.setRotation(this.Leg2p6, -1.570796f, -0.4363323f, 0.0f);
        this.part5 = new ModelRenderer((ModelBase)this, 18, 14);
        this.part5.addBox(-4.0f, -2.0f, -3.0f, 6, 9, 6);
        this.part5.setRotationPoint(3.0f, 12.0f, 6.0f);
        this.part5.setTextureSize(64, 32);
        this.part5.mirror = true;
        this.setRotation(this.part5, 1.570796f, 0.0f, 0.0f);
        this.part6 = new ModelRenderer((ModelBase)this, 18, 14);
        this.part6.addBox(-4.0f, -2.0f, -3.0f, 6, 9, 6);
        this.part6.setRotationPoint(-3.0f, 12.0f, 6.0f);
        this.part6.setTextureSize(64, 32);
        this.part6.mirror = true;
        this.setRotation(this.part6, 1.570796f, 0.0f, 0.0f);
        this.Leg3p1 = new ModelRenderer((ModelBase)this, 0, 18);
        this.Leg3p1.addBox(0.0f, -7.0f, 8.0f, 3, 8, 2);
        this.Leg3p1.setRotationPoint(5.5f, 12.0f, -1.0f);
        this.Leg3p1.setTextureSize(64, 32);
        this.Leg3p1.mirror = true;
        this.setRotation(this.Leg3p1, -2.356194f, 0.0f, 0.0f);
        this.Leg3p2 = new ModelRenderer((ModelBase)this, 0, 18);
        this.Leg3p2.addBox(0.0f, 0.0f, -1.0f, 3, 8, 3);
        this.Leg3p2.setRotationPoint(5.5f, 12.0f, -1.0f);
        this.Leg3p2.setTextureSize(64, 32);
        this.Leg3p2.mirror = true;
        this.setRotation(this.Leg3p2, -0.7853982f, 0.0f, 0.0f);
        this.Leg3p3 = new ModelRenderer((ModelBase)this, 0, 18);
        this.Leg3p3.addBox(-1.0f, -1.0f, -2.0f, 5, 3, 5);
        this.Leg3p3.setRotationPoint(5.5f, 12.0f, -1.0f);
        this.Leg3p3.setTextureSize(64, 32);
        this.Leg3p3.mirror = true;
        this.setRotation(this.Leg3p3, 0.0f, 0.0f, 0.0f);
        this.Leg4p1 = new ModelRenderer((ModelBase)this, 0, 18);
        this.Leg4p1.addBox(-3.0f, -7.0f, 8.0f, 3, 8, 2);
        this.Leg4p1.setRotationPoint(-7.5f, 12.0f, -1.0f);
        this.Leg4p1.setTextureSize(64, 32);
        this.Leg4p1.mirror = true;
        this.setRotation(this.Leg4p1, -2.356194f, 0.0f, 0.0f);
        this.Leg4p2 = new ModelRenderer((ModelBase)this, 0, 18);
        this.Leg4p2.addBox(-3.0f, 0.0f, -1.0f, 3, 8, 3);
        this.Leg4p2.setRotationPoint(-7.5f, 12.0f, -1.0f);
        this.Leg4p2.setTextureSize(64, 32);
        this.Leg4p2.mirror = true;
        this.setRotation(this.Leg4p2, -0.7853982f, 0.0f, 0.0f);
        this.Leg4p3 = new ModelRenderer((ModelBase)this, 0, 18);
        this.Leg4p3.addBox(-4.0f, -1.0f, -2.0f, 5, 3, 5);
        this.Leg4p3.setRotationPoint(-7.5f, 12.0f, -1.0f);
        this.Leg4p3.setTextureSize(64, 32);
        this.Leg4p3.mirror = true;
        this.setRotation(this.Leg4p3, 0.0f, 0.0f, 0.0f);
        this.Leg3p4 = new ModelRenderer((ModelBase)this, 0, 18);
        this.Leg3p4.addBox(1.0f, 2.0f, 10.0f, 1, 7, 2);
        this.Leg3p4.setRotationPoint(5.5f, 12.0f, -1.0f);
        this.Leg3p4.setTextureSize(64, 32);
        this.Leg3p4.mirror = true;
        this.setRotation(this.Leg3p4, -1.570796f, 0.0f, 0.0f);
        this.Leg4p4 = new ModelRenderer((ModelBase)this, 0, 18);
        this.Leg4p4.addBox(-2.0f, 2.0f, 10.0f, 1, 7, 2);
        this.Leg4p4.setRotationPoint(-7.5f, 12.0f, -1.0f);
        this.Leg4p4.setTextureSize(64, 32);
        this.Leg4p4.mirror = true;
        this.setRotation(this.Leg4p4, -1.570796f, 0.0f, 0.0f);
        this.Leg3p5 = new ModelRenderer((ModelBase)this, 0, 18);
        this.Leg3p5.addBox(4.0f, 7.0f, 9.0f, 1, 7, 3);
        this.Leg3p5.setRotationPoint(5.5f, 12.0f, -1.0f);
        this.Leg3p5.setTextureSize(64, 32);
        this.Leg3p5.mirror = true;
        this.setRotation(this.Leg3p5, -1.570796f, 0.4363323f, 0.0f);
        this.Leg3p6 = new ModelRenderer((ModelBase)this, 0, 18);
        this.Leg3p6.addBox(-2.0f, 8.0f, 9.0f, 1, 7, 3);
        this.Leg3p6.setRotationPoint(5.5f, 12.0f, -1.0f);
        this.Leg3p6.setTextureSize(64, 32);
        this.Leg3p6.mirror = true;
        this.setRotation(this.Leg3p6, -1.570796f, -0.4363323f, 0.0f);
        this.Leg4p5 = new ModelRenderer((ModelBase)this, 0, 18);
        this.Leg4p5.addBox(2.0f, 9.0f, 9.0f, 1, 7, 3);
        this.Leg4p5.setRotationPoint(-7.5f, 12.0f, -1.0f);
        this.Leg4p5.setTextureSize(64, 32);
        this.Leg4p5.mirror = true;
        this.setRotation(this.Leg4p5, -1.570796f, 0.4363323f, 0.0f);
        this.Leg4p6 = new ModelRenderer((ModelBase)this, 0, 18);
        this.Leg4p6.addBox(-5.0f, 8.0f, 9.0f, 1, 7, 3);
        this.Leg4p6.setRotationPoint(-7.5f, 12.0f, -1.0f);
        this.Leg4p6.setTextureSize(64, 32);
        this.Leg4p6.mirror = true;
        this.setRotation(this.Leg4p6, -1.570796f, -0.4363323f, 0.0f);
        this.part7 = new ModelRenderer((ModelBase)this, 18, 14);
        this.part7.addBox(-4.0f, -2.0f, -3.0f, 6, 9, 6);
        this.part7.setRotationPoint(3.0f, 12.0f, -3.0f);
        this.part7.setTextureSize(64, 32);
        this.part7.mirror = true;
        this.setRotation(this.part7, 1.570796f, 0.0f, 0.0f);
        this.part8 = new ModelRenderer((ModelBase)this, 18, 14);
        this.part8.addBox(2.0f, 6.0f, -3.0f, 1, 9, 4);
        this.part8.setRotationPoint(-1.0f, 7.0f, 9.0f);
        this.part8.setTextureSize(64, 32);
        this.part8.mirror = true;
        this.setRotation(this.part8, 1.832596f, 0.0f, -0.5235988f);
        this.part9 = new ModelRenderer((ModelBase)this, 18, 14);
        this.part9.addBox(2.0f, -3.0f, -1.0f, 1, 9, 4);
        this.part9.setRotationPoint(-1.0f, 7.0f, 9.0f);
        this.part9.setTextureSize(64, 32);
        this.part9.mirror = true;
        this.setRotation(this.part9, 1.832596f, 0.0f, -0.5235988f);
        this.part10 = new ModelRenderer((ModelBase)this, 18, 14);
        this.part10.addBox(-5.0f, -3.0f, -1.0f, 1, 9, 4);
        this.part10.setRotationPoint(-1.0f, 8.0f, 9.0f);
        this.part10.setTextureSize(64, 32);
        this.part10.mirror = true;
        this.setRotation(this.part10, 1.832596f, 0.0f, 0.3490659f);
        this.part11 = new ModelRenderer((ModelBase)this, 18, 14);
        this.part11.addBox(-5.0f, 6.0f, -3.0f, 1, 9, 4);
        this.part11.setRotationPoint(-1.0f, 8.0f, 9.0f);
        this.part11.setTextureSize(64, 32);
        this.part11.mirror = true;
        this.setRotation(this.part11, 1.832596f, 0.0f, 0.3490659f);
        this.part12 = new ModelRenderer((ModelBase)this, 18, 14);
        this.part12.addBox(5.0f, 6.0f, -3.0f, 1, 9, 4);
        this.part12.setRotationPoint(-1.0f, 9.0f, 9.0f);
        this.part12.setTextureSize(64, 32);
        this.part12.mirror = true;
        this.setRotation(this.part12, 1.832596f, 0.0f, -0.1745329f);
        this.part13 = new ModelRenderer((ModelBase)this, 18, 14);
        this.part13.addBox(5.0f, -3.0f, -1.0f, 1, 9, 4);
        this.part13.setRotationPoint(-1.0f, 9.0f, 9.0f);
        this.part13.setTextureSize(64, 32);
        this.part13.mirror = true;
        this.setRotation(this.part13, 1.832596f, 0.0f, -0.1745329f);
        this.part14 = new ModelRenderer((ModelBase)this, 18, 14);
        this.part14.addBox(5.0f, -12.0f, 1.0f, 1, 9, 4);
        this.part14.setRotationPoint(-1.0f, 9.0f, 9.0f);
        this.part14.setTextureSize(64, 32);
        this.part14.mirror = true;
        this.setRotation(this.part14, 1.832596f, 0.0f, -0.1745329f);
        this.part15 = new ModelRenderer((ModelBase)this, 18, 14);
        this.part15.addBox(-3.0f, 6.0f, -3.0f, 1, 9, 4);
        this.part15.setRotationPoint(-1.0f, 7.0f, 9.0f);
        this.part15.setTextureSize(64, 32);
        this.part15.mirror = true;
        this.setRotation(this.part15, 1.832596f, 0.0f, 0.5235988f);
        this.part16 = new ModelRenderer((ModelBase)this, 18, 14);
        this.part16.addBox(-3.0f, -3.0f, -1.0f, 1, 9, 4);
        this.part16.setRotationPoint(-1.0f, 7.0f, 9.0f);
        this.part16.setTextureSize(64, 32);
        this.part16.mirror = true;
        this.setRotation(this.part16, 1.832596f, 0.0f, 0.5235988f);
        this.part17 = new ModelRenderer((ModelBase)this, 18, 14);
        this.part17.addBox(6.0f, 6.0f, -3.0f, 1, 9, 4);
        this.part17.setRotationPoint(-1.0f, 9.0f, 9.0f);
        this.part17.setTextureSize(64, 32);
        this.part17.mirror = true;
        this.setRotation(this.part17, 1.832596f, 0.0f, 0.0f);
        this.part18 = new ModelRenderer((ModelBase)this, 18, 14);
        this.part18.addBox(6.0f, -3.0f, -1.0f, 1, 9, 4);
        this.part18.setRotationPoint(-1.0f, 9.0f, 9.0f);
        this.part18.setTextureSize(64, 32);
        this.part18.mirror = true;
        this.setRotation(this.part18, 1.832596f, 0.0f, 0.0f);
        this.part19 = new ModelRenderer((ModelBase)this, 18, 14);
        this.part19.addBox(6.0f, -12.0f, 1.0f, 1, 9, 4);
        this.part19.setRotationPoint(-1.0f, 9.0f, 9.0f);
        this.part19.setTextureSize(64, 32);
        this.part19.mirror = true;
        this.setRotation(this.part19, 1.832596f, 0.0f, 0.0f);
        this.part20 = new ModelRenderer((ModelBase)this, 18, 14);
        this.part20.addBox(4.0f, 6.0f, -3.0f, 1, 9, 4);
        this.part20.setRotationPoint(-1.0f, 8.0f, 9.0f);
        this.part20.setTextureSize(64, 32);
        this.part20.mirror = true;
        this.setRotation(this.part20, 1.832596f, 0.0f, -0.3490659f);
        this.part21 = new ModelRenderer((ModelBase)this, 18, 14);
        this.part21.addBox(4.0f, -3.0f, -1.0f, 1, 9, 4);
        this.part21.setRotationPoint(-1.0f, 8.0f, 9.0f);
        this.part21.setTextureSize(64, 32);
        this.part21.mirror = true;
        this.setRotation(this.part21, 1.832596f, 0.0f, -0.3490659f);
        this.part22 = new ModelRenderer((ModelBase)this, 18, 14);
        this.part22.addBox(5.0f, -12.0f, 1.0f, 1, 4, 4);
        this.part22.setRotationPoint(-1.0f, 6.0f, 9.0f);
        this.part22.setTextureSize(64, 32);
        this.part22.mirror = true;
        this.setRotation(this.part22, 2.055667f, 0.1858931f, -0.0144583f);
        this.part23 = new ModelRenderer((ModelBase)this, 18, 14);
        this.part23.addBox(-7.0f, -12.0f, 1.0f, 1, 9, 4);
        this.part23.setRotationPoint(-1.0f, 9.0f, 9.0f);
        this.part23.setTextureSize(64, 32);
        this.part23.mirror = true;
        this.setRotation(this.part23, 1.832596f, 0.0f, 0.0f);
        this.part24 = new ModelRenderer((ModelBase)this, 18, 14);
        this.part24.addBox(-7.0f, -3.0f, -1.0f, 1, 9, 4);
        this.part24.setRotationPoint(-1.0f, 9.0f, 9.0f);
        this.part24.setTextureSize(64, 32);
        this.part24.mirror = true;
        this.setRotation(this.part24, 1.832596f, 0.0f, 0.0f);
        this.part25 = new ModelRenderer((ModelBase)this, 18, 14);
        this.part25.addBox(-7.0f, 6.0f, -3.0f, 1, 9, 4);
        this.part25.setRotationPoint(-1.0f, 9.0f, 9.0f);
        this.part25.setTextureSize(64, 32);
        this.part25.mirror = true;
        this.setRotation(this.part25, 1.832596f, 0.0f, 0.0f);
        this.part26 = new ModelRenderer((ModelBase)this, 18, 14);
        this.part26.addBox(-6.0f, -3.0f, -1.0f, 1, 9, 4);
        this.part26.setRotationPoint(-1.0f, 9.0f, 9.0f);
        this.part26.setTextureSize(64, 32);
        this.part26.mirror = true;
        this.setRotation(this.part26, 1.832596f, 0.0f, 0.1745329f);
        this.part27 = new ModelRenderer((ModelBase)this, 18, 14);
        this.part27.addBox(-6.0f, 6.0f, -3.0f, 1, 9, 4);
        this.part27.setRotationPoint(-1.0f, 9.0f, 9.0f);
        this.part27.setTextureSize(64, 32);
        this.part27.mirror = true;
        this.setRotation(this.part27, 1.832596f, 0.0f, 0.1745329f);
        this.part28 = new ModelRenderer((ModelBase)this, 18, 14);
        this.part28.addBox(-6.0f, -12.0f, 1.0f, 1, 9, 4);
        this.part28.setRotationPoint(-1.0f, 9.0f, 9.0f);
        this.part28.setTextureSize(64, 32);
        this.part28.mirror = true;
        this.setRotation(this.part28, 1.832596f, 0.0f, 0.1745329f);
        this.part29 = new ModelRenderer((ModelBase)this, 18, 14);
        this.part29.addBox(-5.0f, -12.0f, 1.0f, 1, 9, 4);
        this.part29.setRotationPoint(-1.0f, 8.0f, 9.0f);
        this.part29.setTextureSize(64, 32);
        this.part29.mirror = true;
        this.setRotation(this.part29, 1.832596f, 0.0f, 0.3490659f);
        this.part30 = new ModelRenderer((ModelBase)this, 18, 14);
        this.part30.addBox(-3.0f, -12.0f, 1.0f, 1, 9, 4);
        this.part30.setRotationPoint(-1.0f, 7.0f, 9.0f);
        this.part30.setTextureSize(64, 32);
        this.part30.mirror = true;
        this.setRotation(this.part30, 1.832596f, 0.0f, 0.5235988f);
        this.part31 = new ModelRenderer((ModelBase)this, 18, 14);
        this.part31.addBox(2.0f, -12.0f, 1.0f, 1, 9, 4);
        this.part31.setRotationPoint(-1.0f, 7.0f, 9.0f);
        this.part31.setTextureSize(64, 32);
        this.part31.mirror = true;
        this.setRotation(this.part31, 1.832596f, 0.0f, -0.5235988f);
        this.part32 = new ModelRenderer((ModelBase)this, 18, 14);
        this.part32.addBox(4.0f, -12.0f, 1.0f, 1, 9, 4);
        this.part32.setRotationPoint(-1.0f, 8.0f, 9.0f);
        this.part32.setTextureSize(64, 32);
        this.part32.mirror = true;
        this.setRotation(this.part32, 1.832596f, 0.0f, -0.3490659f);
        this.part33 = new ModelRenderer((ModelBase)this, 18, 14);
        this.part33.addBox(-6.0f, -12.0f, 1.0f, 1, 4, 4);
        this.part33.setRotationPoint(-1.0f, 7.0f, 9.0f);
        this.part33.setTextureSize(64, 32);
        this.part33.mirror = true;
        this.setRotation(this.part33, 2.094395f, -0.1745329f, 0.1373543f);
        this.part34 = new ModelRenderer((ModelBase)this, 18, 14);
        this.part34.addBox(2.0f, -12.0f, 1.0f, 1, 4, 4);
        this.part34.setRotationPoint(-1.0f, 5.0f, 9.0f);
        this.part34.setTextureSize(64, 32);
        this.part34.mirror = true;
        this.setRotation(this.part34, 2.055667f, 0.1858931f, -0.5235988f);
        this.part35 = new ModelRenderer((ModelBase)this, 18, 14);
        this.part35.addBox(4.0f, -12.0f, 1.0f, 1, 4, 4);
        this.part35.setRotationPoint(-1.0f, 6.0f, 9.0f);
        this.part35.setTextureSize(64, 32);
        this.part35.mirror = true;
        this.setRotation(this.part35, 2.055667f, 0.1858931f, -0.3490659f);
        this.part36 = new ModelRenderer((ModelBase)this, 18, 14);
        this.part36.addBox(-3.0f, -12.0f, 1.0f, 1, 4, 4);
        this.part36.setRotationPoint(-1.0f, 5.0f, 9.0f);
        this.part36.setTextureSize(64, 32);
        this.part36.mirror = true;
        this.setRotation(this.part36, 2.094395f, -0.1745329f, 0.4864202f);
        this.part37 = new ModelRenderer((ModelBase)this, 18, 14);
        this.part37.addBox(-5.0f, -12.0f, 1.0f, 1, 4, 4);
        this.part37.setRotationPoint(-1.0f, 6.0f, 9.0f);
        this.part37.setTextureSize(64, 32);
        this.part37.mirror = true;
        this.setRotation(this.part37, 2.094395f, -0.1745329f, 0.3118872f);
        this.part38 = new ModelRenderer((ModelBase)this, 18, 14);
        this.part38.addBox(-4.0f, -2.0f, -3.0f, 6, 9, 6);
        this.part38.setRotationPoint(-3.0f, 12.0f, -3.0f);
        this.part38.setTextureSize(64, 32);
        this.part38.mirror = true;
        this.setRotation(this.part38, 1.570796f, 0.0f, 0.0f);
        this.part39 = new ModelRenderer((ModelBase)this, 18, 14);
        this.part39.addBox(-4.0f, -2.0f, -3.0f, 4, 9, 2);
        this.part39.setRotationPoint(1.0f, 6.0f, -3.0f);
        this.part39.setTextureSize(64, 32);
        this.part39.mirror = true;
        this.setRotation(this.part39, 1.942582f, 0.0f, 0.0f);
        this.part40 = new ModelRenderer((ModelBase)this, 18, 14);
        this.part40.addBox(-4.0f, -2.0f, -3.0f, 4, 9, 2);
        this.part40.setRotationPoint(1.0f, 6.0f, 14.0f);
        this.part40.setTextureSize(64, 32);
        this.part40.mirror = true;
        this.setRotation(this.part40, 1.942582f, 0.0f, 0.0f);
        this.Tail1 = new ModelRenderer((ModelBase)this, 9, 18);
        this.Tail1.addBox(-2.0f, 5.0f, -2.0f, 4, 4, 4);
        this.Tail1.setRotationPoint(-1.0f, 12.0f, 21.0f);
        this.Tail1.setTextureSize(64, 32);
        this.Tail1.mirror = true;
        this.setRotation(this.Tail1, 1.130069f, 0.0f, 0.0f);
        this.Tail2 = new ModelRenderer((ModelBase)this, 9, 18);
        this.Tail2.addBox(-2.0f, 13.0f, -2.0f, 4, 4, 4);
        this.Tail2.setRotationPoint(-1.0f, 12.0f, 21.0f);
        this.Tail2.setTextureSize(64, 32);
        this.Tail2.mirror = true;
        this.setRotation(this.Tail2, 1.130069f, 0.0f, 0.0f);
        this.Tail3 = new ModelRenderer((ModelBase)this, 9, 18);
        this.Tail3.addBox(-1.0f, 0.0f, -1.0f, 2, 8, 2);
        this.Tail3.setRotationPoint(-1.0f, 12.0f, 21.0f);
        this.Tail3.setTextureSize(64, 32);
        this.Tail3.mirror = true;
        this.setRotation(this.Tail3, 1.130069f, 0.0f, 0.0f);
        this.Tail4 = new ModelRenderer((ModelBase)this, 9, 18);
        this.Tail4.addBox(-1.0f, 8.0f, -1.0f, 2, 8, 2);
        this.Tail4.setRotationPoint(-1.0f, 12.0f, 21.0f);
        this.Tail4.setTextureSize(64, 32);
        this.Tail4.mirror = true;
        this.setRotation(this.Tail4, 1.130069f, 0.0f, 0.0f);
        this.Tail5 = new ModelRenderer((ModelBase)this, 9, 18);
        this.Tail5.addBox(-1.0f, 16.0f, -1.0f, 2, 8, 2);
        this.Tail5.setRotationPoint(-1.0f, 12.0f, 21.0f);
        this.Tail5.setTextureSize(64, 32);
        this.Tail5.mirror = true;
        this.setRotation(this.Tail5, 1.130069f, 0.0f, 0.0f);
        this.part41 = new ModelRenderer((ModelBase)this, 16, 14);
        this.part41.addBox(-5.0f, -7.0f, -3.0f, 2, 2, 5);
        this.part41.setRotationPoint(-1.0f, 11.5f, -7.0f);
        this.part41.setTextureSize(64, 32);
        this.part41.mirror = true;
        this.setRotation(this.part41, 0.0f, 0.0f, 0.0f);
        this.part42 = new ModelRenderer((ModelBase)this, 16, 14);
        this.part42.addBox(3.0f, -7.0f, -3.0f, 2, 2, 5);
        this.part42.setRotationPoint(-1.0f, 11.5f, -7.0f);
        this.part42.setTextureSize(64, 32);
        this.part42.mirror = true;
        this.setRotation(this.part42, 0.0f, 0.0f, 0.0f);
        this.part43 = new ModelRenderer((ModelBase)this, 2, 12);
        this.part43.addBox(-6.0f, -1.0f, -2.0f, 3, 2, 2);
        this.part43.setRotationPoint(-1.0f, 11.5f, -7.0f);
        this.part43.setTextureSize(64, 32);
        this.part43.mirror = true;
        this.setRotation(this.part43, 0.0f, 0.0f, 0.0f);
        this.part44 = new ModelRenderer((ModelBase)this, 2, 12);
        this.part44.addBox(3.0f, -1.0f, -2.0f, 3, 2, 2);
        this.part44.setRotationPoint(-1.0f, 11.5f, -7.0f);
        this.part44.setTextureSize(64, 32);
        this.part44.mirror = true;
        this.setRotation(this.part44, 0.0f, 0.0f, 0.0f);
        this.part44.mirror = false;
        this.part45 = new ModelRenderer((ModelBase)this, 16, 14);
        this.part45.addBox(-5.0f, -5.0f, 0.0f, 2, 4, 2);
        this.part45.setRotationPoint(-1.0f, 11.5f, -7.0f);
        this.part45.setTextureSize(64, 32);
        this.part45.mirror = true;
        this.setRotation(this.part45, 0.0f, 0.0f, 0.0f);
        this.part46 = new ModelRenderer((ModelBase)this, 16, 14);
        this.part46.addBox(3.0f, -5.0f, 0.0f, 2, 4, 2);
        this.part46.setRotationPoint(-1.0f, 11.5f, -7.0f);
        this.part46.setTextureSize(64, 32);
        this.part46.mirror = true;
        this.setRotation(this.part46, 0.0f, 0.0f, 0.0f);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        this.setRotationAngles(f, f1, f2, f3, f4, f5);
        this.part1.render(f5);
        this.part2.render(f5);
        this.Leg1p1.render(f5);
        this.Leg2p1.render(f5);
        this.Tail6.render(f5);
        this.part3.render(f5);
        this.part4.render(f5);
        this.Leg1p2.render(f5);
        this.Leg2p2.render(f5);
        this.Leg1p3.render(f5);
        this.Leg2p3.render(f5);
        this.Leg1p4.render(f5);
        this.Leg2p4.render(f5);
        this.Leg1p5.render(f5);
        this.Leg2p5.render(f5);
        this.Leg1p6.render(f5);
        this.Leg2p6.render(f5);
        this.part5.render(f5);
        this.part6.render(f5);
        this.Leg3p1.render(f5);
        this.Leg3p2.render(f5);
        this.Leg3p3.render(f5);
        this.Leg4p1.render(f5);
        this.Leg4p2.render(f5);
        this.Leg4p3.render(f5);
        this.Leg3p4.render(f5);
        this.Leg4p4.render(f5);
        this.Leg3p5.render(f5);
        this.Leg3p6.render(f5);
        this.Leg4p5.render(f5);
        this.Leg4p6.render(f5);
        this.part7.render(f5);
        this.part8.render(f5);
        this.part9.render(f5);
        this.part10.render(f5);
        this.part11.render(f5);
        this.part12.render(f5);
        this.part13.render(f5);
        this.part14.render(f5);
        this.part15.render(f5);
        this.part16.render(f5);
        this.part17.render(f5);
        this.part18.render(f5);
        this.part19.render(f5);
        this.part20.render(f5);
        this.part21.render(f5);
        this.part22.render(f5);
        this.part23.render(f5);
        this.part24.render(f5);
        this.part25.render(f5);
        this.part26.render(f5);
        this.part27.render(f5);
        this.part28.render(f5);
        this.part29.render(f5);
        this.part30.render(f5);
        this.part31.render(f5);
        this.part32.render(f5);
        this.part33.render(f5);
        this.part34.render(f5);
        this.part35.render(f5);
        this.part36.render(f5);
        this.part37.render(f5);
        this.part38.render(f5);
        this.part39.render(f5);
        this.part40.render(f5);
        this.Tail1.render(f5);
        this.Tail2.render(f5);
        this.Tail3.render(f5);
        this.Tail4.render(f5);
        this.Tail5.render(f5);
        this.part41.render(f5);
        this.part42.render(f5);
        this.part43.render(f5);
        this.part44.render(f5);
        this.part45.render(f5);
        this.part46.render(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5) {
        this.Leg1p1.rotateAngleX = MathHelper.cos((float)(f * 0.6662f)) * 1.4f * f1;
        this.Leg1p2.rotateAngleX = MathHelper.cos((float)(f * 0.6662f)) * 1.4f * f1 - 1.570796f;
        this.Leg1p3.rotateAngleX = MathHelper.cos((float)(f * 0.6662f)) * 1.4f * f1 - 0.7853982f;
        this.Leg1p4.rotateAngleX = MathHelper.cos((float)(f * 0.6662f)) * 1.4f * f1 - 2.356194f;
        this.Leg1p5.rotateAngleX = MathHelper.cos((float)(f * 0.6662f)) * 1.4f * f1 - 1.570796f;
        this.Leg1p6.rotateAngleX = MathHelper.cos((float)(f * 0.6662f)) * 1.4f * f1 - 1.570796f;
        this.Leg2p1.rotateAngleX = MathHelper.cos((float)(f * 0.6662f + (float)Math.PI)) * 1.4f * f1;
        this.Leg2p2.rotateAngleX = MathHelper.cos((float)(f * 0.6662f + (float)Math.PI)) * 1.4f * f1 - 1.570796f;
        this.Leg2p3.rotateAngleX = MathHelper.cos((float)(f * 0.6662f + (float)Math.PI)) * 1.4f * f1 - 0.7853982f;
        this.Leg2p4.rotateAngleX = MathHelper.cos((float)(f * 0.6662f + (float)Math.PI)) * 1.4f * f1 - 2.356194f;
        this.Leg2p5.rotateAngleX = MathHelper.cos((float)(f * 0.6662f + (float)Math.PI)) * 1.4f * f1 - 1.570796f;
        this.Leg2p6.rotateAngleX = MathHelper.cos((float)(f * 0.6662f + (float)Math.PI)) * 1.4f * f1 - 1.570796f;
        this.Leg3p1.rotateAngleX = MathHelper.cos((float)(f * 0.6662f)) * 1.4f * f1 - 2.356194f;
        this.Leg3p2.rotateAngleX = MathHelper.cos((float)(f * 0.6662f)) * 1.4f * f1 - 0.7853982f;
        this.Leg3p3.rotateAngleX = MathHelper.cos((float)(f * 0.6662f)) * 1.4f * f1;
        this.Leg3p4.rotateAngleX = MathHelper.cos((float)(f * 0.6662f)) * 1.4f * f1 - 1.570796f;
        this.Leg3p5.rotateAngleX = MathHelper.cos((float)(f * 0.6662f)) * 1.4f * f1 - 1.570796f;
        this.Leg3p6.rotateAngleX = MathHelper.cos((float)(f * 0.6662f)) * 1.4f * f1 - 1.570796f;
        this.Leg4p1.rotateAngleX = MathHelper.cos((float)(f * 0.6662f + (float)Math.PI)) * 1.4f * f1 - 2.356194f;
        this.Leg4p2.rotateAngleX = MathHelper.cos((float)(f * 0.6662f + (float)Math.PI)) * 1.4f * f1 - 0.7853982f;
        this.Leg4p3.rotateAngleX = MathHelper.cos((float)(f * 0.6662f + (float)Math.PI)) * 1.4f * f1;
        this.Leg4p4.rotateAngleX = MathHelper.cos((float)(f * 0.6662f + (float)Math.PI)) * 1.4f * f1 - 1.570796f;
        this.Leg4p5.rotateAngleX = MathHelper.cos((float)(f * 0.6662f + (float)Math.PI)) * 1.4f * f1 - 1.570796f;
        this.Leg4p6.rotateAngleX = MathHelper.cos((float)(f * 0.6662f + (float)Math.PI)) * 1.4f * f1 - 1.570796f;
        this.Tail1.rotateAngleX = MathHelper.cos((float)(f3 * 0.1f)) * (float)Math.PI * 0.15f + 1.130069f;
        this.Tail2.rotateAngleX = MathHelper.cos((float)(f3 * 0.1f)) * (float)Math.PI * 0.15f + 1.130069f;
        this.Tail3.rotateAngleX = MathHelper.cos((float)(f3 * 0.1f)) * (float)Math.PI * 0.15f + 1.130069f;
        this.Tail4.rotateAngleX = MathHelper.cos((float)(f3 * 0.1f)) * (float)Math.PI * 0.15f + 1.130069f;
        this.Tail5.rotateAngleX = MathHelper.cos((float)(f3 * 0.1f)) * (float)Math.PI * 0.15f + 1.130069f;
        this.Tail6.rotateAngleX = MathHelper.cos((float)(f3 * 0.1f)) * (float)Math.PI * 0.15f + 1.130069f;
    }
}

