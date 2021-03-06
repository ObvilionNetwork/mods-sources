/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.init.Blocks
 *  net.minecraft.init.Items
 *  net.minecraft.item.ItemStack
 *  net.minecraft.village.MerchantRecipe
 *  net.minecraft.village.MerchantRecipeList
 *  net.minecraft.world.World
 */
package net.divinerpg.entities.vanilla;

import net.divinerpg.DivineRPG;
import net.divinerpg.client.GuiHandler;
import net.divinerpg.entities.base.EntityDivineRPGVillager;
import net.divinerpg.libs.Sounds;
import net.divinerpg.utils.Util;
import net.divinerpg.utils.items.VanillaItemsOther;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.village.MerchantRecipe;
import net.minecraft.village.MerchantRecipeList;
import net.minecraft.world.World;

public class EntityLivestockMerchant
extends EntityDivineRPGVillager {
    public EntityLivestockMerchant(World var1) {
        super(var1);
    }

    @Override
    protected String getLivingSound() {
        return Sounds.getSoundName(Sounds.livestockMerchant);
    }

    @Override
    protected String getHurtSound() {
        return Sounds.getSoundName(Sounds.livestockMerchantHurt);
    }

    @Override
    protected String getDeathSound() {
        return Sounds.getSoundName(Sounds.livestockMerchantHurt);
    }

    @Override
    public void extraInteract(EntityPlayer p) {
        switch (this.rand.nextInt(4)) {
            case 0: {
                p.addChatMessage(Util.getChatComponent("Livestock Merchant: When traveling, I met a merchant named Zelus, who sold me the eggs that grew into the pets I breed now."));
                break;
            }
            case 1: {
                p.addChatMessage(Util.getChatComponent("Livestock Merchant: I sell only the healthiest pets!"));
                break;
            }
            case 2: {
                p.addChatMessage(Util.getChatComponent("Livestock Merchant: Tell Zelus I said Hi!"));
                break;
            }
            case 3: {
                p.addChatMessage(Util.getChatComponent("Livestock Merchant: I'd be afraid to feed a Snapper with my bare hands..."));
            }
        }
    }

    @Override
    public boolean interact(EntityPlayer var1) {
        if (!this.worldObj.isRemote) {
            this.extraInteract(var1);
            var1.openGui((Object)DivineRPG.instance, this.guiID(), this.worldObj, this.getEntityId(), 0, 0);
            return true;
        }
        return super.interact(var1);
    }

    @Override
    public int guiID() {
        return GuiHandler.livestockMerchant;
    }

    @Override
    public void addRecipies(MerchantRecipeList list) {
        list.add((Object)new MerchantRecipe(new ItemStack(Blocks.log, 32, 0), new ItemStack(VanillaItemsOther.shadowCoins, 4), new ItemStack(VanillaItemsOther.overworldEgg, 2, 0)));
        list.add((Object)new MerchantRecipe(new ItemStack(Blocks.log, 64, 0), new ItemStack(VanillaItemsOther.shadowCoins, 7), new ItemStack(VanillaItemsOther.overworldEgg, 2, 1)));
        list.add((Object)new MerchantRecipe(new ItemStack(Blocks.stone, 64), new ItemStack(VanillaItemsOther.shadowCoins, 3), new ItemStack(VanillaItemsOther.overworldEgg, 1, 2)));
        list.add((Object)new MerchantRecipe(new ItemStack(Blocks.nether_brick, 32), new ItemStack(VanillaItemsOther.shadowCoins, 5), new ItemStack(VanillaItemsOther.overworldEgg, 1, 3)));
        list.add((Object)new MerchantRecipe(new ItemStack(VanillaItemsOther.jungleStone, 2), new ItemStack(VanillaItemsOther.shadowCoins, 4), new ItemStack(VanillaItemsOther.overworldEgg, 3, 4)));
        list.add((Object)new MerchantRecipe(new ItemStack(Items.leather, 10), new ItemStack(VanillaItemsOther.shadowCoins, 8), new ItemStack(VanillaItemsOther.grizzleEgg, 2, 0)));
        list.add((Object)new MerchantRecipe(new ItemStack(Items.leather, 10), new ItemStack(VanillaItemsOther.shadowCoins, 8), new ItemStack(VanillaItemsOther.grizzleEgg, 2, 1)));
    }

    @Override
    public String mobName() {
        return "Livestock Merchant";
    }
}

