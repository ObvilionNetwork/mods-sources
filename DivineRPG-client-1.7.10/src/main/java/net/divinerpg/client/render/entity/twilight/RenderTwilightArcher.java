/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cpw.mods.fml.relauncher.Side
 *  cpw.mods.fml.relauncher.SideOnly
 *  net.minecraft.client.model.ModelBase
 *  net.minecraft.client.renderer.entity.RenderLiving
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.ResourceLocation
 *  net.minecraftforge.client.IItemRenderer
 *  net.minecraftforge.client.IItemRenderer$ItemRenderType
 *  net.minecraftforge.client.IItemRenderer$ItemRendererHelper
 *  net.minecraftforge.client.MinecraftForgeClient
 *  org.lwjgl.opengl.GL11
 */
package net.divinerpg.client.render.entity.twilight;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.divinerpg.client.render.entity.twilight.model.ModelTwilightArcher;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.MinecraftForgeClient;
import org.lwjgl.opengl.GL11;

@SideOnly(value=Side.CLIENT)
public class RenderTwilightArcher
extends RenderLiving {
    protected ModelTwilightArcher modelBipedMain;
    private ResourceLocation texture;

    public RenderTwilightArcher(ModelTwilightArcher var1, ResourceLocation var2) {
        super((ModelBase)var1, 1.0f);
        this.modelBipedMain = var1;
        this.texture = var2;
    }

    protected void renderEquippedItems(EntityLivingBase var1, float var2) {
        super.renderEquippedItems(var1, var2);
        ItemStack var3 = var1.getHeldItem();
        if (var3 != null) {
            GL11.glPushMatrix();
            this.modelBipedMain.rightarm.postRender(0.0625f);
            GL11.glTranslatef((float)-0.0625f, (float)0.4375f, (float)0.0625f);
            IItemRenderer var5 = MinecraftForgeClient.getItemRenderer((ItemStack)var3, (IItemRenderer.ItemRenderType)IItemRenderer.ItemRenderType.EQUIPPED);
            boolean var6 = var5 != null && var5.shouldUseRenderHelper(IItemRenderer.ItemRenderType.EQUIPPED, var3, IItemRenderer.ItemRendererHelper.BLOCK_3D);
            float var4 = 0.625f;
            GL11.glTranslatef((float)-0.75f, (float)0.5f, (float)-0.4f);
            GL11.glScalef((float)var4, (float)(-var4), (float)var4);
            GL11.glRotatef((float)120.0f, (float)0.0f, (float)1.0f, (float)-0.6f);
            this.renderManager.itemRenderer.renderItem(var1, var3, 0);
            if (var3.getItem().requiresMultipleRenderPasses()) {
                for (int var7 = 1; var7 < var3.getItem().getRenderPasses(var3.getItemDamage()); ++var7) {
                    this.renderManager.itemRenderer.renderItem(var1, var3, var7);
                }
            }
            GL11.glPopMatrix();
        }
    }

    protected ResourceLocation getEntityTexture(Entity e) {
        return this.texture;
    }
}

