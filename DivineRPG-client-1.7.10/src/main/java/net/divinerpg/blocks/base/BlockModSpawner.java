/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cpw.mods.fml.common.registry.GameRegistry
 *  net.minecraft.block.Block
 *  net.minecraft.block.BlockContainer
 *  net.minecraft.block.material.Material
 *  net.minecraft.tileentity.TileEntity
 *  net.minecraft.tileentity.TileEntityMobSpawner
 *  net.minecraft.world.World
 */
package net.divinerpg.blocks.base;

import cpw.mods.fml.common.registry.GameRegistry;
import java.util.Random;
import net.divinerpg.utils.LangRegistry;
import net.divinerpg.utils.tabs.DivineRPGTabs;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityMobSpawner;
import net.minecraft.world.World;

public class BlockModSpawner
extends BlockContainer {
    protected String name;
    protected String mobName;

    public BlockModSpawner(String name, String mobName) {
        this(name, mobName, "frozenDungeonSpawner");
    }

    public BlockModSpawner(String name, String mobName, String textureName) {
        super(Material.rock);
        this.name = name;
        this.mobName = "divinerpg." + mobName;
        this.setBlockName(name);
        this.setBlockTextureName("divinerpg:" + textureName);
        this.setCreativeTab(DivineRPGTabs.spawner);
        GameRegistry.registerBlock((Block)this, (String)name);
        LangRegistry.addBlock((Block)this);
        this.setHardness(5.0f);
    }

    public TileEntity createNewTileEntity(World world, int par1) {
        TileEntityMobSpawner spawner = new TileEntityMobSpawner();
        this.setEntityName(spawner);
        return spawner;
    }

    protected void setEntityName(TileEntityMobSpawner spawner) {
        spawner.func_145881_a().setEntityName(this.mobName);
    }

    public int quantityDropped(Random par1Random) {
        return 0;
    }

    public void dropBlockAsItemWithChance(World world, int x, int y, int z, int par5, float par6, int par7) {
        super.dropBlockAsItemWithChance(world, x, y, z, par5, par6, par7);
        int var8 = 15 + world.rand.nextInt(15) + world.rand.nextInt(15);
        this.dropXpOnBlockBreak(world, x, y, z, var8);
    }

    public boolean isOpaqueCube() {
        return false;
    }
}

