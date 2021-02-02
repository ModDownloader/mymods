package pl.janekkoduje.resourcegenerator.procedures;

import pl.janekkoduje.resourcegenerator.ResourceGeneratorModElements;
import pl.janekkoduje.resourcegenerator.ResourceGeneratorMod;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import java.util.Map;

@ResourceGeneratorModElements.ModElement.Tag
public class EmeCommandExecutedProcedure extends ResourceGeneratorModElements.ModElement {
	public EmeCommandExecutedProcedure(ResourceGeneratorModElements instance) {
		super(instance, 12);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ResourceGeneratorMod.LOGGER.warn("Failed to load dependency entity for procedure EmeCommandExecuted!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof PlayerEntity) {
			ItemStack _setstack = new ItemStack(Items.EMERALD, (int) (1));
			_setstack.setCount((int) 64);
			ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
		}
	}
}
