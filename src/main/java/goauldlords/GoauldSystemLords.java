package goauldlords;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Mod(
		modid = GoauldSystemLords.MOD_ID,
		name = GoauldSystemLords.MOD_NAME,
		version = GoauldSystemLords.VERSION
)
public class GoauldSystemLords {

	public static final String MOD_ID = "goauldlords";
	public static final String MOD_NAME = "Goauld System Lords";
	public static final String VERSION = "1.0-SNAPSHOT";

	public static final CreativeTabs GOAULD = new CreativeTabs("Goauld System Lords") {
		@SideOnly(Side.CLIENT)
		public ItemStack createIcon() {
			return new ItemStack(GoauldItems.TEST_ITEM);
		}
	};

	/**
	 * This is the instance of your mod as created by Forge. It will never be null.
	 */
	@Mod.Instance(MOD_ID)
	public static GoauldSystemLords INSTANCE;

	/**
	 * Listen for the register event for creating custom blocks
	 */
	@SubscribeEvent
	public static void addBlocks(RegistryEvent.Register<Block> event) {


	}

	/**
	 * This is the first initialization event. Register tile entities here.
	 * The registry events below will have fired prior to entry to this method.
	 */
	@Mod.EventHandler
	public void preinit(FMLPreInitializationEvent event) {

	}

	/**
	 * This is the second initialization event. Register custom recipes
	 */
	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {

	}

	/**
	 * This is the final initialization event. Register actions from other mods here
	 */
	@Mod.EventHandler
	public void postinit(FMLPostInitializationEvent event) {

	}

	/**
	 * This is a special class that listens to registry events, to allow creation of mod blocks and items at the proper time.
	 */
	@Mod.EventBusSubscriber
	public static class ObjectRegistryHandler {
		/**
		 * Listen for the register event for creating custom items
		 */
		@SubscribeEvent
		public static void addItems(RegistryEvent.Register<Item> event) {


			event.getRegistry().register(new TestItem().setRegistryName(MOD_ID, "testItem"));

		}

	}
}

