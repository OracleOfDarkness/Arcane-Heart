
package net.mcreator.arcaneheart.item;

import top.theillusivec4.curios.api.type.capability.ICurioItem;
import top.theillusivec4.curios.api.SlotContext;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.arcaneheart.procedures.OrderIdolWhileBaubleIsEquippedTickProcedure;
import net.mcreator.arcaneheart.procedures.OrderIdolBaubleIsUnequippedProcedure;

public class OrderIdolItem extends Item implements ICurioItem {
	public OrderIdolItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON));
	}

	@Override
	public void curioTick(SlotContext slotContext, ItemStack stack) {
		OrderIdolWhileBaubleIsEquippedTickProcedure.execute(slotContext.entity());
	}

	@Override
	public void onUnequip(SlotContext slotContext, ItemStack newStack, ItemStack stack) {
		OrderIdolBaubleIsUnequippedProcedure.execute(slotContext.entity());
	}
}
