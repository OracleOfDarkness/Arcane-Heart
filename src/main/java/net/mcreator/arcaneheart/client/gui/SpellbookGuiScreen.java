package net.mcreator.arcaneheart.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.EditBox;

import net.mcreator.arcaneheart.world.inventory.SpellbookGuiMenu;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class SpellbookGuiScreen extends AbstractContainerScreen<SpellbookGuiMenu> {
	private final static HashMap<String, Object> guistate = SpellbookGuiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	EditBox Search;

	public SpellbookGuiScreen(SpellbookGuiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 202;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("arcane_heart:textures/screens/spellbook_gui.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
		Search.render(ms, mouseX, mouseY, partialTicks);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		RenderSystem.setShaderTexture(0, new ResourceLocation("arcane_heart:textures/screens/spellbook_overlay512.png"));
		this.blit(ms, this.leftPos + -33, this.topPos + -44, 0, 0, 256, 256, 256, 256);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		if (Search.isFocused())
			return Search.keyPressed(key, b, c);
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
		Search.tick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, Component.translatable("gui.arcane_heart.spellbook_gui.label_superbenji"), 142, 163, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.arcane_heart.spellbook_gui.label_oracleofdarkness"), -19, 163, -12829636);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		Search = new EditBox(this.font, this.leftPos + 39, this.topPos + 181, 120, 20, Component.translatable("gui.arcane_heart.spellbook_gui.Search")) {
			{
				setSuggestion(Component.translatable("gui.arcane_heart.spellbook_gui.Search").getString());
			}

			@Override
			public void insertText(String text) {
				super.insertText(text);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.arcane_heart.spellbook_gui.Search").getString());
				else
					setSuggestion(null);
			}

			@Override
			public void moveCursorTo(int pos) {
				super.moveCursorTo(pos);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.arcane_heart.spellbook_gui.Search").getString());
				else
					setSuggestion(null);
			}
		};
		Search.setMaxLength(32767);
		guistate.put("text:Search", Search);
		this.addWidget(this.Search);
	}
}
