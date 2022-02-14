/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.entity.Entity
 *  net.minecraft.init.Blocks
 *  net.minecraft.util.WeightedRandomChestContent
 *  net.minecraft.world.World
 *  net.minecraft.world.gen.feature.WorldGenerator
 */
package net.divinerpg.dimensions.euca.gen;

import java.util.Random;
import net.divinerpg.dimensions.base.WorldGenAPI;
import net.divinerpg.entities.euca.EntityAlloyMender;
import net.divinerpg.utils.blocks.JourneyBlocks;
import net.divinerpg.utils.items.VanillaItemsOther;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenSmeltery
extends WorldGenerator {
    private static WeightedRandomChestContent[] loot = new WeightedRandomChestContent[]{new WeightedRandomChestContent(VanillaItemsOther.repairEssence, 0, 0, 1, 1)};

    public boolean locationIsValidSpawn(World w, int x, int y, int z) {
        for (int i = 0; i < 11; ++i) {
            for (int l = 0; l < 11; ++l) {
                if (w.getBlock(x + i, y, z + l) == JourneyBlocks.eucaGrass) continue;
                return false;
            }
        }
        return true;
    }

    public boolean generate(World w, Random r, int x, int y, int z) {
        if (!w.isRemote) {
            if (this.locationIsValidSpawn(w, x, --y, z)) {
                return true;
            }
            w.setBlock(x, y + 5, z + 1, JourneyBlocks.eucaBricks);
            w.setBlock(x, y + 5, z + 2, JourneyBlocks.eucaBricks);
            w.setBlock(x, y + 5, z + 3, JourneyBlocks.eucaBricks);
            w.setBlock(x, y + 5, z + 4, JourneyBlocks.eucaBricks);
            w.setBlock(x, y + 5, z + 5, JourneyBlocks.eucaBricks);
            w.setBlock(x, y + 5, z + 6, JourneyBlocks.eucaBricks);
            w.setBlock(x, y + 5, z + 7, JourneyBlocks.eucaBricks);
            w.setBlock(x, y + 5, z + 8, JourneyBlocks.eucaBricks);
            w.setBlock(x, y + 5, z + 9, JourneyBlocks.eucaBricks);
            w.setBlock(x, y + 5, z + 10, JourneyBlocks.eucaBricks);
            w.setBlock(x, y + 5, z + 11, JourneyBlocks.eucaBricks);
            w.setBlock(x + 1, y, z + 2, JourneyBlocks.eucaBricks);
            w.setBlock(x + 1, y, z + 3, JourneyBlocks.eucaBricks);
            w.setBlock(x + 1, y, z + 4, JourneyBlocks.eucaBricks);
            w.setBlock(x + 1, y, z + 5, JourneyBlocks.eucaBricks);
            w.setBlock(x + 1, y, z + 6, JourneyBlocks.eucaBricks);
            w.setBlock(x + 1, y, z + 7, JourneyBlocks.eucaBricks);
            w.setBlock(x + 1, y, z + 8, JourneyBlocks.eucaBricks);
            w.setBlock(x + 1, y, z + 9, JourneyBlocks.eucaBricks);
            w.setBlock(x + 1, y, z + 10, JourneyBlocks.eucaBricks);
            w.setBlock(x + 1, y + 1, z + 2, JourneyBlocks.eucaBricks);
            w.setBlock(x + 1, y + 1, z + 3, JourneyBlocks.eucaBricks);
            w.setBlock(x + 1, y + 1, z + 4, JourneyBlocks.eucaBricks);
            w.setBlock(x + 1, y + 1, z + 5, JourneyBlocks.eucaBricks);
            w.setBlock(x + 1, y + 1, z + 6, JourneyBlocks.eucaBricks);
            w.setBlock(x + 1, y + 1, z + 7, JourneyBlocks.eucaBricks);
            w.setBlock(x + 1, y + 1, z + 8, JourneyBlocks.eucaBricks);
            w.setBlock(x + 1, y + 1, z + 9, JourneyBlocks.eucaBricks);
            w.setBlock(x + 1, y + 1, z + 10, JourneyBlocks.eucaBricks);
            w.setBlock(x + 1, y + 2, z + 2, JourneyBlocks.eucaBricks);
            w.setBlock(x + 1, y + 2, z + 3, JourneyBlocks.eucaBricks);
            w.setBlock(x + 1, y + 2, z + 4, (Block)Blocks.stained_glass_pane, 1, 2);
            w.setBlock(x + 1, y + 2, z + 5, (Block)Blocks.stained_glass_pane, 1, 2);
            w.setBlock(x + 1, y + 2, z + 6, JourneyBlocks.eucaBricks);
            w.setBlock(x + 1, y + 2, z + 7, (Block)Blocks.stained_glass_pane, 1, 2);
            w.setBlock(x + 1, y + 2, z + 8, (Block)Blocks.stained_glass_pane, 1, 2);
            w.setBlock(x + 1, y + 2, z + 9, JourneyBlocks.eucaBricks);
            w.setBlock(x + 1, y + 2, z + 10, JourneyBlocks.eucaBricks);
            w.setBlock(x + 1, y + 3, z + 2, JourneyBlocks.eucaBricks);
            w.setBlock(x + 1, y + 3, z + 3, JourneyBlocks.eucaBricks);
            w.setBlock(x + 1, y + 3, z + 4, (Block)Blocks.stained_glass_pane, 1, 2);
            w.setBlock(x + 1, y + 3, z + 5, (Block)Blocks.stained_glass_pane, 1, 2);
            w.setBlock(x + 1, y + 3, z + 6, JourneyBlocks.eucaBricks);
            w.setBlock(x + 1, y + 3, z + 7, (Block)Blocks.stained_glass_pane, 1, 2);
            w.setBlock(x + 1, y + 3, z + 8, (Block)Blocks.stained_glass_pane, 1, 2);
            w.setBlock(x + 1, y + 3, z + 9, JourneyBlocks.eucaBricks);
            w.setBlock(x + 1, y + 3, z + 10, JourneyBlocks.eucaBricks);
            w.setBlock(x + 1, y + 4, z + 2, JourneyBlocks.eucaBricks);
            w.setBlock(x + 1, y + 4, z + 3, JourneyBlocks.eucaBricks);
            w.setBlock(x + 1, y + 4, z + 4, JourneyBlocks.eucaBricks);
            w.setBlock(x + 1, y + 4, z + 5, JourneyBlocks.eucaBricks);
            w.setBlock(x + 1, y + 4, z + 6, JourneyBlocks.eucaBricks);
            w.setBlock(x + 1, y + 4, z + 7, JourneyBlocks.eucaBricks);
            w.setBlock(x + 1, y + 4, z + 8, JourneyBlocks.eucaBricks);
            w.setBlock(x + 1, y + 4, z + 9, JourneyBlocks.eucaBricks);
            w.setBlock(x + 1, y + 4, z + 10, JourneyBlocks.eucaBricks);
            w.setBlock(x + 1, y + 5, z + 2, JourneyBlocks.eucaBricks);
            w.setBlock(x + 1, y + 5, z + 3, JourneyBlocks.eucaBricks);
            w.setBlock(x + 1, y + 5, z + 4, JourneyBlocks.eucaBricks);
            w.setBlock(x + 1, y + 5, z + 5, JourneyBlocks.eucaBricks);
            w.setBlock(x + 1, y + 5, z + 6, JourneyBlocks.eucaBricks);
            w.setBlock(x + 1, y + 5, z + 7, JourneyBlocks.eucaBricks);
            w.setBlock(x + 1, y + 5, z + 8, JourneyBlocks.eucaBricks);
            w.setBlock(x + 1, y + 5, z + 9, JourneyBlocks.eucaBricks);
            w.setBlock(x + 1, y + 5, z + 10, JourneyBlocks.eucaBricks);
            w.setBlock(x + 1, y + 6, z + 1, JourneyBlocks.eucaBricks);
            w.setBlock(x + 1, y + 6, z + 2, JourneyBlocks.eucaBricks);
            w.setBlock(x + 1, y + 6, z + 3, JourneyBlocks.eucaBricks);
            w.setBlock(x + 1, y + 6, z + 4, JourneyBlocks.eucaBricks);
            w.setBlock(x + 1, y + 6, z + 5, JourneyBlocks.eucaBricks);
            w.setBlock(x + 1, y + 6, z + 6, JourneyBlocks.eucaBricks);
            w.setBlock(x + 1, y + 6, z + 7, JourneyBlocks.eucaBricks);
            w.setBlock(x + 1, y + 6, z + 8, JourneyBlocks.eucaBricks);
            w.setBlock(x + 1, y + 6, z + 9, JourneyBlocks.eucaBricks);
            w.setBlock(x + 1, y + 6, z + 10, JourneyBlocks.eucaBricks);
            w.setBlock(x + 1, y + 6, z + 11, JourneyBlocks.eucaBricks);
            w.setBlock(x + 2, y, z + 2, JourneyBlocks.eucaBricks);
            w.setBlock(x + 2, y, z + 3, JourneyBlocks.goldEucaPlank);
            w.setBlock(x + 2, y, z + 4, JourneyBlocks.goldEucaPlank);
            w.setBlock(x + 2, y, z + 5, JourneyBlocks.goldEucaPlank);
            w.setBlock(x + 2, y, z + 6, JourneyBlocks.goldEucaPlank);
            w.setBlock(x + 2, y, z + 7, JourneyBlocks.goldEucaPlank);
            w.setBlock(x + 2, y, z + 8, JourneyBlocks.goldEucaPlank);
            w.setBlock(x + 2, y, z + 9, JourneyBlocks.goldEucaPlank);
            w.setBlock(x + 2, y, z + 10, JourneyBlocks.eucaBricks);
            w.setBlock(x + 2, y + 1, z + 2, JourneyBlocks.eucaBricks);
            WorldGenAPI.placeEucaChest(w, x + 2, y + 1, z + 8, 1);
            w.setBlock(x + 2, y + 1, z + 10, JourneyBlocks.eucaBricks);
            w.setBlock(x + 2, y + 2, z + 2, JourneyBlocks.eucaBricks);
            w.setBlock(x + 2, y + 2, z + 10, JourneyBlocks.eucaBricks);
            w.setBlock(x + 2, y + 3, z + 2, JourneyBlocks.eucaBricks);
            w.setBlock(x + 2, y + 3, z + 8, JourneyBlocks.eucaBricks);
            w.setBlock(x + 2, y + 3, z + 10, JourneyBlocks.eucaBricks);
            w.setBlock(x + 2, y + 4, z + 2, JourneyBlocks.eucaBricks);
            w.setBlock(x + 2, y + 4, z + 8, JourneyBlocks.eucaBricks);
            w.setBlock(x + 2, y + 4, z + 10, JourneyBlocks.eucaBricks);
            w.setBlock(x + 2, y + 5, z + 2, JourneyBlocks.eucaBricks);
            w.setBlock(x + 2, y + 5, z + 3, JourneyBlocks.eucaBricks);
            w.setBlock(x + 2, y + 5, z + 4, JourneyBlocks.eucaBricks);
            w.setBlock(x + 2, y + 5, z + 5, JourneyBlocks.eucaBricks);
            w.setBlock(x + 2, y + 5, z + 6, JourneyBlocks.eucaBricks);
            w.setBlock(x + 2, y + 5, z + 7, JourneyBlocks.eucaBricks);
            w.setBlock(x + 2, y + 5, z + 8, JourneyBlocks.eucaBricks);
            w.setBlock(x + 2, y + 5, z + 9, JourneyBlocks.eucaBricks);
            w.setBlock(x + 2, y + 5, z + 10, JourneyBlocks.eucaBricks);
            w.setBlock(x + 2, y + 6, z + 2, JourneyBlocks.eucaBricks);
            w.setBlock(x + 2, y + 6, z + 3, JourneyBlocks.eucaBricks);
            w.setBlock(x + 2, y + 6, z + 4, JourneyBlocks.eucaBricks);
            w.setBlock(x + 2, y + 6, z + 5, JourneyBlocks.eucaBricks);
            w.setBlock(x + 2, y + 6, z + 6, JourneyBlocks.eucaBricks);
            w.setBlock(x + 2, y + 6, z + 7, JourneyBlocks.eucaBricks);
            w.setBlock(x + 2, y + 6, z + 8, JourneyBlocks.eucaBricks);
            w.setBlock(x + 2, y + 6, z + 9, JourneyBlocks.eucaBricks);
            w.setBlock(x + 2, y + 6, z + 10, JourneyBlocks.eucaBricks);
            w.setBlock(x + 2, y + 7, z, JourneyBlocks.eucaBricks);
            w.setBlock(x + 2, y + 7, z + 1, JourneyBlocks.eucaBricks);
            w.setBlock(x + 2, y + 7, z + 2, JourneyBlocks.eucaBricks);
            w.setBlock(x + 2, y + 7, z + 3, JourneyBlocks.eucaBricks);
            w.setBlock(x + 2, y + 7, z + 4, JourneyBlocks.eucaBricks);
            w.setBlock(x + 2, y + 7, z + 5, JourneyBlocks.eucaBricks);
            w.setBlock(x + 2, y + 7, z + 6, JourneyBlocks.eucaBricks);
            w.setBlock(x + 2, y + 7, z + 7, JourneyBlocks.eucaBricks);
            w.setBlock(x + 2, y + 7, z + 8, JourneyBlocks.eucaBricks);
            w.setBlock(x + 2, y + 7, z + 9, JourneyBlocks.eucaBricks);
            w.setBlock(x + 2, y + 7, z + 10, JourneyBlocks.eucaBricks);
            w.setBlock(x + 2, y + 7, z + 11, JourneyBlocks.eucaBricks);
            w.setBlock(x + 2, y + 7, z + 12, JourneyBlocks.eucaBricks);
            w.setBlock(x + 3, y, z + 2, JourneyBlocks.eucaBricks);
            w.setBlock(x + 3, y, z + 3, JourneyBlocks.goldEucaPlank);
            w.setBlock(x + 3, y, z + 4, JourneyBlocks.goldEucaPlank);
            w.setBlock(x + 3, y, z + 5, JourneyBlocks.goldEucaPlank);
            w.setBlock(x + 3, y, z + 6, JourneyBlocks.goldEucaPlank);
            w.setBlock(x + 3, y, z + 7, JourneyBlocks.goldEucaPlank);
            w.setBlock(x + 3, y, z + 8, JourneyBlocks.goldEucaPlank);
            w.setBlock(x + 3, y, z + 9, JourneyBlocks.goldEucaPlank);
            w.setBlock(x + 3, y, z + 10, JourneyBlocks.eucaBricks);
            w.setBlock(x + 3, y + 1, z + 2, JourneyBlocks.eucaBricks);
            w.setBlock(x + 3, y + 1, z + 9, JourneyBlocks.eucaBricks);
            w.setBlock(x + 3, y + 1, z + 10, JourneyBlocks.eucaBricks);
            w.setBlock(x + 3, y + 2, z + 2, JourneyBlocks.eucaBricks, 1, 2);
            w.setBlock(x + 3, y + 2, z + 10, JourneyBlocks.eucaBricks, 1, 2);
            w.setBlock(x + 3, y + 3, z + 2, JourneyBlocks.eucaBricks, 1, 2);
            w.setBlock(x + 3, y + 3, z + 9, JourneyBlocks.eucaBricks);
            w.setBlock(x + 3, y + 3, z + 10, JourneyBlocks.eucaBricks, 1, 2);
            w.setBlock(x + 3, y + 4, z + 2, JourneyBlocks.eucaBricks);
            w.setBlock(x + 3, y + 4, z + 9, JourneyBlocks.eucaBricks);
            w.setBlock(x + 3, y + 4, z + 10, JourneyBlocks.eucaBricks);
            w.setBlock(x + 3, y + 5, z + 2, JourneyBlocks.eucaBricks);
            w.setBlock(x + 3, y + 5, z + 3, JourneyBlocks.eucaBricks);
            w.setBlock(x + 3, y + 5, z + 4, JourneyBlocks.eucaBricks);
            w.setBlock(x + 3, y + 5, z + 5, JourneyBlocks.eucaBricks);
            w.setBlock(x + 3, y + 5, z + 6, JourneyBlocks.eucaBricks);
            w.setBlock(x + 3, y + 5, z + 7, JourneyBlocks.eucaBricks);
            w.setBlock(x + 3, y + 5, z + 8, JourneyBlocks.eucaBricks);
            w.setBlock(x + 3, y + 5, z + 9, JourneyBlocks.eucaBricks);
            w.setBlock(x + 3, y + 5, z + 10, JourneyBlocks.eucaBricks);
            w.setBlock(x + 3, y + 6, z + 2, JourneyBlocks.eucaBricks);
            w.setBlock(x + 3, y + 6, z + 3, JourneyBlocks.eucaBricks);
            w.setBlock(x + 3, y + 6, z + 4, JourneyBlocks.eucaBricks);
            w.setBlock(x + 3, y + 6, z + 5, JourneyBlocks.eucaBricks);
            w.setBlock(x + 3, y + 6, z + 6, JourneyBlocks.eucaBricks);
            w.setBlock(x + 3, y + 6, z + 7, JourneyBlocks.eucaBricks);
            w.setBlock(x + 3, y + 6, z + 8, JourneyBlocks.eucaBricks);
            w.setBlock(x + 3, y + 6, z + 9, JourneyBlocks.eucaBricks);
            w.setBlock(x + 3, y + 6, z + 10, JourneyBlocks.eucaBricks);
            w.setBlock(x + 3, y + 7, z + 2, JourneyBlocks.eucaBricks);
            w.setBlock(x + 3, y + 7, z + 3, JourneyBlocks.eucaBricks);
            w.setBlock(x + 3, y + 7, z + 4, JourneyBlocks.eucaBricks);
            w.setBlock(x + 3, y + 7, z + 5, JourneyBlocks.eucaBricks);
            w.setBlock(x + 3, y + 7, z + 6, JourneyBlocks.eucaBricks);
            w.setBlock(x + 3, y + 7, z + 7, JourneyBlocks.eucaBricks);
            w.setBlock(x + 3, y + 7, z + 8, JourneyBlocks.eucaBricks);
            w.setBlock(x + 3, y + 7, z + 9, JourneyBlocks.eucaBricks);
            w.setBlock(x + 3, y + 7, z + 10, JourneyBlocks.eucaBricks);
            w.setBlock(x + 3, y + 8, z, JourneyBlocks.eucaBricks);
            w.setBlock(x + 3, y + 8, z + 1, JourneyBlocks.eucaBricks);
            w.setBlock(x + 3, y + 8, z + 2, JourneyBlocks.eucaBricks);
            w.setBlock(x + 3, y + 8, z + 3, JourneyBlocks.eucaBricks);
            w.setBlock(x + 3, y + 8, z + 4, JourneyBlocks.eucaBricks);
            w.setBlock(x + 3, y + 8, z + 5, JourneyBlocks.eucaBricks);
            w.setBlock(x + 3, y + 8, z + 6, JourneyBlocks.eucaBricks);
            w.setBlock(x + 3, y + 8, z + 7, JourneyBlocks.eucaBricks);
            w.setBlock(x + 3, y + 8, z + 8, JourneyBlocks.eucaBricks);
            w.setBlock(x + 3, y + 8, z + 9, JourneyBlocks.eucaBricks);
            w.setBlock(x + 3, y + 8, z + 10, JourneyBlocks.eucaBricks);
            w.setBlock(x + 3, y + 8, z + 11, JourneyBlocks.eucaBricks);
            w.setBlock(x + 3, y + 8, z + 12, JourneyBlocks.eucaBricks);
            w.setBlock(x + 4, y, z + 2, JourneyBlocks.eucaBricks);
            w.setBlock(x + 4, y, z + 3, JourneyBlocks.goldEucaPlank);
            w.setBlock(x + 4, y, z + 4, JourneyBlocks.goldEucaPlank);
            w.setBlock(x + 4, y, z + 5, JourneyBlocks.goldEucaPlank);
            w.setBlock(x + 4, y, z + 6, JourneyBlocks.goldEucaPlank);
            w.setBlock(x + 4, y, z + 7, JourneyBlocks.goldEucaPlank);
            w.setBlock(x + 4, y, z + 8, JourneyBlocks.goldEucaPlank);
            w.setBlock(x + 4, y, z + 9, JourneyBlocks.goldEucaPlank);
            w.setBlock(x + 4, y, z + 10, JourneyBlocks.eucaBricks);
            w.setBlock(x + 4, y + 1, z + 2, JourneyBlocks.eucaBricks);
            w.setBlock(x + 4, y + 1, z + 10, JourneyBlocks.eucaBricks);
            w.setBlock(x + 4, y + 2, z + 2, (Block)Blocks.stained_glass_pane, 1, 2);
            w.setBlock(x + 4, y + 2, z + 10, (Block)Blocks.stained_glass_pane, 1, 2);
            w.setBlock(x + 4, y + 3, z + 2, (Block)Blocks.stained_glass_pane, 1, 2);
            w.setBlock(x + 4, y + 3, z + 10, (Block)Blocks.stained_glass_pane, 1, 2);
            w.setBlock(x + 4, y + 4, z + 2, JourneyBlocks.eucaBricks);
            w.setBlock(x + 4, y + 4, z + 10, JourneyBlocks.eucaBricks);
            w.setBlock(x + 4, y + 5, z + 2, JourneyBlocks.eucaBricks);
            w.setBlock(x + 4, y + 5, z + 3, JourneyBlocks.eucaBricks);
            w.setBlock(x + 4, y + 5, z + 4, JourneyBlocks.eucaBricks);
            w.setBlock(x + 4, y + 5, z + 5, JourneyBlocks.eucaBricks);
            w.setBlock(x + 4, y + 5, z + 6, JourneyBlocks.eucaBricks);
            w.setBlock(x + 4, y + 5, z + 7, JourneyBlocks.eucaBricks);
            w.setBlock(x + 4, y + 5, z + 8, JourneyBlocks.eucaBricks);
            w.setBlock(x + 4, y + 5, z + 9, JourneyBlocks.eucaBricks);
            w.setBlock(x + 4, y + 5, z + 10, JourneyBlocks.eucaBricks);
            w.setBlock(x + 4, y + 6, z + 2, JourneyBlocks.eucaBricks);
            w.setBlock(x + 4, y + 6, z + 3, JourneyBlocks.eucaBricks);
            w.setBlock(x + 4, y + 6, z + 4, JourneyBlocks.eucaBricks);
            w.setBlock(x + 4, y + 6, z + 5, JourneyBlocks.eucaBricks);
            w.setBlock(x + 4, y + 6, z + 6, JourneyBlocks.eucaBricks);
            w.setBlock(x + 4, y + 6, z + 7, JourneyBlocks.eucaBricks);
            w.setBlock(x + 4, y + 6, z + 8, JourneyBlocks.eucaBricks);
            w.setBlock(x + 4, y + 6, z + 9, JourneyBlocks.eucaBricks);
            w.setBlock(x + 4, y + 6, z + 10, JourneyBlocks.eucaBricks);
            w.setBlock(x + 4, y + 7, z + 2, JourneyBlocks.eucaBricks);
            w.setBlock(x + 4, y + 7, z + 3, JourneyBlocks.eucaBricks);
            w.setBlock(x + 4, y + 7, z + 4, JourneyBlocks.eucaBricks);
            w.setBlock(x + 4, y + 7, z + 5, JourneyBlocks.eucaBricks);
            w.setBlock(x + 4, y + 7, z + 6, JourneyBlocks.eucaBricks);
            w.setBlock(x + 4, y + 7, z + 7, JourneyBlocks.eucaBricks);
            w.setBlock(x + 4, y + 7, z + 8, JourneyBlocks.eucaBricks);
            w.setBlock(x + 4, y + 7, z + 9, JourneyBlocks.eucaBricks);
            w.setBlock(x + 4, y + 7, z + 10, JourneyBlocks.eucaBricks);
            w.setBlock(x + 4, y + 8, z, JourneyBlocks.eucaBricks);
            w.setBlock(x + 4, y + 8, z + 1, JourneyBlocks.eucaBricks);
            w.setBlock(x + 4, y + 8, z + 2, JourneyBlocks.eucaBricks);
            w.setBlock(x + 4, y + 8, z + 3, JourneyBlocks.eucaBricks);
            w.setBlock(x + 4, y + 8, z + 4, JourneyBlocks.eucaBricks);
            w.setBlock(x + 4, y + 8, z + 5, JourneyBlocks.eucaBricks);
            w.setBlock(x + 4, y + 8, z + 6, JourneyBlocks.eucaBricks);
            w.setBlock(x + 4, y + 8, z + 7, JourneyBlocks.eucaBricks);
            w.setBlock(x + 4, y + 8, z + 8, JourneyBlocks.eucaBricks);
            w.setBlock(x + 4, y + 8, z + 9, JourneyBlocks.eucaBricks);
            w.setBlock(x + 4, y + 8, z + 10, JourneyBlocks.eucaBricks);
            w.setBlock(x + 4, y + 8, z + 11, JourneyBlocks.eucaBricks);
            w.setBlock(x + 4, y + 8, z + 12, JourneyBlocks.eucaBricks);
            w.setBlock(x + 5, y, z + 2, JourneyBlocks.eucaBricks);
            w.setBlock(x + 5, y, z + 3, JourneyBlocks.goldEucaPlank);
            w.setBlock(x + 5, y, z + 4, JourneyBlocks.goldEucaPlank);
            w.setBlock(x + 5, y, z + 5, JourneyBlocks.goldEucaPlank);
            w.setBlock(x + 5, y, z + 6, JourneyBlocks.goldEucaPlank);
            w.setBlock(x + 5, y, z + 7, JourneyBlocks.goldEucaPlank);
            w.setBlock(x + 5, y, z + 8, JourneyBlocks.goldEucaPlank);
            w.setBlock(x + 5, y, z + 9, JourneyBlocks.goldEucaPlank);
            w.setBlock(x + 5, y, z + 10, JourneyBlocks.eucaBricks);
            w.setBlock(x + 5, y + 1, z + 2, JourneyBlocks.eucaBricks);
            w.setBlock(x + 5, y + 1, z + 10, JourneyBlocks.eucaBricks);
            w.setBlock(x + 5, y + 2, z + 2, JourneyBlocks.eucaBricks);
            w.setBlock(x + 5, y + 2, z + 10, JourneyBlocks.eucaBricks);
            w.setBlock(x + 5, y + 3, z + 2, JourneyBlocks.eucaBricks);
            w.setBlock(x + 5, y + 3, z + 10, JourneyBlocks.eucaBricks);
            w.setBlock(x + 5, y + 4, z + 2, JourneyBlocks.eucaBricks);
            w.setBlock(x + 5, y + 4, z + 3, JourneyBlocks.eucaBricks);
            w.setBlock(x + 5, y + 4, z + 4, JourneyBlocks.eucaBricks);
            w.setBlock(x + 5, y + 4, z + 5, JourneyBlocks.eucaBricks);
            w.setBlock(x + 5, y + 4, z + 6, JourneyBlocks.eucaBricks);
            w.setBlock(x + 5, y + 4, z + 7, JourneyBlocks.eucaBricks);
            w.setBlock(x + 5, y + 4, z + 8, JourneyBlocks.eucaBricks);
            w.setBlock(x + 5, y + 4, z + 9, JourneyBlocks.eucaBricks);
            w.setBlock(x + 5, y + 4, z + 10, JourneyBlocks.eucaBricks);
            w.setBlock(x + 5, y + 5, z + 2, JourneyBlocks.eucaBricks);
            w.setBlock(x + 5, y + 5, z + 3, JourneyBlocks.eucaBricks);
            w.setBlock(x + 5, y + 5, z + 4, JourneyBlocks.eucaBricks);
            w.setBlock(x + 5, y + 5, z + 5, JourneyBlocks.eucaBricks);
            w.setBlock(x + 5, y + 5, z + 6, JourneyBlocks.eucaBricks);
            w.setBlock(x + 5, y + 5, z + 7, JourneyBlocks.eucaBricks);
            w.setBlock(x + 5, y + 5, z + 8, JourneyBlocks.eucaBricks);
            w.setBlock(x + 5, y + 5, z + 9, JourneyBlocks.eucaBricks);
            w.setBlock(x + 5, y + 5, z + 10, JourneyBlocks.eucaBricks);
            w.setBlock(x + 5, y + 6, z + 2, JourneyBlocks.eucaBricks);
            w.setBlock(x + 5, y + 6, z + 3, JourneyBlocks.eucaBricks);
            w.setBlock(x + 5, y + 6, z + 4, JourneyBlocks.eucaBricks);
            w.setBlock(x + 5, y + 6, z + 5, JourneyBlocks.eucaBricks);
            w.setBlock(x + 5, y + 6, z + 6, JourneyBlocks.eucaBricks);
            w.setBlock(x + 5, y + 6, z + 7, JourneyBlocks.eucaBricks);
            w.setBlock(x + 5, y + 6, z + 8, JourneyBlocks.eucaBricks);
            w.setBlock(x + 5, y + 6, z + 9, JourneyBlocks.eucaBricks);
            w.setBlock(x + 5, y + 6, z + 10, JourneyBlocks.eucaBricks);
            w.setBlock(x + 5, y + 7, z, JourneyBlocks.eucaBricks);
            w.setBlock(x + 5, y + 7, z + 1, JourneyBlocks.eucaBricks);
            w.setBlock(x + 5, y + 7, z + 2, JourneyBlocks.eucaBricks);
            w.setBlock(x + 5, y + 7, z + 3, JourneyBlocks.eucaBricks);
            w.setBlock(x + 5, y + 7, z + 4, JourneyBlocks.eucaBricks);
            w.setBlock(x + 5, y + 7, z + 5, JourneyBlocks.eucaBricks);
            w.setBlock(x + 5, y + 7, z + 6, JourneyBlocks.eucaBricks);
            w.setBlock(x + 5, y + 7, z + 7, JourneyBlocks.eucaBricks);
            w.setBlock(x + 5, y + 7, z + 8, JourneyBlocks.eucaBricks);
            w.setBlock(x + 5, y + 7, z + 9, JourneyBlocks.eucaBricks);
            w.setBlock(x + 5, y + 7, z + 10, JourneyBlocks.eucaBricks);
            w.setBlock(x + 5, y + 7, z + 11, JourneyBlocks.eucaBricks);
            w.setBlock(x + 5, y + 7, z + 12, JourneyBlocks.eucaBricks);
            w.setBlock(x + 6, y, z + 2, JourneyBlocks.eucaBricks);
            w.setBlock(x + 6, y, z + 3, JourneyBlocks.goldEucaPlank);
            w.setBlock(x + 6, y, z + 4, JourneyBlocks.eucaBricks);
            w.setBlock(x + 6, y, z + 5, JourneyBlocks.eucaBricks);
            w.setBlock(x + 6, y, z + 6, JourneyBlocks.eucaBricks);
            w.setBlock(x + 6, y, z + 7, JourneyBlocks.eucaBricks);
            w.setBlock(x + 6, y, z + 8, JourneyBlocks.eucaBricks);
            w.setBlock(x + 6, y, z + 9, JourneyBlocks.eucaBricks);
            w.setBlock(x + 6, y, z + 10, JourneyBlocks.eucaBricks);
            w.setBlock(x + 6, y + 1, z + 2, JourneyBlocks.eucaBricks);
            w.setBlock(x + 6, y + 1, z + 4, JourneyBlocks.eucaBricks);
            w.setBlock(x + 6, y + 1, z + 5, JourneyBlocks.eucaBricks);
            w.setBlock(x + 6, y + 1, z + 6, JourneyBlocks.eucaBricks);
            w.setBlock(x + 6, y + 1, z + 7, JourneyBlocks.eucaBricks);
            w.setBlock(x + 6, y + 1, z + 8, JourneyBlocks.eucaBricks);
            w.setBlock(x + 6, y + 1, z + 9, JourneyBlocks.eucaBricks);
            w.setBlock(x + 6, y + 1, z + 10, JourneyBlocks.eucaBricks);
            w.setBlock(x + 6, y + 2, z + 2, JourneyBlocks.eucaBricks);
            w.setBlock(x + 6, y + 2, z + 4, JourneyBlocks.eucaBricks);
            w.setBlock(x + 6, y + 2, z + 5, JourneyBlocks.eucaBricks);
            w.setBlock(x + 6, y + 2, z + 6, (Block)Blocks.stained_glass_pane, 1, 2);
            w.setBlock(x + 6, y + 2, z + 7, (Block)Blocks.stained_glass_pane, 1, 2);
            w.setBlock(x + 6, y + 2, z + 8, (Block)Blocks.stained_glass_pane, 1, 2);
            w.setBlock(x + 6, y + 2, z + 9, JourneyBlocks.eucaBricks);
            w.setBlock(x + 6, y + 2, z + 10, JourneyBlocks.eucaBricks);
            w.setBlock(x + 6, y + 3, z + 2, JourneyBlocks.eucaBricks);
            w.setBlock(x + 6, y + 3, z + 3, JourneyBlocks.eucaBricks);
            w.setBlock(x + 6, y + 3, z + 4, JourneyBlocks.eucaBricks);
            w.setBlock(x + 6, y + 3, z + 5, JourneyBlocks.eucaBricks);
            w.setBlock(x + 6, y + 3, z + 6, (Block)Blocks.stained_glass_pane, 1, 2);
            w.setBlock(x + 6, y + 3, z + 7, (Block)Blocks.stained_glass_pane, 1, 2);
            w.setBlock(x + 6, y + 3, z + 8, (Block)Blocks.stained_glass_pane, 1, 2);
            w.setBlock(x + 6, y + 3, z + 9, JourneyBlocks.eucaBricks);
            w.setBlock(x + 6, y + 3, z + 10, JourneyBlocks.eucaBricks);
            w.setBlock(x + 6, y + 4, z + 2, JourneyBlocks.eucaBricks);
            w.setBlock(x + 6, y + 4, z + 3, JourneyBlocks.eucaBricks);
            w.setBlock(x + 6, y + 4, z + 4, JourneyBlocks.eucaBricks);
            w.setBlock(x + 6, y + 4, z + 5, JourneyBlocks.eucaBricks);
            w.setBlock(x + 6, y + 4, z + 6, JourneyBlocks.eucaBricks);
            w.setBlock(x + 6, y + 4, z + 7, JourneyBlocks.eucaBricks);
            w.setBlock(x + 6, y + 4, z + 8, JourneyBlocks.eucaBricks);
            w.setBlock(x + 6, y + 4, z + 9, JourneyBlocks.eucaBricks);
            w.setBlock(x + 6, y + 4, z + 10, JourneyBlocks.eucaBricks);
            w.setBlock(x + 6, y + 5, z + 2, JourneyBlocks.eucaBricks);
            w.setBlock(x + 6, y + 5, z + 3, JourneyBlocks.eucaBricks);
            w.setBlock(x + 6, y + 5, z + 4, JourneyBlocks.eucaBricks);
            w.setBlock(x + 6, y + 5, z + 5, JourneyBlocks.eucaBricks);
            w.setBlock(x + 6, y + 5, z + 6, JourneyBlocks.eucaBricks);
            w.setBlock(x + 6, y + 5, z + 7, JourneyBlocks.eucaBricks);
            w.setBlock(x + 6, y + 5, z + 8, JourneyBlocks.eucaBricks);
            w.setBlock(x + 6, y + 5, z + 9, JourneyBlocks.eucaBricks);
            w.setBlock(x + 6, y + 5, z + 10, JourneyBlocks.eucaBricks);
            w.setBlock(x + 6, y + 6, z + 1, JourneyBlocks.eucaBricks);
            w.setBlock(x + 6, y + 6, z + 2, JourneyBlocks.eucaBricks);
            w.setBlock(x + 6, y + 6, z + 3, JourneyBlocks.eucaBricks);
            w.setBlock(x + 6, y + 6, z + 4, JourneyBlocks.eucaBricks);
            w.setBlock(x + 6, y + 6, z + 5, JourneyBlocks.eucaBricks);
            w.setBlock(x + 6, y + 6, z + 6, JourneyBlocks.eucaBricks);
            w.setBlock(x + 6, y + 6, z + 7, JourneyBlocks.eucaBricks);
            w.setBlock(x + 6, y + 6, z + 8, JourneyBlocks.eucaBricks);
            w.setBlock(x + 6, y + 6, z + 9, JourneyBlocks.eucaBricks);
            w.setBlock(x + 6, y + 6, z + 10, JourneyBlocks.eucaBricks);
            w.setBlock(x + 6, y + 6, z + 11, JourneyBlocks.eucaBricks);
            w.setBlock(x + 7, y + 5, z + 1, JourneyBlocks.eucaBricks);
            w.setBlock(x + 7, y + 5, z + 2, JourneyBlocks.eucaBricks);
            w.setBlock(x + 7, y + 5, z + 3, JourneyBlocks.eucaBricks);
            w.setBlock(x + 7, y + 5, z + 4, JourneyBlocks.eucaBricks);
            w.setBlock(x + 7, y + 5, z + 5, JourneyBlocks.eucaBricks);
            w.setBlock(x + 7, y + 5, z + 6, JourneyBlocks.eucaBricks);
            w.setBlock(x + 7, y + 5, z + 7, JourneyBlocks.eucaBricks);
            w.setBlock(x + 7, y + 5, z + 8, JourneyBlocks.eucaBricks);
            w.setBlock(x + 7, y + 5, z + 9, JourneyBlocks.eucaBricks);
            w.setBlock(x + 7, y + 5, z + 10, JourneyBlocks.eucaBricks);
            w.setBlock(x + 7, y + 5, z + 11, JourneyBlocks.eucaBricks);
            EntityAlloyMender smith = new EntityAlloyMender(w);
            smith.setLocationAndAngles(x + 4, y + 2, z + 4, 0.0f, 0.0f);
            w.spawnEntityInWorld((Entity)smith);
        }
        return false;
    }
}

