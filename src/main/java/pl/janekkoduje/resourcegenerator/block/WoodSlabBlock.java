
package pl.janekkoduje.resourcegenerator.block;

import pl.janekkoduje.resourcegenerator.itemgroup.GeneratorsItemGroup;
import pl.janekkoduje.resourcegenerator.ResourceGeneratorModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.storage.loot.LootContext;
import net.minecraft.world.IBlockReader;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.state.properties.SlabType;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import java.util.List;
import java.util.Collections;

@ResourceGeneratorModElements.ModElement.Tag
public class WoodSlabBlock extends ResourceGeneratorModElements.ModElement {
	@ObjectHolder("resource_generator:wood_slab")
	public static final Block block = null;
	public WoodSlabBlock(ResourceGeneratorModElements instance) {
		super(instance, 57);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(() -> new BlockItem(block, new Item.Properties().group(GeneratorsItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends SlabBlock {
		public CustomBlock() {
			super(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(20f, 30f).lightValue(0));
			setRegistryName("wood_slab");
		}

		@Override
		public int getFlammability(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
			return 50;
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, state.get(TYPE) == SlabType.DOUBLE ? 2 : 1));
		}
	}
}
