package com.yungnickyoung.minecraft.bettermineshafts.config;

import net.minecraftforge.common.ForgeConfigSpec;

public final class Configuration {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    public static final ForgeConfigSpec.ConfigValue<Double> mineshaftSpawnRate;
    public static final ForgeConfigSpec.ConfigValue<Integer> minY;
    public static final ForgeConfigSpec.ConfigValue<Integer> maxY;

    public static final ConfigOres ores;
    public static final ConfigSpawnRates spawnRates;

    static {
        BUILDER.push("YUNG's Better Mineshafts");

        mineshaftSpawnRate = BUILDER
            .worldRestart()
            .comment(" Default: .003")
            .define("Mineshaft Spawn Rate", .003);

        minY = BUILDER
            .worldRestart()
            .comment(
                " The lowest a mineshaft can spawn.\n" +
                " Default: 17")
            .define("Minimum y-coordinate", 17);

        maxY = BUILDER
            .worldRestart()
            .comment(
                " The highest the a mineshaft can spawn.\n" +
                "     Be careful, setting this too high may make mineshafts poke through ocean floors.\n" +
                " Default: 37")
            .define("Maximum y-coordinate", 37);


        ores = new ConfigOres(BUILDER);
        spawnRates = new ConfigSpawnRates(BUILDER);

        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}