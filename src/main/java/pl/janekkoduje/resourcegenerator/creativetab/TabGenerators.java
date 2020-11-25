
package pl.janekkoduje.resourcegenerator.creativetab;

import pl.janekkoduje.resourcegenerator.ElementsResourceGeneratorMod;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;
import net.minecraft.creativetab.CreativeTabs;

@ElementsResourceGeneratorMod.ModElement.Tag
public class TabGenerators extends ElementsResourceGeneratorMod.ModElement {
	public TabGenerators(ElementsResourceGeneratorMod instance) {
		super(instance, 10);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabmy_mod") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(Items.EMERALD, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static CreativeTabs tab;
}
