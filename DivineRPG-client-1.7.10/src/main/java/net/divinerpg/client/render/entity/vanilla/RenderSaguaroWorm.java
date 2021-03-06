/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.model.ModelBase
 *  net.minecraft.entity.Entity
 *  net.minecraft.util.ResourceLocation
 */
package net.divinerpg.client.render.entity.vanilla;

import net.divinerpg.client.render.EntityResourceLocation;
import net.divinerpg.client.render.RenderDivineMob;
import net.divinerpg.client.render.entity.vanilla.model.ModelSaguaroWorm;
import net.divinerpg.client.render.entity.vanilla.model.ModelSaguaroWormDormant;
import net.divinerpg.entities.vanilla.EntitySaguaroWorm;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderSaguaroWorm
extends RenderDivineMob {
    private ModelBase normal = new ModelSaguaroWorm();
    private ModelBase dormant = new ModelSaguaroWormDormant();

    public RenderSaguaroWorm() {
        super(new ModelSaguaroWorm(), EntityResourceLocation.saguaroWorm);
    }

    @Override
    protected ResourceLocation getEntityTexture(Entity entity) {
        EntitySaguaroWorm worm = (EntitySaguaroWorm)entity;
        this.mainModel = worm.getDataWatcher().getWatchableObjectInt(17) == 0 ? this.dormant : this.normal;
        return super.getEntityTexture(entity);
    }
}

