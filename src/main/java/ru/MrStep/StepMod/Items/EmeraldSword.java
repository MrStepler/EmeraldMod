package ru.MrStep.StepMod.Items;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import ru.MrStep.StepMod.StepMod;

public class EmeraldSword extends SwordItem {
    public EmeraldSword() {
        super(Tiers.NETHERITE, 12, 2F, new Properties().rarity(Rarity.EPIC).tab(StepMod.TAB));
    }
}
