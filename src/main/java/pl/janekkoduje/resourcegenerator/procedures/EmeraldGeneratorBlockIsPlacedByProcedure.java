package pl.janekkoduje.resourcegenerator.procedures;

import pl.janekkoduje.resourcegenerator.ResourceGeneratorModElements;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;

import java.util.Map;

@ResourceGeneratorModElements.ModElement.Tag
public class EmeraldGeneratorBlockIsPlacedByProcedure extends ResourceGeneratorModElements.ModElement {
	public EmeraldGeneratorBlockIsPlacedByProcedure(ResourceGeneratorModElements instance) {
		super(instance, 13);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure EmeraldGeneratorBlockIsPlacedBy!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof PlayerEntity)
			((PlayerEntity) entity).addExperienceLevel((int) 10);
		if (entity instanceof PlayerEntity) {
			ItemStack _setstack = new ItemStack(Blocks.EMERALD_BLOCK, (int) (1));
			_setstack.setCount((int) 10);
			ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
		}
	}
}
