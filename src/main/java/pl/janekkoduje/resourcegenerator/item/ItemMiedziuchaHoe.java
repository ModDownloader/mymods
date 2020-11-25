
package pl.janekkoduje.resourcegenerator.item;

import pl.janekkoduje.resourcegenerator.ElementsResourceGeneratorMod;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import java.util.Set;
import java.util.HashMap;

@ElementsResourceGeneratorMod.ModElement.Tag
public class ItemMiedziuchaHoe extends ElementsResourceGeneratorMod.ModElement {
	@GameRegistry.ObjectHolder("resource_generator:miedziucha_hoe")
	public static final Item block = null;
	public ItemMiedziuchaHoe(ElementsResourceGeneratorMod instance) {
		super(instance, 38);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemHoe(EnumHelper.addToolMaterial("MIEDZIUCHA_HOE", 2, 250, 6f, 0f, 14)) {
			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("hoe", 2);
				return ret.keySet();
			}
		}.setUnlocalizedName("miedziucha_hoe").setRegistryName("miedziucha_hoe").setCreativeTab(CreativeTabs.TOOLS));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("resource_generator:miedziucha_hoe", "inventory"));
	}
}
