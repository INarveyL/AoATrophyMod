package com.narvey.trophymod.item;
import com.narvey.trophymod.TrophyMod;
import net.minecraft.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems
{
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TrophyMod.MOD_ID);


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    public static final RegistryObject<Item> AOASWORD = ITEMS.register("sword_of_divans",
            () -> new SwordItem(ItemTier.DIAMOND, 30 , -2f , new Item.Properties().group(ModItemGroup.Trophies)));

    public static final RegistryObject<Item> AOASWORD2 = ITEMS.register("gate_keeper_sword",
            () -> new SwordItem(ItemTier.DIAMOND, 15 , -2f , new Item.Properties().group(ModItemGroup.Trophies)));

    public static final RegistryObject<Item> fragment = ITEMS.register("divan_fragment",
            () -> new Item(new Item.Properties().group(ModItemGroup.Trophies)));

    public static final RegistryObject<Item> uemberstone = ITEMS.register("unstable_emberstone",
            () -> new Item(new Item.Properties().group(ModItemGroup.Trophies)));

    public static final RegistryObject<Item> ugemenyte = ITEMS.register("unstable_gemenyte",
            () -> new Item(new Item.Properties().group(ModItemGroup.Trophies)));

    public static final RegistryObject<Item> uornamyte = ITEMS.register("unstable_ornamyte",
            () -> new Item(new Item.Properties().group(ModItemGroup.Trophies)));

    public static final RegistryObject<Item> ujewelyte = ITEMS.register("unstable_jewelyte",
            () -> new Item(new Item.Properties().group(ModItemGroup.Trophies)));

    public static final RegistryObject<Item> ulunar = ITEMS.register("unstable_lunar",
            () -> new Item(new Item.Properties().group(ModItemGroup.Trophies)));

    public static final RegistryObject<Item> umaterial = ITEMS.register("unstable_material",
            () -> new Item(new Item.Properties().group(ModItemGroup.Trophies)));

    public static final RegistryObject<Item> ubloodstone = ITEMS.register("unstable_bloodstone",
            () -> new Item(new Item.Properties().group(ModItemGroup.Trophies)));

    public static final RegistryObject<Item> divanalloy = ITEMS.register("divan_alloy",
            () -> new Item((new Item.Properties().group(ModItemGroup.Trophies))));

    public static final RegistryObject<Item> keeperhandle = ITEMS.register("keeper_handle",
            () -> new Item(new Item.Properties().group(ModItemGroup.Trophies)));

    public static final RegistryObject<Item> keeperBlade = ITEMS.register("keeper_blade",
            () -> new Item((new Item.Properties().group(ModItemGroup.Trophies))));
}
