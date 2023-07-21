
package net.mcreator.arcaneheart.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.core.BlockPos;

public class MagelightBlock extends Block {
	public MagelightBlock() {
		super(BlockBehaviour.Properties.of(Material.FIRE).sound(SoundType.GLASS).strength(0f, 10f).lightLevel(s -> 15).noCollission().noOcclusion().hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true)
				.isRedstoneConductor((bs, br, bp) -> false).noLootTable());
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public VoxelShape getVisualShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return Shapes.empty();
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return Shapes.or(box(7.42713, 0, 7.82, 8.57287, 0.36, 8.18), box(7.42713, 0, 7.82, 8.57287, 0.36, 8.18), box(7.42713, 0, 7.82, 8.57287, 0.36, 8.18), box(7.42713, 0, 7.82, 8.57287, 0.36, 8.18), box(7.42713, 0, 7.82, 8.57287, 0.36, 8.18),
				box(7.42713, 5.4, 7.82, 8.57287, 5.76, 8.18), box(7.42713, 5.4, 7.82, 8.57287, 5.76, 8.18), box(7.42713, 5.4, 7.82, 8.57287, 5.76, 8.18), box(7.42713, 5.4, 7.82, 8.57287, 5.76, 8.18), box(7.42713, 5.4, 7.82, 8.57287, 5.76, 8.18),
				box(5.12, 2.30713, 7.82, 5.48, 3.45287, 8.18), box(5.12, 2.30713, 7.82, 5.48, 3.45287, 8.18), box(5.12, 2.30713, 7.82, 5.48, 3.45287, 8.18), box(10.52, 2.30713, 7.82, 10.88, 3.45287, 8.18),
				box(10.52, 2.30713, 7.82, 10.88, 3.45287, 8.18), box(10.52, 2.30713, 7.82, 10.88, 3.45287, 8.18), box(7.42713, 2.7, 5.12, 8.57287, 3.06, 5.48), box(7.42713, 2.7, 5.12, 8.57287, 3.06, 5.48),
				box(7.42713, 2.7, 5.12, 8.57287, 3.06, 5.48), box(7.42713, 2.7, 5.12, 8.57287, 3.06, 5.48), box(7.42713, 2.7, 5.12, 8.57287, 3.06, 5.48), box(7.42713, 2.7, 10.52, 8.57287, 3.06, 10.88), box(7.42713, 2.7, 10.52, 8.57287, 3.06, 10.88),
				box(7.42713, 2.7, 10.52, 8.57287, 3.06, 10.88), box(7.42713, 2.7, 10.52, 8.57287, 3.06, 10.88), box(7.42713, 2.7, 10.52, 8.57287, 3.06, 10.88), box(5.12, 2.7, 7.42713, 5.48, 3.06, 8.57287),
				box(5.12, 2.7, 7.42713, 5.48, 3.06, 8.57287), box(5.12, 2.7, 7.42713, 5.48, 3.06, 8.57287), box(10.52, 2.7, 7.42713, 10.88, 3.06, 8.57287), box(10.52, 2.7, 7.42713, 10.88, 3.06, 8.57287),
				box(10.52, 2.7, 7.42713, 10.88, 3.06, 8.57287), box(7.82, 2.30713, 5.12, 8.18, 3.45287, 5.48), box(7.82, 2.30713, 5.12, 8.18, 3.45287, 5.48), box(7.82, 2.30713, 5.12, 8.18, 3.45287, 5.48),
				box(7.82, 2.30713, 5.12, 8.18, 3.45287, 5.48), box(7.82, 2.30713, 5.12, 8.18, 3.45287, 5.48), box(7.82, 2.30713, 10.52, 8.18, 3.45287, 10.88), box(7.82, 2.30713, 10.52, 8.18, 3.45287, 10.88),
				box(7.82, 2.30713, 10.52, 8.18, 3.45287, 10.88), box(7.82, 2.30713, 10.52, 8.18, 3.45287, 10.88), box(7.82, 2.30713, 10.52, 8.18, 3.45287, 10.88), box(7.82, 0, 7.42713, 8.18, 0.36, 8.57287), box(7.82, 0, 7.42713, 8.18, 0.36, 8.57287),
				box(7.82, 0, 7.42713, 8.18, 0.36, 8.57287), box(7.82, 5.4, 7.42713, 8.18, 5.76, 8.57287), box(7.82, 5.4, 7.42713, 8.18, 5.76, 8.57287), box(7.82, 5.4, 7.42713, 8.18, 5.76, 8.57287));
	}

	@Override
	public boolean canBeReplaced(BlockState state, BlockPlaceContext context) {
		return context.getItemInHand().getItem() != this.asItem();
	}
}
