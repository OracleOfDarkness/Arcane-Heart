package net.mcreator.arcaneheart.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.BlockPos;

import net.mcreator.arcaneheart.ArcaneHeartMod;

public class FireSpellpageRightclickedOnBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, ItemStack itemstack) {
		ArcaneHeartMod.queueServerWork(4, () -> {
			itemstack.shrink(1);
			world.setBlock(BlockPos.containing(x, y + 1, z), Blocks.FIRE.defaultBlockState(), 3);
		});
	}
}
