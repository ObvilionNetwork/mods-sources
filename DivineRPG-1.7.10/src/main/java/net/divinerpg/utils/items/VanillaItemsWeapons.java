/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.init.Blocks
 *  net.minecraft.init.Items
 *  net.minecraft.item.Item
 */
package net.divinerpg.utils.items;

import net.divinerpg.client.render.EntityResourceLocation;
import net.divinerpg.items.arcana.ItemArcanaSword;
import net.divinerpg.items.base.ItemAoeSword;
import net.divinerpg.items.base.ItemEnderFlameSword;
import net.divinerpg.items.base.ItemFastSword;
import net.divinerpg.items.base.ItemFullSword;
import net.divinerpg.items.base.ItemGriefDagger;
import net.divinerpg.items.base.ItemHealingSword;
import net.divinerpg.items.base.ItemHeritageSword;
import net.divinerpg.items.base.ItemHitHealSword;
import net.divinerpg.items.base.ItemMagmaDagger;
import net.divinerpg.items.base.ItemModBow;
import net.divinerpg.items.base.ItemModSword;
import net.divinerpg.items.base.ItemPoisonousSword;
import net.divinerpg.items.base.ItemProjectileShooter;
import net.divinerpg.items.base.ItemRegenerationDagger;
import net.divinerpg.items.base.ItemSlowingSword;
import net.divinerpg.items.base.ItemSpeedSword;
import net.divinerpg.items.base.ItemThrowable;
import net.divinerpg.items.vanilla.ItemAnchor;
import net.divinerpg.items.vanilla.ItemBurningSword;
import net.divinerpg.items.vanilla.ItemCorruptedCannon;
import net.divinerpg.items.vanilla.ItemScythe;
import net.divinerpg.items.vanilla.ItemSerenadeOfHealth;
import net.divinerpg.items.vanilla.ItemVileStorm;
import net.divinerpg.libs.Sounds;
import net.divinerpg.utils.Util;
import net.divinerpg.utils.items.ItemTestSword;
import net.divinerpg.utils.items.VanillaItemsOther;
import net.divinerpg.utils.material.ToolMaterialMod;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class VanillaItemsWeapons {
    private static EntityResourceLocation x;
    public static Item slimeSword;
    public static Item oceanKnife;
    public static Item aquaticMaul;
    public static Item arlemiteSword;
    public static Item bedrockSword;
    public static Item realmiteSword;
    public static Item rupeeSword;
    public static Item sandslash;
    public static Item divineSword;
    public static Item blueDivineSword;
    public static Item yellowDivineSword;
    public static Item grayDivineSword;
    public static Item redDivineSword;
    public static Item greenDivineSword;
    public static Item bedrockMaul;
    public static Item jungleKnife;
    public static Item jungleRapier;
    public static Item aquaticTrident;
    public static Item aquaticDagger;
    public static Item aquaton;
    public static Item sharkSword;
    public static Item deathBringer;
    public static Item crabclawMaul;
    public static Item poisonSaber;
    public static Item furyMaul;
    public static Item corruptedMaul;
    public static Item frostSword;
    public static Item infernoSword;
    public static Item bloodgemSword;
    public static Item moltenSword;
    public static Item scorchingSword;
    public static Item bluefireSword;
    public static Item enderSword;
    public static Item blueEnderSword;
    public static Item grayEnderSword;
    public static Item greenEnderSword;
    public static Item redEnderSword;
    public static Item yellowEnderSword;
    public static Item cyclopsianSword;
    public static Item flamingFury;
    public static Item dualClaw;
    public static Item terranDagger;
    public static Item terranKnife;
    public static Item terranMaul;
    public static Item aquatoothSword;
    public static Item aquatoothMaul;
    public static Item HeavySwordD;
    public static Item ironHeavySword;
    public static Item copperHeavySword;
    public static Item copperSword;
    public static Item amazoniteSword;
    public static Item nightmareSword;
    public static Item netheriumSword;
    public static Item godlySword;
    public static Item godlyDagger;
    public static Item adminSword;
    public static Item arcanaSword;
    public static Item lunaPresentSword;
    public static Item hitHealSword;
    public static Item impulseSword;
    public static Item lunaSoulSword;
    public static Item griefDagger;
    public static Item magmaDagger;
    public static Item poisonDagger;
    public static Item regenerationDagger;
    public static Item ironDagger;
    public static Item hunterBow;
    public static Item shadowBow;
    public static Item enderBow;
    public static Item bluefireBow;
    public static Item infernoBow;
    public static Item shuriken;
    public static Item vileStorm;
    public static Item scythe;
    public static Item frostCannon;
    public static Item cyclopsianStaff;
    public static Item maelstrom;
    public static Item crabAnchor;
    public static Item sharkAnchor;
    public static Item bowheadAnchor;
    public static Item liopleurodonAnchor;
    public static Item goldenFury;
    public static Item corruptedCannon;
    public static Item ghastCannon;
    public static Item crabclawCannon;
    public static Item bowheadCannon;
    public static Item serenadeOfHealth;
    public static Item serenadeStriker;
    public static Item serenadeOfDeath;
    public static Item serenadeOfInfusion;
    public static Item palavence;
    public static Item massivence;
    public static Item darkSword;
    public static Item lightSword;
    public static Item iceSword;
    public static Item enderFlameSword;
    public static Item heritageSword;

    public static void init() {
    }

    static {
        iceSword = new ItemTestSword(ToolMaterialMod.EnderFlame, "iceSword");
        enderFlameSword = new ItemEnderFlameSword("enderFlameSword", ToolMaterialMod.EnderFlame);
        heritageSword = new ItemHeritageSword("heritageSword", ToolMaterialMod.Heritage);
        darkSword = new ItemSpeedSword("darkSword", ToolMaterialMod.Dark, 18);
        lightSword = new ItemSpeedSword("lightSword", ToolMaterialMod.Light, 20);
        slimeSword = new ItemModSword(ToolMaterialMod.Slime, "slimeSword");
        oceanKnife = new ItemModSword(ToolMaterialMod.OceanKnife, "oceanKnife");
        aquaticMaul = new ItemModSword(ToolMaterialMod.AquaMaul, "aquaMaul");
        arlemiteSword = new ItemModSword(ToolMaterialMod.Arlemite, "arlemiteStabber");
        bedrockSword = new ItemModSword(ToolMaterialMod.Bedrock, "bedrockSword");
        realmiteSword = new ItemModSword(ToolMaterialMod.Realmite, "realmiteSword");
        rupeeSword = new ItemModSword(ToolMaterialMod.Rupee, "rupeeRapier");
        sandslash = new ItemModSword(ToolMaterialMod.Sandslash, "sandslash");
        divineSword = new ItemModSword(ToolMaterialMod.Divine, "divineSword");
        blueDivineSword = new ItemModSword(ToolMaterialMod.Divine, "blueDivineSword");
        yellowDivineSword = new ItemModSword(ToolMaterialMod.Divine, "yellowDivineSword");
        grayDivineSword = new ItemModSword(ToolMaterialMod.Divine, "grayDivineSword");
        redDivineSword = new ItemModSword(ToolMaterialMod.Divine, "redDivineSword");
        greenDivineSword = new ItemModSword(ToolMaterialMod.Divine, "greenDivineSword");
        bedrockMaul = new ItemModSword(ToolMaterialMod.BedrockMaul, "bedrockMaul");
        jungleKnife = new ItemPoisonousSword(ToolMaterialMod.JungleKnife, "jungleKnife", 2.5f);
        jungleRapier = new ItemPoisonousSword(ToolMaterialMod.JungleRapier, "jungleRapier", 4.0f);
        aquaticTrident = new ItemModSword(ToolMaterialMod.AquaTrident, "aquaticTrident");
        aquaticDagger = new ItemModSword(ToolMaterialMod.AquaDagger, "aquaticDagger");
        aquaton = new ItemModSword(ToolMaterialMod.Aquaton, "aquaton");
        sharkSword = new ItemModSword(ToolMaterialMod.Shark, "sharkSword");
        deathBringer = new ItemModSword(ToolMaterialMod.DeathBringer, "deathBringer");
        crabclawMaul = new ItemModSword(ToolMaterialMod.CrabclawMaul, "crabclawMaul");
        poisonSaber = new ItemPoisonousSword(ToolMaterialMod.PoisonSaber, "poisonSaber", 5.0f);
        furyMaul = new ItemModSword(ToolMaterialMod.FuryMaul, "furyMaul");
        corruptedMaul = new ItemModSword(ToolMaterialMod.CorruptedMaul, "corruptedMaul");
        frostSword = new ItemSlowingSword(ToolMaterialMod.Frost, "frostSword");
        infernoSword = new ItemBurningSword(ToolMaterialMod.Inferno, "infernoSword", 12);
        bloodgemSword = new ItemModSword(ToolMaterialMod.Bloodgem, "bloodgemSword");
        moltenSword = new ItemBurningSword(ToolMaterialMod.Molten, "moltenSword", 5);
        scorchingSword = new ItemModSword(ToolMaterialMod.Scorching, "scorchingSword");
        bluefireSword = new ItemModSword(ToolMaterialMod.Bluefire, "bluefireSword");
        enderSword = new ItemModSword(ToolMaterialMod.Ender, "enderSword");
        blueEnderSword = new ItemModSword(ToolMaterialMod.Ender, "blueEnderSword");
        grayEnderSword = new ItemModSword(ToolMaterialMod.Ender, "blackEnderSword");
        greenEnderSword = new ItemModSword(ToolMaterialMod.Ender, "greenEnderSword");
        redEnderSword = new ItemModSword(ToolMaterialMod.Ender, "redEnderSword");
        yellowEnderSword = new ItemModSword(ToolMaterialMod.Ender, "yellowEnderSword");
        cyclopsianSword = new ItemModSword(ToolMaterialMod.Cyclops, "cyclopsianSword");
        flamingFury = new ItemBurningSword(ToolMaterialMod.FlamingFury, "flamingFury", 15);
        dualClaw = new ItemModSword(ToolMaterialMod.DualClaw, "dualClaw");
        terranDagger = new ItemModSword(ToolMaterialMod.TerranDagger, "terranDagger");
        terranKnife = new ItemModSword(ToolMaterialMod.TerranKnife, "terranKnife");
        terranMaul = new ItemModSword(ToolMaterialMod.TerranMaul, "terranMaul");
        aquatoothSword = new ItemModSword(ToolMaterialMod.AquatoothSword, "aquatoothSword");
        aquatoothMaul = new ItemModSword(ToolMaterialMod.AquatoothMaul, "aquatoothMaul");
        HeavySwordD = new ItemModSword(ToolMaterialMod.HeavySwordD, "diamondHeavySword");
        ironHeavySword = new ItemModSword(ToolMaterialMod.ironHeavySword, "ironHeavySword");
        copperHeavySword = new ItemModSword(ToolMaterialMod.copperHeavySword, "copperHeavySword");
        copperSword = new ItemModSword(ToolMaterialMod.copperSword, "copperSword");
        amazoniteSword = new ItemModSword(ToolMaterialMod.amazonite, "amazoniteSword");
        nightmareSword = new ItemModSword(ToolMaterialMod.nightmareSword, "nightmareSword");
        netheriumSword = new ItemBurningSword(ToolMaterialMod.netherium, "netheriumSword", 3);
        godlySword = new ItemModSword(ToolMaterialMod.godly, "godlySword");
        godlyDagger = new ItemSpeedSword("godlyDagger", ToolMaterialMod.godlyDagger, 16);
        adminSword = new ItemModSword(ToolMaterialMod.admin, "adminSword");
        arcanaSword = new ItemArcanaSword("arcanaSword", ToolMaterialMod.arcana);
        lunaPresentSword = new ItemAoeSword("aoeSword", ToolMaterialMod.aoesword);
        hitHealSword = new ItemHitHealSword("hitHealSword", ToolMaterialMod.hitheal);
        impulseSword = new ItemFastSword("fastSword", ToolMaterialMod.fastsword);
        lunaSoulSword = new ItemFullSword("regenSword", ToolMaterialMod.regensword, 200, 2.5);
        griefDagger = new ItemGriefDagger("griefDagger", ToolMaterialMod.griefdagger);
        magmaDagger = new ItemMagmaDagger("magmaDagger", ToolMaterialMod.magmadagger);
        poisonDagger = new ItemPoisonousSword(ToolMaterialMod.poisondagger, "poisonDagger", 5.0f);
        regenerationDagger = new ItemRegenerationDagger("regenerationDagger", ToolMaterialMod.regenerationdagger);
        ironDagger = new ItemModSword(ToolMaterialMod.irondagger, "ironDagger");
        hunterBow = new ItemModBow("hunterBow", 2500, 7, 16, Items.arrow, "hunterArrow");
        shadowBow = new ItemModBow("shadowBow", 10000, 7, 16, 36000, Items.arrow, "shadowArrow");
        enderBow = new ItemModBow("enderBow", -1, 8, 20, "enderArrow");
        bluefireBow = new ItemModBow("bluefireBow", -1, 6, 15, "bluefireArrow");
        infernoBow = new ItemModBow("infernoBow", 10000, 9, 18, "infernoArrow");
        shuriken = new ItemThrowable("shuriken", 4.0f);
        vileStorm = new ItemVileStorm();
        scythe = new ItemScythe();
        frostCannon = new ItemProjectileShooter("frostCannon", 6.0f, Sounds.frostCannon.getPrefixedName(), Items.snowball, EntityResourceLocation.frostCannon.toString(), 15000, 0);
        cyclopsianStaff = new ItemProjectileShooter("cyclopsianStaff", 7.0f, Sounds.staff.getPrefixedName(), VanillaItemsOther.cyclopsEyeShards, 3000, 0);
        maelstrom = new ItemProjectileShooter("maelstrom", 12.0f, Sounds.ghastCannon.getPrefixedName(), EntityResourceLocation.maelstrom.toString(), 100, 0);
        crabAnchor = new ItemAnchor("crabAnchor", EntityResourceLocation.crabAnchor.toString(), 3.0f);
        sharkAnchor = new ItemAnchor("sharkAnchor", EntityResourceLocation.bowheadAnchor.toString(), 4.0f);
        bowheadAnchor = new ItemAnchor("bowheadAnchor", EntityResourceLocation.bowheadAnchor.toString(), 5.0f);
        liopleurodonAnchor = new ItemAnchor("liopleurodonAnchor", EntityResourceLocation.liopleurodonAnchor.toString(), 6.0f);
        goldenFury = new ItemProjectileShooter("goldenFury", 30.0f, Sounds.blitz.getPrefixedName(), Items.gold_nugget, -1, 0);
        corruptedCannon = new ItemCorruptedCannon("corruptedCannon");
        ghastCannon = new ItemProjectileShooter("ghastCannon", 16.0f, Sounds.ghastCannon.getPrefixedName(), EntityResourceLocation.ghastCannon.toString(), 100, 5);
        crabclawCannon = new ItemProjectileShooter("crabclawCannon", 12.0f, Sounds.ghastCannon.getPrefixedName(), Util.toItem(Blocks.cactus), EntityResourceLocation.crabAnchor.toString(), 1000, 3);
        bowheadCannon = new ItemProjectileShooter("bowheadCannon", 12.0f, Sounds.ghastCannon.getPrefixedName(), Util.toItem(Blocks.cactus), EntityResourceLocation.bowheadAnchor.toString(), 1000, 3);
        serenadeOfHealth = new ItemSerenadeOfHealth("serenadeOfHealth");
        palavence = new ItemHealingSword("palavence", ToolMaterialMod.Palavence, 0.7f);
        massivence = new ItemHealingSword("massivence", ToolMaterialMod.Massivence, 1.4f);
    }
}

