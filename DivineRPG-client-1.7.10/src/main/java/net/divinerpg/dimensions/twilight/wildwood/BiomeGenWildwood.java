/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.world.biome.BiomeGenBase
 *  net.minecraft.world.gen.feature.WorldGenAbstractTree
 */
package net.divinerpg.dimensions.twilight.wildwood;

import java.util.Random;
import net.divinerpg.utils.blocks.TwilightBlocks;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;

public class BiomeGenWildwood
extends BiomeGenBase {
    public BiomeGenWildwood(int par1) {
        super(par1);
        this.setBiomeName("Wildwood");
        this.topBlock = TwilightBlocks.wildwoodGrass;
        this.fillerBlock = TwilightBlocks.wildwoodDirt;
        this.spawnableCreatureList.clear();
        this.spawnableMonsterList.clear();
        this.spawnableCaveCreatureList.clear();
        this.spawnableWaterCreatureList.clear();
        this.theBiomeDecorator.treesPerChunk = 6;
        this.waterColorMultiplier = 11519;
    }

    public WorldGenAbstractTree func_150567_a(Random rand) {
        return this.worldGeneratorSwamp;
    }
}

