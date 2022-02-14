/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraftforge.common.config.Configuration
 */
package net.divinerpg.utils.config;

import java.io.File;
import java.util.HashMap;
import net.minecraftforge.common.config.Configuration;

public class ConfigurationHelper {
    public static Configuration cfg;
    private static HashMap<String, Integer> configMap;
    public static boolean keepLoadingEden;
    public static boolean keepLoadingWildwood;
    public static boolean keepLoadingApalachia;
    public static boolean keepLoadingSkythern;
    public static boolean keepLoadingMortum;
    public static boolean keepLoadingVethea;
    public static boolean keepLoadingArcana;
    public static boolean keepLoadingIceika;
    public static boolean keepLoadingEuca;
    public static boolean keepLoadingBoiling;
    public static boolean keepLoadingLelyetia;
    public static boolean canShowOverlay;
    public static int eden;
    public static int wildwood;
    public static int apalachia;
    public static int skythern;
    public static int mortum;
    public static int vethea;
    public static int arcana;
    public static int iceika;
    public static int depths;
    public static int euca;
    public static int boiling;
    public static int lelyetia;
    public static int edenBiome;
    public static int wildwoodBiome;
    public static int apalachiaBiome;
    public static int skythernBiome;
    public static int mortumBiome;
    public static int vetheaBiome;
    public static int arcanaBiome;
    public static int iceikaBiome;
    public static int depthsBiome;
    public static int eucaBiome;
    public static int boilingBiome;
    public static int lelyetiaBiome;
    public static int arcanaX;
    public static int arcanaY;

    public static void init(File dir) {
        cfg = new Configuration(new File(dir, "DivineRPG.cfg"));
        cfg.load();
        ConfigurationHelper.dimensionInit();
        ConfigurationHelper.miscInit();
        cfg.save();
    }

    public static void dimensionInit() {
        edenBiome = cfg.get("Dimension", "Eden biome ID", 100).getInt();
        wildwoodBiome = cfg.get("Dimension", "Wildwood biome ID", 101).getInt();
        apalachiaBiome = cfg.get("Dimension", "Apalachia biome ID", 102).getInt();
        skythernBiome = cfg.get("Dimension", "Skythern biome ID", 103).getInt();
        mortumBiome = cfg.get("Dimension", "Mortum biome ID", 104).getInt();
        vetheaBiome = cfg.get("Dimension", "Vethea biome ID", 105).getInt();
        arcanaBiome = cfg.get("Dimension", "Arcana biome ID", 106).getInt();
        iceikaBiome = cfg.get("Dimension", "Iceika biome ID", 107).getInt();
        depthsBiome = cfg.get("Dimension", "Depths biome ID", 108).getInt();
        eucaBiome = cfg.get("Dimension", "Euca biome ID", 109).getInt();
        boilingBiome = cfg.get("Dimension", "Boiling biome ID", 110).getInt();
        lelyetiaBiome = cfg.get("Dimension", "Lelyetia biome ID", 111).getInt();
        eden = cfg.get("Dimension", "Eden dimension ID", 50).getInt();
        wildwood = cfg.get("Dimension", "Wildwood dimension ID", 51).getInt();
        apalachia = cfg.get("Dimension", "Apalachia dimension ID", 52).getInt();
        skythern = cfg.get("Dimension", "Skythern dimension ID", 53).getInt();
        mortum = cfg.get("Dimension", "Mortum dimension ID", 54).getInt();
        vethea = cfg.get("Dimension", "Vethea dimension ID", 55).getInt();
        arcana = cfg.get("Dimension", "Arcana dimension ID", 56).getInt();
        iceika = cfg.get("Dimension", "Iceika dimension ID", 57).getInt();
        euca = cfg.get("Dimension", "Euca dimension ID", 58).getInt();
        boiling = cfg.get("Dimension", "Boiling dimension ID", 59).getInt();
        lelyetia = cfg.get("Dimension", "Lelyetia dimension ID", 60).getInt();
        keepLoadingEden = cfg.get("Dimension", "Keep loading Eden", false).getBoolean(true);
        keepLoadingWildwood = cfg.get("Dimension", "Keep loading The Wildwood", false).getBoolean(true);
        keepLoadingApalachia = cfg.get("Dimension", "Keep loading Apalachia", false).getBoolean(true);
        keepLoadingSkythern = cfg.get("Dimension", "Keep loading Skythern", false).getBoolean(true);
        keepLoadingMortum = cfg.get("Dimension", "Keep loading Mortum", false).getBoolean(true);
        keepLoadingVethea = cfg.get("Dimension", "Keep loading Vethea", false).getBoolean(true);
        keepLoadingArcana = cfg.get("Dimension", "Keep loading Arcana", false).getBoolean(true);
        keepLoadingIceika = cfg.get("Dimension", "Keep loading Iceika", false).getBoolean(true);
        keepLoadingEuca = cfg.get("Dimension", "Keep loading Euca", false).getBoolean(true);
        keepLoadingBoiling = cfg.get("Dimension", "Keep loading Boiling", false).getBoolean(true);
        keepLoadingLelyetia = cfg.get("Dimension", "Keep loading Lelyetia", false).getBoolean(true);
    }

    public static void miscInit() {
        canShowOverlay = cfg.get("GUI", "Can show overlay in top left corner or debug screen", true).getBoolean(true);
        arcanaX = cfg.get("GUI", "Arcana Bar X", 111).getInt();
        arcanaY = cfg.get("GUI", "Arcana Bar Y", 18).getInt();
    }

    public static int getConfig(String name) {
        return configMap.get(name);
    }

    static {
        configMap = new HashMap();
    }
}

