package sheenrox82.RioV.src.base;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import sheenrox82.RioV.src.content.RioVBlocks;
import sheenrox82.RioV.src.content.RioVItems;
import cpw.mods.fml.common.registry.GameRegistry;


public class Crafting 
{
	public static String[] helmet = new String[] {"XXX", "X X"};
	public static String[] chestplate = new String[] {"X X", "XXX", "XXX"};
	public static String[] leggings = new String[] {"XXX", "X X", "X X"};
	public static String[] boots = new String[] {"X X", "X X"};
	public static String[] bricks = new String[] {"XX"};
	
	public static void add()
	{
		GameRegistry.addRecipe(new ItemStack(RioVBlocks.infuser, 1), "XXX", "XAX", "XXX", Character.valueOf('X'), Blocks.obsidian, Character.valueOf('A'), RioVItems.orb);
		GameRegistry.addRecipe(new ItemStack(RioVItems.terronCrystal, 1), "XZX", "ZAZ", "XZX", Character.valueOf('X'), RioVItems.onyx, Character.valueOf('A'), RioVItems.baseCrystal, Character.valueOf('Z'), RioVItems.blindonite);
		GameRegistry.addRecipe(new ItemStack(RioVItems.demonAngelCrystal, 1), "XZX", "ZAZ", "XZX", Character.valueOf('X'), RioVItems.onyx, Character.valueOf('A'), RioVItems.baseCrystal, Character.valueOf('Z'), RioVItems.nironite);
		GameRegistry.addRecipe(new ItemStack(RioVBlocks.onyxBlock, 1), "XXX", "XXX", "XXX", Character.valueOf('X'), RioVItems.onyx);
		GameRegistry.addRecipe(new ItemStack(RioVBlocks.amethystBlock, 1), "XXX", "XXX", "XXX", Character.valueOf('X'), RioVItems.amethyst);
		GameRegistry.addShapelessRecipe(new ItemStack(RioVBlocks.plankColored, 1, 0), new Object[] {Blocks.planks,  new ItemStack(Items.dye, 1, 15)});
		GameRegistry.addShapelessRecipe(new ItemStack(RioVBlocks.plankColored, 1, 1), new Object[] {Blocks.planks,  new ItemStack(Items.dye, 1, 14)});
		GameRegistry.addShapelessRecipe(new ItemStack(RioVBlocks.plankColored, 1, 2), new Object[] {Blocks.planks,  new ItemStack(Items.dye, 1, 13)});
		GameRegistry.addShapelessRecipe(new ItemStack(RioVBlocks.plankColored, 1, 3), new Object[] {Blocks.planks,  new ItemStack(Items.dye, 1, 12)});
		GameRegistry.addShapelessRecipe(new ItemStack(RioVBlocks.plankColored, 1, 4), new Object[] {Blocks.planks,  new ItemStack(Items.dye, 1, 11)});
		GameRegistry.addShapelessRecipe(new ItemStack(RioVBlocks.plankColored, 1, 5), new Object[] {Blocks.planks,  new ItemStack(Items.dye, 1, 10)});
		GameRegistry.addShapelessRecipe(new ItemStack(RioVBlocks.plankColored, 1, 6), new Object[] {Blocks.planks,  new ItemStack(Items.dye, 1, 9)});
		GameRegistry.addShapelessRecipe(new ItemStack(RioVBlocks.plankColored, 1, 7), new Object[] {Blocks.planks,  new ItemStack(Items.dye, 1, 8)});
		GameRegistry.addShapelessRecipe(new ItemStack(RioVBlocks.plankColored, 1, 8), new Object[] {Blocks.planks,  new ItemStack(Items.dye, 1, 7)});
		GameRegistry.addShapelessRecipe(new ItemStack(RioVBlocks.plankColored, 1, 9), new Object[] {Blocks.planks,  new ItemStack(Items.dye, 1, 6)});
		GameRegistry.addShapelessRecipe(new ItemStack(RioVBlocks.plankColored, 1, 10), new Object[] {Blocks.planks,  new ItemStack(Items.dye, 1, 5)});
		GameRegistry.addShapelessRecipe(new ItemStack(RioVBlocks.plankColored, 1, 11), new Object[] {Blocks.planks,  new ItemStack(Items.dye, 1, 4)});
		GameRegistry.addShapelessRecipe(new ItemStack(RioVBlocks.plankColored, 1, 12), new Object[] {Blocks.planks,  new ItemStack(Items.dye, 1, 3)});
		GameRegistry.addShapelessRecipe(new ItemStack(RioVBlocks.plankColored, 1, 13), new Object[] {Blocks.planks,  new ItemStack(Items.dye, 1, 2)});
		GameRegistry.addShapelessRecipe(new ItemStack(RioVBlocks.plankColored, 1, 14), new Object[] {Blocks.planks,  new ItemStack(Items.dye, 1, 1)});
		GameRegistry.addShapelessRecipe(new ItemStack(RioVBlocks.plankColored, 1, 15), new Object[] {Blocks.planks,  new ItemStack(Items.dye, 1, 0)});
		GameRegistry.addRecipe(new ItemStack(RioVBlocks.blackQuartz, 1, 1), "XXX", "XXX", "XXX", Character.valueOf('X'), RioVItems.burnedQuartz);
		GameRegistry.addRecipe(new ItemStack(RioVBlocks.garnetBlock, 1), "XXX", "XXX", "XXX", Character.valueOf('X'), RioVItems.garnet);
		GameRegistry.addRecipe(new ItemStack(RioVBlocks.nironiteBlock, 1), "XXX", "XXX", "XXX", Character.valueOf('X'), RioVItems.nironite);
		GameRegistry.addRecipe(new ItemStack(RioVBlocks.dragonBlock, 1), "XXX", "XXX", "XXX", Character.valueOf('X'), RioVItems.dragonSoul);
		GameRegistry.addSmelting(RioVItems.horseMeat, new ItemStack(RioVItems.cookedHorseMeat, 1), 1F);
		GameRegistry.addRecipe(new ItemStack(RioVItems.wineGlass, 1), "X X", " X ", "XXX", Character.valueOf('X'), Blocks.glass);
		GameRegistry.addRecipe(new ItemStack(RioVItems.potionGlass, 1), " X ", "X X", "XXX", Character.valueOf('X'), Blocks.glass);
		GameRegistry.addShapelessRecipe(new ItemStack(RioVItems.wine, 1), new Object[] {RioVItems.grapes, RioVItems.wineGlass});
		GameRegistry.addShapelessRecipe(new ItemStack(RioVItems.pepperSpices, 1), new Object[] {RioVItems.pepper});
		GameRegistry.addShapelessRecipe(new ItemStack(RioVItems.spicedWine, 1), new Object[] {RioVItems.pepperSpices, RioVItems.wine});
		GameRegistry.addRecipe(new ItemStack(RioVItems.onyx, 9), "X", Character.valueOf('X'), RioVBlocks.onyxBlock);
		GameRegistry.addRecipe(new ItemStack(RioVItems.amethyst, 9), "X", Character.valueOf('X'), RioVBlocks.amethystBlock);
		GameRegistry.addRecipe(new ItemStack(RioVItems.burnedQuartz, 9), "X", Character.valueOf('X'), new ItemStack(RioVBlocks.blackQuartz, 1, 1));
		GameRegistry.addRecipe(new ItemStack(RioVItems.garnet, 9), "X", Character.valueOf('X'), RioVBlocks.garnetBlock);
		GameRegistry.addRecipe(new ItemStack(RioVItems.nironite, 9), "X", Character.valueOf('X'), RioVBlocks.nironiteBlock);
		GameRegistry.addRecipe(new ItemStack(RioVItems.dragonSoul, 9), "X", Character.valueOf('X'), RioVBlocks.dragonBlock);
		GameRegistry.addRecipe(new ItemStack(RioVItems.theDarknessCrystal, 1), "XZX", "ZAZ", "XZX", Character.valueOf('X'), RioVItems.onyx, Character.valueOf('A'), RioVItems.baseCrystal, Character.valueOf('Z'), RioVItems.vulron);
		GameRegistry.addRecipe(new ItemStack(RioVBlocks.lamp, 1), "XZX", "ZAZ", "XZX", Character.valueOf('X'), Blocks.planks, Character.valueOf('A'), Blocks.torch, Character.valueOf('Z'), Blocks.glass);
		GameRegistry.addShapelessRecipe(new ItemStack(RioVItems.purpleFeather, 1), new Object[] {Items.feather, new ItemStack(Items.dye, 1, 5)});
		GameRegistry.addRecipe(new ItemStack(RioVItems.darknessArrow, 5), "  *", " D ", "X  ", Character.valueOf('*'), RioVItems.ingotOfFlame, Character.valueOf('D'), RioVItems.blackBone, Character.valueOf('X'), RioVItems.purpleFeather);
		GameRegistry.addRecipe(new ItemStack(RioVItems.blindOasisActivator, 1), "  *", " X ", "*  ", Character.valueOf('*'), RioVItems.onyx, Character.valueOf('X'), new ItemStack(RioVBlocks.blackQuartz, 1, 1));
		GameRegistry.addRecipe(new ItemStack(RioVBlocks.blindoniteBlock, 1), "XX", "XX", Character.valueOf('X'), RioVItems.blindonite);
		GameRegistry.addRecipe(new ItemStack(RioVItems.vaerynActivator, 1), "  *", " X ", "*  ", Character.valueOf('*'), RioVItems.blindonite, Character.valueOf('X'), RioVBlocks.blindoniteBlock);
		GameRegistry.addShapelessRecipe(new ItemStack(RioVBlocks.glimmerwoodPlanks, 4), new Object[] {RioVBlocks.glimmerwoodLog});
		GameRegistry.addRecipe(new ItemStack(RioVBlocks.glimmerwoodWorkbench, 1), "XX", "XX", Character.valueOf('X'), RioVBlocks.glimmerwoodPlanks);
		GameRegistry.addRecipe(new ItemStack(RioVItems.glimmerwoodSticks, 4), "X", "X", Character.valueOf('X'), RioVBlocks.glimmerwoodPlanks);
		GameRegistry.addRecipe(new ItemStack(RioVBlocks.glimmerwoodFence, 2), "XXX", "XXX", Character.valueOf('X'), RioVItems.glimmerwoodSticks);
		GameRegistry.addRecipe(new ItemStack(RioVBlocks.glimmerwoodFenceGate, 1), "XOX", "XOX", Character.valueOf('X'), RioVItems.glimmerwoodSticks, Character.valueOf('O'), RioVBlocks.glimmerwoodPlanks);
		GameRegistry.addRecipe(new ItemStack(RioVItems.glimmerwoodDoorItem, 1), "XX", "XX", "XX", Character.valueOf('X'), RioVBlocks.glimmerwoodPlanks);
		GameRegistry.addRecipe(new ItemStack(RioVBlocks.glimmerwoodTrapdoor, 2), "XXX", "XXX", Character.valueOf('X'), RioVBlocks.glimmerwoodPlanks);
		GameRegistry.addRecipe(new ItemStack(RioVBlocks.glimmerwoodLadder, 3), "X X", "XXX", "X X", Character.valueOf('X'), RioVItems.glimmerwoodSticks);
		GameRegistry.addRecipe(new ItemStack(RioVItems.flamonorActivator, 1), "  *", " X ", "*  ", Character.valueOf('*'), RioVItems.onyx, Character.valueOf('X'), RioVBlocks.bloodRock);
		GameRegistry.addRecipe(new ItemStack(RioVBlocks.slateBricks, 4), "XX", "XX", Character.valueOf('X'), RioVBlocks.slate);
		GameRegistry.addRecipe(new ItemStack(RioVBlocks.slate, 1), "XXX", "XXX", "XXX", Character.valueOf('X'), RioVItems.slateFragment);
		GameRegistry.addSmelting(RioVBlocks.slateCobble, new ItemStack(RioVBlocks.slate, 1), 1F);
		GameRegistry.addSmelting(RioVBlocks.slateBricks, new ItemStack(RioVItems.slateFragment, 1), 0.1F);
		GameRegistry.addRecipe(new ItemStack(RioVBlocks.cherryPlanks, 4), "X", Character.valueOf('X'), RioVBlocks.cherryLog);
		GameRegistry.addRecipe(new ItemStack(RioVBlocks.cherryWorkbench, 1), "XX", "XX", Character.valueOf('X'), RioVBlocks.cherryPlanks);
		GameRegistry.addRecipe(new ItemStack(RioVItems.cherryBlossomDoorItem, 1), "XX", "XX", "XX", Character.valueOf('X'), RioVBlocks.cherryPlanks);
		GameRegistry.addRecipe(new ItemStack(RioVBlocks.cherryBlossomTrapdoor, 2), "XXX", "XXX", Character.valueOf('X'), RioVBlocks.cherryPlanks);
		GameRegistry.addRecipe(new ItemStack(RioVBlocks.cherryBlossomLadder, 3), "X X", "XXX", "X X", Character.valueOf('X'), RioVItems.cherryBlossomSticks);
		GameRegistry.addRecipe(new ItemStack(RioVBlocks.cherryBlossomFenceGate, 1), "XOX", "XOX", Character.valueOf('O'), RioVBlocks.cherryPlanks,  Character.valueOf('X'), RioVItems.cherryBlossomSticks);
		GameRegistry.addRecipe(new ItemStack(RioVItems.cherryBlossomSticks, 4), "X", "X", Character.valueOf('X'), RioVBlocks.cherryPlanks);
		GameRegistry.addRecipe(new ItemStack(RioVBlocks.cherryBlossomFence, 2), "XXX", "XXX", Character.valueOf('X'), RioVItems.cherryBlossomSticks);
		GameRegistry.addRecipe(new ItemStack(RioVItems.sanctuatiteActivator, 1), "  *", " X ", "*  ", Character.valueOf('*'), RioVItems.drakiuz, Character.valueOf('X'), RioVBlocks.blindoniteBlock);
		GameRegistry.addRecipe(new ItemStack(RioVBlocks.skywoodPlanks, 4), "X", Character.valueOf('X'), RioVBlocks.skywoodLog);
		GameRegistry.addRecipe(new ItemStack(RioVBlocks.skywoodWorkbench, 1), "XX", "XX", Character.valueOf('X'), RioVBlocks.skywoodPlanks);
		GameRegistry.addRecipe(new ItemStack(RioVItems.skywoodDoorItem, 1), "XX", "XX", "XX", Character.valueOf('X'), RioVBlocks.skywoodPlanks);
		GameRegistry.addRecipe(new ItemStack(RioVBlocks.skywoodTrapdoor, 2), "XXX", "XXX", Character.valueOf('X'), RioVBlocks.skywoodPlanks);
		GameRegistry.addRecipe(new ItemStack(RioVBlocks.skywoodLadder, 3), "X X", "XXX", "X X", Character.valueOf('X'), RioVItems.skywoodSticks);
		GameRegistry.addRecipe(new ItemStack(RioVBlocks.skywoodFenceGate, 1), "XOX", "XOX", Character.valueOf('O'), RioVBlocks.skywoodPlanks,  Character.valueOf('X'), RioVItems.skywoodSticks);
		GameRegistry.addRecipe(new ItemStack(RioVItems.skywoodSticks, 4), "X", "X", Character.valueOf('X'), RioVBlocks.skywoodPlanks);
		GameRegistry.addRecipe(new ItemStack(RioVBlocks.skywoodFence, 2), "XXX", "XXX", Character.valueOf('X'), RioVItems.skywoodSticks);
		GameRegistry.addRecipe(new ItemStack(RioVBlocks.bloodPlanks, 4), "X", Character.valueOf('X'), RioVBlocks.bloodLog);
		GameRegistry.addRecipe(new ItemStack(RioVBlocks.bloodWorkbench, 1), "XX", "XX", Character.valueOf('X'), RioVBlocks.bloodPlanks);
		GameRegistry.addRecipe(new ItemStack(RioVItems.bloodDoorItem, 1), "XX", "XX", "XX", Character.valueOf('X'), RioVBlocks.bloodPlanks);
		GameRegistry.addRecipe(new ItemStack(RioVBlocks.bloodTrapdoor, 2), "XXX", "XXX", Character.valueOf('X'), RioVBlocks.bloodPlanks);
		GameRegistry.addRecipe(new ItemStack(RioVBlocks.bloodLadder, 3), "X X", "XXX", "X X", Character.valueOf('X'), RioVItems.bloodSticks);
		GameRegistry.addRecipe(new ItemStack(RioVBlocks.bloodFenceGate, 1), "XOX", "XOX", Character.valueOf('O'), RioVBlocks.bloodPlanks,  Character.valueOf('X'), RioVItems.bloodSticks);
		GameRegistry.addRecipe(new ItemStack(RioVItems.bloodSticks, 4), "X", "X", Character.valueOf('X'), RioVBlocks.bloodPlanks);
		GameRegistry.addRecipe(new ItemStack(RioVBlocks.bloodFence, 2), "XXX", "XXX", Character.valueOf('X'), RioVItems.bloodSticks);
		GameRegistry.addRecipe(new ItemStack(RioVBlocks.anvil, 1), "XOX", "XXX", Character.valueOf('X'), RioVBlocks.slateBricks, Character.valueOf('O'), new ItemStack(Blocks.wool, 1, 14));
		GameRegistry.addRecipe(new ItemStack(RioVItems.voidHolder, 1), "X X", " X ", Character.valueOf('X'), RioVItems.onyx);
		GameRegistry.addRecipe(new ItemStack(RioVBlocks.jaavikBlock, 1), "XXX", "XXX", "XXX", Character.valueOf('X'), RioVItems.jaavik);
		GameRegistry.addRecipe(new ItemStack(RioVItems.jaavik, 9), "X", Character.valueOf('X'), RioVBlocks.jaavikBlock);
		GameRegistry.addRecipe(new ItemStack(RioVItems.blindonite, 4), "X", Character.valueOf('X'), RioVBlocks.blindoniteBlock);
		GameRegistry.addShapelessRecipe(new ItemStack(RioVItems.chain, 3), new Object[] {Items.iron_ingot, Items.iron_ingot, Items.iron_ingot});
		GameRegistry.addRecipe(new ItemStack(Items.chainmail_helmet, 1), new Object[] { helmet, Character.valueOf('X'), RioVItems.chain});
		GameRegistry.addRecipe(new ItemStack(Items.chainmail_chestplate, 1), new Object[] { chestplate, Character.valueOf('X'), RioVItems.chain});
		GameRegistry.addRecipe(new ItemStack(Items.chainmail_leggings, 1), new Object[] { leggings, Character.valueOf('X'), RioVItems.chain});
		GameRegistry.addRecipe(new ItemStack(Items.chainmail_boots, 1), new Object[] { boots, Character.valueOf('X'), RioVItems.chain});
		GameRegistry.addRecipe(new ItemStack(RioVBlocks.alerisBlock, 1), "XXX", "XXX", "XXX", Character.valueOf('X'), RioVItems.aleris);
		GameRegistry.addRecipe(new ItemStack(RioVItems.aleris, 9), "X", Character.valueOf('X'), RioVBlocks.alerisBlock);
		GameRegistry.addRecipe(new ItemStack(RioVBlocks.bricks, 2, 2), bricks, Character.valueOf('X'), RioVBlocks.amethystBlock);
		GameRegistry.addRecipe(new ItemStack(RioVBlocks.bricks, 2, 3), bricks, Character.valueOf('X'), RioVBlocks.onyxBlock);
		GameRegistry.addRecipe(new ItemStack(RioVBlocks.bricks, 2, 4), bricks, Character.valueOf('X'), RioVBlocks.blindoniteBlock);
		GameRegistry.addRecipe(new ItemStack(RioVBlocks.bricks, 2, 5), bricks, Character.valueOf('X'), RioVBlocks.dragonBlock);
		GameRegistry.addRecipe(new ItemStack(RioVBlocks.bricks, 2, 6), bricks, Character.valueOf('X'), RioVBlocks.vraviniteBlock);
		GameRegistry.addRecipe(new ItemStack(RioVBlocks.bricks, 2, 7), bricks, Character.valueOf('X'), RioVBlocks.alerisBlock);
		GameRegistry.addRecipe(new ItemStack(RioVBlocks.bricks, 2, 8), bricks, Character.valueOf('X'), RioVBlocks.jaavikBlock);
		GameRegistry.addRecipe(new ItemStack(RioVBlocks.bricks, 2, 9), bricks, Character.valueOf('X'), RioVBlocks.nironiteBlock);
		GameRegistry.addRecipe(new ItemStack(RioVBlocks.bricks, 2, 10), bricks, Character.valueOf('X'), RioVBlocks.garnetBlock);
		GameRegistry.addRecipe(new ItemStack(RioVBlocks.bricks, 2, 11), bricks, Character.valueOf('X'), RioVBlocks.drakiuzBlock);
		GameRegistry.addShapelessRecipe(new ItemStack(RioVBlocks.stainedGlass, 1, 0), new Object[] {new ItemStack(Items.dye, 1, 6), new ItemStack(Items.dye, 1, 10), new ItemStack(Items.dye, 1, 11), Blocks.glass});
		GameRegistry.addShapelessRecipe(new ItemStack(RioVBlocks.stainedGlass, 1, 1), new Object[] {new ItemStack(Items.dye, 1, 1), new ItemStack(Items.dye, 1, 5), new ItemStack(Items.dye, 1, 12),  new ItemStack(Items.dye, 1, 10), Blocks.glass});
		GameRegistry.addShapelessRecipe(new ItemStack(RioVBlocks.stainedGlass, 1, 2), new Object[] {new ItemStack(Items.dye, 1, 13), new ItemStack(Items.dye, 1, 14), new ItemStack(Items.dye, 1, 11), new ItemStack(Items.dye, 1, 12),  new ItemStack(Items.dye, 1, 1), Blocks.glass});
		GameRegistry.addShapelessRecipe(new ItemStack(RioVBlocks.stainedGlass, 1, 3), new Object[] {new ItemStack(Items.dye, 1, 0),  new ItemStack(Items.dye, 1, 1), Blocks.glass});
		GameRegistry.addRecipe(new ItemStack(RioVItems.smallBag, 1), "XXX", "X X", "XXX", Character.valueOf('X'), Items.leather);
		GameRegistry.addRecipe(new ItemStack(RioVItems.mediumBag, 1), "XXX", "XOX", "XXX", Character.valueOf('X'), Items.leather, Character.valueOf('O'), RioVItems.smallBag);
		GameRegistry.addRecipe(new ItemStack(RioVItems.largeBag, 1), "XXX", "XOX", "XXX", Character.valueOf('X'), Items.leather, Character.valueOf('O'), RioVItems.mediumBag);
		GameRegistry.addRecipe(new ItemStack(RioVItems.sheenBag, 1), "XXX", "XOX", "XXX", Character.valueOf('X'), Items.leather, Character.valueOf('O'), RioVItems.largeBag);
		GameRegistry.addRecipe(new ItemStack(RioVItems.auntunSummoner, 1), "XTX", "TOT", "XTX", Character.valueOf('O'), RioVItems.onyx, Character.valueOf('X'), RioVItems.darkMatter, Character.valueOf('T'), RioVBlocks.skycloud);
		GameRegistry.addRecipe(new ItemStack(RioVBlocks.chocolateCake, 1), "XXX", "XOX", "XXX", Character.valueOf('O'), Items.cake, Character.valueOf('X'), new ItemStack(Items.dye, 1, 4));
	}
}
