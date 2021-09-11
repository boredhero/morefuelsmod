package io.morefuelsmod.block;

import java.util.Set;
import java.util.function.Supplier;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import io.morefuelsmod.common.Defines;

public final class ModBlocks {

	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Defines.MODID);
	
	private static final Set<RegistryObject<Block>> PURE_BLOCKS = new java.util.HashSet<>();
	
	//public static final RegistryObject<Block> BARREL = register("barrel", () -> new BarrelBlock(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(2.5F, 2.5F)));
	public static final RegistryObject<Block> BLOCK_COKE = register("block_coke", () -> new BasicBlock(Block.Properties.of(Material.STONE, MaterialColor.STONE).strength(2.0F, 2.0F).sound(SoundType.STONE)));
	public static final RegistryObject<Block> BLOCK_BITUMINOUS_COAL = register("block_bituminous_coal", () -> new BasicBlock(Block.Properties.of(Material.STONE, MaterialColor.STONE).strength(2.0F, 2.0F).sound(SoundType.STONE)));
	public static final RegistryObject<Block> BLOCK_CREATIVE_INFINITE_FUEL = register("block_creative_infinite_fuel", () -> new BasicBlock(Block.Properties.of(Material.STONE, MaterialColor.COLOR_RED).strength(3.0F, 5.0F).sound(SoundType.METAL)));
	public static final RegistryObject<Block> BLOCK_LAVA_ORE = register("block_lava_ore", () -> new BasicBlock(Block.Properties.of(Material.STONE, MaterialColor.STONE).strength(2.0F, 2.0F).sound(SoundType.STONE)));
	public static final RegistryObject<Block> BLOCK_BITUMINOUS_COAL_ORE = register("block_bituminous_coal_ore", () -> new BasicBlock(Block.Properties.of(Material.STONE, MaterialColor.STONE).strength(2.0F, 2.0F).sound(SoundType.STONE)));
	public static final RegistryObject<Block> BLOCK_DRIED_PLANT = register("block_dried_plant", () -> new BasicBlock(Block.Properties.of(Material.PLANT, MaterialColor.GRASS).strength(2.0F, 2.0F).sound(SoundType.CROP)));
	
	/**
	 * @return {@code true} if the given {@code Block} requires an associated {@code BlockItem}.
	 * 			Most blocks will want to have {@code BlockItems} as they want to be in inventory.
	 */
	public static boolean needsItemBlock(Block block) {

		for (RegistryObject<Block> pureBlock : PURE_BLOCKS) {
			if (pureBlock.get() == block) {
				return false;
			}
		} return true;
	}
	
	/**
	 * Adds the given supplier associated with the given name to the list of entries to be registered.
	 *
	 * @param name the new entry's name, it will automatically be prefixed.
	 * @param sup a factory for the new entry, it should return a new instance every time it is called.
	 * @param hasItem whether this {@code Block} is intended to have an associated {@code BlockItem}.
	 *
	 * @return {@code RegistryObject} that will be updated with when the entries in the registry change.
	 */
	private static RegistryObject<Block> register(String name, Supplier<? extends Block> sup, boolean hasItem) {
		
		RegistryObject<Block> registryObject = BLOCKS.register(name, sup);
		if (!hasItem) PURE_BLOCKS.add(registryObject);

		return registryObject;
	}

	/**
	 * Default registration method that registers blocks as {@code BlockItem} owners.
	 * @see #register(String, Supplier, boolean)
	 */
	private static RegistryObject<Block> register(String name, Supplier<? extends Block> sup) {
		return register(name, sup, true);
	}
}