
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.arcaneheart.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.arcaneheart.client.gui.SummonersRingScreen;
import net.mcreator.arcaneheart.client.gui.SpellbookGuiScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ArcaneHeartModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(ArcaneHeartModMenus.SPELLBOOK_GUI.get(), SpellbookGuiScreen::new);
			MenuScreens.register(ArcaneHeartModMenus.SUMMONERS_RING.get(), SummonersRingScreen::new);
		});
	}
}
