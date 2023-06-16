package net.mcreator.arcaneheart.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.arcaneheart.ArcaneHeartMod;

public class StoneSpellpageItemRightclickedProcedure {
	public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		ArcaneHeartMod.queueServerWork(4, () -> {
			itemstack.shrink(1);
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(Blocks.STONE);
				_setstack.setCount(8);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		});
	}
}
