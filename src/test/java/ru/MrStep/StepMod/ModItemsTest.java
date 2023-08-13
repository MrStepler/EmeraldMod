package ru.MrStep.StepMod;


import net.minecraft.world.item.Item;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.*;
import ru.MrStep.StepMod.Items.*;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, StepMod.MODID );
    public static final RegistryObject<Item> EMERALD_SWORD = ITEMS.register("emerald_sword",  EmeraldSword::new);
    public static final RegistryObject<Item> EMERALD_SWORD_CORE = ITEMS.register("emerald_sword_core", EmeraldCoreItem::new);
    public static void register()
    {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}