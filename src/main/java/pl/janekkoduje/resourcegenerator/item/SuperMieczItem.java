
package pl.janekkoduje.resourcegenerator.item;

import pl.janekkoduje.resourcegenerator.itemgroup.GeneratorsItemGroup;
import pl.janekkoduje.resourcegenerator.ResourceGeneratorModElements;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

@ResourceGeneratorModElements.ModElement.Tag
public class SuperMieczItem extends ResourceGeneratorModElements.ModElement {
	@ObjectHolder("resource_generator:super_miecz")
	public static final Item block = null;
	public SuperMieczItem(ResourceGeneratorModElements instance) {
		super(instance, 5);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 100;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 9998f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 3, 17.900000000000002f, new Item.Properties().group(GeneratorsItemGroup.tab)) {
			@Override
			@OnlyIn(Dist.CLIENT)
			public boolean hasEffect(ItemStack itemstack) {
				return true;
			}
		}.setRegistryName("super_miecz"));
	}
}
