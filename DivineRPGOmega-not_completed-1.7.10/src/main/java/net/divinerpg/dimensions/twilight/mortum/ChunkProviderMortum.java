/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cpw.mods.fml.common.eventhandler.Event
 *  cpw.mods.fml.common.eventhandler.Event$Result
 *  net.minecraft.block.Block
 *  net.minecraft.block.BlockSand
 *  net.minecraft.entity.EnumCreatureType
 *  net.minecraft.init.Blocks
 *  net.minecraft.util.IProgressUpdate
 *  net.minecraft.world.ChunkPosition
 *  net.minecraft.world.World
 *  net.minecraft.world.biome.BiomeGenBase
 *  net.minecraft.world.chunk.Chunk
 *  net.minecraft.world.chunk.IChunkProvider
 *  net.minecraft.world.gen.NoiseGenerator
 *  net.minecraft.world.gen.NoiseGeneratorOctaves
 *  net.minecraft.world.gen.feature.WorldGenFlowers
 *  net.minecraft.world.gen.feature.WorldGenMinable
 *  net.minecraftforge.common.MinecraftForge
 *  net.minecraftforge.event.terraingen.ChunkProviderEvent$InitNoiseField
 *  net.minecraftforge.event.terraingen.ChunkProviderEvent$ReplaceBiomeBlocks
 *  net.minecraftforge.event.terraingen.DecorateBiomeEvent$Post
 *  net.minecraftforge.event.terraingen.PopulateChunkEvent$Post
 *  net.minecraftforge.event.terraingen.PopulateChunkEvent$Pre
 *  net.minecraftforge.event.terraingen.TerrainGen
 */
package net.divinerpg.dimensions.twilight.mortum;

import cpw.mods.fml.common.eventhandler.Event;
import java.util.List;
import java.util.Random;
import net.divinerpg.dimensions.base.WorldGenModDoublePlant;
import net.divinerpg.dimensions.twilight.mortum.WorldGenMortumStone;
import net.divinerpg.dimensions.twilight.mortum.WorldGenMortumTree;
import net.divinerpg.utils.blocks.TwilightBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSand;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Blocks;
import net.minecraft.util.IProgressUpdate;
import net.minecraft.world.ChunkPosition;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.NoiseGenerator;
import net.minecraft.world.gen.NoiseGeneratorOctaves;
import net.minecraft.world.gen.feature.WorldGenFlowers;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.terraingen.ChunkProviderEvent;
import net.minecraftforge.event.terraingen.DecorateBiomeEvent;
import net.minecraftforge.event.terraingen.PopulateChunkEvent;
import net.minecraftforge.event.terraingen.TerrainGen;

public class ChunkProviderMortum
implements IChunkProvider {
    private Random hellRNG;
    private Random rand;
    private NoiseGeneratorOctaves netherNoiseGen1;
    private NoiseGeneratorOctaves netherNoiseGen2;
    private NoiseGeneratorOctaves netherNoiseGen3;
    private NoiseGeneratorOctaves netherrackExculsivityNoiseGen;
    public NoiseGeneratorOctaves netherNoiseGen6;
    public NoiseGeneratorOctaves netherNoiseGen7;
    private World worldObj;
    private double[] noiseField;
    private double[] slowsandNoise = new double[256];
    private double[] gravelNoise = new double[256];
    private double[] netherrackExclusivityNoise = new double[256];
    double[] noiseData1;
    double[] noiseData2;
    double[] noiseData3;
    double[] noiseData4;
    double[] noiseData5;

    public ChunkProviderMortum(World par1World, long par2) {
        this.worldObj = par1World;
        this.hellRNG = new Random(par2);
        this.netherNoiseGen1 = new NoiseGeneratorOctaves(this.hellRNG, 16);
        this.netherNoiseGen2 = new NoiseGeneratorOctaves(this.hellRNG, 16);
        this.netherNoiseGen3 = new NoiseGeneratorOctaves(this.hellRNG, 8);
        this.netherrackExculsivityNoiseGen = new NoiseGeneratorOctaves(this.hellRNG, 4);
        this.netherNoiseGen6 = new NoiseGeneratorOctaves(this.hellRNG, 10);
        this.netherNoiseGen7 = new NoiseGeneratorOctaves(this.hellRNG, 16);
        NoiseGenerator[] noiseGens = new NoiseGenerator[]{this.netherNoiseGen1, this.netherNoiseGen2, this.netherNoiseGen3, this.netherrackExculsivityNoiseGen, this.netherNoiseGen6, this.netherNoiseGen7};
        noiseGens = TerrainGen.getModdedNoiseGenerators((World)par1World, (Random)this.hellRNG, (NoiseGenerator[])noiseGens);
        this.netherNoiseGen1 = (NoiseGeneratorOctaves)noiseGens[0];
        this.netherNoiseGen2 = (NoiseGeneratorOctaves)noiseGens[1];
        this.netherNoiseGen3 = (NoiseGeneratorOctaves)noiseGens[2];
        this.netherrackExculsivityNoiseGen = (NoiseGeneratorOctaves)noiseGens[3];
        this.netherNoiseGen6 = (NoiseGeneratorOctaves)noiseGens[4];
        this.netherNoiseGen7 = (NoiseGeneratorOctaves)noiseGens[5];
    }

    public void generateNetherTerrain(int par1, int par2, Block[] par3ArrayOfByte) {
        int b0 = 4;
        int b1 = 32;
        int k = b0 + 1;
        int b2 = 17;
        int l = b0 + 1;
        this.noiseField = this.initializeNoiseField(this.noiseField, par1 * b0, 0, par2 * b0, k, b2, l);
        for (int i1 = 0; i1 < b0; ++i1) {
            for (int j1 = 0; j1 < b0; ++j1) {
                for (int k1 = 0; k1 < 16; ++k1) {
                    double d0 = 0.125;
                    double d1 = this.noiseField[((i1 + 0) * l + j1 + 0) * b2 + k1 + 0];
                    double d2 = this.noiseField[((i1 + 0) * l + j1 + 1) * b2 + k1 + 0];
                    double d3 = this.noiseField[((i1 + 1) * l + j1 + 0) * b2 + k1 + 0];
                    double d4 = this.noiseField[((i1 + 1) * l + j1 + 1) * b2 + k1 + 0];
                    double d5 = (this.noiseField[((i1 + 0) * l + j1 + 0) * b2 + k1 + 1] - d1) * d0;
                    double d6 = (this.noiseField[((i1 + 0) * l + j1 + 1) * b2 + k1 + 1] - d2) * d0;
                    double d7 = (this.noiseField[((i1 + 1) * l + j1 + 0) * b2 + k1 + 1] - d3) * d0;
                    double d8 = (this.noiseField[((i1 + 1) * l + j1 + 1) * b2 + k1 + 1] - d4) * d0;
                    for (int l1 = 0; l1 < 8; ++l1) {
                        double d9 = 0.25;
                        double d10 = d1;
                        double d11 = d2;
                        double d12 = (d3 - d1) * d9;
                        double d13 = (d4 - d2) * d9;
                        for (int i2 = 0; i2 < 4; ++i2) {
                            int j2 = i2 + i1 * 4 << 11 | 0 + j1 * 4 << 7 | k1 * 8 + l1;
                            int short1 = 128;
                            double d14 = 0.25;
                            double d15 = d10;
                            double d16 = (d11 - d10) * d14;
                            for (int k2 = 0; k2 < 4; ++k2) {
                                Block l2 = null;
                                if (d15 > 0.0) {
                                    l2 = TwilightBlocks.mortumGrass;
                                }
                                par3ArrayOfByte[j2] = l2;
                                j2 += short1;
                                d15 += d16;
                            }
                            d10 += d12;
                            d11 += d13;
                        }
                        d1 += d5;
                        d2 += d6;
                        d3 += d7;
                        d4 += d8;
                    }
                }
            }
        }
    }

    public void replaceBlocksForBiome(int par1, int par2, Block[] par3ArrayOfByte) {
        ChunkProviderEvent.ReplaceBiomeBlocks event = new ChunkProviderEvent.ReplaceBiomeBlocks((IChunkProvider)this, par1, par2, par3ArrayOfByte, null);
        MinecraftForge.EVENT_BUS.post((Event)event);
        if (event.getResult() == Event.Result.DENY) {
            return;
        }
        int b0 = 64;
        double d0 = 0.03125;
        this.netherrackExclusivityNoise = this.netherrackExculsivityNoiseGen.generateNoiseOctaves(this.netherrackExclusivityNoise, par1 * 16, par2 * 16, 0, 16, 16, 1, d0 * 2.0, d0 * 2.0, d0 * 2.0);
        for (int k = 0; k < 16; ++k) {
            for (int l = 0; l < 16; ++l) {
                boolean flag = this.slowsandNoise[k + l * 16] + this.hellRNG.nextDouble() * 0.2 > 0.0;
                boolean flag1 = this.gravelNoise[k + l * 16] + this.hellRNG.nextDouble() * 0.2 > 0.0;
                int i1 = (int)(this.netherrackExclusivityNoise[k + l * 16] / 3.0 + 3.0 + this.hellRNG.nextDouble() * 0.25);
                int j1 = -1;
                Block b1 = TwilightBlocks.mortumGrass;
                Block b2 = TwilightBlocks.mortumGrass;
                for (int k1 = 127; k1 >= 0; --k1) {
                    int l1 = (l * 16 + k) * 128 + k1;
                    if (k1 < 127 - this.hellRNG.nextInt(5) && k1 > 0 + this.hellRNG.nextInt(5)) {
                        Block b3 = par3ArrayOfByte[l1];
                        if (b3 == null) {
                            j1 = -1;
                            continue;
                        }
                        if (b3 != TwilightBlocks.mortumGrass) continue;
                        if (j1 == -1) {
                            if (i1 <= 0) {
                                b1 = null;
                                b2 = TwilightBlocks.mortumGrass;
                            } else if (k1 >= b0 - 4 && k1 <= b0 + 1) {
                                b1 = TwilightBlocks.mortumGrass;
                                b2 = TwilightBlocks.mortumGrass;
                                if (flag1) {
                                    b1 = TwilightBlocks.twilightStone;
                                }
                                if (flag1) {
                                    b2 = TwilightBlocks.twilightStone;
                                }
                                if (flag) {
                                    b1 = TwilightBlocks.twilightStone;
                                }
                                if (flag) {
                                    b2 = TwilightBlocks.twilightStone;
                                }
                            }
                            if (k1 < b0 && b1 == null) {
                                b1 = Blocks.water;
                            }
                            j1 = i1;
                            if (k1 >= b0 - 1) {
                                par3ArrayOfByte[l1] = b1;
                                continue;
                            }
                            par3ArrayOfByte[l1] = b2;
                            continue;
                        }
                        if (j1 <= 0) continue;
                        --j1;
                        par3ArrayOfByte[l1] = b2;
                        continue;
                    }
                    par3ArrayOfByte[l1] = Blocks.bedrock;
                }
            }
        }
    }

    public Chunk loadChunk(int par1, int par2) {
        return this.provideChunk(par1, par2);
    }

    public Chunk provideChunk(int par1, int par2) {
        this.hellRNG.setSeed((long)par1 * 341873128712L + (long)par2 * 132897987541L);
        Block[] blocks = new Block[32768];
        this.generateNetherTerrain(par1, par2, blocks);
        this.replaceBlocksForBiome(par1, par2, blocks);
        for (int i = 0; i < Short.MAX_VALUE; ++i) {
            if (blocks[i] != TwilightBlocks.mortumGrass || blocks[i + 1] == null) continue;
            blocks[i] = TwilightBlocks.mortumDirt;
        }
        Chunk chunk = new Chunk(this.worldObj, blocks, par1, par2);
        BiomeGenBase[] abiomegenbase = this.worldObj.getWorldChunkManager().loadBlockGeneratorData((BiomeGenBase[])null, par1 * 16, par2 * 16, 16, 16);
        byte[] abyte1 = chunk.getBiomeArray();
        for (int k = 0; k < abyte1.length; ++k) {
            abyte1[k] = (byte)abiomegenbase[k].biomeID;
        }
        chunk.resetRelightChecks();
        return chunk;
    }

    private double[] initializeNoiseField(double[] par1ArrayOfDouble, int par2, int par3, int par4, int par5, int par6, int par7) {
        int i2;
        ChunkProviderEvent.InitNoiseField event = new ChunkProviderEvent.InitNoiseField((IChunkProvider)this, par1ArrayOfDouble, par2, par3, par4, par5, par6, par7);
        MinecraftForge.EVENT_BUS.post((Event)event);
        if (event.getResult() == Event.Result.DENY) {
            return event.noisefield;
        }
        if (par1ArrayOfDouble == null) {
            par1ArrayOfDouble = new double[par5 * par6 * par7];
        }
        double d0 = 684.412;
        double d1 = 2053.236;
        this.noiseData4 = this.netherNoiseGen6.generateNoiseOctaves(this.noiseData4, par2, par3, par4, par5, 1, par7, 1.0, 0.0, 1.0);
        this.noiseData5 = this.netherNoiseGen7.generateNoiseOctaves(this.noiseData5, par2, par3, par4, par5, 1, par7, 100.0, 0.0, 100.0);
        this.noiseData1 = this.netherNoiseGen3.generateNoiseOctaves(this.noiseData1, par2, par3, par4, par5, par6, par7, d0 / 80.0, d1 / 60.0, d0 / 80.0);
        this.noiseData2 = this.netherNoiseGen1.generateNoiseOctaves(this.noiseData2, par2, par3, par4, par5, par6, par7, d0, d1, d0);
        this.noiseData3 = this.netherNoiseGen2.generateNoiseOctaves(this.noiseData3, par2, par3, par4, par5, par6, par7, d0, d1, d0);
        int k1 = 0;
        int l1 = 0;
        double[] adouble1 = new double[par6];
        for (i2 = 0; i2 < par6; ++i2) {
            adouble1[i2] = Math.cos((double)i2 * Math.PI * 6.0 / (double)par6) * 2.0;
            double d2 = i2;
            if (i2 > par6 / 2) {
                d2 = par6 - 1 - i2;
            }
            if (d2 >= 4.0) continue;
            d2 = 4.0 - d2;
            double[] arrd = adouble1;
            int n = i2;
            arrd[n] = arrd[n] - d2 * d2 * d2 * 10.0;
        }
        for (i2 = 0; i2 < par5; ++i2) {
            for (int j2 = 0; j2 < par7; ++j2) {
                double d;
                double d3 = (this.noiseData4[l1] + 256.0) / 512.0;
                if (d3 > 1.0) {
                    d3 = 1.0;
                }
                double d4 = 0.0;
                double d5 = this.noiseData5[l1] / 8000.0;
                if (d5 < 0.0) {
                    d5 = -d5;
                }
                d5 = d5 * 3.0 - 3.0;
                if (d < 0.0) {
                    double d2;
                    d5 /= 2.0;
                    if (d2 < -1.0) {
                        d5 = -1.0;
                    }
                    d5 /= 1.4;
                    d5 /= 2.0;
                    d3 = 0.0;
                } else {
                    if (d5 > 1.0) {
                        d5 = 1.0;
                    }
                    d5 /= 6.0;
                }
                d3 += 0.5;
                d5 = d5 * (double)par6 / 16.0;
                ++l1;
                for (int k2 = 0; k2 < par6; ++k2) {
                    double d11;
                    double d6 = 0.0;
                    double d7 = adouble1[k2];
                    double d8 = this.noiseData2[k1] / 512.0;
                    double d9 = this.noiseData3[k1] / 512.0;
                    double d10 = (this.noiseData1[k1] / 10.0 + 1.0) / 2.0;
                    d6 = d10 < 0.0 ? d8 : (d10 > 1.0 ? d9 : d8 + (d9 - d8) * d10);
                    d6 -= d7;
                    if (k2 > par6 - 4) {
                        d11 = (float)(k2 - (par6 - 4)) / 3.0f;
                        d6 = d6 * (1.0 - d11) + -10.0 * d11;
                    }
                    if ((double)k2 < d4) {
                        d11 = (d4 - (double)k2) / 4.0;
                        if (d11 < 0.0) {
                            d11 = 0.0;
                        }
                        if (d11 > 1.0) {
                            d11 = 1.0;
                        }
                        d6 = d6 * (1.0 - d11) + -10.0 * d11;
                    }
                    par1ArrayOfDouble[k1] = d6;
                    ++k1;
                }
            }
        }
        return par1ArrayOfDouble;
    }

    public boolean chunkExists(int par1, int par2) {
        return true;
    }

    public void populate(IChunkProvider provider, int x, int y) {
        int var13;
        int c;
        int var16;
        int var15;
        int var14;
        BlockSand.fallInstantly = true;
        MinecraftForge.EVENT_BUS.post((Event)new PopulateChunkEvent.Pre(provider, this.worldObj, this.hellRNG, x, y, false));
        int var4 = x * 16;
        int var5 = y * 16;
        for (int var132 = 0; var132 < 10; ++var132) {
            var14 = var4 + this.hellRNG.nextInt(16);
            var15 = this.hellRNG.nextInt(128);
            var16 = var5 + this.hellRNG.nextInt(16);
            new WorldGenMortumStone(50).generate(this.worldObj, this.hellRNG, var14, var15, var16);
            new WorldGenMinable(TwilightBlocks.mortumOre, 8, TwilightBlocks.twilightStone).generate(this.worldObj, this.hellRNG, var14, var15, var16);
        }
        WorldGenMortumTree var17 = new WorldGenMortumTree(false);
        for (int var18 = 0; var18 < 2; ++var18) {
            int var19 = var4 + this.hellRNG.nextInt(16);
            int var20 = var5 + this.hellRNG.nextInt(16);
            int var21 = this.hellRNG.nextInt(128);
            var17.generate(this.worldObj, this.hellRNG, var19, var21, var20);
        }
        for (c = 0; c < 2; ++c) {
            var14 = var4 + this.hellRNG.nextInt(16) + 8;
            var16 = var5 + this.hellRNG.nextInt(16) + 8;
            var15 = this.hellRNG.nextInt(255) + 1;
            new WorldGenModDoublePlant(TwilightBlocks.demonBrambles).generate(this.worldObj, this.hellRNG, var14, var15, var16);
        }
        for (c = 0; c < 2; ++c) {
            var14 = var4 + this.hellRNG.nextInt(16) + 8;
            var16 = var5 + this.hellRNG.nextInt(16) + 8;
            var15 = this.hellRNG.nextInt(255) + 1;
            new WorldGenFlowers(TwilightBlocks.eyePlant).generate(this.worldObj, this.hellRNG, var14, var15, var16);
        }
        for (c = 0; c < 2; ++c) {
            var14 = var4 + this.hellRNG.nextInt(16) + 8;
            var16 = var5 + this.hellRNG.nextInt(16) + 8;
            var15 = this.hellRNG.nextInt(255) + 1;
            new WorldGenFlowers(TwilightBlocks.eyePlant).generate(this.worldObj, this.hellRNG, var14, var15, var16);
        }
        for (var13 = 0; var13 < 30; ++var13) {
            var14 = var4 + this.hellRNG.nextInt(16);
            var15 = this.hellRNG.nextInt(128);
            var16 = var5 + this.hellRNG.nextInt(16);
            new WorldGenMinable(TwilightBlocks.darkOre, 8, TwilightBlocks.twilightStone).generate(this.worldObj, this.hellRNG, var14, var15, var16);
        }
        for (var13 = 0; var13 < 50; ++var13) {
            var14 = var4 + this.hellRNG.nextInt(16);
            var15 = this.hellRNG.nextInt(128);
            var16 = var5 + this.hellRNG.nextInt(16);
            new WorldGenMinable(TwilightBlocks.enchantOre, 8, TwilightBlocks.twilightStone).generate(this.worldObj, this.hellRNG, var14, var15, var16);
        }
        for (c = 0; c < 2; ++c) {
            var14 = var4 + this.hellRNG.nextInt(16) + 8;
            var16 = var5 + this.hellRNG.nextInt(16) + 8;
            var15 = this.hellRNG.nextInt(255) + 1;
            new WorldGenFlowers(TwilightBlocks.mortumBrush).generate(this.worldObj, this.hellRNG, var14, var15, var16);
        }
        MinecraftForge.EVENT_BUS.post((Event)new DecorateBiomeEvent.Post(this.worldObj, this.hellRNG, var4, var5));
        MinecraftForge.EVENT_BUS.post((Event)new PopulateChunkEvent.Post(provider, this.worldObj, this.hellRNG, x, y, false));
        BlockSand.fallInstantly = false;
    }

    public boolean saveChunks(boolean flag, IProgressUpdate iprogressupdate) {
        return true;
    }

    public boolean unloadQueuedChunks() {
        return false;
    }

    public boolean canSave() {
        return true;
    }

    public String makeString() {
        return "Mortum";
    }

    public List getPossibleCreatures(EnumCreatureType enumcreaturetype, int i, int j, int k) {
        BiomeGenBase var5 = this.worldObj.getBiomeGenForCoords(i, k);
        return var5 == null ? null : var5.getSpawnableList(enumcreaturetype);
    }

    public ChunkPosition func_147416_a(World world, String s, int i, int j, int k) {
        return null;
    }

    public int getLoadedChunkCount() {
        return 0;
    }

    public void recreateStructures(int i, int j) {
    }

    public void saveExtraData() {
    }
}

