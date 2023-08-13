package ru.MrStep.StepMod;

import ca.weblite.objc.Client;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import ru.MrStep.StepMod.Items.EmeraldSword;

@Mod.EventBusSubscriber
public class ModEventHandler {
    @SubscribeEvent
    public static void UsageSwordItem(PlayerInteractEvent.RightClickItem event){

        if (event.getItemStack().getItem() == ModItems.AWAKENED_EMERALD_SWORD_CORE.get()){
            var sword = event.getItemStack().getItem();

            var player = event.getEntity();
            TestEntity projectile = new TestEntity(ModItems.SWORD_PROJECTILE.get(), player, player.level);
            projectile.setDeltaMovement(1,0,0);
            player.level.addFreshEntity(projectile);
            if(!player.level.isClientSide()){

            }

        }
    }
}
