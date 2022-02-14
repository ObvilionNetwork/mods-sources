/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.init.Blocks
 *  net.minecraft.world.World
 *  net.minecraft.world.gen.feature.WorldGenerator
 */
package net.divinerpg.dimensions.euca.gen.trees;

import java.util.Random;
import net.divinerpg.dimensions.base.WorldGenAPI;
import net.divinerpg.utils.blocks.JourneyBlocks;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenEucaTree
extends WorldGenerator {
    public boolean generate(World world, Random rand, int x, int y, int z) {
        Block leaves = JourneyBlocks.eucaLeaves;
        Block log = JourneyBlocks.eucaLog;
        int t = world.rand.nextInt(5);
        switch (t) {
            case 0: {
                int height = 10 + rand.nextInt(10);
                for (int i = 0; i < height; ++i) {
                    this.setBlock(world, x, y + i, z, log);
                }
                this.setBlock(world, x -= 5, y += height, (z -= 5) + 5, leaves);
                this.setBlock(world, x + 1, y, z + 1, leaves);
                this.setBlock(world, x + 1, y, z + 2, leaves);
                this.setBlock(world, x + 1, y, z + 4, leaves);
                this.setBlock(world, x + 1, y, z + 5, leaves);
                this.setBlock(world, x + 1, y, z + 6, leaves);
                this.setBlock(world, x + 1, y, z + 8, leaves);
                this.setBlock(world, x + 1, y, z + 9, leaves);
                this.setBlock(world, x + 1, y + 1, z + 5, leaves);
                this.setBlock(world, x + 2, y, z + 1, leaves);
                this.setBlock(world, x + 2, y, z + 2, leaves);
                this.setBlock(world, x + 2, y, z + 3, leaves);
                this.setBlock(world, x + 2, y, z + 4, leaves);
                this.setBlock(world, x + 2, y, z + 5, leaves);
                this.setBlock(world, x + 2, y, z + 6, leaves);
                this.setBlock(world, x + 2, y, z + 7, leaves);
                this.setBlock(world, x + 2, y, z + 8, leaves);
                this.setBlock(world, x + 2, y, z + 9, leaves);
                this.setBlock(world, x + 2, y + 1, z + 4, leaves);
                this.setBlock(world, x + 2, y + 1, z + 5, leaves);
                this.setBlock(world, x + 2, y + 1, z + 6, leaves);
                this.setBlock(world, x + 3, y, z + 2, leaves);
                this.setBlock(world, x + 3, y, z + 3, leaves);
                this.setBlock(world, x + 3, y, z + 4, leaves);
                this.setBlock(world, x + 3, y, z + 5, leaves);
                this.setBlock(world, x + 3, y, z + 6, leaves);
                this.setBlock(world, x + 3, y, z + 7, leaves);
                this.setBlock(world, x + 3, y, z + 8, leaves);
                this.setBlock(world, x + 3, y + 1, z + 4, leaves);
                this.setBlock(world, x + 3, y + 1, z + 5, leaves);
                this.setBlock(world, x + 3, y + 1, z + 6, leaves);
                this.setBlock(world, x + 4, y, z + 1, leaves);
                this.setBlock(world, x + 4, y, z + 2, leaves);
                this.setBlock(world, x + 4, y, z + 3, leaves);
                this.setBlock(world, x + 4, y, z + 4, leaves);
                this.setBlock(world, x + 4, y, z + 5, leaves);
                this.setBlock(world, x + 4, y, z + 6, leaves);
                this.setBlock(world, x + 4, y, z + 7, leaves);
                this.setBlock(world, x + 4, y, z + 8, leaves);
                this.setBlock(world, x + 4, y, z + 9, leaves);
                this.setBlock(world, x + 4, y + 1, z + 2, leaves);
                this.setBlock(world, x + 4, y + 1, z + 3, leaves);
                this.setBlock(world, x + 4, y + 1, z + 4, leaves);
                this.setBlock(world, x + 4, y + 1, z + 5, leaves);
                this.setBlock(world, x + 4, y + 1, z + 6, leaves);
                this.setBlock(world, x + 4, y + 1, z + 7, leaves);
                this.setBlock(world, x + 4, y + 1, z + 8, leaves);
                this.setBlock(world, x + 4, y + 2, z + 5, leaves);
                this.setBlock(world, x + 5, y, z, leaves);
                this.setBlock(world, x + 5, y, z + 1, leaves);
                this.setBlock(world, x + 5, y, z + 2, leaves);
                this.setBlock(world, x + 5, y, z + 3, leaves);
                this.setBlock(world, x + 5, y, z + 4, leaves);
                this.setBlock(world, x + 5, y, z + 5, log);
                this.setBlock(world, x + 5, y, z + 6, leaves);
                this.setBlock(world, x + 5, y, z + 7, leaves);
                this.setBlock(world, x + 5, y, z + 8, leaves);
                this.setBlock(world, x + 5, y, z + 9, leaves);
                this.setBlock(world, x + 5, y, z + 10, leaves);
                this.setBlock(world, x + 5, y + 1, z + 1, leaves);
                this.setBlock(world, x + 5, y + 1, z + 2, leaves);
                this.setBlock(world, x + 5, y + 1, z + 3, leaves);
                this.setBlock(world, x + 5, y + 1, z + 4, leaves);
                this.setBlock(world, x + 5, y + 1, z + 5, log);
                this.setBlock(world, x + 5, y + 1, z + 6, leaves);
                this.setBlock(world, x + 5, y + 1, z + 7, leaves);
                this.setBlock(world, x + 5, y + 1, z + 8, leaves);
                this.setBlock(world, x + 5, y + 1, z + 9, leaves);
                this.setBlock(world, x + 5, y + 2, z + 4, leaves);
                this.setBlock(world, x + 5, y + 2, z + 5, leaves);
                this.setBlock(world, x + 5, y + 2, z + 6, leaves);
                this.setBlock(world, x + 6, y, z + 1, leaves);
                this.setBlock(world, x + 6, y, z + 2, leaves);
                this.setBlock(world, x + 6, y, z + 3, leaves);
                this.setBlock(world, x + 6, y, z + 4, leaves);
                this.setBlock(world, x + 6, y, z + 5, leaves);
                this.setBlock(world, x + 6, y, z + 6, leaves);
                this.setBlock(world, x + 6, y, z + 7, leaves);
                this.setBlock(world, x + 6, y, z + 8, leaves);
                this.setBlock(world, x + 6, y, z + 9, leaves);
                this.setBlock(world, x + 6, y + 1, z + 2, leaves);
                this.setBlock(world, x + 6, y + 1, z + 3, leaves);
                this.setBlock(world, x + 6, y + 1, z + 4, leaves);
                this.setBlock(world, x + 6, y + 1, z + 5, leaves);
                this.setBlock(world, x + 6, y + 1, z + 6, leaves);
                this.setBlock(world, x + 6, y + 1, z + 7, leaves);
                this.setBlock(world, x + 6, y + 1, z + 8, leaves);
                this.setBlock(world, x + 6, y + 2, z + 5, leaves);
                this.setBlock(world, x + 7, y, z + 2, leaves);
                this.setBlock(world, x + 7, y, z + 3, leaves);
                this.setBlock(world, x + 7, y, z + 4, leaves);
                this.setBlock(world, x + 7, y, z + 5, leaves);
                this.setBlock(world, x + 7, y, z + 6, leaves);
                this.setBlock(world, x + 7, y, z + 7, leaves);
                this.setBlock(world, x + 7, y, z + 8, leaves);
                this.setBlock(world, x + 7, y + 1, z + 4, leaves);
                this.setBlock(world, x + 7, y + 1, z + 5, leaves);
                this.setBlock(world, x + 7, y + 1, z + 6, leaves);
                this.setBlock(world, x + 8, y, z + 1, leaves);
                this.setBlock(world, x + 8, y, z + 2, leaves);
                this.setBlock(world, x + 8, y, z + 3, leaves);
                this.setBlock(world, x + 8, y, z + 4, leaves);
                this.setBlock(world, x + 8, y, z + 5, leaves);
                this.setBlock(world, x + 8, y, z + 6, leaves);
                this.setBlock(world, x + 8, y, z + 7, leaves);
                this.setBlock(world, x + 8, y, z + 8, leaves);
                this.setBlock(world, x + 8, y, z + 9, leaves);
                this.setBlock(world, x + 8, y + 1, z + 4, leaves);
                this.setBlock(world, x + 8, y + 1, z + 5, leaves);
                this.setBlock(world, x + 8, y + 1, z + 6, leaves);
                this.setBlock(world, x + 9, y, z + 1, leaves);
                this.setBlock(world, x + 9, y, z + 2, leaves);
                this.setBlock(world, x + 9, y, z + 4, leaves);
                this.setBlock(world, x + 9, y, z + 5, leaves);
                this.setBlock(world, x + 9, y, z + 6, leaves);
                this.setBlock(world, x + 9, y, z + 8, leaves);
                this.setBlock(world, x + 9, y, z + 9, leaves);
                this.setBlock(world, x + 9, y + 1, z + 5, leaves);
                this.setBlock(world, x + 10, y, z + 5, leaves);
                break;
            }
            case 1: {
                int height = 5 + rand.nextInt(5);
                for (int i = 0; i < height; ++i) {
                    this.setBlock(world, x, y + i, z, log);
                }
                this.setBlock(world, x -= 4, y += height, z -= 4, leaves);
                this.setBlock(world, x, y, z + 1, leaves);
                this.setBlock(world, x, y, z + 2, leaves);
                this.setBlock(world, x, y, z + 3, leaves);
                this.setBlock(world, x, y, z + 4, leaves);
                this.setBlock(world, x, y, z + 5, leaves);
                this.setBlock(world, x, y, z + 6, leaves);
                this.setBlock(world, x, y, z + 7, leaves);
                this.setBlock(world, x, y, z + 8, leaves);
                this.setBlock(world, x + 1, y, z, leaves);
                this.setBlock(world, x + 1, y, z + 1, leaves);
                this.setBlock(world, x + 1, y, z + 2, leaves);
                this.setBlock(world, x + 1, y, z + 3, leaves);
                this.setBlock(world, x + 1, y, z + 4, leaves);
                this.setBlock(world, x + 1, y, z + 5, leaves);
                this.setBlock(world, x + 1, y, z + 6, leaves);
                this.setBlock(world, x + 1, y, z + 7, leaves);
                this.setBlock(world, x + 1, y, z + 8, leaves);
                this.setBlock(world, x + 2, y, z, leaves);
                this.setBlock(world, x + 2, y, z + 1, leaves);
                this.setBlock(world, x + 2, y, z + 2, leaves);
                this.setBlock(world, x + 2, y, z + 3, leaves);
                this.setBlock(world, x + 2, y, z + 4, leaves);
                this.setBlock(world, x + 2, y, z + 5, leaves);
                this.setBlock(world, x + 2, y, z + 6, leaves);
                this.setBlock(world, x + 2, y, z + 7, leaves);
                this.setBlock(world, x + 2, y, z + 8, leaves);
                this.setBlock(world, x + 2, y + 1, z + 2, leaves);
                this.setBlock(world, x + 2, y + 1, z + 3, leaves);
                this.setBlock(world, x + 2, y + 1, z + 4, leaves);
                this.setBlock(world, x + 2, y + 1, z + 5, leaves);
                this.setBlock(world, x + 2, y + 1, z + 6, leaves);
                this.setBlock(world, x + 3, y, z, leaves);
                this.setBlock(world, x + 3, y, z + 1, leaves);
                this.setBlock(world, x + 3, y, z + 2, leaves);
                this.setBlock(world, x + 3, y, z + 3, leaves);
                this.setBlock(world, x + 3, y, z + 4, leaves);
                this.setBlock(world, x + 3, y, z + 5, leaves);
                this.setBlock(world, x + 3, y, z + 6, leaves);
                this.setBlock(world, x + 3, y, z + 7, leaves);
                this.setBlock(world, x + 3, y, z + 8, leaves);
                this.setBlock(world, x + 3, y + 1, z + 2, leaves);
                this.setBlock(world, x + 3, y + 1, z + 3, leaves);
                this.setBlock(world, x + 3, y + 1, z + 4, leaves);
                this.setBlock(world, x + 3, y + 1, z + 5, leaves);
                this.setBlock(world, x + 3, y + 1, z + 6, leaves);
                this.setBlock(world, x + 3, y + 2, z + 4, leaves);
                this.setBlock(world, x + 4, y, z, leaves);
                this.setBlock(world, x + 4, y, z + 1, leaves);
                this.setBlock(world, x + 4, y, z + 2, leaves);
                this.setBlock(world, x + 4, y, z + 3, leaves);
                this.setBlock(world, x + 4, y, z + 4, log);
                this.setBlock(world, x + 4, y, z + 5, leaves);
                this.setBlock(world, x + 4, y, z + 6, leaves);
                this.setBlock(world, x + 4, y, z + 7, leaves);
                this.setBlock(world, x + 4, y, z + 8, leaves);
                this.setBlock(world, x + 4, y + 1, z + 2, leaves);
                this.setBlock(world, x + 4, y + 1, z + 3, leaves);
                this.setBlock(world, x + 4, y + 1, z + 4, log);
                this.setBlock(world, x + 4, y + 1, z + 5, leaves);
                this.setBlock(world, x + 4, y + 1, z + 6, leaves);
                this.setBlock(world, x + 4, y + 2, z + 3, leaves);
                this.setBlock(world, x + 4, y + 2, z + 4, leaves);
                this.setBlock(world, x + 4, y + 2, z + 5, leaves);
                this.setBlock(world, x + 5, y, z, leaves);
                this.setBlock(world, x + 5, y, z + 1, leaves);
                this.setBlock(world, x + 5, y, z + 2, leaves);
                this.setBlock(world, x + 5, y, z + 3, leaves);
                this.setBlock(world, x + 5, y, z + 4, leaves);
                this.setBlock(world, x + 5, y, z + 5, leaves);
                this.setBlock(world, x + 5, y, z + 6, leaves);
                this.setBlock(world, x + 5, y, z + 7, leaves);
                this.setBlock(world, x + 5, y, z + 8, leaves);
                this.setBlock(world, x + 5, y + 1, z + 2, leaves);
                this.setBlock(world, x + 5, y + 1, z + 3, leaves);
                this.setBlock(world, x + 5, y + 1, z + 4, leaves);
                this.setBlock(world, x + 5, y + 1, z + 5, leaves);
                this.setBlock(world, x + 5, y + 1, z + 6, leaves);
                this.setBlock(world, x + 5, y + 2, z + 4, leaves);
                this.setBlock(world, x + 6, y, z, leaves);
                this.setBlock(world, x + 6, y, z + 1, leaves);
                this.setBlock(world, x + 6, y, z + 2, leaves);
                this.setBlock(world, x + 6, y, z + 3, leaves);
                this.setBlock(world, x + 6, y, z + 4, leaves);
                this.setBlock(world, x + 6, y, z + 5, leaves);
                this.setBlock(world, x + 6, y, z + 6, leaves);
                this.setBlock(world, x + 6, y, z + 7, leaves);
                this.setBlock(world, x + 6, y, z + 8, leaves);
                this.setBlock(world, x + 6, y + 1, z + 2, leaves);
                this.setBlock(world, x + 6, y + 1, z + 3, leaves);
                this.setBlock(world, x + 6, y + 1, z + 4, leaves);
                this.setBlock(world, x + 6, y + 1, z + 5, leaves);
                this.setBlock(world, x + 6, y + 1, z + 6, leaves);
                this.setBlock(world, x + 7, y, z, leaves);
                this.setBlock(world, x + 7, y, z + 1, leaves);
                this.setBlock(world, x + 7, y, z + 2, leaves);
                this.setBlock(world, x + 7, y, z + 3, leaves);
                this.setBlock(world, x + 7, y, z + 4, leaves);
                this.setBlock(world, x + 7, y, z + 5, leaves);
                this.setBlock(world, x + 7, y, z + 6, leaves);
                this.setBlock(world, x + 7, y, z + 7, leaves);
                this.setBlock(world, x + 7, y, z + 8, leaves);
                this.setBlock(world, x + 8, y, z, leaves);
                this.setBlock(world, x + 8, y, z + 1, leaves);
                this.setBlock(world, x + 8, y, z + 2, leaves);
                this.setBlock(world, x + 8, y, z + 3, leaves);
                this.setBlock(world, x + 8, y, z + 4, leaves);
                this.setBlock(world, x + 8, y, z + 5, leaves);
                this.setBlock(world, x + 8, y, z + 6, leaves);
                this.setBlock(world, x + 8, y, z + 7, leaves);
                this.setBlock(world, x + 8, y, z + 8, leaves);
                break;
            }
            case 2: {
                int height = 15 + rand.nextInt(10);
                for (int i = 0; i < height; ++i) {
                    this.setBlock(world, x, y + i, z, log);
                }
                this.setBlock(world, x -= 5, y += height, (z -= 5) + 5, leaves);
                this.setBlock(world, x + 1, y, z + 3, leaves);
                this.setBlock(world, x + 1, y, z + 4, leaves);
                this.setBlock(world, x + 1, y, z + 5, leaves);
                this.setBlock(world, x + 1, y, z + 6, leaves);
                this.setBlock(world, x + 1, y, z + 7, leaves);
                this.setBlock(world, x + 2, y, z + 3, leaves);
                this.setBlock(world, x + 2, y, z + 4, leaves);
                this.setBlock(world, x + 2, y, z + 5, leaves);
                this.setBlock(world, x + 2, y, z + 6, leaves);
                this.setBlock(world, x + 2, y, z + 7, leaves);
                this.setBlock(world, x + 3, y, z + 1, leaves);
                this.setBlock(world, x + 3, y, z + 2, leaves);
                this.setBlock(world, x + 3, y, z + 3, leaves);
                this.setBlock(world, x + 3, y, z + 4, leaves);
                this.setBlock(world, x + 3, y, z + 5, leaves);
                this.setBlock(world, x + 3, y, z + 6, leaves);
                this.setBlock(world, x + 3, y, z + 7, leaves);
                this.setBlock(world, x + 3, y, z + 8, leaves);
                this.setBlock(world, x + 3, y, z + 9, leaves);
                this.setBlock(world, x + 3, y + 1, z + 3, leaves);
                this.setBlock(world, x + 3, y + 1, z + 4, leaves);
                this.setBlock(world, x + 3, y + 1, z + 5, leaves);
                this.setBlock(world, x + 3, y + 1, z + 6, leaves);
                this.setBlock(world, x + 3, y + 1, z + 7, leaves);
                this.setBlock(world, x + 4, y, z + 1, leaves);
                this.setBlock(world, x + 4, y, z + 2, leaves);
                this.setBlock(world, x + 4, y, z + 3, leaves);
                this.setBlock(world, x + 4, y, z + 4, leaves);
                this.setBlock(world, x + 4, y, z + 5, leaves);
                this.setBlock(world, x + 4, y, z + 6, leaves);
                this.setBlock(world, x + 4, y, z + 7, leaves);
                this.setBlock(world, x + 4, y, z + 8, leaves);
                this.setBlock(world, x + 4, y, z + 9, leaves);
                this.setBlock(world, x + 4, y + 1, z + 3, leaves);
                this.setBlock(world, x + 4, y + 1, z + 4, leaves);
                this.setBlock(world, x + 4, y + 1, z + 5, leaves);
                this.setBlock(world, x + 4, y + 1, z + 6, leaves);
                this.setBlock(world, x + 4, y + 1, z + 7, leaves);
                this.setBlock(world, x + 4, y + 2, z + 4, leaves);
                this.setBlock(world, x + 4, y + 2, z + 5, leaves);
                this.setBlock(world, x + 4, y + 2, z + 6, leaves);
                this.setBlock(world, x + 5, y, z, leaves);
                this.setBlock(world, x + 5, y, z + 1, leaves);
                this.setBlock(world, x + 5, y, z + 2, leaves);
                this.setBlock(world, x + 5, y, z + 3, leaves);
                this.setBlock(world, x + 5, y, z + 4, leaves);
                this.setBlock(world, x + 5, y, z + 5, log);
                this.setBlock(world, x + 5, y, z + 6, leaves);
                this.setBlock(world, x + 5, y, z + 7, leaves);
                this.setBlock(world, x + 5, y, z + 8, leaves);
                this.setBlock(world, x + 5, y, z + 9, leaves);
                this.setBlock(world, x + 5, y, z + 10, leaves);
                this.setBlock(world, x + 5, y + 1, z + 3, leaves);
                this.setBlock(world, x + 5, y + 1, z + 4, leaves);
                this.setBlock(world, x + 5, y + 1, z + 5, log);
                this.setBlock(world, x + 5, y + 1, z + 6, leaves);
                this.setBlock(world, x + 5, y + 1, z + 7, leaves);
                this.setBlock(world, x + 5, y + 2, z + 4, leaves);
                this.setBlock(world, x + 5, y + 2, z + 5, leaves);
                this.setBlock(world, x + 5, y + 2, z + 6, leaves);
                this.setBlock(world, x + 6, y, z + 1, leaves);
                this.setBlock(world, x + 6, y, z + 2, leaves);
                this.setBlock(world, x + 6, y, z + 3, leaves);
                this.setBlock(world, x + 6, y, z + 4, leaves);
                this.setBlock(world, x + 6, y, z + 5, leaves);
                this.setBlock(world, x + 6, y, z + 6, leaves);
                this.setBlock(world, x + 6, y, z + 7, leaves);
                this.setBlock(world, x + 6, y, z + 8, leaves);
                this.setBlock(world, x + 6, y, z + 9, leaves);
                this.setBlock(world, x + 6, y + 1, z + 3, leaves);
                this.setBlock(world, x + 6, y + 1, z + 4, leaves);
                this.setBlock(world, x + 6, y + 1, z + 5, leaves);
                this.setBlock(world, x + 6, y + 1, z + 6, leaves);
                this.setBlock(world, x + 6, y + 1, z + 7, leaves);
                this.setBlock(world, x + 6, y + 2, z + 4, leaves);
                this.setBlock(world, x + 6, y + 2, z + 5, leaves);
                this.setBlock(world, x + 6, y + 2, z + 6, leaves);
                this.setBlock(world, x + 7, y, z + 1, leaves);
                this.setBlock(world, x + 7, y, z + 2, leaves);
                this.setBlock(world, x + 7, y, z + 3, leaves);
                this.setBlock(world, x + 7, y, z + 4, leaves);
                this.setBlock(world, x + 7, y, z + 5, leaves);
                this.setBlock(world, x + 7, y, z + 6, leaves);
                this.setBlock(world, x + 7, y, z + 7, leaves);
                this.setBlock(world, x + 7, y, z + 8, leaves);
                this.setBlock(world, x + 7, y, z + 9, leaves);
                this.setBlock(world, x + 7, y + 1, z + 3, leaves);
                this.setBlock(world, x + 7, y + 1, z + 4, leaves);
                this.setBlock(world, x + 7, y + 1, z + 5, leaves);
                this.setBlock(world, x + 7, y + 1, z + 6, leaves);
                this.setBlock(world, x + 7, y + 1, z + 7, leaves);
                this.setBlock(world, x + 8, y, z + 3, leaves);
                this.setBlock(world, x + 8, y, z + 4, leaves);
                this.setBlock(world, x + 8, y, z + 5, leaves);
                this.setBlock(world, x + 8, y, z + 6, leaves);
                this.setBlock(world, x + 8, y, z + 7, leaves);
                this.setBlock(world, x + 9, y, z + 3, leaves);
                this.setBlock(world, x + 9, y, z + 4, leaves);
                this.setBlock(world, x + 9, y, z + 5, leaves);
                this.setBlock(world, x + 9, y, z + 6, leaves);
                this.setBlock(world, x + 9, y, z + 7, leaves);
                this.setBlock(world, x + 10, y, z + 5, leaves);
                break;
            }
            case 3: {
                log = JourneyBlocks.eucaGoldLog;
                leaves = JourneyBlocks.eucaGoldLeaves;
                int height = rand.nextInt(4);
                WorldGenAPI.addRectangleAdequately(1, 1, 9 + height, world, (x -= 3) + 3, --y + 1, (z -= 3) + 3, log);
                this.setBlock(world, x, (y += height + 2) + 1, z + 2, leaves);
                this.setBlock(world, x, y + 1, z + 3, leaves);
                this.setBlock(world, x, y + 1, z + 4, leaves);
                this.setBlock(world, x + 1, y + 1, z + 1, leaves);
                this.setBlock(world, x + 1, y + 1, z + 2, leaves);
                this.setBlock(world, x + 1, y + 1, z + 3, leaves);
                this.setBlock(world, x + 1, y + 1, z + 4, leaves);
                this.setBlock(world, x + 1, y + 1, z + 5, leaves);
                this.setBlock(world, x + 1, y + 3, z + 2, leaves);
                this.setBlock(world, x + 1, y + 3, z + 3, leaves);
                this.setBlock(world, x + 1, y + 3, z + 4, leaves);
                this.setBlock(world, x + 2, y + 1, z, leaves);
                this.setBlock(world, x + 2, y + 1, z + 1, leaves);
                this.setBlock(world, x + 2, y + 1, z + 2, leaves);
                this.setBlock(world, x + 2, y + 1, z + 3, leaves);
                this.setBlock(world, x + 2, y + 1, z + 4, leaves);
                this.setBlock(world, x + 2, y + 1, z + 5, leaves);
                this.setBlock(world, x + 2, y + 1, z + 6, leaves);
                this.setBlock(world, x + 2, y + 2, z + 3, leaves);
                this.setBlock(world, x + 2, y + 3, z + 1, leaves);
                this.setBlock(world, x + 2, y + 3, z + 2, leaves);
                this.setBlock(world, x + 2, y + 3, z + 3, leaves);
                this.setBlock(world, x + 2, y + 3, z + 4, leaves);
                this.setBlock(world, x + 2, y + 3, z + 5, leaves);
                this.setBlock(world, x + 2, y + 4, z + 3, leaves);
                this.setBlock(world, x + 2, y + 5, z + 2, leaves);
                this.setBlock(world, x + 2, y + 5, z + 3, leaves);
                this.setBlock(world, x + 2, y + 5, z + 4, leaves);
                this.setBlock(world, x + 2, y + 7, z + 3, leaves);
                this.setBlock(world, x + 3, y + 1, z, leaves);
                this.setBlock(world, x + 3, y + 1, z + 1, leaves);
                this.setBlock(world, x + 3, y + 1, z + 2, leaves);
                this.setBlock(world, x + 3, y + 1, z + 4, leaves);
                this.setBlock(world, x + 3, y + 1, z + 5, leaves);
                this.setBlock(world, x + 3, y + 1, z + 6, leaves);
                this.setBlock(world, x + 3, y + 2, z + 2, leaves);
                this.setBlock(world, x + 3, y + 2, z + 4, leaves);
                this.setBlock(world, x + 3, y + 3, z + 1, leaves);
                this.setBlock(world, x + 3, y + 3, z + 2, leaves);
                this.setBlock(world, x + 3, y + 3, z + 4, leaves);
                this.setBlock(world, x + 3, y + 3, z + 5, leaves);
                this.setBlock(world, x + 3, y + 4, z + 2, leaves);
                this.setBlock(world, x + 3, y + 4, z + 4, leaves);
                this.setBlock(world, x + 3, y + 5, z + 2, leaves);
                this.setBlock(world, x + 3, y + 5, z + 4, leaves);
                this.setBlock(world, x + 3, y + 7, z + 2, leaves);
                this.setBlock(world, x + 3, y + 7, z + 4, leaves);
                this.setBlock(world, x + 3, y + 8, z + 3, leaves);
                this.setBlock(world, x + 4, y + 1, z, leaves);
                this.setBlock(world, x + 4, y + 1, z + 1, leaves);
                this.setBlock(world, x + 4, y + 1, z + 2, leaves);
                this.setBlock(world, x + 4, y + 1, z + 3, leaves);
                this.setBlock(world, x + 4, y + 1, z + 4, leaves);
                this.setBlock(world, x + 4, y + 1, z + 5, leaves);
                this.setBlock(world, x + 4, y + 1, z + 6, leaves);
                this.setBlock(world, x + 4, y + 2, z + 3, leaves);
                this.setBlock(world, x + 4, y + 3, z + 1, leaves);
                this.setBlock(world, x + 4, y + 3, z + 2, leaves);
                this.setBlock(world, x + 4, y + 3, z + 3, leaves);
                this.setBlock(world, x + 4, y + 3, z + 4, leaves);
                this.setBlock(world, x + 4, y + 3, z + 5, leaves);
                this.setBlock(world, x + 4, y + 4, z + 3, leaves);
                this.setBlock(world, x + 4, y + 5, z + 2, leaves);
                this.setBlock(world, x + 4, y + 5, z + 3, leaves);
                this.setBlock(world, x + 4, y + 5, z + 4, leaves);
                this.setBlock(world, x + 4, y + 7, z + 3, leaves);
                this.setBlock(world, x + 5, y + 1, z + 1, leaves);
                this.setBlock(world, x + 5, y + 1, z + 2, leaves);
                this.setBlock(world, x + 5, y + 1, z + 3, leaves);
                this.setBlock(world, x + 5, y + 1, z + 4, leaves);
                this.setBlock(world, x + 5, y + 1, z + 5, leaves);
                this.setBlock(world, x + 5, y + 3, z + 2, leaves);
                this.setBlock(world, x + 5, y + 3, z + 3, leaves);
                this.setBlock(world, x + 5, y + 3, z + 4, leaves);
                this.setBlock(world, x + 6, y + 1, z + 2, leaves);
                this.setBlock(world, x + 6, y + 1, z + 3, leaves);
                this.setBlock(world, x + 6, y + 1, z + 4, leaves);
                break;
            }
            case 4: {
                log = JourneyBlocks.eucaGoldLog;
                leaves = JourneyBlocks.eucaSilverLeaves;
                int height = rand.nextInt(4);
                WorldGenAPI.addRectangleAdequately(1, 1, 9 + height, world, (x -= 3) + 3, --y + 1, (z -= 3) + 3, log);
                this.setBlock(world, x, (y += height + 2) + 1, z + 2, leaves);
                this.setBlock(world, x, y + 1, z + 3, leaves);
                this.setBlock(world, x, y + 1, z + 4, leaves);
                this.setBlock(world, x + 1, y + 1, z + 1, leaves);
                this.setBlock(world, x + 1, y + 1, z + 2, leaves);
                this.setBlock(world, x + 1, y + 1, z + 3, leaves);
                this.setBlock(world, x + 1, y + 1, z + 4, leaves);
                this.setBlock(world, x + 1, y + 1, z + 5, leaves);
                this.setBlock(world, x + 1, y + 3, z + 2, leaves);
                this.setBlock(world, x + 1, y + 3, z + 3, leaves);
                this.setBlock(world, x + 1, y + 3, z + 4, leaves);
                this.setBlock(world, x + 2, y + 1, z, leaves);
                this.setBlock(world, x + 2, y + 1, z + 1, leaves);
                this.setBlock(world, x + 2, y + 1, z + 2, leaves);
                this.setBlock(world, x + 2, y + 1, z + 3, leaves);
                this.setBlock(world, x + 2, y + 1, z + 4, leaves);
                this.setBlock(world, x + 2, y + 1, z + 5, leaves);
                this.setBlock(world, x + 2, y + 1, z + 6, leaves);
                this.setBlock(world, x + 2, y + 2, z + 3, leaves);
                this.setBlock(world, x + 2, y + 3, z + 1, leaves);
                this.setBlock(world, x + 2, y + 3, z + 2, leaves);
                this.setBlock(world, x + 2, y + 3, z + 3, leaves);
                this.setBlock(world, x + 2, y + 3, z + 4, leaves);
                this.setBlock(world, x + 2, y + 3, z + 5, leaves);
                this.setBlock(world, x + 2, y + 4, z + 3, leaves);
                this.setBlock(world, x + 2, y + 5, z + 2, leaves);
                this.setBlock(world, x + 2, y + 5, z + 3, leaves);
                this.setBlock(world, x + 2, y + 5, z + 4, leaves);
                this.setBlock(world, x + 2, y + 7, z + 3, leaves);
                this.setBlock(world, x + 3, y + 1, z, leaves);
                this.setBlock(world, x + 3, y + 1, z + 1, leaves);
                this.setBlock(world, x + 3, y + 1, z + 2, leaves);
                this.setBlock(world, x + 3, y + 1, z + 4, leaves);
                this.setBlock(world, x + 3, y + 1, z + 5, leaves);
                this.setBlock(world, x + 3, y + 1, z + 6, leaves);
                this.setBlock(world, x + 3, y + 2, z + 2, leaves);
                this.setBlock(world, x + 3, y + 2, z + 4, leaves);
                this.setBlock(world, x + 3, y + 3, z + 1, leaves);
                this.setBlock(world, x + 3, y + 3, z + 2, leaves);
                this.setBlock(world, x + 3, y + 3, z + 4, leaves);
                this.setBlock(world, x + 3, y + 3, z + 5, leaves);
                this.setBlock(world, x + 3, y + 4, z + 2, leaves);
                this.setBlock(world, x + 3, y + 4, z + 4, leaves);
                this.setBlock(world, x + 3, y + 5, z + 2, leaves);
                this.setBlock(world, x + 3, y + 5, z + 4, leaves);
                this.setBlock(world, x + 3, y + 7, z + 2, leaves);
                this.setBlock(world, x + 3, y + 7, z + 4, leaves);
                this.setBlock(world, x + 3, y + 8, z + 3, leaves);
                this.setBlock(world, x + 4, y + 1, z, leaves);
                this.setBlock(world, x + 4, y + 1, z + 1, leaves);
                this.setBlock(world, x + 4, y + 1, z + 2, leaves);
                this.setBlock(world, x + 4, y + 1, z + 3, leaves);
                this.setBlock(world, x + 4, y + 1, z + 4, leaves);
                this.setBlock(world, x + 4, y + 1, z + 5, leaves);
                this.setBlock(world, x + 4, y + 1, z + 6, leaves);
                this.setBlock(world, x + 4, y + 2, z + 3, leaves);
                this.setBlock(world, x + 4, y + 3, z + 1, leaves);
                this.setBlock(world, x + 4, y + 3, z + 2, leaves);
                this.setBlock(world, x + 4, y + 3, z + 3, leaves);
                this.setBlock(world, x + 4, y + 3, z + 4, leaves);
                this.setBlock(world, x + 4, y + 3, z + 5, leaves);
                this.setBlock(world, x + 4, y + 4, z + 3, leaves);
                this.setBlock(world, x + 4, y + 5, z + 2, leaves);
                this.setBlock(world, x + 4, y + 5, z + 3, leaves);
                this.setBlock(world, x + 4, y + 5, z + 4, leaves);
                this.setBlock(world, x + 4, y + 7, z + 3, leaves);
                this.setBlock(world, x + 5, y + 1, z + 1, leaves);
                this.setBlock(world, x + 5, y + 1, z + 2, leaves);
                this.setBlock(world, x + 5, y + 1, z + 3, leaves);
                this.setBlock(world, x + 5, y + 1, z + 4, leaves);
                this.setBlock(world, x + 5, y + 1, z + 5, leaves);
                this.setBlock(world, x + 5, y + 3, z + 2, leaves);
                this.setBlock(world, x + 5, y + 3, z + 3, leaves);
                this.setBlock(world, x + 5, y + 3, z + 4, leaves);
                this.setBlock(world, x + 6, y + 1, z + 2, leaves);
                this.setBlock(world, x + 6, y + 1, z + 3, leaves);
                this.setBlock(world, x + 6, y + 1, z + 4, leaves);
                break;
            }
        }
        return true;
    }

    private void setBlock(World world, int x, int y, int z, Block block) {
        this.setBlock(world, x, y, z, block, 0);
    }

    private void setBlock(World world, int x, int y, int z, Block block, int meta) {
        if (world.getBlock(x, y, z) == Blocks.air) {
            this.setBlockAndNotifyAdequately(world, x, y, z, block, meta);
        }
    }
}

