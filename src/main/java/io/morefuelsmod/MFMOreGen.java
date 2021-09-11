package io.morefuelsmod;

import io.morefuelsmod.block.ModBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.template.RuleTest;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.TopSolidRangeConfig;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;

public class MFMOreGen {
    public static void generateOres(final BiomeLoadingEvent event){
        if(!(event.getCategory().equals(Biome.Category.NETHER) && event.getCategory().equals(Biome.Category.THEEND))){
            generateOre(
                    event.getGeneration(),
                    OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                    ModBlocks.BLOCK_BITUMINOUS_COAL_ORE.get().getBlock().defaultBlockState(),
                    4, // Vein Size
                    1, // Min height
                    128, // Max Height
                    30 // 'amount' - not 100% sure what this does, but i think it's similar to chunk frequency from 1.15.2 and before
            );
            generateOre(
                    event.getGeneration(),
                    OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                    ModBlocks.BLOCK_LAVA_ORE.get().getBlock().defaultBlockState(),
                    2,
                    1,
                    30,
                    15
            );
        }
        else if(event.getCategory().equals(Biome.Category.NETHER)){
            generateOre(
                    event.getGeneration(),
                    OreFeatureConfig.FillerBlockType.NETHERRACK,
                    ModBlocks.BLOCK_LAVA_ORE.get().getBlock().defaultBlockState(),
                    3,
                    1,
                    128,
                    15
            );
        }
    }

    private static void generateOre(BiomeGenerationSettingsBuilder settings, RuleTest fillerType, BlockState state, int veinSize, int minHeight, int maxHeight, int amount){
        settings.addFeature(
                GenerationStage.Decoration.UNDERGROUND_ORES,
                Feature.ORE.configured(
                        new OreFeatureConfig(
                                fillerType,
                                state,
                                veinSize)
                )
                        .decorated(
                                Placement.RANGE.configured(
                                        new TopSolidRangeConfig(
                                                minHeight,
                                                0,
                                                maxHeight)
                                ).squared()
                                        .count(amount)
                        )
        );
    }

}
