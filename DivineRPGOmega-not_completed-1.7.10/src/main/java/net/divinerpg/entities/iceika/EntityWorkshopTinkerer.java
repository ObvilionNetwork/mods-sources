/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.item.ItemStack
 *  net.minecraft.stats.StatBase
 *  net.minecraft.village.MerchantRecipeList
 *  net.minecraft.world.World
 */
package net.divinerpg.entities.iceika;

import net.divinerpg.DivineRPG;
import net.divinerpg.client.GuiHandler;
import net.divinerpg.entities.base.EntityDivineRPGVillager;
import net.divinerpg.entities.base.InfiniteTrade;
import net.divinerpg.libs.DivineRPGAchievements;
import net.divinerpg.utils.MessageLocalizer;
import net.divinerpg.utils.Util;
import net.divinerpg.utils.items.IceikaItems;
import net.divinerpg.utils.items.VanillaItemsWeapons;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatBase;
import net.minecraft.village.MerchantRecipeList;
import net.minecraft.world.World;

public class EntityWorkshopTinkerer
extends EntityDivineRPGVillager {
    private static final String[] MESSAGE = new String[]{"message.merchant.ho", "message.merchant.out", "message.merchant.in", "message.merchant.burr"};

    public EntityWorkshopTinkerer(World var1) {
        super(var1);
        this.setSize(1.0f, 2.0f);
    }

    @Override
    public void extraInteract(EntityPlayer p) {
        p.addChatMessage(Util.getChatComponent("Tinkerer: " + MessageLocalizer.normal(MESSAGE[this.rand.nextInt(4)])));
    }

    @Override
    public boolean interact(EntityPlayer var1) {
        if (!this.worldObj.isRemote) {
            this.extraInteract(var1);
            var1.openGui((Object)DivineRPG.instance, this.guiID(), this.worldObj, this.getEntityId(), 0, 0);
            var1.triggerAchievement((StatBase)DivineRPGAchievements.lilTinkerin);
            return true;
        }
        return super.interact(var1);
    }

    @Override
    public int guiID() {
        return GuiHandler.tinker;
    }

    @Override
    public void addRecipies(MerchantRecipeList list) {
        list.add((Object)new InfiniteTrade(new ItemStack(IceikaItems.snowflake, 1), new ItemStack(VanillaItemsWeapons.shuriken, 16, 0), new ItemStack(IceikaItems.snowflakeShuriken, 16, 0)));
        list.add((Object)new InfiniteTrade(new ItemStack(IceikaItems.snowflake, 7), new ItemStack(VanillaItemsWeapons.slimeSword, 1, 0), new ItemStack(IceikaItems.glacierSword, 1, 0)));
        list.add((Object)new InfiniteTrade(new ItemStack(IceikaItems.snowflake, 12), new ItemStack(VanillaItemsWeapons.shadowBow, 1, 0), new ItemStack(IceikaItems.icicleBow, 1, 0)));
        list.add((Object)new InfiniteTrade(new ItemStack(IceikaItems.snowflake, 58), new ItemStack(VanillaItemsWeapons.enderFlameSword, 1, 0), new ItemStack(VanillaItemsWeapons.iceSword, 1, 0)));
        list.add((Object)new InfiniteTrade(new ItemStack(IceikaItems.snowflake, 24), new ItemStack(VanillaItemsWeapons.massivence, 1, 0), new ItemStack(IceikaItems.frossivence, 1, 0)));
        list.add((Object)new InfiniteTrade(new ItemStack(IceikaItems.snowflake, 12), new ItemStack(VanillaItemsWeapons.crabclawCannon, 1, 0), new ItemStack(IceikaItems.frostclawCannon, 1, 0)));
        list.add((Object)new InfiniteTrade(new ItemStack(IceikaItems.snowflake, 12), new ItemStack(VanillaItemsWeapons.frostCannon, 1, 0), new ItemStack(IceikaItems.fractiteCannon, 1, 0)));
        list.add((Object)new InfiniteTrade(new ItemStack(IceikaItems.snowflake, 15), new ItemStack(VanillaItemsWeapons.frostSword, 1, 0), new ItemStack(IceikaItems.frostkingSword, 1, 0)));
        list.add((Object)new InfiniteTrade(new ItemStack(IceikaItems.snowflake, 18), new ItemStack(IceikaItems.soundOfMusic, 1, 0), new ItemStack(IceikaItems.soundOfCarols, 1, 0)));
        list.add((Object)new InfiniteTrade(new ItemStack(IceikaItems.snowflake, 25), new ItemStack(VanillaItemsWeapons.enderSword, 1, 0), new ItemStack(IceikaItems.enderice, 1, 0)));
        list.add((Object)new InfiniteTrade(new ItemStack(IceikaItems.snowflake, 30), new ItemStack(VanillaItemsWeapons.bluefireBow, 1, 0), new ItemStack(IceikaItems.snowstormBow, 1, 0)));
        list.add((Object)new InfiniteTrade(new ItemStack(IceikaItems.snowflake, 45), new ItemStack(VanillaItemsWeapons.bedrockMaul, 1, 0), new ItemStack(IceikaItems.frozenMaul, 1, 0)));
        list.add((Object)new InfiniteTrade(new ItemStack(IceikaItems.snowflake, 40), new ItemStack(VanillaItemsWeapons.divineSword, 1, 0), new ItemStack(IceikaItems.icineSword, 1, 0)));
        list.add((Object)new InfiniteTrade(new ItemStack(IceikaItems.snowflake, 15), new ItemStack(VanillaItemsWeapons.sandslash, 1, 0), new ItemStack(IceikaItems.snowSlash, 1, 0)));
    }

    @Override
    public String mobName() {
        return "Workshop Tinkerer";
    }
}

