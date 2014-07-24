package sheenrox82.RioV.src.util;

import java.util.Arrays;

import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import sheenrox82.Core.src.base.ModUpdateChecker;
import sheenrox82.RioV.src.api.base.RioVAPI;
import sheenrox82.RioV.src.base.Config;
import sheenrox82.RioV.src.base.Crafting;
import sheenrox82.RioV.src.base.TheMistsOfRioV;
import sheenrox82.RioV.src.command.CommandFaction;
import sheenrox82.RioV.src.command.CommandFactionClient;
import sheenrox82.RioV.src.command.CommandPrintChangelog;
import sheenrox82.RioV.src.command.CommandRageQuit;
import sheenrox82.RioV.src.content.Biomes;
import sheenrox82.RioV.src.content.Enchantments;
import sheenrox82.RioV.src.content.EntityLoader;
import sheenrox82.RioV.src.content.RioVBlocks;
import sheenrox82.RioV.src.content.RioVItems;
import sheenrox82.RioV.src.event.ConfigChanges;
import sheenrox82.RioV.src.event.Events;
import sheenrox82.RioV.src.handler.FuelHandler;
import sheenrox82.RioV.src.registries.HarvestLevelRegistry;
import sheenrox82.RioV.src.tileentity.TileEntityInfuser;
import sheenrox82.RioV.src.tileentity.flag.TileEntityJaerinFlag;
import sheenrox82.RioV.src.tileentity.flag.TileEntityNoFactionFlag;
import sheenrox82.RioV.src.tileentity.flag.TileEntityRaetiinFlag;
import sheenrox82.RioV.src.world.WorldGen;
import sheenrox82.RioV.src.world.provider.WorldProviderBlindOasis;
import sheenrox82.RioV.src.world.provider.WorldProviderFlamonor;
import sheenrox82.RioV.src.world.provider.WorldProviderSanctuatite;
import sheenrox82.RioV.src.world.provider.WorldProviderVaeryn;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.ModMetadata;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

public class Registry 
{
	public static int render = 3;
	public static String developer = "sheenrox82";
	public static void preInit(FMLPreInitializationEvent initEvent)
	{		
		RioVAPI.getInstance().modLoaded = false;
		ModUpdateChecker.init("https://dl.dropboxusercontent.com/u/126631367/Current%20Version.txt", Util.VERSION);
		RioVAPI.getInstance().getLogger().info("Starting... //START PRE-INITIALIZATION");
		RioVAPI.getInstance().getLogger().info("Sounds loaded.");
		FMLCommonHandler.instance().bus().register(new ConfigChanges());
		TheMistsOfRioV.commonProxy.init();
		ModMetadata data = initEvent.getModMetadata();
		data.autogenerated = false;
		data.modId = Util.MOD_ID;
		data.name = Util.MOD_NAME;
		data.logoFile = "/assets/riov/textures/misc/RioV.png";
		data.version = (Util.VERSION);
		data.url = "http://www.minecraftforum.net/members/sheenrox82/";
		data.authorList = Arrays.asList(new String[] {developer});
		data.description = Util.MOD_NAME + " - The imagined world is called RioV, " +
				"in the year of 1301 DoC (Death of Carigon.), the land of RioV is " +
				"filled with Nizonians. A native creature that are basically giant beasts. " +
				"In 1278 DoC the Natives found a new threat across the land called humans, " +
				"another wild creature. Since then, the races have been weakened and new races have " +
				"arrived, such as the dark elves. There is a myth that in 1610 a monster called a " +
				"Soverian Overlord will destroy the land of RioV and leave it in ashes. " +
				"This is The Mists of RioV.";
		RioVAPI.getInstance().getLogger().info("mcmod.info data initiated.");
		Config.initialize(initEvent);
		syncConfig();
		RioVAPI.getInstance().getLogger().info("Config loaded.");
		MinecraftForge.EVENT_BUS.register(new Events());
		RioVAPI.getInstance().getLogger().info("Events registered.");
		RioVItems.add();
		RioVBlocks.add();
		Crafting.add();
		Biomes.add();
		Enchantments.add();
		RioVAPI.getInstance().getLogger().info("Content added.");
		HarvestLevelRegistry.addHarvestLevels();
		RioVAPI.getInstance().getLogger().info("Some stats initiated.");
		GameRegistry.registerFuelHandler(new FuelHandler());
		GameRegistry.registerTileEntity(TileEntityInfuser.class, "Infuser");
		GameRegistry.registerTileEntity(TileEntityNoFactionFlag.class, "No Faction Flag");
		GameRegistry.registerTileEntity(TileEntityRaetiinFlag.class, "Raetiin Flag");
		GameRegistry.registerTileEntity(TileEntityJaerinFlag.class, "Jaerin Flag");
		GameRegistry.registerWorldGenerator(new WorldGen(), 3);
		NetworkRegistry.INSTANCE.registerGuiHandler(TheMistsOfRioV.getInstance(), TheMistsOfRioV.getInstance().guiHandler);
		RioVAPI.getInstance().getUtil().registerDimension(Config.blindOasisID, WorldProviderBlindOasis.class);
		RioVAPI.getInstance().getUtil().registerDimension(Config.vaerynID, WorldProviderVaeryn.class);
		RioVAPI.getInstance().getUtil().registerDimension(Config.flamonorID, WorldProviderFlamonor.class);
		RioVAPI.getInstance().getUtil().registerDimension(Config.sanctuatiteID, WorldProviderSanctuatite.class);
		RioVAPI.getInstance().getLogger().info("Core data registered. //END PRE-INITIALIZATION");
	}

	public static void init(FMLInitializationEvent init)
	{		
		RioVAPI.getInstance().getLogger().info("Other shit is registering. //START INITIALIZATION");
		TheMistsOfRioV.commonProxy.cape();
		RioVAPI.getInstance().getLogger().info("Adding special capes. ;)");
		TheMistsOfRioV.commonProxy.registerItemRenderers();
		RioVAPI.getInstance().getLogger().info("Item renderers registered.");
		EntityLoader.add();
		RioVAPI.getInstance().getLogger().info("Entity data registering...");
		EntityLoader.addOverworldSpawning();
		EntityLoader.addNetherSpawning();
		EntityLoader.addEndSpawning();
		EntityLoader.addDimensionSpawning();
		RioVAPI.getInstance().getLogger().info("Entity data registered.");
		ExpansionChecker.check();
		RioVAPI.getInstance().getLogger().info("Checking for expansions...");
		BiomeGenBase.extremeHills.theBiomeDecorator.treesPerChunk = 15;
		BiomeGenBase.plains.theBiomeDecorator.treesPerChunk = 1;
		BiomeGenBase.plains.theBiomeDecorator.bigMushroomsPerChunk = 1;
		BiomeGenBase.plains.theBiomeDecorator.flowersPerChunk = 20;
		RioVAPI.getInstance().getLogger().info("Packets registering...");
		RioVAPI.getInstance().getPipeline().initialise();
		RioVAPI.getInstance().getLogger().info("Packets registered.");
		RioVAPI.getInstance().getLogger().info("Other shit is registered. //END INITIALIZATION");
	}

	public static void postInit(FMLPostInitializationEvent postInit)
	{
		RioVAPI.getInstance().getLogger().info("Almost done initializing. //START POST-INITIALIZATION");
		RioVAPI.getInstance().getPipeline().postInitialise();
		RioVAPI.getInstance().getLogger().info("Packets post-registered.");
		Config.initPost();
		RioVAPI.getInstance().getLogger().info("Mod loaded! Sup. //END POST-INITIALIZATION");
		RioVAPI.getInstance().modLoaded = true;
	}

	public static void syncConfig() 
	{
		Config.EOS = Config.config.getBoolean("Use the purple Eos bar instead of text?", Configuration.CATEGORY_GENERAL, Config.EOS, "// Boolean");
		Config.toolHud = Config.config.getBoolean("Show tool info in corner?", Configuration.CATEGORY_GENERAL, Config.toolHud, "// Boolean");
		Config.showToolInfo = Config.config.getBoolean("Show Tool Info?", Configuration.CATEGORY_GENERAL, Config.showToolInfo, "// Boolean");
		Config.allowBreathing = Config.config.getBoolean("Allow Mob Breathing Sounds? (CLIENT SIDE)", Configuration.CATEGORY_GENERAL, Config.allowBreathing, "// Boolean");
		Config.deadBodies = Config.config.getBoolean("Allow Dead Bodies for mobs?", Configuration.CATEGORY_GENERAL, Config.deadBodies, "// Boolean");
		Config.runCapes = Config.config.getBoolean("Allow RioV Capes to initialize?", Configuration.CATEGORY_GENERAL, Config.runCapes, "// Boolean");
		Config.hudPosX = Config.config.getInt("Item HUD Position X || Max: 1000 || Default: 175", Configuration.CATEGORY_GENERAL, Config.hudPosX, 175, 1000, "// Integer");
		Config.hudPosY = Config.config.getInt("Item HUD Position Y || Max: 500 || Default: 50", Configuration.CATEGORY_GENERAL, Config.hudPosY, 50, 500, "// Integer");
		Config.eosPosX = Config.config.getInt("Eos HUD Position X || Max: 800 || Default: 20", Configuration.CATEGORY_GENERAL, Config.eosPosX, 20, 800, "// Integer");
		Config.eosPosY = Config.config.getInt("Eos HUD Position Y || Max: 800 || Default: 20", Configuration.CATEGORY_GENERAL, Config.eosPosY, 20, 800, "// Integer");

		if(Config.config.hasChanged())
		{
			Config.config.save();
		}
	}

	public static void serverLoad(FMLServerStartingEvent event)
	{
		event.registerServerCommand(new CommandFactionClient());
		event.registerServerCommand(new CommandFaction());
		event.registerServerCommand(new CommandRageQuit());
		event.registerServerCommand(new CommandPrintChangelog());
	}
}
