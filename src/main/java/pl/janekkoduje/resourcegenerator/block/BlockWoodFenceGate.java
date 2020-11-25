
package pl.janekkoduje.resourcegenerator.block;

import pl.janekkoduje.resourcegenerator.creativetab.TabGenerators;
import pl.janekkoduje.resourcegenerator.ElementsResourceGeneratorMod;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.world.IBlockAccess;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.BlockFenceGate;
import net.minecraft.block.Block;

@ElementsResourceGeneratorMod.ModElement.Tag
public class BlockWoodFenceGate extends ElementsResourceGeneratorMod.ModElement {
	@GameRegistry.ObjectHolder("resource_generator:wood_fence_gate")
	public static final Block block = null;
	public BlockWoodFenceGate(ElementsResourceGeneratorMod instance) {
		super(instance, 59);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("wood_fence_gate"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("resource_generator:wood_fence_gate", "inventory"));
	}
	public static class BlockCustom extends BlockFenceGate {
		public BlockCustom() {
			super(Material.WOOD);
			setUnlocalizedName("wood_fence_gate");
			setSoundType(SoundType.WOOD);
			setHardness(20F);
			setResistance(30F);
			setLightLevel(0F);
			setLightOpacity(255);
			setCreativeTab(TabGenerators.tab);
		}

		@Override
		public int getFlammability(IBlockAccess world, BlockPos pos, EnumFacing face) {
			return 50;
		}
	}
}
