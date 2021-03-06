/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cpw.mods.fml.common.registry.GameData
 *  net.minecraft.block.Block
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.entity.player.EntityPlayerMP
 *  net.minecraft.init.Blocks
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.MathHelper
 *  net.minecraft.util.MovingObjectPosition
 *  net.minecraft.util.Vec3
 *  net.minecraft.world.World
 */
package info.jbcs.minecraft.vending;

import cpw.mods.fml.common.registry.GameData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Set;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class General {
    public static Random rand = new Random();
    static HashMap<String, Block> blockMapping;

    public static void propelTowards(Entity what, Entity whereTo, double force) {
        double dx = whereTo.posX - what.posX;
        double dy = whereTo.posY - what.posY;
        double dz = whereTo.posZ - what.posZ;
        double total = Math.sqrt(dx * dx + dy * dy + dz * dz);
        if (total == 0.0) {
            what.motionX = 0.0;
            what.motionY = 0.0;
            what.motionZ = 0.0;
        } else {
            what.motionX = dx / total * force;
            what.motionY = dy / total * force;
            what.motionZ = dz / total * force;
        }
    }

    public static boolean isInRange(double distance, double x1, double y1, double z1, double x2, double y2, double z2) {
        double x = x1 - x2;
        double y = y1 - y2;
        double z = z1 - z2;
        return x * x + y * y + z * z < distance * distance;
    }

    public static Item getItem(ItemStack stack) {
        if (stack == null) {
            return null;
        }
        return stack.getItem();
    }

    public static Item getItem(int itemId) {
        Item item = (Item)GameData.getItemRegistry().getObjectById(itemId);
        return item;
    }

    public static Integer getItemId(Item item) {
        return GameData.getItemRegistry().getId(item);
    }

    public static String getUnlocalizedName(Block block) {
        String name = block.getUnlocalizedName();
        if (name.startsWith("tile.")) {
            name = name.substring(5);
        }
        return name;
    }

    public static Block getBlock(String s, Block fallback) {
        Block res;
        String[] blockNames = (String[]) GameData.getBlockRegistry().getKeys().toArray();
        if (blockMapping == null) {
            blockMapping = new HashMap();
            for (String blockName : blockNames) {
                Block block = Block.getBlockFromName(blockName);
                if (block == null) continue;
                String name = block.getUnlocalizedName();
                if (name.startsWith("tile.")) {
                    name = name.substring(5);
                }
                blockMapping.put(name.toLowerCase(), block);
            }
        }
        if ((res = blockMapping.get(s.toLowerCase())) == null) {
            return fallback;
        }
        return res;
    }

    public static Block getBlock(String s) {
        return General.getBlock(s, Blocks.stone);
    }

    public static String getName(Block block) {
        String res = block.getUnlocalizedName();
        return res.substring(5);
    }

    public static MovingObjectPosition getMovingObjectPositionFromPlayer(World par1World, EntityPlayer par2EntityPlayer, boolean par3) {
        float var4 = 1.0f;
        float var5 = par2EntityPlayer.prevRotationPitch + (par2EntityPlayer.rotationPitch - par2EntityPlayer.prevRotationPitch) * var4;
        float var6 = par2EntityPlayer.prevRotationYaw + (par2EntityPlayer.rotationYaw - par2EntityPlayer.prevRotationYaw) * var4;
        double var7 = par2EntityPlayer.prevPosX + (par2EntityPlayer.posX - par2EntityPlayer.prevPosX) * (double)var4;
        double var9 = par2EntityPlayer.prevPosY + (par2EntityPlayer.posY - par2EntityPlayer.prevPosY) * (double)var4 + 1.62 - (double)par2EntityPlayer.yOffset;
        double var11 = par2EntityPlayer.prevPosZ + (par2EntityPlayer.posZ - par2EntityPlayer.prevPosZ) * (double)var4;
        Vec3 var13 = Vec3.createVectorHelper((double)var7, (double)var9, (double)var11);
        float var14 = MathHelper.cos((float)(-var6 * ((float)Math.PI / 180) - (float)Math.PI));
        float var15 = MathHelper.sin((float)(-var6 * ((float)Math.PI / 180) - (float)Math.PI));
        float var16 = -MathHelper.cos((float)(-var5 * ((float)Math.PI / 180)));
        float var17 = MathHelper.sin((float)(-var5 * ((float)Math.PI / 180)));
        float var18 = var15 * var16;
        float var20 = var14 * var16;
        double var21 = 5.0;
        if (par2EntityPlayer instanceof EntityPlayerMP) {
            var21 = ((EntityPlayerMP)par2EntityPlayer).theItemInWorldManager.getBlockReachDistance();
        }
        Vec3 var23 = var13.addVector((double)var18 * var21, (double)var17 * var21, (double)var20 * var21);
        return par1World.rayTraceBlocks(var13, var23, par3);
    }

    public static int countNotNull(ItemStack[] itemStacks) {
        int counter = 0;
        for (ItemStack itemStack : itemStacks) {
            if (itemStack == null) continue;
            ++counter;
        }
        for (ItemStack itemStack : itemStacks) {
            if (itemStack == null) continue;
            ++counter;
        }
        return counter;
    }

    public static ItemStack getNotNull(ItemStack[] itemStacks, int num) {
        if (itemStacks.length == 1) {
            return itemStacks[0];
        }
        ArrayList<ItemStack> list = new ArrayList<ItemStack>();
        for (ItemStack itemStack : itemStacks) {
            if (itemStack == null) continue;
            list.add(itemStack);
        }
        return num < list.size() ? (ItemStack)list.get(num) : null;
    }
}

