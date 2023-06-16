
package net.mcreator.arcaneheart.recipes.brewing;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.common.brewing.IBrewingRecipe;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;

import net.mcreator.arcaneheart.init.ArcaneHeartModItems;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class FireManaPotionRecipeBrewingRecipe implements IBrewingRecipe {
	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> BrewingRecipeRegistry.addRecipe(new FireManaPotionRecipeBrewingRecipe()));
	}

	@Override
	public boolean isInput(ItemStack input) {
		return Ingredient.of(new ItemStack(ArcaneHeartModItems.BIGGER_BOTTLE.get())).test(input);
	}

	@Override
	public boolean isIngredient(ItemStack ingredient) {
		return Ingredient.of(new ItemStack(ArcaneHeartModItems.FIRE_MANA_DROP.get())).test(ingredient);
	}

	@Override
	public ItemStack getOutput(ItemStack input, ItemStack ingredient) {
		if (isInput(input) && isIngredient(ingredient)) {
			return new ItemStack(ArcaneHeartModItems.FIRE_MANA_POTION.get());
		}
		return ItemStack.EMPTY;
	}
}
