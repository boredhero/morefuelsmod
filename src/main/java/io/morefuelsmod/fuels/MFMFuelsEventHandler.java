//https://github.com/TheGreyGhost/MinecraftByExample/blob/master/src/main/java/minecraftbyexample/mbe35_recipes/FurnaceFuelBurnTimeEventHandler.java
package io.morefuelsmod.fuels;

import java.util.Arrays;
import java.util.List;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import io.morefuelsmod.item.ModItems;
import io.morefuelsmod.block.ModBlocks;
import io.morefuelsmod.config.MFMConfig;

public class MFMFuelsEventHandler {
	public static final MFMFuelsEventHandler instance = new MFMFuelsEventHandler();
	
	private MFMFuelsEventHandler() {
		//I don't really know why this is here or what it does, just that it has to be here and nothing should
	}
	
	@SubscribeEvent
	public void onFurnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		ItemStack fuelStack = event.getItemStack();
		Item fuel = fuelStack.getItem();
		//Lets containerize some things so we can do "contains" checks rather than ||
		//Banners container
		List<Item> bannerList = Arrays.asList(Items.BLACK_BANNER, Items.BLUE_BANNER, Items.BROWN_BANNER,
				Items.CYAN_BANNER, Items.GRAY_BANNER, Items.GREEN_BANNER, Items.LIGHT_BLUE_BANNER,
				Items.LIGHT_GRAY_BANNER, Items.LIME_BANNER, Items.MAGENTA_BANNER, Items.ORANGE_BANNER,
				Items.PINK_BANNER, Items.PURPLE_BANNER, Items.RED_BANNER, Items.WHITE_BANNER, Items.YELLOW_BANNER);
		//Carpets container
		List<Item> carpetList = Arrays.asList(Items.BLACK_CARPET, Items.BLUE_CARPET, Items.BROWN_CARPET,
				Items.CYAN_CARPET, Items.GRAY_CARPET, Items.GREEN_CARPET, Items.LIGHT_BLUE_CARPET, 
				Items.LIGHT_GRAY_CARPET, Items.LIME_CARPET, Items.MAGENTA_CARPET, Items.ORANGE_CARPET,
				Items.PINK_CARPET, Items.PURPLE_CARPET, Items.RED_CARPET, Items.WHITE_CARPET, Items.YELLOW_CARPET);
		//Bed container
		List<Item> bedList = Arrays.asList(Items.BLACK_BED, Items.BLUE_BED, Items.BROWN_BED,
				Items.CYAN_BED, Items.GRAY_BED, Items.GREEN_BED, Items.LIGHT_BLUE_BED,
				Items.LIGHT_GRAY_BED, Items.LIME_BED, Items.MAGENTA_BED, Items.ORANGE_BED,
				Items.PINK_BED, Items.PURPLE_BED, Items.RED_BED, Items.WHITE_BED, Items.YELLOW_BED);
		//Planks container
		List<Item> planksList = Arrays.asList(Items.ACACIA_PLANKS, Items.BIRCH_PLANKS, Items.DARK_OAK_PLANKS,
				Items.JUNGLE_PLANKS, Items.OAK_PLANKS, Items.SPRUCE_PLANKS);
		//Slabs container
		List<Item> slabsList = Arrays.asList(Items.ACACIA_SLAB, Items.BIRCH_SLAB, Items.DARK_OAK_SLAB,
				Items.JUNGLE_SLAB, Items.OAK_SLAB, Items.SPRUCE_SLAB);
		//Doors container
		List<Item> doorsList = Arrays.asList(Items.ACACIA_DOOR, Items.BIRCH_DOOR, Items.DARK_OAK_DOOR,
				Items.JUNGLE_DOOR, Items.OAK_DOOR, Items.SPRUCE_DOOR);
		//Boats container
		List<Item> boatsList = Arrays.asList(Items.ACACIA_BOAT, Items.BIRCH_BOAT, Items.DARK_OAK_BOAT,
				Items.JUNGLE_BOAT, Items.OAK_BOAT, Items.SPRUCE_BOAT);
		//Fence container
		List<Item> fenceList = Arrays.asList(Items.ACACIA_FENCE, Items.BIRCH_FENCE, Items.DARK_OAK_FENCE,
				Items.JUNGLE_FENCE, Items.OAK_FENCE, Items.SPRUCE_FENCE);
		//Stairs container
		List<Item> stairsList = Arrays.asList(Items.ACACIA_STAIRS, Items.BIRCH_STAIRS, Items.DARK_OAK_STAIRS,
				Items.JUNGLE_STAIRS, Items.OAK_STAIRS, Items.SPRUCE_STAIRS);
		//Trapdoor container
		List<Item> trapdoorsList = Arrays.asList(Items.ACACIA_TRAPDOOR, Items.BIRCH_TRAPDOOR, Items.DARK_OAK_TRAPDOOR,
				Items.JUNGLE_TRAPDOOR, Items.OAK_TRAPDOOR, Items.SPRUCE_TRAPDOOR);
		//Button container
		List<Item> buttonList = Arrays.asList(Items.ACACIA_BUTTON, Items.BIRCH_BUTTON, Items.DARK_OAK_BUTTON,
				Items.JUNGLE_BUTTON, Items.OAK_BUTTON, Items.SPRUCE_BUTTON);
		//Sign container
		List<Item> signList = Arrays.asList(Items.ACACIA_SIGN, Items.BIRCH_SIGN, Items.DARK_OAK_SIGN,
				Items.JUNGLE_SIGN, Items.OAK_SIGN, Items.SPRUCE_SIGN);
		//Leaves Container
		List<Item> leavesList = Arrays.asList(Items.ACACIA_LEAVES, Items.BIRCH_LEAVES, Items.DARK_OAK_LEAVES,
				Items.JUNGLE_LEAVES, Items.OAK_LEAVES, Items.SPRUCE_LEAVES);
		//Piston container
		List<Item> pistonList = Arrays.asList(Items.PISTON, Items.STICKY_PISTON);
		//Chorus container
		List<Item> chorusList = Arrays.asList(Items.CHORUS_PLANT, Items.CHORUS_FLOWER, Items.POPPED_CHORUS_FRUIT);
		//Purpur Block & Pillar Container
		List<Item> purpurBlockPillarList = Arrays.asList(Items.PURPUR_BLOCK, Items.PURPUR_PILLAR);
		//Mushroom Blocks Container
		List<Item> mushroomBlockList = Arrays.asList(Items.BROWN_MUSHROOM_BLOCK, Items.MUSHROOM_STEM, Items.RED_MUSHROOM_BLOCK);
		//Books Container
		List<Item> booksList = Arrays.asList(Items.BOOK, Items.ENCHANTED_BOOK, Items.KNOWLEDGE_BOOK, Items.WRITABLE_BOOK, Items.WRITTEN_BOOK);
		//Maps Container
		List<Item> mapsList = Arrays.asList(Items.FILLED_MAP, Items.MAP);
		//Banner Pattern Container
		List<Item> bannerPatternList = Arrays.asList(Items.CREEPER_BANNER_PATTERN, Items.FLOWER_BANNER_PATTERN, Items.PIGLIN_BANNER_PATTERN,
				Items.MOJANG_BANNER_PATTERN, Items.SKULL_BANNER_PATTERN);
		//First off, lets fix Mojang's own shit for them...
		//All timings are in ticks. 20t = 1 second. See fuels.md for mor details.
		final int planks = MFMConfig.planks, slabs = MFMConfig.slabs, sticks = MFMConfig.sticks, bowl = MFMConfig.bowl, wood_door = MFMConfig.wood_door, boat = MFMConfig.boat, 
		scaffolding = MFMConfig.scaffolding, wood_fence = MFMConfig.wood_fence, wood_stairs = MFMConfig.wood_stairs, wood_trapdoor = MFMConfig.wood_trapdoor,
		cartography_table = MFMConfig.cartography_table, loom = MFMConfig.loom, bookshelf = MFMConfig.bookshelf, lectern = MFMConfig.lectern, composter = MFMConfig.composter,
		chest = MFMConfig.chest, trapped_chest = MFMConfig.trapped_chest, barrel = MFMConfig.barrel, daylight_detector = MFMConfig.daylight_detector, jukebox = MFMConfig.jukebox,
		note_block = MFMConfig.note_block, banner = MFMConfig.banner, bow = MFMConfig.bow, fishing_rod = MFMConfig.fishing_rod, ladder = MFMConfig.ladder, wooden_button = MFMConfig.ladder,
		wooden_pickaxe = MFMConfig.wooden_pickaxe, wooden_shovel = MFMConfig.wooden_shovel, wooden_hoe = MFMConfig.wooden_hoe, wooden_axe = MFMConfig.wooden_axe, 
		wooden_sword = MFMConfig.wooden_sword, wooden_sign = MFMConfig.wooden_sign, carpet = MFMConfig.carpet, block_of_coal = MFMConfig.block_of_coal, 
		//Now lets get onto adding new items as fuel
		leaves = MFMConfig.leaves, tripwire_hook = MFMConfig.tripwire_hook, dry_sponge = MFMConfig.dry_sponge, piston = MFMConfig.piston, cobweb = MFMConfig.cobweb, torch = MFMConfig.torch,
		redstone_torch = MFMConfig.redstone_torch, chorus = MFMConfig.chorus, purpur_block_pillar = MFMConfig.purpur_block_pillar, purpur_slab = MFMConfig.purpur_slab, 
		purpur_stairs = MFMConfig.purpur_stairs, end_rod = MFMConfig.end_rod, lever = MFMConfig.lever, mushroom_block = MFMConfig.mushroom_block, string = MFMConfig.string, 
		feather = MFMConfig.feather, painting = MFMConfig.painting, paper = MFMConfig.paper, books = MFMConfig.books, minecart_with_chest = MFMConfig.minecart_with_chest, bed = MFMConfig.bed,
		dried_kelp = MFMConfig.dried_kelp, blaze_powder = MFMConfig.dried_kelp, item_frame = MFMConfig.item_frame, map = MFMConfig.map, carrot_on_a_stick = MFMConfig.carrot_on_a_stick,
		armor_stand = MFMConfig.armor_stand, shield = MFMConfig.shield, banner_pattern = MFMConfig.banner_pattern, campfire = MFMConfig.campfire, beehive = MFMConfig.beehive,
		//And lastly...modded fuel items...
		dried_plant = MFMConfig.dried_plant, dried_plant_block = MFMConfig.dried_plant_block, bituminous_coal = MFMConfig.bituminous_coal, bituminous_coal_block = MFMConfig.bituminous_coal_block,
		coke = MFMConfig.coke, coke_block = MFMConfig.coke_block, lava_orb = MFMConfig.lava_orb, can_of_slimoline = MFMConfig.can_of_slimoline, coal_dust = MFMConfig.coal_dust,
		infinite_creative_fuel = MFMConfig.infinite_creative_fuel;

		if(fuel == ModItems.DRIED_PLANT.get())
			event.setBurnTime(dried_plant);
		else if(fuel == ModBlocks.BLOCK_DRIED_PLANT.get().asItem())
			event.setBurnTime(dried_plant_block);
		else if(fuel == ModItems.BITUMINOUS_COAL.get())
			event.setBurnTime(bituminous_coal);
		else if(fuel == ModBlocks.BLOCK_BITUMINOUS_COAL.get().asItem())
			event.setBurnTime(bituminous_coal_block);
		else if(fuel == ModItems.COKE.get())
			event.setBurnTime(coke);
		else if(fuel == ModBlocks.BLOCK_COKE.get().asItem())
			event.setBurnTime(coke_block);
		else if(fuel == ModItems.LAVA_GLASS_ORB.get())
			event.setBurnTime(lava_orb);
		else if(fuel == ModItems.CAN_OF_SLIMOLINE.get())
			event.setBurnTime(can_of_slimoline);
		else if(fuel == ModItems.COAL_DUST.get())
			event.setBurnTime(coal_dust);
		else if(fuel == ModBlocks.BLOCK_CREATIVE_INFINITE_FUEL.get().asItem())
			event.setBurnTime(infinite_creative_fuel);
		else if(planksList.contains(fuel) && MFMConfig.enablePlanksTweak)
			event.setBurnTime(planks);
		else if(slabsList.contains(fuel) && MFMConfig.enableSlabsTweak)
			event.setBurnTime(slabs);
		else if(mushroomBlockList.contains(fuel) && MFMConfig.enableMushroomBlockTweak)
			event.setBurnTime(mushroom_block);
		else if(bedList.contains(fuel) && MFMConfig.enableBedFuel)
			event.setBurnTime(bed);
		else if(leavesList.contains(fuel) && MFMConfig.enableLeavesFuel)
			event.setBurnTime(leaves);
		else if(signList.contains(fuel) && MFMConfig.enableWoodSignTweak)
			event.setBurnTime(wooden_sign);
		else if(buttonList.contains(fuel) && MFMConfig.enableWoodButtonTweak)
			event.setBurnTime(wooden_button);
		else if(fenceList.contains(fuel) && MFMConfig.enableWoodFenceTweak)
			event.setBurnTime(wood_fence);
		else if(stairsList.contains(fuel) && MFMConfig.enableWoodStairsTweak)
			event.setBurnTime(wood_stairs);
		else if(trapdoorsList.contains(fuel) && MFMConfig.enableWoodTrapdoorTweak)
			event.setBurnTime(wood_trapdoor);
		else if(doorsList.contains(fuel) && MFMConfig.enableWoodDoorTweak)
			event.setBurnTime(wood_door);
		else if(boatsList.contains(fuel) && MFMConfig.enableBoatTweak)
			event.setBurnTime(boat);
		else if(fuel == Items.STICK && MFMConfig.enableStickTweak)
			event.setBurnTime(sticks);
		else if(fuel == Items.STRING && MFMConfig.enableStringFuel)
			event.setBurnTime(string);
		else if(fuel == Items.FEATHER && MFMConfig.enableFeatherFuel)
			event.setBurnTime(feather);
		else if(fuel == Items.PAINTING && MFMConfig.enablePaintingFuel)
			event.setBurnTime(painting);
		else if(fuel == Items.PAPER && MFMConfig.enablePaperFuel)
			event.setBurnTime(paper);
		else if(booksList.contains(fuel) && MFMConfig.enableBooksFuel)
			event.setBurnTime(books);
		else if(fuel== Items.BOWL && MFMConfig.enableBowlTweak)
			event.setBurnTime(bowl);
		else if(fuel == Items.ARMOR_STAND && MFMConfig.enableArmorStandFuel)
			event.setBurnTime(armor_stand);
		else if(fuel == Items.SHIELD && MFMConfig.enableShieldFuel)
			event.setBurnTime(shield);
		else if(fuel == Items.CAMPFIRE && MFMConfig.enableCampfireFuel)
			event.setBurnTime(campfire);
		else if(fuel == Items.COAL_BLOCK && MFMConfig.enableCoalBlockTweak)
			event.setBurnTime(block_of_coal);
		else if(fuel == Items.ITEM_FRAME && MFMConfig.enableItemFrameFuel)
			event.setBurnTime(item_frame);
		else if(fuel == Items.SCAFFOLDING && MFMConfig.enableScaffoldingTweak)
			event.setBurnTime(scaffolding);
		else if(fuel == Items.CARTOGRAPHY_TABLE && MFMConfig.enableCartographyTableTweak)
			event.setBurnTime(cartography_table);
		else if(fuel == Items.LOOM && MFMConfig.enableLoomTweak)
			event.setBurnTime(loom);
		else if(fuel == Items.BOOKSHELF && MFMConfig.enableBookshelfTweak)
			event.setBurnTime(bookshelf);
		else if(fuel == Items.LECTERN && MFMConfig.enableLecternTweak)
			event.setBurnTime(lectern);
		else if(fuel == Items.COMPOSTER && MFMConfig.enableComposterTweak)
			event.setBurnTime(composter);
		else if(fuel == Items.CHEST && MFMConfig.enableChestTweak)
			event.setBurnTime(chest);
		else if(fuel == Items.TRAPPED_CHEST && MFMConfig.enableTrappedChestTweak)
			event.setBurnTime(trapped_chest);
		else if(fuel == Items.CHEST_MINECART && MFMConfig.enableChestMinecartFuel)
			event.setBurnTime(minecart_with_chest);
		else if(fuel == Items.BARREL && MFMConfig.enableBarrelTweak)
			event.setBurnTime(barrel);
		else if(fuel == Items.DRIED_KELP && MFMConfig.enableDriedKelpItemFuel)
			event.setBurnTime(dried_kelp);
		else if(fuel == Items.DAYLIGHT_DETECTOR && MFMConfig.enableDaylightDetectorFuel)
			event.setBurnTime(daylight_detector);
		else if(fuel == Items.JUKEBOX && MFMConfig.enableJukeboxTweak)
			event.setBurnTime(jukebox);
		else if(fuel == Items.NOTE_BLOCK && MFMConfig.enableNoteBlockTweak)
			event.setBurnTime(note_block);
		else if(fuel == Items.BOW && MFMConfig.enableBowTweak)
			event.setBurnTime(bow);
		else if(fuel == Items.LEVER && MFMConfig.enableLeverFuel)
			event.setBurnTime(lever);
		else if(fuel == Items.FISHING_ROD && MFMConfig.enableFishingRodTweak)
			event.setBurnTime(fishing_rod);
		else if(fuel == Items.CARROT_ON_A_STICK && MFMConfig.enableCarrotOnAStickFuel)
			event.setBurnTime(carrot_on_a_stick);
		else if(fuel == Items.LADDER && MFMConfig.enableLadderTweak)
			event.setBurnTime(ladder);
		else if(fuel == Items.WOODEN_PICKAXE && MFMConfig.enableWoodenPickaxeTweak)
			event.setBurnTime(wooden_pickaxe);
		else if(fuel == Items.WOODEN_HOE && MFMConfig.enableWoodenHoeTweak)
			event.setBurnTime(wooden_hoe);
		else if(fuel == Items.WOODEN_AXE &&MFMConfig.enableWoodenAxeTweak)
			event.setBurnTime(wooden_axe);
		else if(fuel == Items.WOODEN_SHOVEL && MFMConfig.enableWoodenShovelTweak)
			event.setBurnTime(wooden_shovel);
		else if(fuel == Items.WOODEN_SWORD && MFMConfig.enableWoodenSwordTweak)
			event.setBurnTime(wooden_sword);
		else if(fuel == Items.TRIPWIRE_HOOK && MFMConfig.enableTripwireHookFuel)
			event.setBurnTime(tripwire_hook);
		else if(fuel == Items.SPONGE && MFMConfig.enableSpongeFuel)
			event.setBurnTime(dry_sponge);
		else if(fuel == Items.COBWEB && MFMConfig.enableCobwebFuel)
			event.setBurnTime(cobweb);
		else if(fuel == Items.TORCH && MFMConfig.enableTorchFuel)
			event.setBurnTime(torch);
		else if(fuel == Items.REDSTONE_TORCH && MFMConfig.enableRedstoneTorchFuel)
			event.setBurnTime(redstone_torch);
		else if(fuel == Items.PURPUR_SLAB && MFMConfig.enablePurpurSlabFuel)
			event.setBurnTime(purpur_slab);
		else if(fuel == Items.PURPUR_STAIRS && MFMConfig.enablePurpurStairsFuel)
			event.setBurnTime(purpur_stairs);
		else if(fuel == Items.END_ROD && MFMConfig.enableEndRodFuel)
			event.setBurnTime(end_rod);
		else if(fuel == Items.BLAZE_POWDER && MFMConfig.enableBlazePowderFuel)
			event.setBurnTime(blaze_powder);
		else if(mapsList.contains(fuel) && MFMConfig.enableMapsFuels)
			event.setBurnTime(map);
		else if(purpurBlockPillarList.contains(fuel) && MFMConfig.enablePurpurBlocksFuel)
			event.setBurnTime(purpur_block_pillar);
		else if(bannerPatternList.contains(fuel) && MFMConfig.enableBannerPatternFuels)
			event.setBurnTime(banner_pattern);
		else if(chorusList.contains(fuel) && MFMConfig.enableChorusItemsFuel)
			event.setBurnTime(chorus);
		else if(pistonList.contains(fuel) && MFMConfig.enablePistonFuels)
			event.setBurnTime(piston);
		else if(bannerList.contains(fuel) && MFMConfig.enableBannerTweak)
			event.setBurnTime(banner);
		else if(carpetList.contains(fuel) && MFMConfig.enableCarpetTweak)
			event.setBurnTime(carpet);
		else if(fuel == Items.BEEHIVE && MFMConfig.enableBeeHiveFuel)
			event.setBurnTime(beehive);
		
	}
	
}
