/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.world.WorldProvider
 *  net.minecraft.world.biome.WorldChunkManagerHell
 *  net.minecraft.world.chunk.IChunkProvider
 */
package net.divinerpg.dimensions.arcana;

import net.divinerpg.dimensions.arcana.ChunkProviderArcana;
import net.divinerpg.utils.DimensionHelper;
import net.divinerpg.utils.config.ConfigurationHelper;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.WorldChunkManagerHell;
import net.minecraft.world.chunk.IChunkProvider;

public class WorldProviderArcana
extends WorldProvider {
    public void registerWorldChunkManager() {
        this.worldChunkMgr = new WorldChunkManagerHell(DimensionHelper.arcanaBiome, 0.5f);
        this.dimensionId = ConfigurationHelper.arcana;
    }

    protected void generateLightBrightnessTable() {
        float var1 = 0.1f;
        for (int var2 = 0; var2 <= 15; ++var2) {
            float var3 = 1.0f - (float)var2 / 15.0f;
            this.lightBrightnessTable[var2] = (1.0f - var3) / (var3 * 3.0f + 1.0f) * (1.0f - var1) + var1;
        }
    }

    public float getCloudHeight() {
        return 128.0f;
    }

    public IChunkProvider createChunkGenerator() {
        return new ChunkProviderArcana(this.worldObj, this.worldObj.getSeed());
    }

    public boolean isSurfaceWorld() {
        return false;
    }

    public float calculateCelestialAngle(long var1, float var3) {
        return 0.0f;
    }

    public boolean canRespawnHere() {
        return false;
    }

    public String getSaveFolder() {
        return "Arcana";
    }

    public String getDimensionName() {
        return "Arcana";
    }
}

