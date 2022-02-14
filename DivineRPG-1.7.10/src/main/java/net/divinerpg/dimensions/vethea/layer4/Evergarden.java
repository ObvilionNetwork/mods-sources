/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.init.Blocks
 *  net.minecraft.world.World
 *  net.minecraft.world.gen.feature.WorldGenerator
 */
package net.divinerpg.dimensions.vethea.layer4;

import java.util.Random;
import net.divinerpg.utils.blocks.VetheaBlocks;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class Evergarden
extends WorldGenerator {
    public boolean generate(World world, Random rand, int i, int j, int k) {
        for (int x = 0; x <= 30; ++x) {
            for (int z = 0; z <= 36; ++z) {
                world.setBlock(i + x, j - 1, k + z, VetheaBlocks.dreamGrass);
                for (int y = 0; y <= 6; ++y) {
                    world.setBlock(i + x, j + y, k + z, Blocks.air);
                }
            }
        }
        world.setBlock(i + 0, j + 0, k + 2, VetheaBlocks.lunaBricks);
        world.setBlock(i + 0, j + 0, k + 3, VetheaBlocks.lunaBricks);
        world.setBlock(i + 0, j + 0, k + 4, VetheaBlocks.lunaBricks);
        world.setBlock(i + 0, j + 0, k + 5, VetheaBlocks.lunaBricks);
        world.setBlock(i + 0, j + 0, k + 6, VetheaBlocks.lunaBricks);
        world.setBlock(i + 0, j + 0, k + 7, VetheaBlocks.lunaBricks);
        world.setBlock(i + 0, j + 0, k + 8, VetheaBlocks.lunaBricks);
        world.setBlock(i + 0, j + 0, k + 9, VetheaBlocks.lunaBricks);
        world.setBlock(i + 0, j + 0, k + 10, VetheaBlocks.lunaBricks);
        world.setBlock(i + 0, j + 0, k + 11, VetheaBlocks.lunaBricks);
        world.setBlock(i + 0, j + 0, k + 12, VetheaBlocks.lunaBricks);
        world.setBlock(i + 0, j + 0, k + 13, VetheaBlocks.lunaBricks);
        world.setBlock(i + 0, j + 0, k + 14, VetheaBlocks.lunaBricks);
        world.setBlock(i + 0, j + 0, k + 15, VetheaBlocks.lunaBricks);
        world.setBlock(i + 0, j + 0, k + 16, VetheaBlocks.lunaBricks);
        world.setBlock(i + 0, j + 0, k + 17, VetheaBlocks.lunaBricks);
        world.setBlock(i + 0, j + 0, k + 18, VetheaBlocks.lunaBricks);
        world.setBlock(i + 0, j + 0, k + 19, VetheaBlocks.lunaBricks);
        world.setBlock(i + 0, j + 0, k + 20, VetheaBlocks.lunaBricks);
        world.setBlock(i + 0, j + 0, k + 21, VetheaBlocks.lunaBricks);
        world.setBlock(i + 0, j + 0, k + 22, VetheaBlocks.lunaBricks);
        world.setBlock(i + 0, j + 0, k + 23, VetheaBlocks.lunaBricks);
        world.setBlock(i + 0, j + 0, k + 24, VetheaBlocks.lunaBricks);
        world.setBlock(i + 0, j + 0, k + 25, VetheaBlocks.lunaBricks);
        world.setBlock(i + 0, j + 0, k + 26, VetheaBlocks.lunaBricks);
        world.setBlock(i + 0, j + 0, k + 27, VetheaBlocks.lunaBricks);
        world.setBlock(i + 0, j + 0, k + 28, VetheaBlocks.lunaBricks);
        world.setBlock(i + 0, j + 0, k + 29, VetheaBlocks.lunaBricks);
        world.setBlock(i + 0, j + 0, k + 30, VetheaBlocks.lunaBricks);
        world.setBlock(i + 0, j + 0, k + 31, VetheaBlocks.lunaBricks);
        world.setBlock(i + 0, j + 0, k + 32, VetheaBlocks.lunaBricks);
        world.setBlock(i + 0, j + 0, k + 33, VetheaBlocks.lunaBricks);
        world.setBlock(i + 0, j + 0, k + 34, VetheaBlocks.lunaBricks);
        world.setBlock(i + 0, j + 1, k + 2, VetheaBlocks.lunaBricks);
        world.setBlock(i + 0, j + 1, k + 4, VetheaBlocks.lunaBricks);
        world.setBlock(i + 0, j + 1, k + 6, VetheaBlocks.lunaBricks);
        world.setBlock(i + 0, j + 1, k + 8, VetheaBlocks.lunaBricks);
        world.setBlock(i + 0, j + 1, k + 10, VetheaBlocks.lunaBricks);
        world.setBlock(i + 0, j + 1, k + 12, VetheaBlocks.lunaBricks);
        world.setBlock(i + 0, j + 1, k + 14, VetheaBlocks.lunaBricks);
        world.setBlock(i + 0, j + 1, k + 16, VetheaBlocks.lunaBricks);
        world.setBlock(i + 0, j + 1, k + 18, VetheaBlocks.lunaBricks);
        world.setBlock(i + 0, j + 1, k + 20, VetheaBlocks.lunaBricks);
        world.setBlock(i + 0, j + 1, k + 22, VetheaBlocks.lunaBricks);
        world.setBlock(i + 0, j + 1, k + 24, VetheaBlocks.lunaBricks);
        world.setBlock(i + 0, j + 1, k + 26, VetheaBlocks.lunaBricks);
        world.setBlock(i + 0, j + 1, k + 28, VetheaBlocks.lunaBricks);
        world.setBlock(i + 0, j + 1, k + 30, VetheaBlocks.lunaBricks);
        world.setBlock(i + 0, j + 1, k + 32, VetheaBlocks.lunaBricks);
        world.setBlock(i + 0, j + 1, k + 34, VetheaBlocks.lunaBricks);
        world.setBlock(i + 0, j + 2, k + 2, VetheaBlocks.lunaBricks);
        world.setBlock(i + 0, j + 2, k + 3, VetheaBlocks.lunaBricks);
        world.setBlock(i + 0, j + 2, k + 4, VetheaBlocks.lunaBricks);
        world.setBlock(i + 0, j + 2, k + 5, VetheaBlocks.lunaBricks);
        world.setBlock(i + 0, j + 2, k + 6, VetheaBlocks.lunaBricks);
        world.setBlock(i + 0, j + 2, k + 7, VetheaBlocks.lunaBricks);
        world.setBlock(i + 0, j + 2, k + 8, VetheaBlocks.lunaBricks);
        world.setBlock(i + 0, j + 2, k + 9, VetheaBlocks.lunaBricks);
        world.setBlock(i + 0, j + 2, k + 10, VetheaBlocks.lunaBricks);
        world.setBlock(i + 0, j + 2, k + 11, VetheaBlocks.lunaBricks);
        world.setBlock(i + 0, j + 2, k + 12, VetheaBlocks.lunaBricks);
        world.setBlock(i + 0, j + 2, k + 13, VetheaBlocks.lunaBricks);
        world.setBlock(i + 0, j + 2, k + 14, VetheaBlocks.lunaBricks);
        world.setBlock(i + 0, j + 2, k + 15, VetheaBlocks.lunaBricks);
        world.setBlock(i + 0, j + 2, k + 16, VetheaBlocks.lunaBricks);
        world.setBlock(i + 0, j + 2, k + 17, VetheaBlocks.lunaBricks);
        world.setBlock(i + 0, j + 2, k + 18, VetheaBlocks.lunaBricks);
        world.setBlock(i + 0, j + 2, k + 19, VetheaBlocks.lunaBricks);
        world.setBlock(i + 0, j + 2, k + 20, VetheaBlocks.lunaBricks);
        world.setBlock(i + 0, j + 2, k + 21, VetheaBlocks.lunaBricks);
        world.setBlock(i + 0, j + 2, k + 22, VetheaBlocks.lunaBricks);
        world.setBlock(i + 0, j + 2, k + 23, VetheaBlocks.lunaBricks);
        world.setBlock(i + 0, j + 2, k + 24, VetheaBlocks.lunaBricks);
        world.setBlock(i + 0, j + 2, k + 25, VetheaBlocks.lunaBricks);
        world.setBlock(i + 0, j + 2, k + 26, VetheaBlocks.lunaBricks);
        world.setBlock(i + 0, j + 2, k + 27, VetheaBlocks.lunaBricks);
        world.setBlock(i + 0, j + 2, k + 28, VetheaBlocks.lunaBricks);
        world.setBlock(i + 0, j + 2, k + 29, VetheaBlocks.lunaBricks);
        world.setBlock(i + 0, j + 2, k + 30, VetheaBlocks.lunaBricks);
        world.setBlock(i + 0, j + 2, k + 31, VetheaBlocks.lunaBricks);
        world.setBlock(i + 0, j + 2, k + 32, VetheaBlocks.lunaBricks);
        world.setBlock(i + 0, j + 2, k + 33, VetheaBlocks.lunaBricks);
        world.setBlock(i + 0, j + 2, k + 34, VetheaBlocks.lunaBricks);
        world.setBlock(i + 1, j + 0, k + 2, VetheaBlocks.lunaBricks);
        world.setBlock(i + 1, j + 0, k + 34, VetheaBlocks.lunaBricks);
        world.setBlock(i + 1, j + 2, k + 2, VetheaBlocks.lunaBricks);
        world.setBlock(i + 1, j + 2, k + 34, VetheaBlocks.lunaBricks);
        world.setBlock(i + 2, j + 0, k + 2, VetheaBlocks.lunaBricks);
        world.setBlock(i + 2, j + 0, k + 34, VetheaBlocks.lunaBricks);
        world.setBlock(i + 2, j + 1, k + 2, VetheaBlocks.lunaBricks);
        world.setBlock(i + 2, j + 1, k + 34, VetheaBlocks.lunaBricks);
        world.setBlock(i + 2, j + 2, k + 2, VetheaBlocks.lunaBricks);
        world.setBlock(i + 2, j + 2, k + 34, VetheaBlocks.lunaBricks);
        world.setBlock(i + 3, j + 0, k + 2, VetheaBlocks.lunaBricks);
        world.setBlock(i + 3, j + 0, k + 34, VetheaBlocks.lunaBricks);
        world.setBlock(i + 3, j + 2, k + 2, VetheaBlocks.lunaBricks);
        world.setBlock(i + 3, j + 2, k + 34, VetheaBlocks.lunaBricks);
        world.setBlock(i + 4, j + 0, k + 2, VetheaBlocks.lunaBricks);
        world.setBlock(i + 4, j + 0, k + 8, VetheaBlocks.lunaBricks);
        world.setBlock(i + 4, j + 0, k + 9, VetheaBlocks.lunaBricks);
        world.setBlock(i + 4, j + 0, k + 10, VetheaBlocks.lunaBricks);
        world.setBlock(i + 4, j + 0, k + 34, VetheaBlocks.lunaBricks);
        world.setBlock(i + 4, j + 1, k + 2, VetheaBlocks.lunaBricks);
        world.setBlock(i + 4, j + 1, k + 8, VetheaBlocks.lunaBricks);
        world.setBlock(i + 4, j + 1, k + 9, VetheaBlocks.lunaBricks);
        world.setBlock(i + 4, j + 1, k + 10, VetheaBlocks.lunaBricks);
        world.setBlock(i + 4, j + 1, k + 34, VetheaBlocks.lunaBricks);
        world.setBlock(i + 4, j + 2, k + 2, VetheaBlocks.lunaBricks);
        world.setBlock(i + 4, j + 2, k + 8, VetheaBlocks.lunaBricks);
        world.setBlock(i + 4, j + 2, k + 9, VetheaBlocks.lunaBricks);
        world.setBlock(i + 4, j + 2, k + 10, VetheaBlocks.lunaBricks);
        world.setBlock(i + 4, j + 2, k + 34, VetheaBlocks.lunaBricks);
        world.setBlock(i + 4, j + 3, k + 8, VetheaBlocks.lunaBricks);
        world.setBlock(i + 4, j + 3, k + 9, VetheaBlocks.lunaBricks);
        world.setBlock(i + 4, j + 4, k + 8, VetheaBlocks.lunaBricks);
        world.setBlock(i + 4, j + 4, k + 9, VetheaBlocks.lunaBricks);
        world.setBlock(i + 4, j + 5, k + 8, VetheaBlocks.lunaBricks);
        world.setBlock(i + 4, j + 5, k + 9, VetheaBlocks.lunaBricks);
        world.setBlock(i + 4, j + 5, k + 10, VetheaBlocks.lunaBricks);
        world.setBlock(i + 4, j + 5, k + 11, VetheaBlocks.lunaBricks);
        world.setBlock(i + 4, j + 5, k + 12, VetheaBlocks.firelight);
        world.setBlock(i + 4, j + 7, k + 26, VetheaBlocks.firelight);
        world.setBlock(i + 5, j + 0, k + 2, VetheaBlocks.lunaBricks);
        world.setBlock(i + 5, j + 0, k + 8, VetheaBlocks.lunaBricks);
        world.setBlock(i + 5, j + 0, k + 34, VetheaBlocks.lunaBricks);
        world.setBlock(i + 5, j + 1, k + 8, VetheaBlocks.lunaBricks);
        world.setBlock(i + 5, j + 2, k + 2, VetheaBlocks.lunaBricks);
        world.setBlock(i + 5, j + 2, k + 8, VetheaBlocks.lunaBricks);
        world.setBlock(i + 5, j + 2, k + 34, VetheaBlocks.lunaBricks);
        world.setBlock(i + 5, j + 3, k + 8, VetheaBlocks.lunaBricks);
        world.setBlock(i + 5, j + 4, k + 8, VetheaBlocks.lunaBricks);
        world.setBlock(i + 5, j + 5, k + 8, VetheaBlocks.lunaBricks);
        world.setBlock(i + 5, j + 7, k + 26, VetheaBlocks.lunaBricks);
        world.setBlock(i + 6, j + 0, k + 2, VetheaBlocks.lunaBricks);
        world.setBlock(i + 6, j + 0, k + 8, VetheaBlocks.lunaBricks);
        world.setBlock(i + 6, j + 0, k + 26, VetheaBlocks.lunaBricks);
        world.setBlock(i + 6, j + 0, k + 34, VetheaBlocks.lunaBricks);
        world.setBlock(i + 6, j + 1, k + 2, VetheaBlocks.lunaBricks);
        world.setBlock(i + 6, j + 1, k + 8, VetheaBlocks.lunaBricks);
        world.setBlock(i + 6, j + 1, k + 34, VetheaBlocks.lunaBricks);
        world.setBlock(i + 6, j + 2, k + 2, VetheaBlocks.lunaBricks);
        world.setBlock(i + 6, j + 2, k + 8, VetheaBlocks.lunaBricks);
        world.setBlock(i + 6, j + 2, k + 34, VetheaBlocks.lunaBricks);
        world.setBlock(i + 6, j + 5, k + 8, VetheaBlocks.lunaBricks);
        world.setBlock(i + 6, j + 5, k + 26, VetheaBlocks.lunaBricks);
        world.setBlock(i + 6, j + 7, k + 26, VetheaBlocks.lunaBricks);
        world.setBlock(i + 7, j + 0, k + 2, VetheaBlocks.lunaBricks);
        world.setBlock(i + 7, j + 0, k + 25, VetheaBlocks.lunaBricks);
        world.setBlock(i + 7, j + 0, k + 26, VetheaBlocks.lunaBricks);
        world.setBlock(i + 7, j + 0, k + 27, VetheaBlocks.lunaBricks);
        world.setBlock(i + 7, j + 0, k + 34, VetheaBlocks.lunaBricks);
        world.setBlock(i + 7, j + 1, k + 26, VetheaBlocks.lunaBricks);
        world.setBlock(i + 7, j + 2, k + 2, VetheaBlocks.lunaBricks);
        world.setBlock(i + 7, j + 2, k + 26, VetheaBlocks.lunaBricks);
        world.setBlock(i + 7, j + 2, k + 34, VetheaBlocks.lunaBricks);
        world.setBlock(i + 7, j + 3, k + 26, VetheaBlocks.lunaBricks);
        world.setBlock(i + 7, j + 4, k + 26, VetheaBlocks.lunaBricks);
        world.setBlock(i + 7, j + 5, k + 8, VetheaBlocks.lunaBricks);
        world.setBlock(i + 7, j + 5, k + 25, VetheaBlocks.lunaBricks);
        world.setBlock(i + 7, j + 5, k + 26, VetheaBlocks.lunaBricks);
        world.setBlock(i + 7, j + 5, k + 27, VetheaBlocks.lunaBricks);
        world.setBlock(i + 7, j + 6, k + 26, VetheaBlocks.lunaBricks);
        world.setBlock(i + 7, j + 7, k + 23, VetheaBlocks.firelight);
        world.setBlock(i + 7, j + 7, k + 24, VetheaBlocks.lunaBricks);
        world.setBlock(i + 7, j + 7, k + 25, VetheaBlocks.lunaBricks);
        world.setBlock(i + 7, j + 7, k + 26, VetheaBlocks.lunaBricks);
        world.setBlock(i + 7, j + 7, k + 27, VetheaBlocks.lunaBricks);
        world.setBlock(i + 7, j + 7, k + 28, VetheaBlocks.lunaBricks);
        world.setBlock(i + 7, j + 7, k + 29, VetheaBlocks.firelight);
        world.setBlock(i + 8, j + 0, k + 2, VetheaBlocks.lunaBricks);
        world.setBlock(i + 8, j + 0, k + 26, VetheaBlocks.lunaBricks);
        world.setBlock(i + 8, j + 0, k + 34, VetheaBlocks.lunaBricks);
        world.setBlock(i + 8, j + 1, k + 2, VetheaBlocks.lunaBricks);
        world.setBlock(i + 8, j + 1, k + 34, VetheaBlocks.lunaBricks);
        world.setBlock(i + 8, j + 2, k + 2, VetheaBlocks.lunaBricks);
        world.setBlock(i + 8, j + 2, k + 34, VetheaBlocks.lunaBricks);
        world.setBlock(i + 8, j + 5, k + 8, VetheaBlocks.firelight);
        world.setBlock(i + 8, j + 5, k + 26, VetheaBlocks.lunaBricks);
        world.setBlock(i + 8, j + 7, k + 26, VetheaBlocks.lunaBricks);
        world.setBlock(i + 9, j + 0, k + 2, VetheaBlocks.lunaBricks);
        world.setBlock(i + 9, j + 0, k + 34, VetheaBlocks.lunaBricks);
        world.setBlock(i + 9, j + 2, k + 2, VetheaBlocks.lunaBricks);
        world.setBlock(i + 9, j + 2, k + 34, VetheaBlocks.lunaBricks);
        world.setBlock(i + 9, j + 7, k + 26, VetheaBlocks.lunaBricks);
        world.setBlock(i + 10, j + 0, k + 2, VetheaBlocks.lunaBricks);
        world.setBlock(i + 10, j + 0, k + 34, VetheaBlocks.lunaBricks);
        world.setBlock(i + 10, j + 1, k + 2, VetheaBlocks.lunaBricks);
        world.setBlock(i + 10, j + 1, k + 34, VetheaBlocks.lunaBricks);
        world.setBlock(i + 10, j + 2, k + 2, VetheaBlocks.lunaBricks);
        world.setBlock(i + 10, j + 2, k + 34, VetheaBlocks.lunaBricks);
        world.setBlock(i + 10, j + 7, k + 26, VetheaBlocks.firelight);
        world.setBlock(i + 11, j + 0, k + 0, VetheaBlocks.lunaBricks);
        world.setBlock(i + 11, j + 0, k + 1, VetheaBlocks.lunaBricks);
        world.setBlock(i + 11, j + 0, k + 2, VetheaBlocks.lunaBricks);
        world.setBlock(i + 11, j + 0, k + 34, VetheaBlocks.lunaBricks);
        world.setBlock(i + 11, j + 1, k + 1, VetheaBlocks.lunaBricks);
        world.setBlock(i + 11, j + 1, k + 2, VetheaBlocks.lunaBricks);
        world.setBlock(i + 11, j + 2, k + 2, VetheaBlocks.lunaBricks);
        world.setBlock(i + 11, j + 2, k + 34, VetheaBlocks.lunaBricks);
        world.setBlock(i + 11, j + 3, k + 2, VetheaBlocks.lunaBricks);
        world.setBlock(i + 12, j + 0, k + 34, VetheaBlocks.lunaBricks);
        world.setBlock(i + 12, j + 1, k + 34, VetheaBlocks.lunaBricks);
        world.setBlock(i + 12, j + 2, k + 34, VetheaBlocks.lunaBricks);
        world.setBlock(i + 12, j + 3, k + 2, VetheaBlocks.lunaBricks);
        world.setBlock(i + 13, j + 0, k + 34, VetheaBlocks.lunaBricks);
        world.setBlock(i + 13, j + 2, k + 34, VetheaBlocks.lunaBricks);
        world.setBlock(i + 13, j + 3, k + 2, VetheaBlocks.lunaBricks);
        world.setBlock(i + 14, j + 0, k + 0, VetheaBlocks.lunaBricks);
        world.setBlock(i + 14, j + 0, k + 1, VetheaBlocks.lunaBricks);
        world.setBlock(i + 14, j + 0, k + 2, VetheaBlocks.lunaBricks);
        world.setBlock(i + 14, j + 0, k + 10, VetheaBlocks.lunaBricks);
        world.setBlock(i + 14, j + 0, k + 19, VetheaBlocks.lunaBricks);
        world.setBlock(i + 14, j + 0, k + 34, VetheaBlocks.lunaBricks);
        world.setBlock(i + 14, j + 1, k + 1, VetheaBlocks.lunaBricks);
        world.setBlock(i + 14, j + 1, k + 2, VetheaBlocks.lunaBricks);
        world.setBlock(i + 14, j + 1, k + 10, VetheaBlocks.lunaBricks);
        world.setBlock(i + 14, j + 1, k + 19, VetheaBlocks.lunaBricks);
        world.setBlock(i + 14, j + 1, k + 34, VetheaBlocks.lunaBricks);
        world.setBlock(i + 14, j + 2, k + 2, VetheaBlocks.lunaBricks);
        world.setBlock(i + 14, j + 2, k + 10, VetheaBlocks.lunaBricks);
        world.setBlock(i + 14, j + 2, k + 19, VetheaBlocks.lunaBricks);
        world.setBlock(i + 14, j + 2, k + 34, VetheaBlocks.lunaBricks);
        world.setBlock(i + 14, j + 3, k + 2, VetheaBlocks.lunaBricks);
        world.setBlock(i + 14, j + 3, k + 10, VetheaBlocks.lunaBricks);
        world.setBlock(i + 14, j + 3, k + 11, VetheaBlocks.lunaBricks);
        world.setBlock(i + 14, j + 3, k + 18, VetheaBlocks.lunaBricks);
        world.setBlock(i + 14, j + 3, k + 19, VetheaBlocks.lunaBricks);
        world.setBlock(i + 14, j + 4, k + 11, VetheaBlocks.lunaBricks);
        world.setBlock(i + 14, j + 4, k + 12, VetheaBlocks.lunaBricks);
        world.setBlock(i + 14, j + 4, k + 17, VetheaBlocks.lunaBricks);
        world.setBlock(i + 14, j + 4, k + 18, VetheaBlocks.lunaBricks);
        world.setBlock(i + 14, j + 5, k + 12, VetheaBlocks.lunaBricks);
        world.setBlock(i + 14, j + 5, k + 13, VetheaBlocks.lunaBricks);
        world.setBlock(i + 14, j + 5, k + 14, VetheaBlocks.lunaBricks);
        world.setBlock(i + 14, j + 5, k + 15, VetheaBlocks.lunaBricks);
        world.setBlock(i + 14, j + 5, k + 16, VetheaBlocks.lunaBricks);
        world.setBlock(i + 14, j + 5, k + 17, VetheaBlocks.lunaBricks);
        world.setBlock(i + 14, j + 6, k + 14, VetheaBlocks.lunaBricks);
        world.setBlock(i + 14, j + 6, k + 15, VetheaBlocks.lunaBricks);
        world.setBlock(i + 14, j + 7, k + 14, VetheaBlocks.firelight);
        world.setBlock(i + 14, j + 7, k + 15, VetheaBlocks.firelight);
        world.setBlock(i + 15, j + 0, k + 2, VetheaBlocks.lunaBricks);
        world.setBlock(i + 15, j + 0, k + 34, VetheaBlocks.lunaBricks);
        world.setBlock(i + 15, j + 2, k + 2, VetheaBlocks.lunaBricks);
        world.setBlock(i + 15, j + 2, k + 34, VetheaBlocks.lunaBricks);
        world.setBlock(i + 16, j + 0, k + 2, VetheaBlocks.lunaBricks);
        world.setBlock(i + 16, j + 0, k + 34, VetheaBlocks.lunaBricks);
        world.setBlock(i + 16, j + 1, k + 2, VetheaBlocks.lunaBricks);
        world.setBlock(i + 16, j + 1, k + 34, VetheaBlocks.lunaBricks);
        world.setBlock(i + 16, j + 2, k + 2, VetheaBlocks.lunaBricks);
        world.setBlock(i + 16, j + 2, k + 34, VetheaBlocks.lunaBricks);
        world.setBlock(i + 17, j + 0, k + 2, VetheaBlocks.lunaBricks);
        world.setBlock(i + 17, j + 0, k + 34, VetheaBlocks.lunaBricks);
        world.setBlock(i + 17, j + 2, k + 2, VetheaBlocks.lunaBricks);
        world.setBlock(i + 17, j + 2, k + 34, VetheaBlocks.lunaBricks);
        world.setBlock(i + 18, j + 0, k + 2, VetheaBlocks.lunaBricks);
        world.setBlock(i + 18, j + 0, k + 34, VetheaBlocks.lunaBricks);
        world.setBlock(i + 18, j + 1, k + 2, VetheaBlocks.lunaBricks);
        world.setBlock(i + 18, j + 1, k + 34, VetheaBlocks.lunaBricks);
        world.setBlock(i + 18, j + 2, k + 2, VetheaBlocks.lunaBricks);
        world.setBlock(i + 18, j + 2, k + 34, VetheaBlocks.lunaBricks);
        world.setBlock(i + 19, j + 0, k + 2, VetheaBlocks.lunaBricks);
        world.setBlock(i + 19, j + 0, k + 34, VetheaBlocks.lunaBricks);
        world.setBlock(i + 19, j + 2, k + 2, VetheaBlocks.lunaBricks);
        world.setBlock(i + 19, j + 2, k + 34, VetheaBlocks.lunaBricks);
        world.setBlock(i + 20, j + 0, k + 2, VetheaBlocks.lunaBricks);
        world.setBlock(i + 20, j + 0, k + 27, VetheaBlocks.lunaBricks);
        world.setBlock(i + 20, j + 0, k + 34, VetheaBlocks.lunaBricks);
        world.setBlock(i + 20, j + 1, k + 2, VetheaBlocks.lunaBricks);
        world.setBlock(i + 20, j + 1, k + 27, VetheaBlocks.lunaBricks);
        world.setBlock(i + 20, j + 1, k + 34, VetheaBlocks.lunaBricks);
        world.setBlock(i + 20, j + 2, k + 2, VetheaBlocks.lunaBricks);
        world.setBlock(i + 20, j + 2, k + 27, VetheaBlocks.lunaBricks);
        world.setBlock(i + 20, j + 2, k + 34, VetheaBlocks.lunaBricks);
        world.setBlock(i + 20, j + 3, k + 27, VetheaBlocks.lunaBricks);
        world.setBlock(i + 20, j + 4, k + 27, VetheaBlocks.lunaBricks);
        world.setBlock(i + 20, j + 5, k + 27, VetheaBlocks.lunaBricks);
        world.setBlock(i + 21, j + 0, k + 2, VetheaBlocks.lunaBricks);
        world.setBlock(i + 21, j + 0, k + 8, VetheaBlocks.firelight);
        world.setBlock(i + 21, j + 0, k + 9, VetheaBlocks.firelight);
        world.setBlock(i + 21, j + 0, k + 10, VetheaBlocks.firelight);
        world.setBlock(i + 21, j + 0, k + 11, VetheaBlocks.firelight);
        world.setBlock(i + 21, j + 0, k + 12, VetheaBlocks.firelight);
        world.setBlock(i + 21, j + 0, k + 34, VetheaBlocks.lunaBricks);
        world.setBlock(i + 21, j + 2, k + 2, VetheaBlocks.lunaBricks);
        world.setBlock(i + 21, j + 2, k + 34, VetheaBlocks.lunaBricks);
        world.setBlock(i + 21, j + 5, k + 27, VetheaBlocks.lunaBricks);
        world.setBlock(i + 22, j + 0, k + 2, VetheaBlocks.lunaBricks);
        world.setBlock(i + 22, j + 0, k + 8, VetheaBlocks.firelight);
        world.setBlock(i + 22, j + 0, k + 9, VetheaBlocks.lunaStone);
        world.setBlock(i + 22, j + 0, k + 10, VetheaBlocks.lunaStone);
        world.setBlock(i + 22, j + 0, k + 11, VetheaBlocks.lunaStone);
        world.setBlock(i + 22, j + 0, k + 12, VetheaBlocks.firelight);
        world.setBlock(i + 22, j + 0, k + 34, VetheaBlocks.lunaBricks);
        world.setBlock(i + 22, j + 1, k + 2, VetheaBlocks.lunaBricks);
        world.setBlock(i + 22, j + 1, k + 34, VetheaBlocks.lunaBricks);
        world.setBlock(i + 22, j + 2, k + 2, VetheaBlocks.lunaBricks);
        world.setBlock(i + 22, j + 2, k + 34, VetheaBlocks.lunaBricks);
        world.setBlock(i + 22, j + 5, k + 27, VetheaBlocks.lunaBricks);
        world.setBlock(i + 22, j + 5, k + 28, VetheaBlocks.lunaBricks);
        world.setBlock(i + 22, j + 5, k + 29, VetheaBlocks.lunaBricks);
        world.setBlock(i + 22, j + 5, k + 30, VetheaBlocks.lunaBricks);
        world.setBlock(i + 22, j + 6, k + 27, VetheaBlocks.firelight);
        world.setBlock(i + 22, j + 6, k + 30, VetheaBlocks.firelight);
        world.setBlock(i + 23, j + 0, k + 2, VetheaBlocks.lunaBricks);
        world.setBlock(i + 23, j + 0, k + 8, VetheaBlocks.firelight);
        world.setBlock(i + 23, j + 0, k + 9, VetheaBlocks.lunaStone);
        world.setBlock(i + 23, j + 0, k + 10, VetheaBlocks.lunaStone);
        world.setBlock(i + 23, j + 0, k + 11, VetheaBlocks.lunaStone);
        world.setBlock(i + 23, j + 0, k + 12, VetheaBlocks.firelight);
        world.setBlock(i + 23, j + 0, k + 34, VetheaBlocks.lunaBricks);
        world.setBlock(i + 23, j + 1, k + 10, VetheaBlocks.lunicAltar);
        world.setBlock(i + 23, j + 2, k + 2, VetheaBlocks.lunaBricks);
        world.setBlock(i + 23, j + 2, k + 34, VetheaBlocks.lunaBricks);
        world.setBlock(i + 23, j + 5, k + 30, VetheaBlocks.lunaBricks);
        world.setBlock(i + 24, j + 0, k + 2, VetheaBlocks.lunaBricks);
        world.setBlock(i + 24, j + 0, k + 8, VetheaBlocks.firelight);
        world.setBlock(i + 24, j + 0, k + 9, VetheaBlocks.lunaStone);
        world.setBlock(i + 24, j + 0, k + 10, VetheaBlocks.lunaStone);
        world.setBlock(i + 24, j + 0, k + 11, VetheaBlocks.lunaStone);
        world.setBlock(i + 24, j + 0, k + 12, VetheaBlocks.firelight);
        world.setBlock(i + 24, j + 0, k + 34, VetheaBlocks.lunaBricks);
        world.setBlock(i + 24, j + 1, k + 2, VetheaBlocks.lunaBricks);
        world.setBlock(i + 24, j + 1, k + 34, VetheaBlocks.lunaBricks);
        world.setBlock(i + 24, j + 2, k + 2, VetheaBlocks.lunaBricks);
        world.setBlock(i + 24, j + 2, k + 34, VetheaBlocks.lunaBricks);
        world.setBlock(i + 24, j + 5, k + 30, VetheaBlocks.lunaBricks);
        world.setBlock(i + 25, j + 0, k + 2, VetheaBlocks.lunaBricks);
        world.setBlock(i + 25, j + 0, k + 8, VetheaBlocks.firelight);
        world.setBlock(i + 25, j + 0, k + 9, VetheaBlocks.firelight);
        world.setBlock(i + 25, j + 0, k + 10, VetheaBlocks.firelight);
        world.setBlock(i + 25, j + 0, k + 11, VetheaBlocks.firelight);
        world.setBlock(i + 25, j + 0, k + 12, VetheaBlocks.firelight);
        world.setBlock(i + 25, j + 0, k + 30, VetheaBlocks.lunaBricks);
        world.setBlock(i + 25, j + 0, k + 34, VetheaBlocks.lunaBricks);
        world.setBlock(i + 25, j + 1, k + 30, VetheaBlocks.lunaBricks);
        world.setBlock(i + 25, j + 2, k + 2, VetheaBlocks.lunaBricks);
        world.setBlock(i + 25, j + 2, k + 30, VetheaBlocks.lunaBricks);
        world.setBlock(i + 25, j + 2, k + 34, VetheaBlocks.lunaBricks);
        world.setBlock(i + 25, j + 3, k + 30, VetheaBlocks.lunaBricks);
        world.setBlock(i + 25, j + 4, k + 30, VetheaBlocks.lunaBricks);
        world.setBlock(i + 25, j + 5, k + 30, VetheaBlocks.lunaBricks);
        world.setBlock(i + 26, j + 0, k + 2, VetheaBlocks.lunaBricks);
        world.setBlock(i + 26, j + 0, k + 34, VetheaBlocks.lunaBricks);
        world.setBlock(i + 26, j + 1, k + 2, VetheaBlocks.lunaBricks);
        world.setBlock(i + 26, j + 1, k + 34, VetheaBlocks.lunaBricks);
        world.setBlock(i + 26, j + 2, k + 2, VetheaBlocks.lunaBricks);
        world.setBlock(i + 26, j + 2, k + 34, VetheaBlocks.lunaBricks);
        world.setBlock(i + 27, j + 0, k + 2, VetheaBlocks.lunaBricks);
        world.setBlock(i + 27, j + 0, k + 34, VetheaBlocks.lunaBricks);
        world.setBlock(i + 27, j + 2, k + 2, VetheaBlocks.lunaBricks);
        world.setBlock(i + 27, j + 2, k + 34, VetheaBlocks.lunaBricks);
        world.setBlock(i + 28, j + 0, k + 2, VetheaBlocks.lunaBricks);
        world.setBlock(i + 28, j + 0, k + 34, VetheaBlocks.lunaBricks);
        world.setBlock(i + 28, j + 1, k + 2, VetheaBlocks.lunaBricks);
        world.setBlock(i + 28, j + 1, k + 34, VetheaBlocks.lunaBricks);
        world.setBlock(i + 28, j + 2, k + 2, VetheaBlocks.lunaBricks);
        world.setBlock(i + 28, j + 2, k + 34, VetheaBlocks.lunaBricks);
        world.setBlock(i + 29, j + 0, k + 2, VetheaBlocks.lunaBricks);
        world.setBlock(i + 29, j + 0, k + 34, VetheaBlocks.lunaBricks);
        world.setBlock(i + 29, j + 2, k + 2, VetheaBlocks.lunaBricks);
        world.setBlock(i + 29, j + 2, k + 34, VetheaBlocks.lunaBricks);
        world.setBlock(i + 30, j + 0, k + 2, VetheaBlocks.lunaBricks);
        world.setBlock(i + 30, j + 0, k + 3, VetheaBlocks.lunaBricks);
        world.setBlock(i + 30, j + 0, k + 4, VetheaBlocks.lunaBricks);
        world.setBlock(i + 30, j + 0, k + 5, VetheaBlocks.lunaBricks);
        world.setBlock(i + 30, j + 0, k + 6, VetheaBlocks.lunaBricks);
        world.setBlock(i + 30, j + 0, k + 7, VetheaBlocks.lunaBricks);
        world.setBlock(i + 30, j + 0, k + 8, VetheaBlocks.lunaBricks);
        world.setBlock(i + 30, j + 0, k + 9, VetheaBlocks.lunaBricks);
        world.setBlock(i + 30, j + 0, k + 10, VetheaBlocks.lunaBricks);
        world.setBlock(i + 30, j + 0, k + 11, VetheaBlocks.lunaBricks);
        world.setBlock(i + 30, j + 0, k + 12, VetheaBlocks.lunaBricks);
        world.setBlock(i + 30, j + 0, k + 13, VetheaBlocks.lunaBricks);
        world.setBlock(i + 30, j + 0, k + 14, VetheaBlocks.lunaBricks);
        world.setBlock(i + 30, j + 0, k + 15, VetheaBlocks.lunaBricks);
        world.setBlock(i + 30, j + 0, k + 16, VetheaBlocks.lunaBricks);
        world.setBlock(i + 30, j + 0, k + 17, VetheaBlocks.lunaBricks);
        world.setBlock(i + 30, j + 0, k + 18, VetheaBlocks.lunaBricks);
        world.setBlock(i + 30, j + 0, k + 19, VetheaBlocks.lunaBricks);
        world.setBlock(i + 30, j + 0, k + 20, VetheaBlocks.lunaBricks);
        world.setBlock(i + 30, j + 0, k + 21, VetheaBlocks.lunaBricks);
        world.setBlock(i + 30, j + 0, k + 22, VetheaBlocks.lunaBricks);
        world.setBlock(i + 30, j + 0, k + 23, VetheaBlocks.lunaBricks);
        world.setBlock(i + 30, j + 0, k + 24, VetheaBlocks.lunaBricks);
        world.setBlock(i + 30, j + 0, k + 25, VetheaBlocks.lunaBricks);
        world.setBlock(i + 30, j + 0, k + 26, VetheaBlocks.lunaBricks);
        world.setBlock(i + 30, j + 0, k + 27, VetheaBlocks.lunaBricks);
        world.setBlock(i + 30, j + 0, k + 28, VetheaBlocks.lunaBricks);
        world.setBlock(i + 30, j + 0, k + 29, VetheaBlocks.lunaBricks);
        world.setBlock(i + 30, j + 0, k + 30, VetheaBlocks.lunaBricks);
        world.setBlock(i + 30, j + 0, k + 31, VetheaBlocks.lunaBricks);
        world.setBlock(i + 30, j + 0, k + 32, VetheaBlocks.lunaBricks);
        world.setBlock(i + 30, j + 0, k + 33, VetheaBlocks.lunaBricks);
        world.setBlock(i + 30, j + 0, k + 34, VetheaBlocks.lunaBricks);
        world.setBlock(i + 30, j + 1, k + 2, VetheaBlocks.lunaBricks);
        world.setBlock(i + 30, j + 1, k + 4, VetheaBlocks.lunaBricks);
        world.setBlock(i + 30, j + 1, k + 6, VetheaBlocks.lunaBricks);
        world.setBlock(i + 30, j + 1, k + 8, VetheaBlocks.lunaBricks);
        world.setBlock(i + 30, j + 1, k + 10, VetheaBlocks.lunaBricks);
        world.setBlock(i + 30, j + 1, k + 12, VetheaBlocks.lunaBricks);
        world.setBlock(i + 30, j + 1, k + 14, VetheaBlocks.lunaBricks);
        world.setBlock(i + 30, j + 1, k + 16, VetheaBlocks.lunaBricks);
        world.setBlock(i + 30, j + 1, k + 18, VetheaBlocks.lunaBricks);
        world.setBlock(i + 30, j + 1, k + 20, VetheaBlocks.lunaBricks);
        world.setBlock(i + 30, j + 1, k + 22, VetheaBlocks.lunaBricks);
        world.setBlock(i + 30, j + 1, k + 24, VetheaBlocks.lunaBricks);
        world.setBlock(i + 30, j + 1, k + 26, VetheaBlocks.lunaBricks);
        world.setBlock(i + 30, j + 1, k + 28, VetheaBlocks.lunaBricks);
        world.setBlock(i + 30, j + 1, k + 30, VetheaBlocks.lunaBricks);
        world.setBlock(i + 30, j + 1, k + 32, VetheaBlocks.lunaBricks);
        world.setBlock(i + 30, j + 1, k + 34, VetheaBlocks.lunaBricks);
        world.setBlock(i + 30, j + 2, k + 2, VetheaBlocks.lunaBricks);
        world.setBlock(i + 30, j + 2, k + 3, VetheaBlocks.lunaBricks);
        world.setBlock(i + 30, j + 2, k + 4, VetheaBlocks.lunaBricks);
        world.setBlock(i + 30, j + 2, k + 5, VetheaBlocks.lunaBricks);
        world.setBlock(i + 30, j + 2, k + 6, VetheaBlocks.lunaBricks);
        world.setBlock(i + 30, j + 2, k + 7, VetheaBlocks.lunaBricks);
        world.setBlock(i + 30, j + 2, k + 8, VetheaBlocks.lunaBricks);
        world.setBlock(i + 30, j + 2, k + 9, VetheaBlocks.lunaBricks);
        world.setBlock(i + 30, j + 2, k + 10, VetheaBlocks.lunaBricks);
        world.setBlock(i + 30, j + 2, k + 11, VetheaBlocks.lunaBricks);
        world.setBlock(i + 30, j + 2, k + 12, VetheaBlocks.lunaBricks);
        world.setBlock(i + 30, j + 2, k + 13, VetheaBlocks.lunaBricks);
        world.setBlock(i + 30, j + 2, k + 14, VetheaBlocks.lunaBricks);
        world.setBlock(i + 30, j + 2, k + 15, VetheaBlocks.lunaBricks);
        world.setBlock(i + 30, j + 2, k + 16, VetheaBlocks.lunaBricks);
        world.setBlock(i + 30, j + 2, k + 17, VetheaBlocks.lunaBricks);
        world.setBlock(i + 30, j + 2, k + 18, VetheaBlocks.lunaBricks);
        world.setBlock(i + 30, j + 2, k + 19, VetheaBlocks.lunaBricks);
        world.setBlock(i + 30, j + 2, k + 20, VetheaBlocks.lunaBricks);
        world.setBlock(i + 30, j + 2, k + 21, VetheaBlocks.lunaBricks);
        world.setBlock(i + 30, j + 2, k + 22, VetheaBlocks.lunaBricks);
        world.setBlock(i + 30, j + 2, k + 23, VetheaBlocks.lunaBricks);
        world.setBlock(i + 30, j + 2, k + 24, VetheaBlocks.lunaBricks);
        world.setBlock(i + 30, j + 2, k + 25, VetheaBlocks.lunaBricks);
        world.setBlock(i + 30, j + 2, k + 26, VetheaBlocks.lunaBricks);
        world.setBlock(i + 30, j + 2, k + 27, VetheaBlocks.lunaBricks);
        world.setBlock(i + 30, j + 2, k + 28, VetheaBlocks.lunaBricks);
        world.setBlock(i + 30, j + 2, k + 29, VetheaBlocks.lunaBricks);
        world.setBlock(i + 30, j + 2, k + 30, VetheaBlocks.lunaBricks);
        world.setBlock(i + 30, j + 2, k + 31, VetheaBlocks.lunaBricks);
        world.setBlock(i + 30, j + 2, k + 32, VetheaBlocks.lunaBricks);
        world.setBlock(i + 30, j + 2, k + 33, VetheaBlocks.lunaBricks);
        world.setBlock(i + 30, j + 2, k + 34, VetheaBlocks.lunaBricks);
        return true;
    }
}

