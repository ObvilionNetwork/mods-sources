/*
 * Decompiled with CFR 0.152.
 */
package com.meteor.extrabotany.common.lexicon;

import com.meteor.extrabotany.common.block.ModMultiBlocks;
import com.meteor.extrabotany.common.block.tile.TileRelicPlate;
import com.meteor.extrabotany.common.core.handler.ConfigHandler;
import com.meteor.extrabotany.common.lexicon.ELexiconEntry;
import com.meteor.extrabotany.common.lexicon.LLexiconEntry;
import com.meteor.extrabotany.common.lexicon.page.PageCraftRelic;
import com.meteor.extrabotany.common.lexicon.page.PageDisplay;
import com.meteor.extrabotany.common.lib.LibReference;
import com.meteor.extrabotany.common.recipe.ModEAltarRecipe;
import com.meteor.extrabotany.common.recipe.ModManaInfusionRecipe;
import com.meteor.extrabotany.common.recipe.ModPetalRecipe;
import com.meteor.extrabotany.common.recipe.ModRecipe;
import com.meteor.extrabotany.common.recipe.ModRuneRecipe;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;
import ru.justagod.cutter.invoke.Invoke;
import vazkii.botania.api.BotaniaAPI;
import vazkii.botania.api.lexicon.LexiconCategory;
import vazkii.botania.api.lexicon.LexiconEntry;
import vazkii.botania.api.lexicon.LexiconPage;
import vazkii.botania.api.recipe.RecipeElvenTrade;
import vazkii.botania.common.block.ModBlocks;
import vazkii.botania.common.item.ModItems;
import vazkii.botania.common.item.block.ItemBlockSpecialFlower;
import vazkii.botania.common.lexicon.BLexiconEntry;
import vazkii.botania.common.lexicon.DLexiconEntry;
import vazkii.botania.common.lexicon.page.PageCraftingRecipe;
import vazkii.botania.common.lexicon.page.PageElvenRecipe;
import vazkii.botania.common.lexicon.page.PageEntity;
import vazkii.botania.common.lexicon.page.PageManaInfusionRecipe;
import vazkii.botania.common.lexicon.page.PageMultiblock;
import vazkii.botania.common.lexicon.page.PagePetalRecipe;
import vazkii.botania.common.lexicon.page.PageRuneRecipe;
import vazkii.botania.common.lexicon.page.PageText;

public class LexiconModData {
    public static LexiconEntry pickup;
    public static LexiconEntry shield;
    public static LexiconEntry advancedmaterial;
    public static LexiconEntry candyflower;
    public static LexiconEntry blueenchantress;
    public static LexiconEntry sunshinelily;
    public static LexiconEntry moonlightlily;
    public static LexiconEntry geminiorchid;
    public static LexiconEntry ominiviolet;
    public static LexiconEntry pyschobloom;
    public static LexiconEntry stonesia;
    public static LexiconEntry bellflower;
    public static LexiconEntry necrofleur;
    public static LexiconEntry numerondandelife;
    public static LexiconEntry woodienia;
    public static LexiconEntry icebirdium;
    public static LexiconEntry numeronbalsam;
    public static LexiconEntry volatilily;
    public static LexiconEntry judasvow;
    public static LexiconEntry diplopbamboo;
    public static LexiconEntry voiduim;
    public static LexiconEntry artifaconia;
    public static LexiconEntry infernoidisy;
    public static LexiconEntry launchish;
    public static LexiconEntry annoyobloom;
    public static LexiconEntry manalinkuim;
    public static LexiconEntry infinitymana;
    public static LexiconEntry maxwelldemon;
    public static LexiconEntry excaliber;
    public static LexiconEntry gaia3;
    public static LexiconEntry gaiawise;
    public static LexiconEntry eternalslience;
    public static LexiconEntry hermestravelwand;
    public static LexiconEntry valkyriecombatsuit;
    public static LexiconEntry ogarmor;
    public static LexiconEntry cosmetic;
    public static LexiconEntry blankcard;
    public static LexiconEntry shard;
    public static LexiconEntry petal;
    public static LexiconEntry astralforce;
    public static LexiconEntry teleportpearl;
    public static LexiconEntry coronaclaymore;
    public static LexiconEntry scissorblade;
    public static LexiconEntry angelwand;
    public static LexiconEntry dagger;
    public static LexiconEntry manareader;
    public static LexiconEntry key;
    public static LexiconEntry mysterybox;
    public static LexiconEntry dungeonbox;
    public static LexiconEntry manapotato;
    public static LexiconEntry gaiatablet;
    public static LexiconEntry exmachina;
    public static LexiconEntry auracontroler;
    public static LexiconEntry elfpool;
    public static LexiconEntry elfupdater;
    public static LexiconEntry elfarmor;
    public static LexiconEntry elfpick;
    public static LexiconEntry topserver;
    public static LexiconCategory categoryExtra;
    public static LexiconCategory categoryEAltar;
    public static LexiconEntry testEAltar;
    public static LexiconEntry asgardC;
    public static LexiconEntry elfiriumC;
    public static LexiconEntry trademana;

    public static void init() {
        categoryExtra = new LexiconCategory(StatCollector.translateToLocal("category.Botania:extra"));
        categoryExtra.setIcon(LibReference.EXTRA);
        categoryExtra.setPriority(0);
        BotaniaAPI.addCategory(categoryExtra);
        categoryEAltar = new LexiconCategory(StatCollector.translateToLocal("category.Botania:extraEAltar"));
        categoryEAltar.setIcon(LibReference.EXTRAEALTAR);
        categoryEAltar.setPriority(0);
        BotaniaAPI.addCategory(categoryEAltar);
        Invoke.client(() -> ModEAltarRecipe.instance.initLexicon());
        asgardC = new BLexiconEntry("asgard", categoryExtra);
        asgardC.setLexiconPages(new PageText("0"));
        asgardC.setIcon(new ItemStack(com.meteor.extrabotany.common.block.ModBlocks.elfOre));
        elfiriumC = new BLexiconEntry("elfiriumc", categoryExtra);
        elfiriumC.setLexiconPages(new PageText("0"), new PageDisplay("1", new ItemStack(com.meteor.extrabotany.common.block.ModBlocks.elfOre)), new PageCraftingRecipe("2", ModRecipe.relicPanel), new PageMultiblock("3", TileRelicPlate.makeMultiblockSet()), new PageText("4"), new PageCraftRelic("4", new ItemStack(com.meteor.extrabotany.common.item.ModItems.elfirium), new ItemStack[]{new ItemStack(com.meteor.extrabotany.common.item.ModItems.fragmentEfirium), new ItemStack(com.meteor.extrabotany.common.item.ModItems.material, 1, 2), new ItemStack(com.meteor.extrabotany.common.item.ModItems.material, 1, 9), new ItemStack(com.meteor.extrabotany.common.item.ModItems.material, 1, 11)}, 5000000), new PageCraftRelic("5", new ItemStack(com.meteor.extrabotany.common.item.ModItems.awakepick), new ItemStack[]{new ItemStack(ModItems.terraPick), new ItemStack(com.meteor.extrabotany.common.block.ModBlocks.blockelfirium), new ItemStack(ModItems.overgrowthSeed), new ItemStack(com.meteor.extrabotany.common.item.ModItems.awakearmcontrol)}, 10000000), new PageCraftRelic("6", new ItemStack(com.meteor.extrabotany.common.item.ModItems.awakeoghelm), new ItemStack[]{new ItemStack(ModItems.terrasteelHelm), new ItemStack(com.meteor.extrabotany.common.block.ModBlocks.blockelfirium), new ItemStack(com.meteor.extrabotany.common.item.ModItems.SGBee), new ItemStack(com.meteor.extrabotany.common.item.ModItems.awakearmcontrol)}, 10000000), new PageCraftRelic("7", new ItemStack(com.meteor.extrabotany.common.item.ModItems.awakeogchest), new ItemStack[]{new ItemStack(ModItems.terrasteelChest), new ItemStack(com.meteor.extrabotany.common.block.ModBlocks.blockelfirium), new ItemStack(com.meteor.extrabotany.common.item.ModItems.SGBee), new ItemStack(com.meteor.extrabotany.common.item.ModItems.awakearmcontrol)}, 10000000), new PageCraftRelic("8", new ItemStack(com.meteor.extrabotany.common.item.ModItems.awakeoglegs), new ItemStack[]{new ItemStack(ModItems.terrasteelLegs), new ItemStack(com.meteor.extrabotany.common.block.ModBlocks.blockelfirium), new ItemStack(com.meteor.extrabotany.common.item.ModItems.SGBee), new ItemStack(com.meteor.extrabotany.common.item.ModItems.awakearmcontrol)}, 10000000), new PageCraftRelic("9", new ItemStack(com.meteor.extrabotany.common.item.ModItems.awakeogboots), new ItemStack[]{new ItemStack(ModItems.terrasteelBoots), new ItemStack(com.meteor.extrabotany.common.block.ModBlocks.blockelfirium), new ItemStack(com.meteor.extrabotany.common.item.ModItems.SGBee), new ItemStack(com.meteor.extrabotany.common.item.ModItems.awakearmcontrol)}, 10000000));
        elfiriumC.setIcon(new ItemStack(com.meteor.extrabotany.common.item.ModItems.elfirium));
        trademana = new BLexiconEntry("trademana", categoryExtra);
        trademana.setLexiconPages(new PageText("0"), new PageText("1"), new PageCraftingRecipe("2", ModRecipe.manatrade));
        trademana.setIcon(new ItemStack(com.meteor.extrabotany.common.block.ModBlocks.manatrade));
        key = new BLexiconEntry("key", categoryExtra);
        key.setLexiconPages(new PageText("0"));
        key.setIcon(new ItemStack(com.meteor.extrabotany.common.item.ModItems.key));
        mysterybox = new BLexiconEntry("mysterybox", categoryExtra);
        mysterybox.setLexiconPages(new PageText("0"));
        mysterybox.setIcon(new ItemStack(com.meteor.extrabotany.common.item.ModItems.boxs));
        dungeonbox = new BLexiconEntry("dungeonbox", categoryExtra);
        dungeonbox.setLexiconPages(new PageText("0"));
        dungeonbox.setIcon(new ItemStack(com.meteor.extrabotany.common.item.ModItems.dungeonbox));
        manareader = new BLexiconEntry("manareader", categoryExtra);
        manareader.setLexiconPages(new PageText("0"), new PageCraftingRecipe("1", ModRecipe.manareader));
        manareader.setIcon(new ItemStack(com.meteor.extrabotany.common.item.ModItems.reader));
        manapotato = new BLexiconEntry("manapotato", categoryExtra);
        manapotato.setLexiconPages(new PageText("0"), new PageCraftingRecipe("1", ModRecipe.manapotato));
        manapotato.setIcon(new ItemStack(com.meteor.extrabotany.common.item.ModItems.manapotato));
        gaiatablet = new BLexiconEntry("gaiatablet", categoryExtra);
        gaiatablet.setLexiconPages(new PageText("0"), new PageCraftingRecipe("1", ModRecipe.gaiatablet), new PageCraftingRecipe("2", ModRecipe.elfTablet));
        gaiatablet.setIcon(new ItemStack(com.meteor.extrabotany.common.item.ModItems.gaiatablet));
        gaiawise = new ELexiconEntry("gaiawise", categoryExtra);
        gaiawise.setLexiconPages(new PageText("0"), new PageCraftingRecipe("1", ModRecipe.gaiawise));
        gaiawise.setIcon(new ItemStack(com.meteor.extrabotany.common.item.ModItems.gaiawise));
        dagger = new BLexiconEntry("mermaiddagger", categoryExtra);
        dagger.setLexiconPages(new PageText("0"), new PageCraftingRecipe("1", ModRecipe.dagger));
        dagger.setIcon(new ItemStack(com.meteor.extrabotany.common.item.ModItems.dagger));
        ogarmor = new LLexiconEntry("ogarmor", categoryExtra);
        ogarmor.setLexiconPages(new PageText("0"), new PageCraftingRecipe("1", ModRecipe.oghelm), new PageCraftingRecipe("2", ModRecipe.ogchest), new PageCraftingRecipe("3", ModRecipe.oglegs), new PageCraftingRecipe("4", ModRecipe.ogboots));
        ogarmor.setIcon(new ItemStack(com.meteor.extrabotany.common.item.ModItems.oghelm));
        shield = new ELexiconEntry("shield", categoryExtra);
        shield.setLexiconPages(new PageText("0"), new PageText("1"), new PageCraftingRecipe("3", ModRecipe.sgmini), new PageCraftingRecipe("4", ModRecipe.sgenhanced), new PageCraftingRecipe("5", ModRecipe.sgquick), new PageText("2"), new PageCraftingRecipe("6", ModRecipe.sgbee));
        shield.setIcon(new ItemStack(com.meteor.extrabotany.common.item.ModItems.SGBee));
        blankcard = new BLexiconEntry("blankcard", categoryExtra);
        blankcard.setLexiconPages(new PageText("0"), new PageManaInfusionRecipe("1", ModManaInfusionRecipe.blankCardRecipe));
        blankcard.setIcon(new ItemStack(com.meteor.extrabotany.common.item.ModItems.material, 1, 1));
        shard = new BLexiconEntry("prismaticshard", categoryExtra);
        shard.setLexiconPages(new PageText("0"));
        shard.setIcon(new ItemStack(com.meteor.extrabotany.common.item.ModItems.material));
        advancedmaterial = new ELexiconEntry("advancedmaterial", categoryExtra);
        advancedmaterial.setLexiconPages(new PageText("0"), new PageText("1"), new PageCraftingRecipe("4", ModRecipe.elvenQuartz), new PageCraftingRecipe("5", ModRecipe.gaiaQuartz), new PageText("2"), new PageText("3"), new PageRuneRecipe("6", ModRuneRecipe.castsoulsteelRecipe), new PageElvenRecipe("7", new RecipeElvenTrade(new ItemStack(com.meteor.extrabotany.common.item.ModItems.emptysoulsteel), new ItemStack(com.meteor.extrabotany.common.item.ModItems.castsoulsteel))), new PageCraftingRecipe("8", ModRecipe.soulsteel));
        advancedmaterial.setIcon(new ItemStack(com.meteor.extrabotany.common.item.ModItems.material, 1, 11));
        petal = new BLexiconEntry("petal", categoryExtra);
        petal.setLexiconPages(new PageText("0"));
        petal.setIcon(new ItemStack(com.meteor.extrabotany.common.item.ModItems.lycorisrandom));
        teleportpearl = new ELexiconEntry("teleportpearl", categoryExtra);
        teleportpearl.setLexiconPages(new PageText("0"), new PageCraftingRecipe("1", ModRecipe.teleportpearl));
        teleportpearl.setIcon(new ItemStack(com.meteor.extrabotany.common.item.ModItems.teleportpearl));
        angelwand = new ELexiconEntry("angelwand", categoryExtra);
        angelwand.setLexiconPages(new PageText("0"), new PageCraftingRecipe("1", ModRecipe.angelwand));
        angelwand.setIcon(new ItemStack(com.meteor.extrabotany.common.item.ModItems.angelwand));
        coronaclaymore = new LLexiconEntry("coronaclaymore", categoryExtra);
        coronaclaymore.setLexiconPages(new PageText("0"));
        coronaclaymore.setIcon(new ItemStack(com.meteor.extrabotany.common.item.ModItems.heliacalclaymore));
        scissorblade = new ELexiconEntry("scissorblade", categoryExtra);
        scissorblade.setLexiconPages(new PageText("0"), new PageCraftingRecipe("1", ModRecipe.bladered), new PageCraftingRecipe("2", ModRecipe.bladepurple));
        scissorblade.setIcon(new ItemStack(com.meteor.extrabotany.common.item.ModItems.scissorred));
        cosmetic = new ELexiconEntry("cosmetic", categoryExtra);
        cosmetic.setLexiconPages(new PageText("0"), new PageCraftingRecipe("1", ModRecipe.baubleDog0), new PageCraftingRecipe("2", ModRecipe.baubleDog1), new PageCraftingRecipe("3", ModRecipe.baubleDog2), new PageCraftingRecipe("4", ModRecipe.baubleDog3));
        cosmetic.setIcon(new ItemStack(com.meteor.extrabotany.common.item.ModItems.dog, 1, 0));
        candyflower = new ELexiconEntry("candyflower", BotaniaAPI.categoryGenerationFlowers);
        candyflower.setLexiconPages(new PageText("0"), new PageText("1"), new PagePetalRecipe("2", ModPetalRecipe.candyflowerRecipe));
        candyflower.setIcon(ItemBlockSpecialFlower.ofType("candyflower"));
        blueenchantress = new ELexiconEntry("blueenchantress", BotaniaAPI.categoryGenerationFlowers);
        blueenchantress.setLexiconPages(new PageText("0"), new PagePetalRecipe("1", ModPetalRecipe.blueenchantressRecipe));
        blueenchantress.setIcon(ItemBlockSpecialFlower.ofType("blueenchantress"));
        sunshinelily = new ELexiconEntry("sunshinelily", BotaniaAPI.categoryGenerationFlowers);
        sunshinelily.setLexiconPages(new PageText("0"), new PageText("1"), new PagePetalRecipe("2", ModPetalRecipe.sunshinelilyRecipe));
        sunshinelily.setIcon(ItemBlockSpecialFlower.ofType("sunshinelily"));
        moonlightlily = new ELexiconEntry("moonlightlily", BotaniaAPI.categoryGenerationFlowers);
        moonlightlily.setLexiconPages(new PageText("0"), new PageText("1"), new PagePetalRecipe("2", ModPetalRecipe.moonlightlilyRecipe));
        moonlightlily.setIcon(ItemBlockSpecialFlower.ofType("moonlightlily"));
        ominiviolet = new ELexiconEntry("ominiviolet", BotaniaAPI.categoryGenerationFlowers);
        ominiviolet.setLexiconPages(new PageText("0"), new PagePetalRecipe("1", ModPetalRecipe.ominivioletRecipe));
        ominiviolet.setIcon(ItemBlockSpecialFlower.ofType("omniviolet"));
        geminiorchid = new ELexiconEntry("geminiorchid", BotaniaAPI.categoryGenerationFlowers);
        geminiorchid.setLexiconPages(new PageText("0"), new PagePetalRecipe("1", ModPetalRecipe.geminiorchidRecipe));
        geminiorchid.setIcon(ItemBlockSpecialFlower.ofType("geminiorchid"));
        stonesia = new ELexiconEntry("stonesia", BotaniaAPI.categoryGenerationFlowers);
        stonesia.setLexiconPages(new PageText("0"), new PagePetalRecipe("1", ModPetalRecipe.stonesiaRecipe));
        stonesia.setIcon(ItemBlockSpecialFlower.ofType("stonesia"));
        pyschobloom = new ELexiconEntry("pyschobloom", BotaniaAPI.categoryGenerationFlowers);
        pyschobloom.setLexiconPages(new PageText("0"), new PagePetalRecipe("1", ModPetalRecipe.pyschobloomRecipe));
        pyschobloom.setIcon(ItemBlockSpecialFlower.ofType("pyschobloom"));
        bellflower = new ELexiconEntry("bellflower", BotaniaAPI.categoryGenerationFlowers);
        bellflower.setLexiconPages(new PageText("0"), new PagePetalRecipe("1", ModPetalRecipe.bellflowerRecipe));
        bellflower.setIcon(ItemBlockSpecialFlower.ofType("bellflower"));
        necrofleur = new ELexiconEntry("necrofleur", BotaniaAPI.categoryFunctionalFlowers);
        necrofleur.setLexiconPages(new PageText("0"), new PagePetalRecipe("1", ModPetalRecipe.necrofleurRecipe));
        necrofleur.setIcon(ItemBlockSpecialFlower.ofType("necrofleur"));
        numerondandelife = new ELexiconEntry("numerondandelife", BotaniaAPI.categoryFunctionalFlowers);
        numerondandelife.setLexiconPages(new PageText("0"), new PagePetalRecipe("1", ModPetalRecipe.numerondandelifeRecipe));
        numerondandelife.setIcon(ItemBlockSpecialFlower.ofType("numerondandelife"));
        icebirdium = new ELexiconEntry("icebirdium", BotaniaAPI.categoryFunctionalFlowers);
        icebirdium.setLexiconPages(new PageText("0"), new PagePetalRecipe("1", ModPetalRecipe.icebirdiumRecipe));
        icebirdium.setIcon(ItemBlockSpecialFlower.ofType("icebirdium"));
        judasvow = new ELexiconEntry("judasvow", BotaniaAPI.categoryFunctionalFlowers);
        judasvow.setLexiconPages(new PageText("0"), new PagePetalRecipe("1", ModPetalRecipe.judasvowRecipe));
        judasvow.setIcon(ItemBlockSpecialFlower.ofType("judasvow"));
        volatilily = new ELexiconEntry("volatilily", BotaniaAPI.categoryFunctionalFlowers);
        volatilily.setLexiconPages(new PageText("0"), new PagePetalRecipe("1", ModPetalRecipe.volatililyRecipe));
        volatilily.setIcon(ItemBlockSpecialFlower.ofType("volatilily"));
        numeronbalsam = new ELexiconEntry("numeronbalsam", BotaniaAPI.categoryFunctionalFlowers);
        numeronbalsam.setLexiconPages(new PageText("0"), new PagePetalRecipe("1", ModPetalRecipe.numeronbalsamRecipe));
        numeronbalsam.setIcon(ItemBlockSpecialFlower.ofType("numeronbalsam"));
        if (ConfigHandler.enableDiplopbamboo) {
            diplopbamboo = new ELexiconEntry("diplopbamboo", BotaniaAPI.categoryFunctionalFlowers);
            diplopbamboo.setLexiconPages(new PageText("0"), new PagePetalRecipe("1", ModPetalRecipe.diplopbambooRecipe));
            diplopbamboo.setIcon(ItemBlockSpecialFlower.ofType("diplopbamboo"));
        }
        voiduim = new ELexiconEntry("voiduim", BotaniaAPI.categoryFunctionalFlowers);
        voiduim.setLexiconPages(new PageText("0"), new PagePetalRecipe("1", ModPetalRecipe.voiduimRecipe));
        voiduim.setIcon(ItemBlockSpecialFlower.ofType("voiduim"));
        woodienia = new ELexiconEntry("woodienia", BotaniaAPI.categoryFunctionalFlowers);
        woodienia.setLexiconPages(new PageText("0"), new PagePetalRecipe("1", ModPetalRecipe.woodieniaRecipe));
        woodienia.setIcon(ItemBlockSpecialFlower.ofType("woodienia"));
        artifaconia = new ELexiconEntry("artifaconia", BotaniaAPI.categoryFunctionalFlowers);
        artifaconia.setLexiconPages(new PageText("0"), new PagePetalRecipe("1", ModPetalRecipe.artifaconiaRecipe));
        artifaconia.setIcon(ItemBlockSpecialFlower.ofType("artifaconia"));
        infernoidisy = new ELexiconEntry("infernoidisy", BotaniaAPI.categoryFunctionalFlowers);
        infernoidisy.setLexiconPages(new PageText("0"), new PagePetalRecipe("1", ModPetalRecipe.infernoidisyRecipe));
        infernoidisy.setIcon(ItemBlockSpecialFlower.ofType("infernoidisy"));
        launchish = new ELexiconEntry("launchish", BotaniaAPI.categoryFunctionalFlowers);
        launchish.setLexiconPages(new PageText("0"), new PagePetalRecipe("1", ModPetalRecipe.launchishRecipe));
        launchish.setIcon(ItemBlockSpecialFlower.ofType("launchish"));
        annoyobloom = new ELexiconEntry("annoyobloom", BotaniaAPI.categoryFunctionalFlowers);
        annoyobloom.setLexiconPages(new PageText("0"), new PagePetalRecipe("1", ModPetalRecipe.annoyobloomRecipe));
        annoyobloom.setIcon(ItemBlockSpecialFlower.ofType("annoyobloom"));
        manalinkuim = new ELexiconEntry("manalinkuim", BotaniaAPI.categoryFunctionalFlowers);
        manalinkuim.setLexiconPages(new PageText("0"), new PagePetalRecipe("1", ModPetalRecipe.manalinkuim));
        manalinkuim.setIcon(ItemBlockSpecialFlower.ofType("manalinkuim"));
        infinitymana = new DLexiconEntry("infinitymana", categoryExtra);
        infinitymana.setIcon(new ItemStack(ModBlocks.pool));
        maxwelldemon = new LLexiconEntry("maxwelldemon", categoryExtra);
        maxwelldemon.setIcon(new ItemStack(com.meteor.extrabotany.common.item.ModItems.maxwelldemon));
        maxwelldemon.setLexiconPages(new PageText("0"), new PageCraftingRecipe("1", ModRecipe.maxwell));
        eternalslience = new LLexiconEntry("eternalslience", categoryExtra);
        eternalslience.setIcon(new ItemStack(com.meteor.extrabotany.common.item.ModItems.eternalslience));
        eternalslience.setLexiconPages(new PageText("0"), new PageCraftingRecipe("1", ModRecipe.eternalsilence));
        hermestravelwand = new LLexiconEntry("hermestravelwand", categoryExtra);
        hermestravelwand.setIcon(new ItemStack(com.meteor.extrabotany.common.item.ModItems.hermeswand));
        hermestravelwand.setLexiconPages(new PageText("0"), new PageCraftingRecipe("1", ModRecipe.hermes));
        valkyriecombatsuit = new LLexiconEntry("valkyriecombatsuit", categoryExtra);
        valkyriecombatsuit.setIcon(new ItemStack(com.meteor.extrabotany.common.item.ModItems.valkyriecombatuniform));
        valkyriecombatsuit.setLexiconPages(new PageText("0"), new PageCraftingRecipe("1", ModRecipe.valkyie));
        gaia3 = new ELexiconEntry("gaia3", categoryExtra);
        gaia3.setIcon(new ItemStack(Item.getItemFromBlock(ModBlocks.pylon), 1, 2));
        gaia3.setLexiconPages(new PageText("0"), new PageText("1"), new PageMultiblock("3", ModMultiBlocks.gaia), new PageText("2"));
        gaia3.setPriority();
        exmachina = new ELexiconEntry("ExMachine", categoryExtra);
        exmachina.setIcon(new ItemStack(com.meteor.extrabotany.common.item.ModItems.awakearmcontrol));
        exmachina.setLexiconPages(new PageText("0"), new PageText("1"), new PageEntity("2", "ExtraBotania.exmachine", 80), new PageMultiblock("3", ModMultiBlocks.gaia), new PageText("4"));
        auracontroler = new LLexiconEntry("auracontoler", categoryExtra);
        auracontroler.setIcon(new ItemStack(Item.getItemFromBlock(com.meteor.extrabotany.common.block.ModBlocks.auracontroler)));
        auracontroler.setLexiconPages(new PageText("0"), new PageCraftingRecipe("2", ModRecipe.auracontroler), new PageText("3"), new PageText("4"), new PageText("5"));
        elfpool = new ELexiconEntry("elfpool", categoryExtra);
        elfpool.setIcon(new ItemStack(com.meteor.extrabotany.common.block.ModBlocks.elfpool));
        elfpool.setLexiconPages(new PageText("0"), new PageCraftingRecipe("1", ModRecipe.elfpool));
        topserver = new DLexiconEntry("topserver", categoryExtra);
        topserver.setIcon(new ItemStack(com.meteor.extrabotany.common.block.ModBlocks.blockelfirium));
        elfarmor = new LLexiconEntry("elfarmor", categoryExtra);
        elfarmor.setIcon(new ItemStack(com.meteor.extrabotany.common.item.ModItems.awakeogchest));
        elfarmor.setLexiconPages(new PageText("0"), new PageText("1"), new PageText("2"), new PageText("3"), new PageText("4"), new PageText("5"), new PageText("6"), new PageText("7"));
        elfpick = new LLexiconEntry("elfpick", categoryExtra);
        elfpick.setIcon(new ItemStack(com.meteor.extrabotany.common.item.ModItems.awakepick));
        elfpick.setLexiconPages(new PageText("0"), new PageDisplay("1", new ItemStack(com.meteor.extrabotany.common.item.ModItems.awakepick)));
    }
}
