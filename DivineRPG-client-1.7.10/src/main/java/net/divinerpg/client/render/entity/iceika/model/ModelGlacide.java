/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.model.ModelBase
 *  net.minecraft.client.model.ModelRenderer
 *  net.minecraft.entity.Entity
 *  net.minecraft.util.MathHelper
 */
package net.divinerpg.client.render.entity.iceika.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelGlacide
extends ModelBase {
    ModelRenderer head;
    ModelRenderer body;
    ModelRenderer legRBT;
    ModelRenderer legLBT;
    ModelRenderer legRFT;
    ModelRenderer legLFT;
    ModelRenderer udders;
    ModelRenderer legRMT;
    ModelRenderer legLMT;
    ModelRenderer legLF;
    ModelRenderer legRF;
    ModelRenderer legLM;
    ModelRenderer legLB;
    ModelRenderer legRM;
    ModelRenderer legRB;
    ModelRenderer body2;
    ModelRenderer body3;
    ModelRenderer body4;
    ModelRenderer body5;
    ModelRenderer body6;
    ModelRenderer body7;
    ModelRenderer body8;
    ModelRenderer body9;
    ModelRenderer body10;
    ModelRenderer body11;
    ModelRenderer body12;
    ModelRenderer body13;
    ModelRenderer body14;
    ModelRenderer body15;
    ModelRenderer body16;
    ModelRenderer body17;
    ModelRenderer body18;
    ModelRenderer body19;
    ModelRenderer body20;
    ModelRenderer body21;
    ModelRenderer body22;
    ModelRenderer body23;
    ModelRenderer body24;
    ModelRenderer body25;
    ModelRenderer body26;
    ModelRenderer body27;
    ModelRenderer head2;
    ModelRenderer body28;
    ModelRenderer body29;
    ModelRenderer body30;
    ModelRenderer body31;
    ModelRenderer body32;
    ModelRenderer body33;
    ModelRenderer body34;
    ModelRenderer body35;
    ModelRenderer body36;
    ModelRenderer body37;
    ModelRenderer body38;
    ModelRenderer body39;
    ModelRenderer body40;
    ModelRenderer body41;
    ModelRenderer body42;
    ModelRenderer body43;

    public ModelGlacide() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.head = new ModelRenderer((ModelBase)this, 0, 0);
        this.head.addBox(-4.0f, -4.0f, -6.0f, 8, 8, 11);
        this.head.setRotationPoint(6.0f, -2.0f, -10.0f);
        this.head.setTextureSize(64, 32);
        this.head.mirror = true;
        this.setRotation(this.head, 0.0f, 0.0f, 0.0f);
        this.body = new ModelRenderer((ModelBase)this, 32, 6);
        this.body.addBox(-6.0f, -10.0f, -7.0f, 2, 5, 2);
        this.body.setRotationPoint(12.0f, -4.0f, 17.0f);
        this.body.setTextureSize(64, 32);
        this.body.mirror = true;
        this.setRotation(this.body, 0.7853982f, 0.0f, 0.0f);
        this.legRBT = new ModelRenderer((ModelBase)this, 32, 18);
        this.legRBT.addBox(-4.0f, -4.0f, -2.0f, 5, 4, 5);
        this.legRBT.setRotationPoint(-3.0f, 12.0f, 8.0f);
        this.legRBT.setTextureSize(64, 32);
        this.legRBT.mirror = true;
        this.setRotation(this.legRBT, 0.0f, 0.0f, 0.0f);
        this.legLBT = new ModelRenderer((ModelBase)this, 32, 18);
        this.legLBT.addBox(-1.0f, -4.0f, -2.0f, 5, 4, 5);
        this.legLBT.setRotationPoint(3.0f, 12.0f, 8.0f);
        this.legLBT.setTextureSize(64, 32);
        this.legLBT.mirror = true;
        this.setRotation(this.legLBT, 0.0f, 0.0f, 0.0f);
        this.legRFT = new ModelRenderer((ModelBase)this, 32, 18);
        this.legRFT.addBox(-4.0f, -4.0f, -3.0f, 5, 4, 5);
        this.legRFT.setRotationPoint(-3.0f, 12.0f, -5.0f);
        this.legRFT.setTextureSize(64, 32);
        this.legRFT.mirror = true;
        this.setRotation(this.legRFT, 0.0f, 0.0f, 0.0f);
        this.legLFT = new ModelRenderer((ModelBase)this, 32, 18);
        this.legLFT.addBox(-1.0f, -4.0f, -3.0f, 5, 4, 5);
        this.legLFT.setRotationPoint(3.0f, 12.0f, -5.0f);
        this.legLFT.setTextureSize(64, 32);
        this.legLFT.mirror = true;
        this.setRotation(this.legLFT, 0.0f, 0.0f, 0.0f);
        this.udders = new ModelRenderer((ModelBase)this, 52, 0);
        this.udders.addBox(-2.0f, -3.0f, 0.0f, 4, 6, 2);
        this.udders.setRotationPoint(0.0f, 14.0f, 6.0f);
        this.udders.setTextureSize(64, 32);
        this.udders.mirror = true;
        this.setRotation(this.udders, 1.570796f, 0.0f, 0.0f);
        this.legRMT = new ModelRenderer((ModelBase)this, 32, 17);
        this.legRMT.addBox(-1.0f, -4.0f, 0.0f, 5, 4, 6);
        this.legRMT.setRotationPoint(-6.0f, 12.0f, -1.733333f);
        this.legRMT.setTextureSize(64, 32);
        this.legRMT.mirror = true;
        this.setRotation(this.legRMT, 0.0f, 0.0f, 0.0f);
        this.legLMT = new ModelRenderer((ModelBase)this, 32, 17);
        this.legLMT.addBox(0.0f, -4.0f, 0.0f, 5, 4, 6);
        this.legLMT.setRotationPoint(2.0f, 12.0f, -1.7f);
        this.legLMT.setTextureSize(64, 32);
        this.legLMT.mirror = true;
        this.setRotation(this.legLMT, 0.0f, 0.0f, 0.0f);
        this.legLF = new ModelRenderer((ModelBase)this, 0, 16);
        this.legLF.addBox(-1.0f, 0.0f, -3.0f, 4, 12, 4);
        this.legLF.setRotationPoint(3.0f, 12.0f, -5.0f);
        this.legLF.setTextureSize(64, 32);
        this.legLF.mirror = true;
        this.setRotation(this.legLF, 0.0f, 0.0f, 0.0f);
        this.legRF = new ModelRenderer((ModelBase)this, 0, 16);
        this.legRF.addBox(-3.0f, 0.0f, -3.0f, 4, 12, 4);
        this.legRF.setRotationPoint(-3.0f, 12.0f, -5.0f);
        this.legRF.setTextureSize(64, 32);
        this.legRF.mirror = true;
        this.setRotation(this.legRF, 0.0f, 0.0f, 0.0f);
        this.legLM = new ModelRenderer((ModelBase)this, 0, 15);
        this.legLM.addBox(0.0f, 0.0f, 0.0f, 4, 12, 5);
        this.legLM.setRotationPoint(2.0f, 12.0f, -1.7f);
        this.legLM.setTextureSize(64, 32);
        this.legLM.mirror = true;
        this.setRotation(this.legLM, 0.0f, 0.0f, 0.0f);
        this.legLB = new ModelRenderer((ModelBase)this, 0, 16);
        this.legLB.addBox(-1.0f, 0.0f, -2.0f, 4, 12, 4);
        this.legLB.setRotationPoint(3.0f, 12.0f, 8.0f);
        this.legLB.setTextureSize(64, 32);
        this.legLB.mirror = true;
        this.setRotation(this.legLB, 0.0f, 0.0f, 0.0f);
        this.legRM = new ModelRenderer((ModelBase)this, 0, 15);
        this.legRM.addBox(0.0f, 0.0f, 0.0f, 4, 12, 5);
        this.legRM.setRotationPoint(-6.0f, 12.0f, -1.733333f);
        this.legRM.setTextureSize(64, 32);
        this.legRM.mirror = true;
        this.setRotation(this.legRM, 0.0f, 0.0f, 0.0f);
        this.legRB = new ModelRenderer((ModelBase)this, 0, 16);
        this.legRB.addBox(-3.0f, 0.0f, -2.0f, 4, 12, 4);
        this.legRB.setRotationPoint(-3.0f, 12.0f, 8.0f);
        this.legRB.setTextureSize(64, 32);
        this.legRB.mirror = true;
        this.setRotation(this.legRB, 0.0f, 0.0f, 0.0f);
        this.body2 = new ModelRenderer((ModelBase)this, 20, 26);
        this.body2.addBox(-6.0f, -10.0f, -7.0f, 3, 3, 3);
        this.body2.setRotationPoint(12.0f, 5.0f, 18.0f);
        this.body2.setTextureSize(64, 32);
        this.body2.mirror = true;
        this.setRotation(this.body2, 1.570796f, 0.0f, 0.0f);
        this.body3 = new ModelRenderer((ModelBase)this, 20, 4);
        this.body3.addBox(-6.0f, -10.0f, -7.0f, 12, 18, 10);
        this.body3.setRotationPoint(0.0f, 5.0f, 2.0f);
        this.body3.setTextureSize(64, 32);
        this.body3.mirror = true;
        this.setRotation(this.body3, 1.570796f, 0.0f, 0.0f);
        this.body4 = new ModelRenderer((ModelBase)this, 20, 26);
        this.body4.addBox(-6.0f, -10.0f, -7.0f, 3, 3, 3);
        this.body4.setRotationPoint(12.0f, 2.0f, 2.0f);
        this.body4.setTextureSize(64, 32);
        this.body4.mirror = true;
        this.setRotation(this.body4, 1.570796f, 0.0f, 0.0f);
        this.body5 = new ModelRenderer((ModelBase)this, 32, 6);
        this.body5.addBox(-6.0f, -10.0f, -7.0f, 2, 18, 2);
        this.body5.setRotationPoint(12.0f, -4.0f, -4.0f);
        this.body5.setTextureSize(64, 32);
        this.body5.mirror = true;
        this.setRotation(this.body5, 2.356194f, 0.0f, 0.0f);
        this.body6 = new ModelRenderer((ModelBase)this, 32, 6);
        this.body6.addBox(-6.0f, -10.0f, -7.0f, 4, 3, 4);
        this.body6.setRotationPoint(11.0f, 14.0f, 6.0f);
        this.body6.setTextureSize(64, 32);
        this.body6.mirror = true;
        this.setRotation(this.body6, -2.356194f, 0.0f, 0.0f);
        this.body7 = new ModelRenderer((ModelBase)this, 20, 26);
        this.body7.addBox(-6.0f, -10.0f, -7.0f, 3, 3, 3);
        this.body7.setRotationPoint(-3.0f, 2.0f, 2.0f);
        this.body7.setTextureSize(64, 32);
        this.body7.mirror = true;
        this.setRotation(this.body7, 1.570796f, 0.0f, 0.0f);
        this.body8 = new ModelRenderer((ModelBase)this, 20, 26);
        this.body8.addBox(-6.0f, -10.0f, -7.0f, 3, 3, 3);
        this.body8.setRotationPoint(-3.0f, 5.0f, 18.0f);
        this.body8.setTextureSize(64, 32);
        this.body8.mirror = true;
        this.setRotation(this.body8, 1.570796f, 0.0f, 0.0f);
        this.body9 = new ModelRenderer((ModelBase)this, 32, 6);
        this.body9.addBox(-6.0f, -10.0f, -7.0f, 3, 3, 4);
        this.body9.setRotationPoint(7.0f, 7.0f, 5.0f);
        this.body9.setTextureSize(64, 32);
        this.body9.mirror = true;
        this.setRotation(this.body9, -2.356194f, 0.0f, 0.0f);
        this.body10 = new ModelRenderer((ModelBase)this, 32, 6);
        this.body10.addBox(-6.0f, -10.0f, -7.0f, 2, 18, 2);
        this.body10.setRotationPoint(8.0f, -4.0f, -4.0f);
        this.body10.setTextureSize(64, 32);
        this.body10.mirror = true;
        this.setRotation(this.body10, 2.356194f, 0.0f, 0.0f);
        this.body11 = new ModelRenderer((ModelBase)this, 32, 6);
        this.body11.addBox(-6.0f, -10.0f, -7.0f, 2, 5, 2);
        this.body11.setRotationPoint(8.0f, -4.0f, 17.0f);
        this.body11.setTextureSize(64, 32);
        this.body11.mirror = true;
        this.setRotation(this.body11, 0.7853982f, 0.0f, 0.0f);
        this.body12 = new ModelRenderer((ModelBase)this, 20, 26);
        this.body12.addBox(-6.0f, -10.0f, -7.0f, 3, 3, 3);
        this.body12.setRotationPoint(-3.0f, 5.0f, 8.0f);
        this.body12.setTextureSize(64, 32);
        this.body12.mirror = true;
        this.setRotation(this.body12, 1.570796f, 0.0f, 0.0f);
        this.body13 = new ModelRenderer((ModelBase)this, 32, 6);
        this.body13.addBox(-6.0f, -10.0f, -7.0f, 2, 18, 2);
        this.body13.setRotationPoint(8.0f, -1.0f, 2.0f);
        this.body13.setTextureSize(64, 32);
        this.body13.mirror = true;
        this.setRotation(this.body13, 2.356194f, 0.0f, 0.0f);
        this.body14 = new ModelRenderer((ModelBase)this, 32, 6);
        this.body14.addBox(-6.0f, -10.0f, -7.0f, 2, 5, 2);
        this.body14.setRotationPoint(8.0f, -1.0f, 23.0f);
        this.body14.setTextureSize(64, 32);
        this.body14.mirror = true;
        this.setRotation(this.body14, 0.7853982f, 0.0f, 0.0f);
        this.body15 = new ModelRenderer((ModelBase)this, 20, 26);
        this.body15.addBox(-6.0f, -10.0f, -7.0f, 3, 3, 3);
        this.body15.setRotationPoint(12.0f, 5.0f, 8.0f);
        this.body15.setTextureSize(64, 32);
        this.body15.mirror = true;
        this.setRotation(this.body15, 1.570796f, 0.0f, 0.0f);
        this.body16 = new ModelRenderer((ModelBase)this, 32, 6);
        this.body16.addBox(-6.0f, -10.0f, -7.0f, 2, 18, 2);
        this.body16.setRotationPoint(12.0f, -1.0f, 2.0f);
        this.body16.setTextureSize(64, 32);
        this.body16.mirror = true;
        this.setRotation(this.body16, 2.356194f, 0.0f, 0.0f);
        this.body17 = new ModelRenderer((ModelBase)this, 32, 6);
        this.body17.addBox(-6.0f, -10.0f, -7.0f, 2, 5, 2);
        this.body17.setRotationPoint(12.0f, -1.0f, 23.0f);
        this.body17.setTextureSize(64, 32);
        this.body17.mirror = true;
        this.setRotation(this.body17, 0.7853982f, 0.0f, 0.0f);
        this.body18 = new ModelRenderer((ModelBase)this, 32, 6);
        this.body18.addBox(-6.0f, -10.0f, -7.0f, 2, 9, 2);
        this.body18.setRotationPoint(12.0f, 14.0f, 5.0f);
        this.body18.setTextureSize(64, 32);
        this.body18.mirror = true;
        this.setRotation(this.body18, -2.356194f, 0.0f, 0.0f);
        this.body19 = new ModelRenderer((ModelBase)this, 32, 6);
        this.body19.addBox(-6.0f, -10.0f, -7.0f, 1, 9, 2);
        this.body19.setRotationPoint(8.0f, 7.0f, 4.0f);
        this.body19.setTextureSize(64, 32);
        this.body19.mirror = true;
        this.setRotation(this.body19, -2.356194f, 0.0f, 0.0f);
        this.body20 = new ModelRenderer((ModelBase)this, 32, 6);
        this.body20.addBox(-6.0f, -10.0f, -7.0f, 4, 3, 4);
        this.body20.setRotationPoint(-3.0f, 14.0f, 6.0f);
        this.body20.setTextureSize(64, 32);
        this.body20.mirror = true;
        this.setRotation(this.body20, -2.356194f, 0.0f, 0.0f);
        this.body21 = new ModelRenderer((ModelBase)this, 32, 6);
        this.body21.addBox(-6.0f, -10.0f, -7.0f, 2, 9, 2);
        this.body21.setRotationPoint(-2.0f, 14.0f, 5.0f);
        this.body21.setTextureSize(64, 32);
        this.body21.mirror = true;
        this.setRotation(this.body21, -2.356194f, 0.0f, 0.0f);
        this.body22 = new ModelRenderer((ModelBase)this, 32, 6);
        this.body22.addBox(-6.0f, -10.0f, -7.0f, 3, 3, 4);
        this.body22.setRotationPoint(2.0f, 7.0f, 5.0f);
        this.body22.setTextureSize(64, 32);
        this.body22.mirror = true;
        this.setRotation(this.body22, -2.356194f, 0.0f, 0.0f);
        this.body23 = new ModelRenderer((ModelBase)this, 32, 6);
        this.body23.addBox(-6.0f, -10.0f, -7.0f, 1, 9, 2);
        this.body23.setRotationPoint(3.0f, 7.0f, 4.0f);
        this.body23.setTextureSize(64, 32);
        this.body23.mirror = true;
        this.setRotation(this.body23, -2.356194f, 0.0f, 0.0f);
        this.body24 = new ModelRenderer((ModelBase)this, 32, 6);
        this.body24.addBox(-6.0f, -10.0f, -7.0f, 3, 3, 4);
        this.body24.setRotationPoint(2.0f, 14.0f, 6.0f);
        this.body24.setTextureSize(64, 32);
        this.body24.mirror = true;
        this.setRotation(this.body24, -2.356194f, 0.0f, 0.0f);
        this.body25 = new ModelRenderer((ModelBase)this, 32, 6);
        this.body25.addBox(-6.0f, -10.0f, -7.0f, 1, 9, 2);
        this.body25.setRotationPoint(3.0f, 14.0f, 5.0f);
        this.body25.setTextureSize(64, 32);
        this.body25.mirror = true;
        this.setRotation(this.body25, -2.356194f, 0.0f, 0.0f);
        this.body26 = new ModelRenderer((ModelBase)this, 32, 6);
        this.body26.addBox(-6.0f, -10.0f, -7.0f, 1, 9, 2);
        this.body26.setRotationPoint(8.0f, 14.0f, 5.0f);
        this.body26.setTextureSize(64, 32);
        this.body26.mirror = true;
        this.setRotation(this.body26, -2.356194f, 0.0f, 0.0f);
        this.body27 = new ModelRenderer((ModelBase)this, 32, 6);
        this.body27.addBox(-6.0f, -10.0f, -7.0f, 3, 3, 4);
        this.body27.setRotationPoint(7.0f, 14.0f, 6.0f);
        this.body27.setTextureSize(64, 32);
        this.body27.mirror = true;
        this.setRotation(this.body27, -2.356194f, 0.0f, 0.0f);
        this.head2 = new ModelRenderer((ModelBase)this, 0, 0);
        this.head2.addBox(-4.0f, -4.0f, -6.0f, 8, 8, 11);
        this.head2.setRotationPoint(-6.0f, -2.0f, -10.0f);
        this.head2.setTextureSize(64, 32);
        this.head2.mirror = true;
        this.setRotation(this.head2, 0.0f, 0.0f, 0.0f);
        this.body28 = new ModelRenderer((ModelBase)this, 32, 6);
        this.body28.addBox(-6.0f, -10.0f, -7.0f, 2, 18, 2);
        this.body28.setRotationPoint(-2.0f, -4.0f, -4.0f);
        this.body28.setTextureSize(64, 32);
        this.body28.mirror = true;
        this.setRotation(this.body28, 2.356194f, 0.0f, 0.0f);
        this.body29 = new ModelRenderer((ModelBase)this, 32, 6);
        this.body29.addBox(-6.0f, -10.0f, -7.0f, 2, 5, 2);
        this.body29.setRotationPoint(-2.0f, -4.0f, 17.0f);
        this.body29.setTextureSize(64, 32);
        this.body29.mirror = true;
        this.setRotation(this.body29, 0.7853982f, 0.0f, 0.0f);
        this.body30 = new ModelRenderer((ModelBase)this, 32, 6);
        this.body30.addBox(-6.0f, -10.0f, -7.0f, 2, 5, 2);
        this.body30.setRotationPoint(-2.0f, -1.0f, 23.0f);
        this.body30.setTextureSize(64, 32);
        this.body30.mirror = true;
        this.setRotation(this.body30, 0.7853982f, 0.0f, 0.0f);
        this.body31 = new ModelRenderer((ModelBase)this, 32, 6);
        this.body31.addBox(-6.0f, -10.0f, -7.0f, 2, 18, 2);
        this.body31.setRotationPoint(-2.0f, -1.0f, 2.0f);
        this.body31.setTextureSize(64, 32);
        this.body31.mirror = true;
        this.setRotation(this.body31, 2.356194f, 0.0f, 0.0f);
        this.body32 = new ModelRenderer((ModelBase)this, 32, 6);
        this.body32.addBox(-6.0f, -10.0f, -7.0f, 1, 9, 2);
        this.body32.setRotationPoint(16.0f, -15.0f, -7.0f);
        this.body32.setTextureSize(64, 32);
        this.body32.mirror = true;
        this.setRotation(this.body32, 2.356194f, 0.0f, 0.0f);
        this.body33 = new ModelRenderer((ModelBase)this, 32, 6);
        this.body33.addBox(-6.0f, -10.0f, -7.0f, 2, 5, 2);
        this.body33.setRotationPoint(2.0f, -1.0f, 23.0f);
        this.body33.setTextureSize(64, 32);
        this.body33.mirror = true;
        this.setRotation(this.body33, 0.7853982f, 0.0f, 0.0f);
        this.body34 = new ModelRenderer((ModelBase)this, 32, 6);
        this.body34.addBox(-6.0f, -10.0f, -7.0f, 2, 18, 2);
        this.body34.setRotationPoint(2.0f, -1.0f, 2.0f);
        this.body34.setTextureSize(64, 32);
        this.body34.mirror = true;
        this.setRotation(this.body34, 2.356194f, 0.0f, 0.0f);
        this.body35 = new ModelRenderer((ModelBase)this, 32, 6);
        this.body35.addBox(-6.0f, -10.0f, -7.0f, 2, 18, 2);
        this.body35.setRotationPoint(2.0f, -4.0f, -4.0f);
        this.body35.setTextureSize(64, 32);
        this.body35.mirror = true;
        this.setRotation(this.body35, 2.356194f, 0.0f, 0.0f);
        this.body36 = new ModelRenderer((ModelBase)this, 32, 6);
        this.body36.addBox(-6.0f, -10.0f, -7.0f, 2, 5, 2);
        this.body36.setRotationPoint(2.0f, -4.0f, 17.0f);
        this.body36.setTextureSize(64, 32);
        this.body36.mirror = true;
        this.setRotation(this.body36, 0.7853982f, 0.0f, 0.0f);
        this.body37 = new ModelRenderer((ModelBase)this, 32, 6);
        this.body37.addBox(-6.0f, -10.0f, -7.0f, 1, 9, 2);
        this.body37.setRotationPoint(7.0f, -15.0f, -7.0f);
        this.body37.setTextureSize(64, 32);
        this.body37.mirror = true;
        this.setRotation(this.body37, 2.356194f, 0.0f, 0.0f);
        this.body38 = new ModelRenderer((ModelBase)this, 32, 6);
        this.body38.addBox(-6.0f, -10.0f, -7.0f, 1, 5, 2);
        this.body38.setRotationPoint(16.0f, -9.0f, 7.0f);
        this.body38.setTextureSize(64, 32);
        this.body38.mirror = true;
        this.setRotation(this.body38, 0.7853982f, 0.0f, 0.0f);
        this.body39 = new ModelRenderer((ModelBase)this, 32, 6);
        this.body39.addBox(-6.0f, -10.0f, -7.0f, 1, 9, 2);
        this.body39.setRotationPoint(4.0f, -15.0f, -7.0f);
        this.body39.setTextureSize(64, 32);
        this.body39.mirror = true;
        this.setRotation(this.body39, 2.356194f, 0.0f, 0.0f);
        this.body40 = new ModelRenderer((ModelBase)this, 32, 6);
        this.body40.addBox(-6.0f, -10.0f, -7.0f, 1, 5, 2);
        this.body40.setRotationPoint(4.0f, -9.0f, 7.0f);
        this.body40.setTextureSize(64, 32);
        this.body40.mirror = true;
        this.setRotation(this.body40, 0.7853982f, 0.0f, 0.0f);
        this.body41 = new ModelRenderer((ModelBase)this, 32, 6);
        this.body41.addBox(-6.0f, -10.0f, -7.0f, 1, 9, 2);
        this.body41.setRotationPoint(-5.0f, -15.0f, -7.0f);
        this.body41.setTextureSize(64, 32);
        this.body41.mirror = true;
        this.setRotation(this.body41, 2.356194f, 0.0f, 0.0f);
        this.body42 = new ModelRenderer((ModelBase)this, 32, 6);
        this.body42.addBox(-6.0f, -10.0f, -7.0f, 1, 5, 2);
        this.body42.setRotationPoint(-5.0f, -9.0f, 7.0f);
        this.body42.setTextureSize(64, 32);
        this.body42.mirror = true;
        this.setRotation(this.body42, 0.7853982f, 0.0f, 0.0f);
        this.body43 = new ModelRenderer((ModelBase)this, 32, 6);
        this.body43.addBox(-6.0f, -10.0f, -7.0f, 1, 5, 2);
        this.body43.setRotationPoint(7.0f, -9.0f, 7.0f);
        this.body43.setTextureSize(64, 32);
        this.body43.mirror = true;
        this.setRotation(this.body43, 0.7853982f, 0.0f, 0.0f);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        this.setRotationAngles(f, f1, f2, f3, f4, f5);
        this.head.render(f5);
        this.body.render(f5);
        this.legRBT.render(f5);
        this.legLBT.render(f5);
        this.legRFT.render(f5);
        this.legLFT.render(f5);
        this.udders.render(f5);
        this.legRMT.render(f5);
        this.legLMT.render(f5);
        this.legLF.render(f5);
        this.legRF.render(f5);
        this.legLM.render(f5);
        this.legLB.render(f5);
        this.legRM.render(f5);
        this.legRB.render(f5);
        this.body2.render(f5);
        this.body3.render(f5);
        this.body4.render(f5);
        this.body5.render(f5);
        this.body6.render(f5);
        this.body7.render(f5);
        this.body8.render(f5);
        this.body9.render(f5);
        this.body10.render(f5);
        this.body11.render(f5);
        this.body12.render(f5);
        this.body13.render(f5);
        this.body14.render(f5);
        this.body15.render(f5);
        this.body16.render(f5);
        this.body17.render(f5);
        this.body18.render(f5);
        this.body19.render(f5);
        this.body20.render(f5);
        this.body21.render(f5);
        this.body22.render(f5);
        this.body23.render(f5);
        this.body24.render(f5);
        this.body25.render(f5);
        this.body26.render(f5);
        this.body27.render(f5);
        this.head2.render(f5);
        this.body28.render(f5);
        this.body29.render(f5);
        this.body30.render(f5);
        this.body31.render(f5);
        this.body32.render(f5);
        this.body33.render(f5);
        this.body34.render(f5);
        this.body35.render(f5);
        this.body36.render(f5);
        this.body37.render(f5);
        this.body38.render(f5);
        this.body39.render(f5);
        this.body40.render(f5);
        this.body41.render(f5);
        this.body42.render(f5);
        this.body43.render(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5) {
        this.legLF.rotateAngleX = MathHelper.cos((float)(f * 0.6662f)) * 1.4f * f1;
        this.legLFT.rotateAngleX = MathHelper.cos((float)(f * 0.6662f)) * 1.4f * f1;
        this.legLM.rotateAngleX = MathHelper.cos((float)(f * 0.6662f)) * 1.4f * f1;
        this.legLMT.rotateAngleX = MathHelper.cos((float)(f * 0.6662f)) * 1.4f * f1;
        this.legLB.rotateAngleX = MathHelper.cos((float)(f * 0.6662f)) * 1.4f * f1;
        this.legLBT.rotateAngleX = MathHelper.cos((float)(f * 0.6662f)) * 1.4f * f1;
        this.legRF.rotateAngleX = MathHelper.cos((float)(f * 0.6662f + (float)Math.PI)) * 1.4f * f1;
        this.legRFT.rotateAngleX = MathHelper.cos((float)(f * 0.6662f + (float)Math.PI)) * 1.4f * f1;
        this.legRM.rotateAngleX = MathHelper.cos((float)(f * 0.6662f + (float)Math.PI)) * 1.4f * f1;
        this.legRMT.rotateAngleX = MathHelper.cos((float)(f * 0.6662f + (float)Math.PI)) * 1.4f * f1;
        this.legRB.rotateAngleX = MathHelper.cos((float)(f * 0.6662f + (float)Math.PI)) * 1.4f * f1;
        this.legRBT.rotateAngleX = MathHelper.cos((float)(f * 0.6662f + (float)Math.PI)) * 1.4f * f1;
    }
}

