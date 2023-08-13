package ru.MrStep.StepMod;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.protocol.Packet;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.HitResult;
import net.minecraftforge.network.NetworkHooks;

public class TestEntity extends AbstractArrow {


    protected TestEntity(EntityType<TestEntity> entityType, LivingEntity shooter, Level world) {
        super(entityType, world);
    }

    public TestEntity(EntityType<TestEntity> entityType, Level level) {
        super(entityType, level);
    }

    @Override
    protected void onHitEntity(EntityHitResult ray) {
        super.onHitEntity(ray);
        // this, x, y, z, explosionStrength, setsFires, breakMode
        this.level.explode(this, this.getX(), this.getY(), this.getZ(), 4.0f, true, Explosion.BlockInteraction.NONE);
    }

    @Override
    protected ItemStack getPickupItem() {
        return ItemStack.EMPTY;
    }
    @Override
    public Packet<?> getAddEntityPacket() {
        return NetworkHooks.getEntitySpawningPacket(this);
    }

}
