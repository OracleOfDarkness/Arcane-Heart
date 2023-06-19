
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.arcaneheart.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.arcaneheart.world.inventory.SummonersRingMenu;
import net.mcreator.arcaneheart.world.inventory.SpellbookGuiMenu;
import net.mcreator.arcaneheart.ArcaneHeartMod;

public class ArcaneHeartModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, ArcaneHeartMod.MODID);
	public static final RegistryObject<MenuType<SpellbookGuiMenu>> SPELLBOOK_GUI = REGISTRY.register("spellbook_gui", () -> IForgeMenuType.create(SpellbookGuiMenu::new));
	public static final RegistryObject<MenuType<SummonersRingMenu>> SUMMONERS_RING = REGISTRY.register("summoners_ring", () -> IForgeMenuType.create(SummonersRingMenu::new));
}
