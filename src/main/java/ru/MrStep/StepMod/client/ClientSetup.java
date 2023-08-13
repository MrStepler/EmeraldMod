package ru.MrStep.StepMod.client;

import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import ru.MrStep.StepMod.ModItems;
import ru.MrStep.StepMod.StepMod;
import ru.MrStep.StepMod.TestEntity;

@Mod.EventBusSubscriber(modid = StepMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientSetup {
    public static DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, StepMod.MODID);
    public static final RegistryObject<EntityType<TestEntity>> SWORD_PROJECTILE  = ENTITY_TYPES.register("awakened_sword_projectile",
            () -> EntityType.Builder.of( (EntityType.EntityFactory<TestEntity>) TestEntity::new , MobCategory.MISC).sized(0.5F,0.5F).build("awakened_sword_projectile"));
    @SubscribeEvent
    public static void doSetup(FMLClientSetupEvent event) {

        EntityRenderers.register(ModItems.SWORD_PROJECTILE.get(), SwordProjectileRenderer::new);
    }
}
