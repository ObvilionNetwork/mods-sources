/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.tileentity.TileEntity
 *  net.minecraft.util.ResourceLocation
 */
package net.divinerpg.client.render.block;

import net.divinerpg.client.model.DivineModel;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

public class TileEntityStatue
extends TileEntity {
    public ResourceLocation texture;
    public DivineModel model;

    public TileEntityStatue() {
    }

    public TileEntityStatue(ResourceLocation texture, DivineModel model) {
        this.model = model;
        this.texture = texture;
    }
}

