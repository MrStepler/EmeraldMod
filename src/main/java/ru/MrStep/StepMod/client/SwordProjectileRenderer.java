package ru.MrStep.StepMod.client;

import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import ru.MrStep.StepMod.StepMod;
import ru.MrStep.StepMod.TestEntity;

public class SwordProjectileRenderer extends EntityRenderer<TestEntity> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(StepMod.MODID, "textures/entities/awakened_sword_projectile.png");
    protected SwordProjectileRenderer(EntityRendererProvider.Context manager) {
        super(manager);
    }

    @Override
    public ResourceLocation getTextureLocation(TestEntity entity) {
        return TEXTURE;
    }
}
