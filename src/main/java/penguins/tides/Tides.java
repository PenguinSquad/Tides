package penguins.tides;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import penguins.tides.init.TBlocks;
import penguins.tides.init.TEntities;
import penguins.tides.init.TItems;
import penguins.tides.init.TWorld;

import static penguins.tides.lib.TidesInfo.*;


@Mod(modid = MODID, version = VERSION)
public class Tides {
    public static final Logger LOGGER = LogManager.getLogger(MODNAME);

    @SidedProxy(clientSide = JAVAPATH + "TClientProxy", serverSide = JAVAPATH + "TCommonProxy")
    public static TCommonProxy proxy;

    @Instance(MODID)
    public static Tides instance;

    public static final CreativeTabs TAB = new CreativeTabs("tidal") {
        @Override
        public Item getTabIconItem() {
            return TItems.PEARL;
        }
    };

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        TItems.init();
        TBlocks.init();
        TWorld.init();
        TEntities.init();
        proxy.initClient();
    }
}
