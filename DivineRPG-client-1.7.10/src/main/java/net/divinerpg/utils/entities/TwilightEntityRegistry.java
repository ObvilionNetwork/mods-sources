/*
 * Decompiled with CFR 0.152.
 */
package net.divinerpg.utils.entities;

import net.divinerpg.entities.twilight.EntityAngryBunny;
import net.divinerpg.entities.twilight.EntityApalachiaArcher;
import net.divinerpg.entities.twilight.EntityApalachiaCadillion;
import net.divinerpg.entities.twilight.EntityApalachiaGolem;
import net.divinerpg.entities.twilight.EntityApalachiaTomo;
import net.divinerpg.entities.twilight.EntityApalachiaWarrior;
import net.divinerpg.entities.twilight.EntityBaslisk;
import net.divinerpg.entities.twilight.EntityBehemoth;
import net.divinerpg.entities.twilight.EntityBunny;
import net.divinerpg.entities.twilight.EntityDensos;
import net.divinerpg.entities.twilight.EntityEdenCadillion;
import net.divinerpg.entities.twilight.EntityEdenCori;
import net.divinerpg.entities.twilight.EntityEdenTomo;
import net.divinerpg.entities.twilight.EntityEpiphite;
import net.divinerpg.entities.twilight.EntityEternalArcher;
import net.divinerpg.entities.twilight.EntityGreenfeet;
import net.divinerpg.entities.twilight.EntityKarot;
import net.divinerpg.entities.twilight.EntityMadivel;
import net.divinerpg.entities.twilight.EntityMage;
import net.divinerpg.entities.twilight.EntityMegalith;
import net.divinerpg.entities.twilight.EntityMoonWolf;
import net.divinerpg.entities.twilight.EntityMortumCadillion;
import net.divinerpg.entities.twilight.EntityMortumDemon;
import net.divinerpg.entities.twilight.EntityMystic;
import net.divinerpg.entities.twilight.EntityParticleBullet;
import net.divinerpg.entities.twilight.EntityReyvor;
import net.divinerpg.entities.twilight.EntitySamek;
import net.divinerpg.entities.twilight.EntitySkythernArcher;
import net.divinerpg.entities.twilight.EntitySkythernCori;
import net.divinerpg.entities.twilight.EntitySkythernFiend;
import net.divinerpg.entities.twilight.EntitySkythernGolem;
import net.divinerpg.entities.twilight.EntitySorcerer;
import net.divinerpg.entities.twilight.EntitySoulFiend;
import net.divinerpg.entities.twilight.EntitySoulSpider;
import net.divinerpg.entities.twilight.EntitySoulStealer;
import net.divinerpg.entities.twilight.EntitySpellbinder;
import net.divinerpg.entities.twilight.EntitySunArcher;
import net.divinerpg.entities.twilight.EntityTwilightArcher;
import net.divinerpg.entities.twilight.EntityTwilightDemon;
import net.divinerpg.entities.twilight.EntityVamacheron;
import net.divinerpg.entities.twilight.EntityVerek;
import net.divinerpg.entities.twilight.EntityWildwoodCadillion;
import net.divinerpg.entities.twilight.EntityWildwoodGolem;
import net.divinerpg.entities.twilight.EntityWildwoodTomo;
import net.divinerpg.entities.twilight.projectile.EntityCoriShot;
import net.divinerpg.entities.twilight.projectile.EntitySoulFiendProjectile;
import net.divinerpg.entities.twilight.projectile.EntityTwilightDemonShot;
import net.divinerpg.entities.twilight.projectile.EntityTwilightMageShot;
import net.divinerpg.utils.Util;

public class TwilightEntityRegistry {
    public static void init() {
        Util.registerProjectile(EntityCoriShot.class, "WeakCoriShot");
        Util.registerProjectile(EntityParticleBullet.class, "ParticleBullet");
        Util.registerProjectile(EntityTwilightDemonShot.class, "TwilightDemonShot");
        Util.registerProjectile(EntitySoulFiendProjectile.class, "SoulFiendShot");
        Util.registerProjectile(EntityTwilightMageShot.class, "TwilightMageShot");
        Util.registerDivineRPGMob(EntityEdenCadillion.class, "EdenCadillion");
        Util.registerDivineRPGMob(EntityEdenTomo.class, "EdenTomo");
        Util.registerDivineRPGMob(EntityBunny.class, "Bunny");
        Util.registerDivineRPGMob(EntityAngryBunny.class, "AngryBunny");
        Util.registerDivineRPGMob(EntityEdenCori.class, "WeakCori");
        Util.registerDivineRPGMob(EntityMadivel.class, "Madivel");
        Util.registerDivineRPGMob(EntityGreenfeet.class, "Greenfeet");
        Util.registerDivineRPGMob(EntitySunArcher.class, "SunArcher");
        Util.registerDivineRPGMob(EntityWildwoodGolem.class, "WildwoodGolem");
        Util.registerDivineRPGMob(EntityWildwoodTomo.class, "WildwoodTomo");
        Util.registerDivineRPGMob(EntityWildwoodCadillion.class, "WildwoodCadillion");
        Util.registerDivineRPGMob(EntityEpiphite.class, "Epiphite");
        Util.registerDivineRPGMob(EntityBehemoth.class, "Behemoth");
        Util.registerDivineRPGMob(EntityMage.class, "Mage");
        Util.registerDivineRPGMob(EntitySpellbinder.class, "Spellbinder");
        Util.registerDivineRPGMob(EntityMystic.class, "Mystic");
        Util.registerDivineRPGMob(EntitySorcerer.class, "Sorcerer");
        Util.registerDivineRPGMob(EntityVerek.class, "Verek");
        Util.registerDivineRPGMob(EntityMoonWolf.class, "MoonWolf");
        Util.registerDivineRPGMob(EntityApalachiaCadillion.class, "ApalachiaCadillion");
        Util.registerDivineRPGMob(EntityApalachiaTomo.class, "ApalachiaTomo");
        Util.registerDivineRPGMob(EntityApalachiaGolem.class, "ApalachiaGolem");
        Util.registerDivineRPGMob(EntityApalachiaWarrior.class, "EnchantedWarrior");
        Util.registerDivineRPGMob(EntitySkythernArcher.class, "SkythernArcher");
        Util.registerDivineRPGMob(EntityApalachiaArcher.class, "EnchantedArcher");
        Util.registerDivineRPGMob(EntityTwilightArcher.class, "TwilightArcher");
        Util.registerDivineRPGMob(EntitySamek.class, "Samek");
        Util.registerDivineRPGMob(EntitySkythernGolem.class, "SkythernGolem");
        Util.registerDivineRPGMob(EntitySkythernCori.class, "SkythernCori");
        Util.registerDivineRPGMob(EntitySkythernFiend.class, "SkythernFiend");
        Util.registerDivineRPGMob(EntityMegalith.class, "Megalith");
        Util.registerDivineRPGMob(EntityMortumCadillion.class, "MortumCadillion");
        Util.registerDivineRPGMob(EntityMortumDemon.class, "DemonOfDarkness");
        Util.registerDivineRPGMob(EntityBaslisk.class, "Baslisk");
        Util.registerDivineRPGMob(EntitySoulStealer.class, "SoulStealer");
        Util.registerDivineRPGMob(EntityDensos.class, "Densos");
        Util.registerDivineRPGMob(EntityReyvor.class, "Reyvor");
        Util.registerDivineRPGMob(EntityTwilightDemon.class, "TwilightDemon");
        Util.registerDivineRPGMob(EntitySoulFiend.class, "SoulFiend");
        Util.registerDivineRPGMob(EntityVamacheron.class, "Vamacheron");
        Util.registerDivineRPGMob(EntityKarot.class, "Karot");
        Util.registerDivineRPGMob(EntityEternalArcher.class, "EternalArcher");
        Util.registerDivineRPGMob(EntitySoulSpider.class, "SoulSpider");
    }
}

