/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cpw.mods.fml.relauncher.Side
 *  cpw.mods.fml.relauncher.SideOnly
 *  net.minecraft.client.renderer.texture.IIconRegister
 *  net.minecraft.tileentity.TileEntity
 *  net.minecraft.util.IIcon
 *  net.minecraft.world.World
 */
package net.divinerpg.blocks.arcana;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.divinerpg.blocks.arcana.container.tile_entity.TileEntityOceanfireFurnace;
import net.divinerpg.blocks.base.BlockModFurnace;
import net.divinerpg.client.GuiHandler;
import net.divinerpg.utils.blocks.ArcanaBlocks;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class BlockOceanfireFurnace
extends BlockModFurnace {
    @SideOnly(value=Side.CLIENT)
    protected IIcon side;
    @SideOnly(value=Side.CLIENT)
    protected IIcon top;
    @SideOnly(value=Side.CLIENT)
    protected IIcon front;

    public BlockOceanfireFurnace(String name, boolean act) {
        super(name, act, GuiHandler.oceanfire);
    }

    @SideOnly(value=Side.CLIENT)
    public void registerBlockIcons(IIconRegister par1IIconRegister) {
        this.side = par1IIconRegister.registerIcon("divinerpg:oceanfireFurnace_side");
        this.front = par1IIconRegister.registerIcon(this.active ? "divinerpg:oceanfireFurnace_front_on" : "divinerpg:oceanfireFurnace_front_off");
        this.top = par1IIconRegister.registerIcon("divinerpg:oceanfireFurnace_top");
    }

    @SideOnly(value=Side.CLIENT)
    public IIcon getIcon(int size, int meta) {
        if (size == 3 && meta == 0) {
            return this.front;
        }
        return size == 1 ? this.top : (size == 0 ? this.top : (size != meta ? this.side : this.front));
    }

    public TileEntity createNewTileEntity(World var1, int var2) {
        return new TileEntityOceanfireFurnace();
    }

    public static void updateFurnaceBlockState(boolean act, World par1World, int par2, int par3, int par4) {
        int l = par1World.getBlockMetadata(par2, par3, par4);
        TileEntity tileentity = par1World.getTileEntity(par2, par3, par4);
        keepInventory = true;
        if (act) {
            par1World.setBlock(par2, par3, par4, ArcanaBlocks.oceanfireFurnaceOn);
        } else {
            par1World.setBlock(par2, par3, par4, ArcanaBlocks.oceanfireFurnace);
        }
        keepInventory = false;
        par1World.setBlockMetadataWithNotify(par2, par3, par4, l, 2);
        if (tileentity != null) {
            tileentity.validate();
            par1World.setTileEntity(par2, par3, par4, tileentity);
        }
    }
}

