package net.kryston.tutorialmod.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.kryston.tutorialmod.TutorialMod;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {

    public static final ItemGroup INFLAMES = FabricItemGroupBuilder.build(new Identifier(TutorialMod.MOD_ID, "inflames"),() -> new ItemStack(ModItems.BURNED_STICK));
}
