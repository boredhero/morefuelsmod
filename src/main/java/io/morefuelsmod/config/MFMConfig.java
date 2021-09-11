package io.morefuelsmod.config;

/*
 * Credit to Cadiboo on the file
 * Source: https://gist.github.com/Cadiboo/f0a2d9c103e7d9aefa8b03d571390f82
 */

import org.apache.commons.lang3.tuple.Pair;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.common.ForgeConfigSpec.BooleanValue;
import net.minecraftforge.common.ForgeConfigSpec.Builder;
import net.minecraftforge.common.ForgeConfigSpec.ConfigValue;

import io.morefuelsmod.common.Defines;

public class MFMConfig {

	public static final Common COMMON;
	public static final ForgeConfigSpec COMMON_SPEC;
	static {
		final Pair<Common, ForgeConfigSpec> specPair = new Builder().configure(Common::new);
        COMMON_SPEC = specPair.getRight();
        COMMON = specPair.getLeft();
	}
	    // DISABLED DUE TO NEW JSON ORE GEN SYSTEM
        //public static boolean enableBituminousGeneration;
        //public static boolean enableLavaOreNetherGeneration;
        //public static boolean enableLavaOreOverworldGeneration;
        //Enable/Disable Vanilla Fuel Tweaks
        public static boolean enablePlanksTweak, enableSlabsTweak, enableMushroomBlockTweak, enableWoodSignTweak, enableWoodButtonTweak, enableWoodFenceTweak, 
        enableWoodStairsTweak, enableWoodTrapdoorTweak, enableWoodDoorTweak, enableBoatTweak, enableStickTweak, enableBowlTweak, enableCoalBlockTweak, enableScaffoldingTweak, 
        enableLoomTweak, enableBookshelfTweak, enableLecternTweak, enableComposterTweak, enableChestTweak, enableTrappedChestTweak, enableBarrelTweak, enableJukeboxTweak, 
        enableNoteBlockTweak, enableBowTweak, enableFishingRodTweak, enableLadderTweak, enableWoodenPickaxeTweak, enableWoodenHoeTweak, enableWoodenAxeTweak, 
        enableWoodenShovelTweak, enableWoodenSwordTweak, enableBannerTweak, enableCarpetTweak, enableCartographyTableTweak;
        //Enable/Disable vanilla fuel items
        public static boolean enableBedFuel, enableLeavesFuel, enableStringFuel, enableFeatherFuel, enablePaintingFuel, enablePaperFuel, enableBooksFuel, 
        enableArmorStandFuel, enableShieldFuel, enableCampfireFuel, enableItemFrameFuel, enableChestMinecartFuel, enableDriedKelpItemFuel, 
        enableDaylightDetectorFuel, enableLeverFuel, enableCarrotOnAStickFuel, enableTripwireHookFuel, enableSpongeFuel, enableCobwebFuel, enableTorchFuel, 
        enableRedstoneTorchFuel, enablePurpurBlocksFuel, enablePurpurSlabFuel, enablePurpurStairsFuel, enableEndRodFuel, enableBlazePowderFuel, enableChorusItemsFuel, 
        enablePistonFuels, enableBannerPatternFuels, enableMapsFuels, enableBeeHiveFuel;

        //Lets let them change the numbers....why not...
        public static int planks, slabs, sticks, bowl, wood_door, boat, scaffolding, wood_fence, wood_stairs, wood_trapdoor,
        cartography_table, loom, bookshelf, lectern, composter, chest, trapped_chest, barrel, daylight_detector, jukebox, note_block,
        banner, bow, fishing_rod, ladder, wooden_button, wooden_pickaxe, wooden_shovel, wooden_hoe, wooden_axe, wooden_sword, wooden_sign, carpet, 
        block_of_coal, 
        //Now lets get onto adding new items as fuel
        leaves, tripwire_hook, dry_sponge, piston, cobweb, torch, redstone_torch, chorus, purpur_block_pillar, purpur_slab, purpur_stairs, end_rod, lever,
        mushroom_block, string, feather, painting, paper, books, minecart_with_chest, bed, dried_kelp, blaze_powder, item_frame, map, carrot_on_a_stick,
        armor_stand, shield, banner_pattern, campfire, beehive,
        //And lastly...modded fuel items...
        dried_plant, dried_plant_block, bituminous_coal, bituminous_coal_block, coke, coke_block, lava_orb, can_of_slimoline, coal_dust,
        infinite_creative_fuel;


        public static void bakeConfig() {
                // DISABLED DUE TO NEW JSON ORE SYSTEM
                //enableBituminousGeneration = COMMON.enableBituminousGeneration.get();
                //enableLavaOreNetherGeneration = COMMON.enableLavaOreNetherGeneration.get();
                //enableLavaOreOverworldGeneration = COMMON.enableLavaOreOverworldGeneration.get();
                //Enable/Disable Vanilla Fuels Tweaks
                enablePlanksTweak = COMMON.enablePlanksTweak.get(); enableSlabsTweak = COMMON.enableSlabsTweak.get(); enableMushroomBlockTweak = COMMON.enableMushroomBlockTweak.get();
                enableWoodSignTweak = COMMON.enableWoodSignTweak.get(); enableWoodButtonTweak = COMMON.enableWoodButtonTweak.get(); enableWoodFenceTweak = COMMON.enableWoodFenceTweak.get();
                enableWoodStairsTweak = COMMON.enableWoodStairsTweak.get(); enableWoodTrapdoorTweak = COMMON.enableWoodTrapdoorTweak.get(); enableWoodDoorTweak = COMMON.enableWoodDoorTweak.get();
                enableBoatTweak = COMMON.enableBoatTweak.get(); enableStickTweak = COMMON.enableStickTweak.get(); enableBowlTweak = COMMON.enableBowlTweak.get();
                enableCoalBlockTweak = COMMON.enableCoalBlockTweak.get(); enableScaffoldingTweak = COMMON.enableScaffoldingTweak.get(); enableLoomTweak = COMMON.enableLoomTweak.get();
                enableBookshelfTweak = COMMON.enableBookshelfTweak.get(); enableLecternTweak = COMMON.enableLecternTweak.get(); enableComposterTweak = COMMON.enableLecternTweak.get();
                enableChestTweak = COMMON.enableChestTweak.get(); enableTrappedChestTweak = COMMON.enableTrappedChestTweak.get(); enableBarrelTweak = COMMON.enableBarrelTweak.get();
                enableJukeboxTweak = COMMON.enableJukeboxTweak.get(); enableNoteBlockTweak = COMMON.enableNoteBlockTweak.get(); enableBowTweak = COMMON.enableBowTweak.get();
                enableFishingRodTweak = COMMON.enableFishingRodTweak.get(); enableLadderTweak = COMMON.enableLadderTweak.get(); enableWoodenPickaxeTweak = COMMON.enableWoodenPickaxeTweak.get();
                enableWoodenHoeTweak = COMMON.enableWoodenHoeTweak.get(); enableWoodenAxeTweak = COMMON.enableWoodenAxeTweak.get(); enableWoodenShovelTweak = COMMON.enableWoodenShovelTweak.get();
                enableWoodenSwordTweak = COMMON.enableWoodenSwordTweak.get(); enableBannerTweak = COMMON.enableBannerTweak.get(); enableCarpetTweak = COMMON.enableCarpetTweak.get();
                enableCartographyTableTweak = COMMON.enableCartographyTableTweak.get();
                //Enable/Disable vanilla fuel items
                enableBedFuel = COMMON.enableBedFuel.get(); enableLeavesFuel = COMMON.enableLeavesFuel.get(); enableStringFuel = COMMON.enableStringFuel.get();
                enableFeatherFuel = COMMON.enableFeatherFuel.get(); enablePaintingFuel = COMMON.enablePaintingFuel.get(); enablePaperFuel = COMMON.enablePaperFuel.get();
                enableBooksFuel = COMMON.enableBooksFuel.get(); enableArmorStandFuel = COMMON.enableArmorStandFuel.get(); enableShieldFuel = COMMON.enableShieldFuel.get();
                enableCampfireFuel = COMMON.enableCampfireFuel.get(); enableItemFrameFuel = COMMON.enableItemFrameFuel.get(); enableChestMinecartFuel = COMMON.enableChestMinecartFuel.get();
                enableDriedKelpItemFuel = COMMON.enableDriedKelpItemFuel.get(); enableDaylightDetectorFuel = COMMON.enableDaylightDetectorFuel.get(); enableLeverFuel = COMMON.enableLeverFuel.get();
                enableCarrotOnAStickFuel = COMMON.enableCarrotOnAStickFuel.get(); enableTripwireHookFuel = COMMON.enableTripwireHookFuel.get(); enableSpongeFuel = COMMON.enableSpongeFuel.get();
                enableCobwebFuel = COMMON.enableCobwebFuel.get(); enableTorchFuel = COMMON.enableTorchFuel.get(); enableRedstoneTorchFuel = COMMON.enableRedstoneTorchFuel.get();
                enablePurpurBlocksFuel = COMMON.enablePurpurBlocksFuel.get(); enablePurpurSlabFuel = COMMON.enablePurpurSlabFuel.get(); enablePurpurStairsFuel = COMMON.enablePurpurStairsFuel.get();
                enableEndRodFuel = COMMON.enableEndRodFuel.get(); enableBlazePowderFuel = COMMON.enableBlazePowderFuel.get(); enableChorusItemsFuel = COMMON.enableChorusItemsFuel.get();
                enablePistonFuels = COMMON.enablePistonFuels.get(); enableBannerPatternFuels = COMMON.enableBannerPatternFuels.get(); enableMapsFuels = COMMON.enableMapsFuels.get();
                enableBeeHiveFuel = COMMON.enableBeeHiveFuel.get();
                //Values...oh god
                planks = COMMON.planks.get(); slabs = COMMON.slabs.get(); sticks = COMMON.sticks.get(); bowl = COMMON.bowl.get(); wood_door = COMMON.wood_door.get();
                boat = COMMON.boat.get(); scaffolding = COMMON.scaffolding.get(); wood_fence = COMMON.wood_fence.get(); wood_stairs = COMMON.wood_stairs.get();
                wood_trapdoor = COMMON.wood_trapdoor.get(); cartography_table = COMMON.cartography_table.get(); loom = COMMON.loom.get(); bookshelf = COMMON.bookshelf.get();
                lectern = COMMON.lectern.get(); composter = COMMON.composter.get(); chest = COMMON.chest.get(); trapped_chest = COMMON.trapped_chest.get(); barrel = COMMON.barrel.get();
                daylight_detector = COMMON.daylight_detector.get(); jukebox = COMMON.jukebox.get(); note_block = COMMON.note_block.get(); banner = COMMON.banner.get(); bow = COMMON.bow.get();
                fishing_rod = COMMON.fishing_rod.get(); ladder = COMMON.ladder.get(); wooden_button = COMMON.wooden_button.get(); wooden_pickaxe = COMMON.wooden_pickaxe.get();
                wooden_shovel = COMMON.wooden_shovel.get(); wooden_hoe = COMMON.wooden_hoe.get(); wooden_axe = COMMON.wooden_axe.get(); wooden_sword = COMMON.wooden_sword.get();
                wooden_sign = COMMON.wooden_sign.get(); carpet = COMMON.carpet.get(); block_of_coal = COMMON.block_of_coal.get();
                //New items
                leaves = COMMON.leaves.get(); tripwire_hook = COMMON.tripwire_hook.get(); dry_sponge = COMMON.dry_sponge.get(); piston = COMMON.piston.get(); cobweb = COMMON.cobweb.get();
                torch = COMMON.torch.get(); redstone_torch = COMMON.redstone_torch.get(); chorus = COMMON.chorus.get(); purpur_block_pillar = COMMON.purpur_block_pillar.get();
                purpur_slab = COMMON.purpur_slab.get(); purpur_stairs = COMMON.purpur_stairs.get(); end_rod = COMMON.end_rod.get(); lever = COMMON.lever.get();
                mushroom_block = COMMON.mushroom_block.get(); string = COMMON.string.get(); feather = COMMON.feather.get(); painting = COMMON.painting.get(); paper = COMMON.paper.get();
                books = COMMON.books.get(); minecart_with_chest = COMMON.minecart_with_chest.get(); bed = COMMON.bed.get(); dried_kelp = COMMON.dried_kelp.get();
                blaze_powder = COMMON.blaze_powder.get(); item_frame = COMMON.item_frame.get(); map = COMMON.map.get(); carrot_on_a_stick = COMMON.carrot_on_a_stick.get();
                armor_stand = COMMON.armor_stand.get(); shield = COMMON.shield.get(); banner_pattern = COMMON.banner_pattern.get(); campfire = COMMON.campfire.get();
                beehive = COMMON.beehive.get();
                //Our stuff
                dried_plant = COMMON.dried_plant.get(); dried_plant_block = COMMON.dried_plant_block.get(); bituminous_coal = COMMON.bituminous_coal.get(); 
                bituminous_coal_block = COMMON.bituminous_coal_block.get(); coke = COMMON.coke.get(); coke_block = COMMON.coke_block.get(); lava_orb = COMMON.lava_orb.get();
                can_of_slimoline = COMMON.can_of_slimoline.get(); coal_dust = COMMON.coal_dust.get(); infinite_creative_fuel = COMMON.infinite_creative_fuel.get(); 

        }
	//Internal class
	public static class Common{
        // DISABLED DUE TO NEW JSON ORE GENERATION SYSTEM
        //public final BooleanValue enableBituminousGeneration;
        //public final BooleanValue enableLavaOreNetherGeneration;
        //public final BooleanValue enableLavaOreOverworldGeneration;
        //Enable/Disable Vanilla Fuel Tweaks
        public final BooleanValue enablePlanksTweak, enableSlabsTweak, enableMushroomBlockTweak, enableWoodSignTweak, enableWoodButtonTweak, enableWoodFenceTweak, 
        enableWoodStairsTweak, enableWoodTrapdoorTweak, enableWoodDoorTweak, enableBoatTweak, enableStickTweak, enableBowlTweak, enableCoalBlockTweak, enableScaffoldingTweak, 
        enableLoomTweak, enableBookshelfTweak, enableLecternTweak, enableComposterTweak, enableChestTweak, enableTrappedChestTweak, enableBarrelTweak, enableJukeboxTweak, 
        enableNoteBlockTweak, enableBowTweak, enableFishingRodTweak, enableLadderTweak, enableWoodenPickaxeTweak, enableWoodenHoeTweak, enableWoodenAxeTweak, 
        enableWoodenShovelTweak, enableWoodenSwordTweak, enableBannerTweak, enableCarpetTweak, enableCartographyTableTweak;
        //Enable/disable mod-added vanilla items
        public final BooleanValue enableBedFuel, enableLeavesFuel, enableStringFuel, enableFeatherFuel, enablePaintingFuel, enablePaperFuel, enableBooksFuel, 
        enableArmorStandFuel, enableShieldFuel, enableCampfireFuel, enableItemFrameFuel, enableChestMinecartFuel, enableDriedKelpItemFuel, 
        enableDaylightDetectorFuel, enableLeverFuel, enableCarrotOnAStickFuel, enableTripwireHookFuel, enableSpongeFuel, enableCobwebFuel, enableTorchFuel, 
        enableRedstoneTorchFuel, enablePurpurBlocksFuel, enablePurpurSlabFuel, enablePurpurStairsFuel, enableEndRodFuel, enableBlazePowderFuel, enableChorusItemsFuel, 
        enablePistonFuels, enableBannerPatternFuels, enableMapsFuels, enableBeeHiveFuel;

        //Lets let them change the numbers....why not...
        public final ConfigValue<Integer> planks, slabs, sticks, bowl, wood_door, boat, scaffolding, wood_fence, wood_stairs, wood_trapdoor,
        cartography_table, loom, bookshelf, lectern, composter, chest, trapped_chest, barrel, daylight_detector, jukebox, note_block,
        banner, bow, fishing_rod, ladder, wooden_button, wooden_pickaxe, wooden_shovel, wooden_hoe, wooden_axe, wooden_sword, wooden_sign, carpet, 
        block_of_coal, 
        //Now lets get onto adding new items as fuel
        leaves, tripwire_hook, dry_sponge, piston, cobweb, torch, redstone_torch, chorus, purpur_block_pillar, purpur_slab, purpur_stairs, end_rod, lever,
        mushroom_block, string, feather, painting, paper, books, minecart_with_chest, bed, dried_kelp, blaze_powder, item_frame, map, carrot_on_a_stick,
        armor_stand, shield, banner_pattern, campfire, beehive,
        //And lastly...modded fuel items...
        dried_plant, dried_plant_block, bituminous_coal, bituminous_coal_block, coke, coke_block, lava_orb, can_of_slimoline, coal_dust,
        infinite_creative_fuel;

        public Common(Builder builder) {
                builder.push("General");

                // DISABLED DUE TO NEW JSON ORE GENERATION SYSTEM
                /*enableBituminousGeneration = builder
                        .comment("Enable Bituminous Coal Ore Generation:")
                        .translation(Defines.MODID + ".config." + "enableBituminousGeneration")
                        .define("enableBituminousGeneration", true);
            
                enableLavaOreNetherGeneration = builder
                        .comment("Enable Lava Ore Genereation in the Nether:")
                        .translation(Defines.MODID + ".config." + "enableLaveOreNetherGeneration")
                        .define("enableLavaOreNetherGeneration", true);
            
                enableLavaOreOverworldGeneration = builder
            		.comment("Enable Lava Ore Generation in the Overworld:")
            		.translation(Defines.MODID + ".config." + "enableLavaOreOverworldGeneration")
                        .define("enableLavaOreOverworldGeneration", true);*/
        

                enablePlanksTweak = builder.comment("\nEnable/Disable Fuel Tweaks - Revert my Math back to Mojangs if set to false").translation(Defines.MODID + ".config." + "enablePlanksTweak").define("enablePlanksTweak", true);
                enableSlabsTweak = builder.comment("").translation(Defines.MODID + ".config." + "enableSlabsTweak").define("enableSlabsTweak", true);
                enableMushroomBlockTweak = builder.comment("").translation(Defines.MODID + ".config." + "enableMushroomBlockTweak").define("enableMushroomBlockTweak", true);
                enableWoodSignTweak = builder.comment("").translation(Defines.MODID + ".config." + "enableWoodSignTweak").define("enableWoodSignTweak", true);
                enableWoodButtonTweak = builder.comment("").translation(Defines.MODID + ".config." + "enableWoodButtonTweak").define("enableWoodButtonTweak", true);
                enableWoodFenceTweak = builder.comment("").translation(Defines.MODID + ".config." + "enableWoodFenceTweak").define("enableWoodFenceTweak", true);
                enableWoodStairsTweak = builder.comment("").translation(Defines.MODID + ".config." + "enableWoodStairsTweak").define("enableWoodStairsTweak", true);
                enableWoodTrapdoorTweak = builder.comment("").translation(Defines.MODID + ".config." + "enableWoodTrapdoorTweak").define("enableWoodTrapdoorTweak", true);
                enableWoodDoorTweak = builder.comment("").translation(Defines.MODID + ".config." + "enableWoodDoorTweak").define("enableWoodDoorTweak", true);
                enableBoatTweak = builder.comment("").translation(Defines.MODID + ".config." + "enableBoatTweak").define("enableBoatTweak", true);
                enableStickTweak = builder.comment("").translation(Defines.MODID + ".config." + "enableStickTweak").define("enableStickTweak", true);
                enableBowlTweak = builder.comment("").translation(Defines.MODID + ".config." + "enableBowlTweak").define("enableBowlTweak", true);
                enableCoalBlockTweak = builder.comment("").translation(Defines.MODID + ".config." + "enableCoalBlockTweak").define("enableCoalBlockTweak", true);
                enableScaffoldingTweak = builder.comment("").translation(Defines.MODID + ".config." + "enableScaffoldingTweak").define("enableScaffoldingTweak", true);
                enableLoomTweak = builder.comment("").translation(Defines.MODID + ".config." + "enableLoomTweak").define("enableLoomTweak", true);
                enableBookshelfTweak = builder.comment("").translation(Defines.MODID + ".config." + "enableBookshelfTweak").define("enableBookshelfTweak", true);
                enableLecternTweak = builder.comment("").translation(Defines.MODID + ".config." + "enableLecternTweak").define("enableLecternTweak", true);
                enableComposterTweak = builder.comment("").translation(Defines.MODID + ".config." + "enableComposterTweak").define("enableComposterTweak", true);
                enableChestTweak = builder.comment("").translation(Defines.MODID + ".config." + "enableChestTweak").define("enableChestTweak", true);
                enableTrappedChestTweak = builder.comment("").translation(Defines.MODID + ".config." + "enableTrappedChestTweak").define("enableTrappedChestTweak", true);
                enableBarrelTweak = builder.comment("").translation(Defines.MODID + ".config." + "enableBarrelTweak").define("enableBarrelTweak", true);
                enableJukeboxTweak = builder.comment("").translation(Defines.MODID + ".config." + "enableJukeboxTweak").define("enableJukeboxTweak", true);
                enableNoteBlockTweak = builder.comment("").translation(Defines.MODID + ".config." + "enableNoteBlockTweak").define("enableNoteBlockTweak", true);
                enableBowTweak = builder.comment("").translation(Defines.MODID + ".config." + "enableBowTweak").define("enableBowTweak", true);
                enableFishingRodTweak = builder.comment("").translation(Defines.MODID + ".config." + "enableFishingRodTweak").define("enableFishingRodTweak", true);
                enableLadderTweak = builder.comment("").translation(Defines.MODID + ".config." + "enableLadderTweak").define("enableLadderTweak", true);
                enableWoodenPickaxeTweak = builder.comment("").translation(Defines.MODID + ".config." + "enableWoodenPickaxeTweak").define("enableWoodenPickaxeTweak", true);
                enableWoodenHoeTweak = builder.comment("").translation(Defines.MODID + ".config." + "enableWoodenHoeTweak").define("enableWoodenHoeTweak", true);
                enableWoodenAxeTweak = builder.comment("").translation(Defines.MODID + ".config." + "enableWoodenAxeTweak").define("enableWoodenAxeTweak", true);
                enableWoodenShovelTweak = builder.comment("").translation(Defines.MODID + ".config." + "enableWoodenShovelTweak").define("enableWoodenShovelTweak", true);
                enableWoodenSwordTweak = builder.comment("").translation(Defines.MODID + ".config." + "enableWoodenSwordTweak").define("enableWoodenSwordTweak", true);
                enableBannerTweak = builder.comment("").translation(Defines.MODID + ".config." + "enableBannerTweak").define("enableBannerTweak", true);
                enableCarpetTweak = builder.comment("").translation(Defines.MODID + ".config." + "enableCarpetTweak").define("enableCarpetTweak", true);
                enableCartographyTableTweak = builder.comment("").translation(Defines.MODID + ".config." + "enableCartographyTableTweak").define("enableCartographyTableTweak", true);


                enableBedFuel = builder.comment("\nEnable/Disable New Vanilla Fuels - Disable as fuels entirely if set to false").translation(Defines.MODID + ".config." + "enableBedFuel").define("enableBedFuel", true);
                enableLeavesFuel = builder.comment("").translation(Defines.MODID + ".config." + "enableLeavesFuel").define("enableLeavesFuel", true);
                enableStringFuel = builder.comment("").translation(Defines.MODID + ".config." + "enableStringFuel").define("enableStringFuel", true);
                enableFeatherFuel = builder.comment("").translation(Defines.MODID + ".config." + "enableFeatherFuel").define("enableFeatherFuel", true);
                enablePaintingFuel = builder.comment("").translation(Defines.MODID + ".config." + "enablePaintingFuel").define("enablePaintingFuel", true);
                enablePaperFuel = builder.comment("").translation(Defines.MODID + ".config." + "enablePaperFuel").define("enablePaperFuel", true);
                enableBooksFuel = builder.comment("").translation(Defines.MODID + ".config." + "enableBooksFuel").define("enableBooksFuel", true);
                enableArmorStandFuel = builder.comment("").translation(Defines.MODID + ".config." + "enableArmorStandFuel").define("enableArmorStandFuel", true);
                enableShieldFuel = builder.comment("").translation(Defines.MODID + ".config." + "enableShieldFuel").define("enableShieldFuel", true);
                enableCampfireFuel = builder.comment("").translation(Defines.MODID + ".config." + "enableCampfireFuel").define("enableCampfireFuel", true);
                enableItemFrameFuel = builder.comment("").translation(Defines.MODID + ".config." + "enableItemFrameFuel").define("enableItemFrameFuel", true);
                enableChestMinecartFuel = builder.comment("").translation(Defines.MODID + ".config." + "enableChestMinecartFuel").define("enableChestMinecartFuel", true);
                enableDriedKelpItemFuel = builder.comment("").translation(Defines.MODID + ".config." + "enableDriedKelpItemFuel").define("enableDriedKelpItemFuel", true);
                enableDaylightDetectorFuel = builder.comment("").translation(Defines.MODID + ".config." + "enableDaylightDetectorFuel").define("enableDaylightDetectorFuel", true);
                enableLeverFuel = builder.comment("").translation(Defines.MODID + ".config." + "enableLeverFuel").define("enableLeverFuel", true);
                enableCarrotOnAStickFuel = builder.comment("").translation(Defines.MODID + ".config." + "enableCarrotOnAStickFuel").define("enableCarrotOnAStickFuel", true);
                enableTripwireHookFuel = builder.comment("").translation(Defines.MODID + ".config." + "enableTripwireHookFuel").define("enableTripwireHookFuel", true);
                enableSpongeFuel = builder.comment("").translation(Defines.MODID + ".config." + "enableSpongeFuel").define("enableSpongeFuel", true);
                enableCobwebFuel = builder.comment("").translation(Defines.MODID + ".config." + "enableCobwebFuel").define("enableCobwebFuel", true);
                enableTorchFuel = builder.comment("").translation(Defines.MODID + ".config." + "enableTorchFuel").define("enableTorchFuel", true);
                enableRedstoneTorchFuel = builder.comment("").translation(Defines.MODID + ".config." + "enableRedstoneTorchFuel").define("enableRedstoneTorchFuel", true);
                enablePurpurBlocksFuel = builder.comment("").translation(Defines.MODID + ".config." + "enablePurpurBlocksFuel").define("enablePurpurBlocksFuel", true);
                enablePurpurSlabFuel = builder.comment("").translation(Defines.MODID + ".config." + "enablePurpurSlabFuel").define("enablePurpurSlabFuel", true);
                enablePurpurStairsFuel = builder.comment("").translation(Defines.MODID + ".config." + "enablePurpurStairsFuel").define("enablePurpurStairsFuel", true);
                enableEndRodFuel = builder.comment("").translation(Defines.MODID + ".config." + "enableEndRodFuel").define("enableEndRodFuel", true);
                enableBlazePowderFuel = builder.comment("").translation(Defines.MODID + ".config." + "enableBlazePowderFuel").define("enableBlazePowderFuel", true);
                enableChorusItemsFuel = builder.comment("").translation(Defines.MODID + ".config." + "enableChorusItemsFuel").define("enableChorusItemsFuel", true);
                enablePistonFuels = builder.comment("").translation(Defines.MODID + ".config." + "enablePistonFuels").define("enablePistonFuels", true);
                enableBannerPatternFuels = builder.comment("").translation(Defines.MODID + ".config." + "enableBannerPatternFuels").define("enableBannerPatternFuels", true);
                enableMapsFuels = builder.comment("").translation(Defines.MODID + ".config." + "enableMapsFuels").define("enableMapsFuels", true);
                enableBeeHiveFuel = builder.comment("").translation(Defines.MODID + ".config." + "enableBeeHiveFuel").define("enableBeeHiveFuel", true);


                planks = builder.comment("\nValues - These are in ticks. Don't touch unless you need advanced tuning!").translation(Defines.MODID + ".config." + "planks").define("planks", 75);
                slabs = builder.comment("").translation(Defines.MODID + ".config." + "slabs").define("slabs", 38);
                sticks = builder.comment("").translation(Defines.MODID + ".config." + "sticks").define("sticks", 38);
                bowl = builder.comment("").translation(Defines.MODID + ".config." + "bowl").define("bowl", 56);
                wood_door = builder.comment("").translation(Defines.MODID + ".config." + "wood_door").define("wood_door", 150);
                boat = builder.comment("").translation(Defines.MODID + ".config." + "boat").define("boat", 375);
                scaffolding = builder.comment("").translation(Defines.MODID + ".config." + "scaffolding").define("scaffolding", 325);
                wood_fence = builder.comment("").translation(Defines.MODID + ".config." + "wood_fence").define("wood_fence", 125);
                wood_stairs = builder.comment("").translation(Defines.MODID + ".config." + "wood_stairs").define("wood_stairs", 113);
                wood_trapdoor = builder.comment("").translation(Defines.MODID + ".config." + "wood_trapdoor").define("wood_trapdoor", 450);
                cartography_table = builder.comment("").translation(Defines.MODID + ".config." + "cartography_table").define("cartography_table", 580);
                loom = builder.comment("").translation(Defines.MODID + ".config." + "loom").define("loom", 200);
                bookshelf = builder.comment("").translation(Defines.MODID + ".config." + "bookshelf").define("bookshelf", 1710);
                lectern = builder.comment("").translation(Defines.MODID + ".config." + "lectern").define("lectern", 1860);
                composter = builder.comment("").translation(Defines.MODID + ".config." + "composter").define("composter", 263);
                chest = builder.comment("").translation(Defines.MODID + ".config." + "chest").define("chest", 600);
                trapped_chest = builder.comment("").translation(Defines.MODID + ".config." + "trapped_chest").define("trapped_chest", 656);
                barrel = builder.comment("").translation(Defines.MODID + ".config." + "barrel").define("barrel", 525);
                daylight_detector = builder.comment("").translation(Defines.MODID + ".config." + "daylight_detector").define("daylight_detector", 113);
                jukebox = builder.comment("").translation(Defines.MODID + ".config." + "jukebox").define("jukebox", 600);
                note_block = builder.comment("").translation(Defines.MODID + ".config." + "note_block").define("note_block", 600);
                banner = builder.comment("").translation(Defines.MODID + ".config." + "banner").define("banner", 638);
                bow = builder.comment("").translation(Defines.MODID + ".config." + "bow").define("bow", 188);
                fishing_rod = builder.comment("").translation(Defines.MODID + ".config." + "fishing_rod").define("fishing_rod", 163);
                ladder = builder.comment("").translation(Defines.MODID + ".config." + "ladder").define("ladder", 88);
                wooden_button = builder.comment("").translation(Defines.MODID + ".config." + "wooden_button").define("wooden_button", 75);
                wooden_pickaxe = builder.comment("").translation(Defines.MODID + ".config." + "wooden_pickaxe").define("wooden_pickaxe", 300);
                wooden_shovel = builder.comment("").translation(Defines.MODID + ".config." + "wooden_shovel").define("wooden_shovel", 150);
                wooden_hoe = builder.comment("").translation(Defines.MODID + ".config." + "wooden_hoe").define("wooden_hoe", 225);
                wooden_axe = builder.comment("").translation(Defines.MODID + ".config." + "wooden_axe").define("wooden_axe", 300);
                wooden_sword = builder.comment("").translation(Defines.MODID + ".config." + "wooden_sword").define("wooden_sword", 188);
                wooden_sign = builder.comment("").translation(Defines.MODID + ".config." + "wooden_sign").define("wooden_sign", 163);
                carpet = builder.comment("").translation(Defines.MODID + ".config." + "carpet").define("carpet", 67);
                block_of_coal = builder.comment("").translation(Defines.MODID + ".config." + "block_of_coal").define("block_of_coal", 14400);
                //Now lets get onto adding new items as fuel
                leaves = builder.comment("").translation(Defines.MODID + ".config." + "leaves").define("leaves", 75);
                tripwire_hook = builder.comment("").translation(Defines.MODID + ".config." + "tripwire_hook").define("tripwire_hook", 56);
                dry_sponge = builder.comment("").translation(Defines.MODID + ".config." + "dry_sponge").define("dry_sponge", 140);
                piston = builder.comment("").translation(Defines.MODID + ".config." + "piston").define("piston", 225);
                cobweb = builder.comment("").translation(Defines.MODID + ".config." + "cobweb").define("cobweb", 25);
                torch = builder.comment("").translation(Defines.MODID + ".config." + "torch").define("torch", 410);
                redstone_torch = builder.comment("").translation(Defines.MODID + ".config." + "redstone_torch").define("redstone_torch", 38);
                chorus = builder.comment("").translation(Defines.MODID + ".config." + "chorus").define("chorus", 300);
                purpur_block_pillar = builder.comment("").translation(Defines.MODID + ".config." + "purpur_block_pillar").define("purpur_block_pillar", 300);
                purpur_slab = builder.comment("").translation(Defines.MODID + ".config." + "purpur_slab").define("purpur_slab", 150);
                purpur_stairs = builder.comment("").translation(Defines.MODID + ".config." + "purpur_stairs").define("purpur_stairs", 450);
                end_rod = builder.comment("").translation(Defines.MODID + ".config." + "end_rod").define("end_rod", 675);
                lever = builder.comment("").translation(Defines.MODID + ".config." + "lever").define("lever", 38);
                mushroom_block = builder.comment("").translation(Defines.MODID + ".config." + "mushroom_block").define("mushroom_block", 300);
                string = builder.comment("").translation(Defines.MODID + ".config." + "string").define("string", 25);
                feather = builder.comment("").translation(Defines.MODID + ".config." + "feather").define("feather", 25);
                painting = builder.comment("").translation(Defines.MODID + ".config." + "painting").define("painting", 400);
                paper = builder.comment("").translation(Defines.MODID + ".config." + "paper").define("paper", 140);
                books = builder.comment("").translation(Defines.MODID + ".config." + "books").define("books", 420);
                minecart_with_chest = builder.comment("").translation(Defines.MODID + ".config." + "minecart_with_chest").define("minecart_with_chest", 600);
                bed = builder.comment("").translation(Defines.MODID + ".config." + "bed").define("bed", 525);
                dried_kelp = builder.comment("").translation(Defines.MODID + ".config." + "dried_kelp").define("dried_kelp", 444);
                blaze_powder = builder.comment("").translation(Defines.MODID + ".config." + "blaze_powder").define("blaze_powder", 1200);
                item_frame = builder.comment("").translation(Defines.MODID + ".config." + "item_frame").define("item_frame", 300);
                map = builder.comment("").translation(Defines.MODID + ".config." + "map").define("map", 1200);
                carrot_on_a_stick = builder.comment("").translation(Defines.MODID + ".config." + "carrot_on_a_stick").define("carrot_on_a_stick", 163);
                armor_stand = builder.comment("").translation(Defines.MODID + ".config." + "armor_stand").define("armor_stand", 225);
                shield = builder.comment("").translation(Defines.MODID + ".config." + "shield").define("shield", 450);
                banner_pattern = builder.comment("").translation(Defines.MODID + ".config." + "banner_pattern").define("banner_pattern", 140);
                campfire = builder.comment("").translation(Defines.MODID + ".config." + "campfire").define("campfire", 2613);
                beehive = builder.comment("").translation(Defines.MODID + ".config." + "beehive").define("beehive", 450);
                //Mod fuels start here
                dried_plant = builder.comment("").translation(Defines.MODID + ".config." + "dried_plant").define("dried_plant", 140);
                dried_plant_block = builder.comment("").translation(Defines.MODID + ".config." + "dried_plant_block").define("dried_plant_block", 1260);
                bituminous_coal = builder.comment("").translation(Defines.MODID + ".config." + "bituminous_coal").define("bituminous_coal", 1600);
                bituminous_coal_block = builder.comment("").translation(Defines.MODID + ".config." + "bituminous_coal_block").define("bituminous_coal_block", 14000);
                coke = builder.comment("").translation(Defines.MODID + ".config." + "coke").define("coke", 3200);
                coke_block = builder.comment("").translation(Defines.MODID + ".config." + "coke_block").define("coke_block", 28800);
                lava_orb = builder.comment("").translation(Defines.MODID + ".config." + "lava_orb").define("lava_orb", 20000);
                can_of_slimoline = builder.comment("").translation(Defines.MODID + ".config." + "can_of_slimoline").define("can_of_slimoline", 20000);
                coal_dust = builder.comment("").translation(Defines.MODID + ".config." + "coal_dust").define("coal_dust", 1600);
                infinite_creative_fuel = builder.comment("").translation(Defines.MODID + ".config." + "infinite_creative_fuel").define("infinite_creative_fuel", 63072000); //Two whole IRL years!

                builder.pop();
                }	
        }
}
