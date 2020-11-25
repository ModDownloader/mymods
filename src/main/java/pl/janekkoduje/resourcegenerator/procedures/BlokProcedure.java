package pl.janekkoduje.resourcegenerator.procedures;

import pl.janekkoduje.resourcegenerator.ResourceGeneratorModElements;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;

import java.util.Map;

@ResourceGeneratorModElements.ModElement.Tag
public class BlokProcedure extends ResourceGeneratorModElements.ModElement {
	public BlokProcedure(ResourceGeneratorModElements instance) {
		super(instance, 18);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure Blok!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof PlayerEntity) {
			ItemStack _setstack = new ItemStack(Blocks.EMERALD_BLOCK, (int) (1));
			_setstack.setCount((int) 64);
			ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
		}
	}
}
