/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.item.Item
 *  net.minecraft.potion.Potion
 */
package net.divinerpg.utils.items;

import net.divinerpg.blocks.base.BlockModCrop;
import net.divinerpg.items.arcana.ItemAquamarine;
import net.divinerpg.items.arcana.ItemArcanaPotion;
import net.divinerpg.items.arcana.ItemArcanaSeeds;
import net.divinerpg.items.arcana.ItemArcanaSpawnEgg;
import net.divinerpg.items.arcana.ItemArcaniteBlade;
import net.divinerpg.items.arcana.ItemArcaniteBlaster;
import net.divinerpg.items.arcana.ItemArcaniumSaber;
import net.divinerpg.items.arcana.ItemAttractor;
import net.divinerpg.items.arcana.ItemCaptainsSparkler;
import net.divinerpg.items.arcana.ItemChargedCollector;
import net.divinerpg.items.arcana.ItemDivineAccumulator;
import net.divinerpg.items.arcana.ItemEnderScepter;
import net.divinerpg.items.arcana.ItemFirefly;
import net.divinerpg.items.arcana.ItemGeneralsStaff;
import net.divinerpg.items.arcana.ItemGhostbane;
import net.divinerpg.items.arcana.ItemGrenade;
import net.divinerpg.items.arcana.ItemKey;
import net.divinerpg.items.arcana.ItemLaVekor;
import net.divinerpg.items.arcana.ItemMeriksMissile;
import net.divinerpg.items.arcana.ItemMeteorMash;
import net.divinerpg.items.arcana.ItemReflector;
import net.divinerpg.items.arcana.ItemShadowSword;
import net.divinerpg.items.arcana.ItemStaffEnrichment;
import net.divinerpg.items.arcana.ItemStaffStarlight;
import net.divinerpg.items.arcana.ItemStormSword;
import net.divinerpg.items.arcana.ItemWizardsBook;
import net.divinerpg.items.base.ItemDivineArmor;
import net.divinerpg.items.base.ItemMod;
import net.divinerpg.items.base.ItemModFood;
import net.divinerpg.items.base.ItemModSword;
import net.divinerpg.items.twilight.ItemTwilightSeeds;
import net.divinerpg.utils.blocks.ArcanaBlocks;
import net.divinerpg.utils.enums.ArmorInfo;
import net.divinerpg.utils.material.EnumArmor;
import net.divinerpg.utils.material.ToolMaterialMod;
import net.minecraft.item.Item;
import net.minecraft.potion.Potion;

public class ArcanaItems {
    public static final int HEAD = 0;
    public static final int BODY = 1;
    public static final int LEGS = 2;
    public static final int BOOTS = 3;
    public static Item dungeonTokens = new ItemMod("dungeonTokens");
    public static Item arcanium = new ItemMod("arcanium");
    public static Item staffStarlight = new ItemStaffStarlight("staffOfStarlight");
    public static Item starlight = new ItemStaffStarlight("starlight");
    public static Item stormSword = new ItemStormSword("stormSword", ToolMaterialMod.Storm);
    public static Item captainsSparkler = new ItemCaptainsSparkler("captainsSparkler");
    public static Item strongArcanaPotion = new ItemArcanaPotion("strongArcanaPotion", 200, 0);
    public static Item weakArcanaPotion = new ItemArcanaPotion("weakArcanaPotion", 100, 0);
    public static Item regenArcanaPotion = new ItemArcanaPotion("regenArcanaPotion", 100, 1);
    public static Item collector = new ItemMod("collector");
    public static Item chargedCollector = new ItemChargedCollector("chargedCollector");
    public static Item wizardBook = new ItemWizardsBook("wizardsBook");
    public static Item staffOfEnrichment = new ItemStaffEnrichment("staffOfEnrichment");
    public static Item meriksMissile = new ItemMeriksMissile("meriksMissile", 1, -1, 50);
    public static Item grenade = new ItemGrenade("grenade");
    public static Item firefly = new ItemFirefly();
    public static Item laVekor = new ItemLaVekor();
    public static Item enderScepter = new ItemEnderScepter("enderScepter");
    public static Item arcaniumSaber = new ItemArcaniumSaber("arcaniumSaber", ToolMaterialMod.Saber);
    public static Item wraithbane = new ItemGhostbane();
    public static Item reflector = new ItemReflector();
    public static Item shadowSword = new ItemShadowSword("shadowSaber", ToolMaterialMod.ShadowSaber);
    public static Item liviciaSword = new ItemModSword(ToolMaterialMod.LiviciaSword, "liviciaSword");
    public static Item meteorMash = new ItemMeteorMash();
    public static Item divineAccumulator = new ItemDivineAccumulator();
    public static Item arcaniteBlaster = new ItemArcaniteBlaster();
    public static Item arcaniteBlade = new ItemArcaniteBlade();
    public static Item generalsStaff = new ItemGeneralsStaff();
    public static Item attractor = new ItemAttractor();
    public static Item sludgeKey = new ItemKey("sludgeKey");
    public static Item ancientKey = new ItemKey("ancientKey");
    public static Item soulKey = new ItemKey("soulKey");
    public static Item golemSpawner = new ItemArcanaSpawnEgg("golemEgg");
    public static Item seimerSpawner = new ItemArcanaSpawnEgg("seimerEgg");
    public static Item paratikuSpawner = new ItemArcanaSpawnEgg("paratikuEgg");
    public static Item fyracryxSpawner = new ItemArcanaSpawnEgg("fyracryxEgg");
    public static Item hitchak = new ItemModFood(2, 3.0f, false, "hitchak");
    public static Item hitchakSeeds = new ItemArcanaSeeds("hitchakSeeds", (BlockModCrop)ArcanaBlocks.hitchak);
    public static Item veilo = new ItemMod("veilo");
    public static Item veiloSeeds = new ItemArcanaSeeds("veiloSeeds", (BlockModCrop)ArcanaBlocks.veilo);
    public static Item marsine = new ItemMod("marsine");
    public static Item marsineSeeds = new ItemArcanaSeeds("marsineSeeds", (BlockModCrop)ArcanaBlocks.marsine);
    public static Item firestock = new ItemMod("firestock");
    public static Item firestockSeeds = new ItemTwilightSeeds("firestockSeeds", ArcanaBlocks.firestock, ArcanaBlocks.arcanaGrass);
    public static Item pinfly = new ItemModFood(2, 0.3f, false, "pinfly").setPotionEffect(Potion.moveSpeed.id, 10, 2, 1.0f);
    public static Item pinflySeeds = new ItemTwilightSeeds("pinflySeeds", ArcanaBlocks.pinfly, ArcanaBlocks.arcanaGrass);
    public static Item aquamarine = new ItemAquamarine("aquamarine");
    public static Item aquamarineSeeds = new ItemArcanaSeeds("aquamarineSeeds", (BlockModCrop)ArcanaBlocks.aquamarine);
    public static Item eucalyptusSeeds = new ItemArcanaSeeds("eucalyptusRootSeeds", (BlockModCrop)ArcanaBlocks.eucalyptusRoot);
    public static Item arcanaCrystall = new ItemMod("arcanaCrystall");
    private static Object[] kormInfo = new Object[]{ArmorInfo.ARCANA_REGEN};
    public static Item kormaHelmet = new ItemDivineArmor(EnumArmor.KORMA, 0, kormInfo);
    public static Item kormaBody = new ItemDivineArmor(EnumArmor.KORMA, 1, kormInfo);
    public static Item kormaLegs = new ItemDivineArmor(EnumArmor.KORMA, 2, kormInfo);
    public static Item kormaBoots = new ItemDivineArmor(EnumArmor.KORMA, 3, kormInfo);
    private static Object[] vemInfo = new Object[]{ArmorInfo.HEALTH_REGEN};
    public static Item vemosHelmet = new ItemDivineArmor(EnumArmor.VEMOS, 0, "vemos", vemInfo);
    public static Item vemosBody = new ItemDivineArmor(EnumArmor.VEMOS, 1, "vemos", vemInfo);
    public static Item vemosLegs = new ItemDivineArmor(EnumArmor.VEMOS, 2, "vemos", vemInfo);
    public static Item vemosBoots = new ItemDivineArmor(EnumArmor.VEMOS, 3, "vemos", vemInfo);

    public static void init() {
    }
}

