
package net.mcreator.arcaneheart.item;

import top.theillusivec4.curios.api.type.capability.ICurioItem;
import top.theillusivec4.curios.api.SlotContext;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.monster.EnderMan;

import net.mcreator.arcaneheart.procedures.EntropyRingWhileBaubleIsEquippedTickProcedure;
import net.mcreator.arcaneheart.procedures.EntropyRingBaubleIsUnequippedProcedure;

public class EntropyRingItem extends Item implements ICurioItem {
	public EntropyRingItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON));
	}

	@Override
	public boolean isEnderMask(SlotContext slotContext, EnderMan enderMan, ItemStack stack) {
		return true;
	}

	@Override
	public void curioTick(SlotContext slotContext, ItemStack stack) {
		EntropyRingWhileBaubleIsEquippedTickProcedure.execute(slotContext.entity());
	}

	@Override
	public void onUnequip(SlotContext slotContext, ItemStack newStack, ItemStack stack) {
		EntropyRingBaubleIsUnequippedProcedure.execute(slotContext.entity());
	}
}
