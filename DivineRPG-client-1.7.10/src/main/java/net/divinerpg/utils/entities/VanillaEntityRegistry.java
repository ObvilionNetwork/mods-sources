/*
 * Decompiled with CFR 0.152.
 */
package net.divinerpg.utils.entities;

import net.divinerpg.entities.base.EntityDivineArrow;
import net.divinerpg.entities.vanilla.EntityAncientEntity;
import net.divinerpg.entities.vanilla.EntityAridWarrior;
import net.divinerpg.entities.vanilla.EntityAyeracoBlue;
import net.divinerpg.entities.vanilla.EntityAyeracoGreen;
import net.divinerpg.entities.vanilla.EntityAyeracoPurple;
import net.divinerpg.entities.vanilla.EntityAyeracoRed;
import net.divinerpg.entities.vanilla.EntityAyeracoYellow;
import net.divinerpg.entities.vanilla.EntityCaveCrawler;
import net.divinerpg.entities.vanilla.EntityCaveclops;
import net.divinerpg.entities.vanilla.EntityCrab;
import net.divinerpg.entities.vanilla.EntityCyclops;
import net.divinerpg.entities.vanilla.EntityDesertCrawler;
import net.divinerpg.entities.vanilla.EntityEhu;
import net.divinerpg.entities.vanilla.EntityEnderSpider;
import net.divinerpg.entities.vanilla.EntityEnderTriplets;
import net.divinerpg.entities.vanilla.EntityEnderWatcher;
import net.divinerpg.entities.vanilla.EntityEnthralledDramcryx;
import net.divinerpg.entities.vanilla.EntityFrost;
import net.divinerpg.entities.vanilla.EntityGlacon;
import net.divinerpg.entities.vanilla.EntityGrizzle;
import net.divinerpg.entities.vanilla.EntityHellPig;
import net.divinerpg.entities.vanilla.EntityHellSpider;
import net.divinerpg.entities.vanilla.EntityHusk;
import net.divinerpg.entities.vanilla.EntityJackOMan;
import net.divinerpg.entities.vanilla.EntityJungleBat;
import net.divinerpg.entities.vanilla.EntityJungleDramcryx;
import net.divinerpg.entities.vanilla.EntityJungleSpider;
import net.divinerpg.entities.vanilla.EntityKingCrab;
import net.divinerpg.entities.vanilla.EntityKingOfScorchers;
import net.divinerpg.entities.vanilla.EntityKobblin;
import net.divinerpg.entities.vanilla.EntityLiopleurodon;
import net.divinerpg.entities.vanilla.EntityLivestockMerchant;
import net.divinerpg.entities.vanilla.EntityMiner;
import net.divinerpg.entities.vanilla.EntityPumpkinSpider;
import net.divinerpg.entities.vanilla.EntityRainbour;
import net.divinerpg.entities.vanilla.EntityRotatick;
import net.divinerpg.entities.vanilla.EntitySaguaroWorm;
import net.divinerpg.entities.vanilla.EntityScorcher;
import net.divinerpg.entities.vanilla.EntityShark;
import net.divinerpg.entities.vanilla.EntitySmelter;
import net.divinerpg.entities.vanilla.EntitySnapper;
import net.divinerpg.entities.vanilla.EntityStoneGolem;
import net.divinerpg.entities.vanilla.EntityTheEye;
import net.divinerpg.entities.vanilla.EntityTheGrue;
import net.divinerpg.entities.vanilla.EntityTheWatcher;
import net.divinerpg.entities.vanilla.EntityWhale;
import net.divinerpg.entities.vanilla.EntityWildfire;
import net.divinerpg.entities.vanilla.projectile.EntityCaveRock;
import net.divinerpg.entities.vanilla.projectile.EntityCorruptedBullet;
import net.divinerpg.entities.vanilla.projectile.EntityDeath;
import net.divinerpg.entities.vanilla.projectile.EntityEnderTripletFireball;
import net.divinerpg.entities.vanilla.projectile.EntityFrostShot;
import net.divinerpg.entities.vanilla.projectile.EntityKingOfScorchersMeteor;
import net.divinerpg.entities.vanilla.projectile.EntityKingOfScorchersShot;
import net.divinerpg.entities.vanilla.projectile.EntitySaguaroWormShot;
import net.divinerpg.entities.vanilla.projectile.EntityScorcherShot;
import net.divinerpg.entities.vanilla.projectile.EntityShooterBullet;
import net.divinerpg.entities.vanilla.projectile.EntityVileStorm;
import net.divinerpg.entities.vanilla.projectile.EntityWatcherShot;
import net.divinerpg.utils.Util;

public class VanillaEntityRegistry {
    public static void init() {
        Util.registerProjectile(EntityVileStorm.class, "VileStorm");
        Util.registerProjectile(EntityDeath.class, "Death");
        Util.registerProjectile(EntityKingOfScorchersShot.class, "KOSShot");
        Util.registerProjectile(EntityKingOfScorchersMeteor.class, "KOSMeteor");
        Util.registerProjectile(EntityCaveRock.class, "CaveRock");
        Util.registerProjectile(EntityWatcherShot.class, "WatcherShot");
        Util.registerProjectile(EntityFrostShot.class, "FrostShot");
        Util.registerProjectile(EntityScorcherShot.class, "ScorcherShot");
        Util.registerProjectile(EntityCorruptedBullet.class, "CorruptedBullet");
        Util.registerProjectile(EntityDivineArrow.class, "DivineArrow");
        Util.registerProjectile(EntityEnderTripletFireball.class, "TripletFireball");
        Util.registerProjectile(EntityShooterBullet.class, "Bullet");
        Util.registerProjectile(EntitySaguaroWormShot.class, "SaguaroWorm");
        Util.registerDivineRPGMob(EntityEnderWatcher.class, "EnderWatcher");
        Util.registerDivineRPGMob(EntityCrab.class, "Crab");
        Util.registerDivineRPGMob(EntityMiner.class, "UndeadMiner");
        Util.registerDivineRPGMob(EntityKingCrab.class, "KingCrab");
        Util.registerDivineRPGMob(EntityDesertCrawler.class, "DesertCrawler");
        Util.registerDivineRPGMob(EntityCaveCrawler.class, "CaveCrawler");
        Util.registerDivineRPGMob(EntityJungleDramcryx.class, "JungleDramcryx");
        Util.registerDivineRPGMob(EntityJungleSpider.class, "JungleSpider");
        Util.registerDivineRPGMob(EntityCyclops.class, "Cyclops");
        Util.registerDivineRPGMob(EntityCaveclops.class, "Caveclops");
        Util.registerDivineRPGMob(EntityAncientEntity.class, "AncientEntity");
        Util.registerDivineRPGMob(EntityWhale.class, "Whale");
        Util.registerDivineRPGMob(EntityHellSpider.class, "HellSpider");
        Util.registerDivineRPGMob(EntityScorcher.class, "Scorcher");
        Util.registerDivineRPGMob(EntityEnderSpider.class, "EnderSpider");
        Util.registerDivineRPGMob(EntityEnderTriplets.class, "EnderTriplets");
        Util.registerDivineRPGMob(EntityAridWarrior.class, "AridWarrior");
        Util.registerDivineRPGMob(EntityAyeracoBlue.class, "AyeracoBlue");
        Util.registerDivineRPGMob(EntityAyeracoGreen.class, "AyeracoGreen");
        Util.registerDivineRPGMob(EntityAyeracoPurple.class, "AyeracoPurple");
        Util.registerDivineRPGMob(EntityAyeracoRed.class, "AyeracoRed");
        Util.registerDivineRPGMob(EntityAyeracoYellow.class, "AyeracoYellow");
        Util.registerDivineRPGMob(EntityEnthralledDramcryx.class, "EnthralledDramcryx");
        Util.registerDivineRPGMob(EntityTheEye.class, "TheEye");
        Util.registerDivineRPGMob(EntityFrost.class, "Frost");
        Util.registerDivineRPGMob(EntityKingOfScorchers.class, "KingOfScorchers");
        Util.registerDivineRPGMob(EntityRainbour.class, "Rainbour");
        Util.registerDivineRPGMob(EntityRotatick.class, "Rotatick");
        Util.registerDivineRPGMob(EntityShark.class, "Shark");
        Util.registerDivineRPGMob(EntityTheWatcher.class, "TheWatcher");
        Util.registerDivineRPGMob(EntityWildfire.class, "Wildfire");
        Util.registerDivineRPGMob(EntityGlacon.class, "Glacon");
        Util.registerDivineRPGMob(EntityJackOMan.class, "JackOMan");
        Util.registerDivineRPGMob(EntityLivestockMerchant.class, "LivestockMerchant");
        Util.registerDivineRPGMob(EntityJungleBat.class, "JungleBat");
        Util.registerDivineRPGMob(EntityHellPig.class, "HellPig");
        Util.registerDivineRPGMob(EntityKobblin.class, "Kobblin");
        Util.registerDivineRPGMob(EntityTheGrue.class, "TheGrue");
        Util.registerDivineRPGMob(EntitySaguaroWorm.class, "SaguaroWorm");
        Util.registerDivineRPGMob(EntityPumpkinSpider.class, "PumpkinSpider");
        Util.registerDivineRPGMob(EntityLiopleurodon.class, "Liopleurodon");
        Util.registerEgglessMob(EntityEhu.class, "Ehu");
        Util.registerEgglessMob(EntityHusk.class, "Husk");
        Util.registerEgglessMob(EntityStoneGolem.class, "StoneGolem");
        Util.registerEgglessMob(EntitySmelter.class, "Smelter");
        Util.registerEgglessMob(EntityGrizzle.class, "Grizzle");
        Util.registerEgglessMob(EntitySnapper.class, "Snapper");
    }
}

