package pl.janekkoduje.resourcegenerator.procedure;

import pl.janekkoduje.resourcegenerator.ElementsResourceGeneratorMod;

import net.minecraft.world.World;
import net.minecraft.entity.item.EntityXPOrb;

import java.util.Map;

@ElementsResourceGeneratorMod.ModElement.Tag
public class ProcedureLol extends ElementsResourceGeneratorMod.ModElement {
	public ProcedureLol(ElementsResourceGeneratorMod instance) {
		super(instance, 20);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure Lol!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure Lol!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure Lol!");
			return;
		}
		int x = (int) dependencies.get("x");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		for (int index0 = 0; index0 < (int) (200); index0++) {
			if (!world.isRemote) {
				world.spawnEntity(new EntityXPOrb(world, x, 200, z, (int) 100000));
			}
		}
	}
}
