package mireille.client.renderer.item;

import net.minecraftforge.client.*;
import cpw.mods.fml.relauncher.*;
import mireille.client.model.skins.*;
import net.minecraft.util.*;
import net.minecraft.item.*;
import org.lwjgl.opengl.*;
import net.minecraft.client.*;

@SideOnly(Side.CLIENT)
public class RenderShikamaDodji implements IItemRenderer
{
    private static ModelShikamaDodji model;
    private static ResourceLocation texture;
    
    public RenderShikamaDodji(final ModelShikamaDodji model, final ResourceLocation texture) {
        RenderShikamaDodji.model = model;
        RenderShikamaDodji.texture = texture;
    }
    
    public boolean handleRenderType(final ItemStack item, final IItemRenderer.ItemRenderType type) {
        return true;
    }
    
    public boolean shouldUseRenderHelper(final IItemRenderer.ItemRenderType type, final ItemStack item, final IItemRenderer.ItemRendererHelper helper) {
        return type == IItemRenderer.ItemRenderType.INVENTORY || (type == IItemRenderer.ItemRenderType.ENTITY && helper == IItemRenderer.ItemRendererHelper.ENTITY_ROTATION);
    }
    
    public void renderItem(final IItemRenderer.ItemRenderType type, final ItemStack item, final Object... data) {
        renderSkin(type, item, data);
    }
    
    public static void renderSkin(final IItemRenderer.ItemRenderType type, final ItemStack item, final Object... data) {
        if (type == IItemRenderer.ItemRenderType.INVENTORY) {
            GL11.glPushMatrix();
            Minecraft.getMinecraft().renderEngine.bindTexture(RenderShikamaDodji.texture);
            GL11.glRotatef(-135.0f, 1.0f, 0.0f, 0.0f);
            GL11.glRotatef(45.0f, 0.0f, 1.0f, 0.0f);
            GL11.glRotatef(-45.0f, 0.0f, 0.0f, 1.0f);
            GL11.glScalef(0.65f, 0.65f, 0.65f);
            GL11.glTranslatef(-0.5f, 0.5f, -0.3f);
            RenderShikamaDodji.model.render(0.0625f);
            GL11.glPopMatrix();
        }
        else if (type == IItemRenderer.ItemRenderType.ENTITY) {
            GL11.glPushMatrix();
            Minecraft.getMinecraft().renderEngine.bindTexture(RenderShikamaDodji.texture);
            GL11.glRotatef(-90.0f, 1.0f, 0.0f, 0.0f);
            GL11.glRotatef(90.0f, 0.0f, 1.0f, 0.0f);
            GL11.glRotatef(-90.0f, 0.0f, 0.0f, 1.0f);
            GL11.glTranslatef(0.0f, -1.0f, 0.0f);
            RenderShikamaDodji.model.render(0.0625f);
            GL11.glPopMatrix();
        }
        else if (type == IItemRenderer.ItemRenderType.EQUIPPED_FIRST_PERSON) {
            GL11.glPushMatrix();
            Minecraft.getMinecraft().renderEngine.bindTexture(RenderShikamaDodji.texture);
            GL11.glRotatef(-80.0f, 1.0f, 0.0f, 0.0f);
            GL11.glRotatef(35.0f, 0.0f, 1.0f, 0.0f);
            GL11.glRotatef(-105.0f, 0.0f, 0.0f, 1.0f);
            GL11.glTranslatef(0.0f, 0.35f, 0.6f);
            RenderShikamaDodji.model.render(0.0625f);
            GL11.glPopMatrix();
        }
        else {
            GL11.glPushMatrix();
            Minecraft.getMinecraft().renderEngine.bindTexture(RenderShikamaDodji.texture);
            GL11.glRotatef(-80.0f, 1.0f, 0.0f, 0.0f);
            GL11.glRotatef(15.0f, 0.0f, 1.0f, 0.0f);
            GL11.glRotatef(-105.0f, 0.0f, 0.0f, 1.0f);
            GL11.glTranslatef(-0.2f, 0.15f, 0.4f);
            RenderShikamaDodji.model.render(0.0625f);
            GL11.glPopMatrix();
        }
    }
}
