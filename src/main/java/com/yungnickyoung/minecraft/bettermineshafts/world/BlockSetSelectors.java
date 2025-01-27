package com.yungnickyoung.minecraft.bettermineshafts.world;

import com.yungnickyoung.minecraft.yungsapi.world.BlockSetSelector;
import net.minecraft.block.Blocks;

public class BlockSetSelectors {
    /**
     * Main theme blocks.
     */
    public static BlockSetSelector NORMAL = new BlockSetSelector(Blocks.OAK_PLANKS.getDefaultState())
        .addBlock(Blocks.COBBLESTONE.getDefaultState(), 0.1f)
        .addBlock(Blocks.STONE_BRICKS.getDefaultState(), 0.1f)
        .addBlock(Blocks.MOSSY_STONE_BRICKS.getDefaultState(), 0.1f)
        .addBlock(Blocks.CRACKED_STONE_BRICKS.getDefaultState(), 0.1f)
        .addBlock(Blocks.CAVE_AIR.getDefaultState(), 0.2f);

    public static BlockSetSelector MESA = new BlockSetSelector(Blocks.DARK_OAK_PLANKS.getDefaultState())
        .addBlock(Blocks.BROWN_TERRACOTTA.getDefaultState(), 0.05f)
        .addBlock(Blocks.ORANGE_TERRACOTTA.getDefaultState(), 0.05f)
        .addBlock(Blocks.YELLOW_TERRACOTTA.getDefaultState(), 0.05f)
        .addBlock(Blocks.WHITE_TERRACOTTA.getDefaultState(), 0.05f)
        .addBlock(Blocks.STONE_BRICKS.getDefaultState(), 0.1f)
        .addBlock(Blocks.MOSSY_STONE_BRICKS.getDefaultState(), 0.1f)
        .addBlock(Blocks.CRACKED_STONE_BRICKS.getDefaultState(), 0.1f)
        .addBlock(Blocks.CAVE_AIR.getDefaultState(), 0.2f);

    public static BlockSetSelector JUNGLE = new BlockSetSelector(Blocks.JUNGLE_PLANKS.getDefaultState())
        .addBlock(Blocks.MOSSY_COBBLESTONE.getDefaultState(), 0.1f)
        .addBlock(Blocks.STONE_BRICKS.getDefaultState(), 0.05f)
        .addBlock(Blocks.MOSSY_STONE_BRICKS.getDefaultState(), 0.2f)
        .addBlock(Blocks.CRACKED_STONE_BRICKS.getDefaultState(), 0.05f)
        .addBlock(Blocks.CHISELED_STONE_BRICKS.getDefaultState(), 0.05f)
        .addBlock(Blocks.CAVE_AIR.getDefaultState(), 0.2f);

    public static BlockSetSelector SNOW = new BlockSetSelector(Blocks.SPRUCE_PLANKS.getDefaultState())
        .addBlock(Blocks.SNOW_BLOCK.getDefaultState(), .25f)
        .addBlock(Blocks.PACKED_ICE.getDefaultState(), .1f)
        .addBlock(Blocks.BLUE_ICE.getDefaultState(), .1f)
        .addBlock(Blocks.COBBLESTONE.getDefaultState(), 0.05f)
        .addBlock(Blocks.CRACKED_STONE_BRICKS.getDefaultState(), 0.1f)
        .addBlock(Blocks.CAVE_AIR.getDefaultState(), 0.2f);

    public static BlockSetSelector ICE = new BlockSetSelector(Blocks.PACKED_ICE.getDefaultState())
        .addBlock(Blocks.BLUE_ICE.getDefaultState(), .4f)
        .addBlock(Blocks.SNOW_BLOCK.getDefaultState(), 0.1f)
        .addBlock(Blocks.CAVE_AIR.getDefaultState(), 0.1f);

    public static BlockSetSelector DESERT = new BlockSetSelector(Blocks.SANDSTONE.getDefaultState())
        .addBlock(Blocks.SAND.getDefaultState(), 0.3f)
        .addBlock(Blocks.CHISELED_SANDSTONE.getDefaultState(), 0.1f)
        .addBlock(Blocks.CUT_SANDSTONE.getDefaultState(), 0.1f)
        .addBlock(Blocks.SMOOTH_SANDSTONE.getDefaultState(), 0.1f)
        .addBlock(Blocks.STONE_BRICKS.getDefaultState(), 0.05f)
        .addBlock(Blocks.CRACKED_STONE_BRICKS.getDefaultState(), 0.05f)
        .addBlock(Blocks.CAVE_AIR.getDefaultState(), 0.2f);

    public static BlockSetSelector RED_DESERT = new BlockSetSelector(Blocks.RED_SANDSTONE.getDefaultState())
        .addBlock(Blocks.RED_SAND.getDefaultState(), 0.3f)
        .addBlock(Blocks.CHISELED_RED_SANDSTONE.getDefaultState(), 0.1f)
        .addBlock(Blocks.CUT_RED_SANDSTONE.getDefaultState(), 0.1f)
        .addBlock(Blocks.SMOOTH_RED_SANDSTONE.getDefaultState(), 0.1f)
        .addBlock(Blocks.STONE_BRICKS.getDefaultState(), 0.05f)
        .addBlock(Blocks.CRACKED_STONE_BRICKS.getDefaultState(), 0.05f)
        .addBlock(Blocks.CAVE_AIR.getDefaultState(), 0.2f);

    public static BlockSetSelector MUSHROOM = new BlockSetSelector()
        .addBlock(Blocks.MUSHROOM_STEM.getDefaultState(), .33333f)
        .addBlock(Blocks.BROWN_MUSHROOM_BLOCK.getDefaultState(), .33333f)
        .addBlock(Blocks.RED_MUSHROOM_BLOCK.getDefaultState(), .33333f);

    public static BlockSetSelector ACACIA = new BlockSetSelector(Blocks.ACACIA_PLANKS.getDefaultState())
        .addBlock(Blocks.COBBLESTONE.getDefaultState(), 0.1f)
        .addBlock(Blocks.STONE_BRICKS.getDefaultState(), 0.1f)
        .addBlock(Blocks.MOSSY_STONE_BRICKS.getDefaultState(), 0.1f)
        .addBlock(Blocks.CRACKED_STONE_BRICKS.getDefaultState(), 0.1f)
        .addBlock(Blocks.CAVE_AIR.getDefaultState(), 0.2f);

    /**
     * Stone brick blocks.
     */
    public static BlockSetSelector STONE_BRICK_NORMAL = new BlockSetSelector()
        .addBlock(Blocks.STONE_BRICKS.getDefaultState(), 0.33333f)
        .addBlock(Blocks.MOSSY_STONE_BRICKS.getDefaultState(), 0.33333f)
        .addBlock(Blocks.CRACKED_STONE_BRICKS.getDefaultState(), 0.33333f);

    public static BlockSetSelector STONE_BRICK_JUNGLE = new BlockSetSelector()
        .addBlock(Blocks.STONE_BRICKS.getDefaultState(), .25f)
        .addBlock(Blocks.MOSSY_STONE_BRICKS.getDefaultState(), .25f)
        .addBlock(Blocks.CRACKED_STONE_BRICKS.getDefaultState(), .25f)
        .addBlock(Blocks.CHISELED_STONE_BRICKS.getDefaultState(), .25f);

    public static BlockSetSelector STONE_BRICK_SNOW = new BlockSetSelector()
        .addBlock(Blocks.SNOW_BLOCK.getDefaultState(), .5f)
        .addBlock(Blocks.PACKED_ICE.getDefaultState(), .25f)
        .addBlock(Blocks.BLUE_ICE.getDefaultState(), .25f);

    public static BlockSetSelector STONE_BRICK_ICE = new BlockSetSelector()
        .addBlock(Blocks.PACKED_ICE.getDefaultState(), .5f)
        .addBlock(Blocks.BLUE_ICE.getDefaultState(), .5f);

    public static BlockSetSelector STONE_BRICK_DESERT = new BlockSetSelector()
        .addBlock(Blocks.SAND.getDefaultState(), .25f)
        .addBlock(Blocks.SANDSTONE.getDefaultState(), .25f)
        .addBlock(Blocks.SMOOTH_SANDSTONE.getDefaultState(), .2f)
        .addBlock(Blocks.CUT_SANDSTONE.getDefaultState(), .2f)
        .addBlock(Blocks.CHISELED_SANDSTONE.getDefaultState(), .1f);

    public static BlockSetSelector STONE_BRICK_RED_DESERT = new BlockSetSelector()
        .addBlock(Blocks.RED_SAND.getDefaultState(), .25f)
        .addBlock(Blocks.RED_SANDSTONE.getDefaultState(), .25f)
        .addBlock(Blocks.SMOOTH_RED_SANDSTONE.getDefaultState(), .2f)
        .addBlock(Blocks.CUT_RED_SANDSTONE.getDefaultState(), .2f)
        .addBlock(Blocks.CHISELED_RED_SANDSTONE.getDefaultState(), .1f);

    public static BlockSetSelector STONE_BRICK_MUSHROOM = new BlockSetSelector()
        .addBlock(Blocks.MUSHROOM_STEM.getDefaultState(), .33333f)
        .addBlock(Blocks.BROWN_MUSHROOM_BLOCK.getDefaultState(), .33333f)
        .addBlock(Blocks.RED_MUSHROOM_BLOCK.getDefaultState(), .33333f);
}
