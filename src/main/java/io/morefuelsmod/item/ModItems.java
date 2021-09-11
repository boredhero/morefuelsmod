package io.morefuelsmod.item;

import net.minecraft.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.RegistryObject;

import io.morefuelsmod.common.Defines;

public final class ModItems {

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Defines.MODID);

    public static final RegistryObject<Item> COKE = ITEMS.register("coke", () -> new Item(ModItemGroup.PROPERTIES));
    public static final RegistryObject<Item> BITUMINOUS_COAL = ITEMS.register("bituminous_coal", () -> new Item(ModItemGroup.PROPERTIES));
    public static final RegistryObject<Item> CAN_OF_SLIMOLINE = ITEMS.register("can_of_slimoline", () -> new Item(ModItemGroup.PROPERTIES));
    public static final RegistryObject<Item> COAL_DUST = ITEMS.register("coal_dust", () -> new Item(ModItemGroup.PROPERTIES));
    public static final RegistryObject<Item> GLASS_ORB = ITEMS.register("glass_orb", () -> new Item(ModItemGroup.PROPERTIES));
    public static final RegistryObject<Item> LAVA_CRYSTALS = ITEMS.register("lava_crystals", () -> new Item(ModItemGroup.PROPERTIES));
    public static final RegistryObject<Item> LAVA_GLASS_ORB = ITEMS.register("lava_glass_orb", () -> new Item(ModItemGroup.PROPERTIES));
    public static final RegistryObject<Item> TEMPERED_GLASS_ORB = ITEMS.register("tempered_glass_orb", () -> new Item(ModItemGroup.PROPERTIES));
    public static final RegistryObject<Item> DRIED_PLANT = ITEMS.register("dried_plant", () -> new Item(ModItemGroup.PROPERTIES));
}