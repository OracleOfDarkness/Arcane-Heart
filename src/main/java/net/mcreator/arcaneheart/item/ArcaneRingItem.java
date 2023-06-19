
package net.mcreator.arcaneheart.item;

import top.theillusivec4.curios.api.type.capability.ICurioItem;
import top.theillusivec4.curios.api.SlotContext;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.monster.EnderMan;

import net.mcreator.arcaneheart.procedures.ArcaneRingWhileBaubleIsEquippedTickProcedure;

public class ArcaneRingItem extends Item implements ICurioItem {
	public ArcaneRingItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON));
	}

	@Override
	public boolean makesPiglinsNeutral(SlotContext slotContext, ItemStack stack) {
		return true;
	}

	@Override
	public boolean isEnderMask(SlotContext slotContext, EnderMan enderMan, ItemStack stack) {
		return true;
	}

	@Override
	public void curioTick(SlotContext slotContext, ItemStack stack) {
		ArcaneRingWhileBaubleIsEquippedTickProcedure.execute(slotContext.entity().level, slotContext.entity().getX(), slotContext.entity().getY(), slotContext.entity().getZ());
	}
}
