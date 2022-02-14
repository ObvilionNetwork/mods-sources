/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cpw.mods.fml.relauncher.Side
 *  cpw.mods.fml.relauncher.SideOnly
 *  net.minecraft.client.model.ModelBase
 *  net.minecraft.client.renderer.entity.RenderLiving
 *  net.minecraft.entity.Entity
 *  net.minecraft.util.ResourceLocation
 */
package net.divinerpg.entities.lelyetia;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.divinerpg.entities.lelyetia.modelLelyetianWarrior;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

@SideOnly(value=Side.CLIENT)
public class RenderLelyetianWarrior
extends RenderLiving {
    private static final ResourceLocation EntityTexture = new ResourceLocation("divinerpg:textures/mobs/lelyetianWarrior.png");
    protected modelLelyetianWarrior model;

    public RenderLelyetianWarrior(ModelBase par1ModelBase, float par2) {
        super(par1ModelBase, par2);
        this.model = (modelLelyetianWarrior)this.mainModel;
    }

    protected ResourceLocation getEntityTexture(Entity entity) {
        return EntityTexture;
    }
}

