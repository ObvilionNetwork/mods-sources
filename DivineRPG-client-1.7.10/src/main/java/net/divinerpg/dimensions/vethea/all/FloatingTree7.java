/*
 * Decompiled with CFR 0.152.
 */
package net.divinerpg.dimensions.vethea.all;

import net.divinerpg.dimensions.vethea.IVetheanStructure;
import net.divinerpg.dimensions.vethea.VetheaChunk;
import net.divinerpg.utils.blocks.VetheaBlocks;

public class FloatingTree7
implements IVetheanStructure {
    @Override
    public void generate(VetheaChunk chunk, int i, int j, int k) {
        chunk.setBlock(i + 0, j + 2, k + 1, VetheaBlocks.dreamStone);
        chunk.setBlock(i + 1, j + 2, k + 0, VetheaBlocks.dreamStone);
        chunk.setBlock(i + 1, j + 2, k + 1, VetheaBlocks.dreamStone);
        chunk.setBlock(i + 1, j + 2, k + 2, VetheaBlocks.dreamStone);
        chunk.setBlock(i + 1, j + 3, k + 1, VetheaBlocks.mintwood);
        chunk.setBlock(i + 1, j + 4, k + 1, VetheaBlocks.mintwood);
        chunk.setBlock(i + 2, j + 2, k + 1, VetheaBlocks.dreamStone);
        chunk.setBlock(i + 2, j + 4, k + 1, VetheaBlocks.mintwood);
        chunk.setBlock(i + 3, j + 1, k + 1, VetheaBlocks.mintwoodLeaves);
        chunk.setBlock(i + 3, j + 4, k + 1, VetheaBlocks.mintwood);
        chunk.setBlock(i + 4, j + 0, k + 1, VetheaBlocks.mintwoodLeaves);
        chunk.setBlock(i + 4, j + 1, k + 0, VetheaBlocks.mintwoodLeaves);
        chunk.setBlock(i + 4, j + 1, k + 1, VetheaBlocks.mintwood);
        chunk.setBlock(i + 4, j + 1, k + 2, VetheaBlocks.mintwoodLeaves);
        chunk.setBlock(i + 4, j + 2, k + 1, VetheaBlocks.mintwood);
        chunk.setBlock(i + 4, j + 3, k + 1, VetheaBlocks.mintwood);
        chunk.setBlock(i + 4, j + 4, k + 1, VetheaBlocks.mintwood);
        chunk.setBlock(i + 5, j + 1, k + 1, VetheaBlocks.mintwoodLeaves);
    }
}

