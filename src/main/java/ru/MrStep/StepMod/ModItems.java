package ru.MrStep.StepMod;


import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.item.Item;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.*;
import ru.MrStep.StepMod.Items.*;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, StepMod.MODID );
    public static DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, StepMod.MODID);
    public static final RegistryObject<Item> EMERALD_SWORD = ITEMS.register("emerald_sword",  EmeraldSword::new);
    public static final RegistryObject<Item> EMERALD_SWORD_CORE = ITEMS.register("emerald_sword_core", EmeraldCoreItem::new);
    public static final RegistryObject<Item> AWAKENED_EMERALD_SWORD_CORE = ITEMS.register("awakened_emerald_sword", EmeraldCoreItem::new);
    public static final RegistryObject<EntityType<TestEntity>> SWORD_PROJECTILE  = ENTITY_TYPES.register("awakened_sword_projectile",
            () -> EntityType.Builder.of( (EntityType.EntityFactory<TestEntity>) TestEntity::new , MobCategory.MISC).sized(0.5F,0.5F).build("awakened_sword_projectile"));
    public static void register()
    {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ENTITY_TYPES.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
