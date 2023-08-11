package ru.MrStep.StepMod.Items;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import ru.MrStep.StepMod.StepMod;

public class EmeraldCoreItem extends Item {
    public EmeraldCoreItem() {
        super(new Properties().rarity(Rarity.RARE).tab(StepMod.TAB));
    }
}
