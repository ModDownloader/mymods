
package net.mcreator.resourcegenerator.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.block.Blocks;

import net.mcreator.resourcegenerator.itemgroup.GeneratorsItemGroup;
import net.mcreator.resourcegenerator.ResourceGeneratorModElements;

@ResourceGeneratorModElements.ModElement.Tag
public class HiperkilofItem extends ResourceGeneratorModElements.ModElement {
	@ObjectHolder("resource_generator:hiperkilof")
	public static final Item block = null;
	public HiperkilofItem(ResourceGeneratorModElements instance) {
		super(instance, 4);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 500;
			}

			public float getEfficiency() {
				return 27f;
			}

			public float getAttackDamage() {
				return 2f;
			}

			public int getHarvestLevel() {
				return 50;
			}

			public int getEnchantability() {
				return 10;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(Blocks.DIRT, (int) (1)));
			}
		}, 1, -3f, new Item.Properties().group(GeneratorsItemGroup.tab)) {
			@Override
			@OnlyIn(Dist.CLIENT)
			public boolean hasEffect(ItemStack itemstack) {
				return true;
			}
		}.setRegistryName("hiperkilof"));
	}
}
