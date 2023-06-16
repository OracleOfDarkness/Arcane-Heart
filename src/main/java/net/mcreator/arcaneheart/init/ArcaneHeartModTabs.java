
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.arcaneheart.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.CreativeModeTabEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ArcaneHeartModTabs {
	@SubscribeEvent
	public static void buildTabContentsModded(CreativeModeTabEvent.Register event) {
		event.registerCreativeModeTab(new ResourceLocation("arcane_heart", "arcane_heart"),
				builder -> builder.title(Component.translatable("item_group.arcane_heart.arcane_heart")).icon(() -> new ItemStack(ArcaneHeartModItems.ARCANE_MANA_DROP.get())).displayItems((parameters, tabData) -> {
					tabData.accept(ArcaneHeartModItems.ARCANE_MANA_DROP.get());
					tabData.accept(ArcaneHeartModItems.ARCANE_MANA_BUCKET.get());
					tabData.accept(ArcaneHeartModItems.BIGGER_BOTTLE.get());
					tabData.accept(ArcaneHeartModItems.EARTH_MANA_DROP.get());
					tabData.accept(ArcaneHeartModItems.WATER_MANA_DROP.get());
					tabData.accept(ArcaneHeartModItems.FIRE_MANA_DROP.get());
					tabData.accept(ArcaneHeartModItems.AIR_MANA_DROP.get());
					tabData.accept(ArcaneHeartModItems.ENTROPY_MANA_DROP.get());
					tabData.accept(ArcaneHeartModItems.ORDER_MANA_DROP.get());
					tabData.accept(ArcaneHeartModItems.BOTTLE_OF_MANA.get());
					tabData.accept(ArcaneHeartModItems.BOWL_OF_MANA.get());
					tabData.accept(ArcaneHeartModItems.SPELLBOOK.get());
				})

		);
	}
}
