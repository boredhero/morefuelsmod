package io.morefuelsmod;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import io.morefuelsmod.common.Defines;
import io.morefuelsmod.config.MFMConfig;
import io.morefuelsmod.core.RegistryHandler;
import io.morefuelsmod.fuels.MFMFuelsEventHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Defines.MODID)
public class MoreFuelsMod {

    public static final Logger LOGGER = LogManager.getLogger("GLOBAL");
    public static final String version = "1.7.1";
    public static final String mcversion = "1.14.4";

    public MoreFuelsMod() {
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, MFMConfig.COMMON_SPEC);
        RegistryHandler.registerDeferred(FMLJavaModLoadingContext.get().getModEventBus());
        MFMLogger.init(LogManager.getLogger());
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::enqueueIMC);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::processIMC);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);
        MinecraftForge.EVENT_BUS.register(this);
        MinecraftForge.EVENT_BUS.register(MFMFuelsEventHandler.instance);
    }
    private void setup(final FMLCommonSetupEvent event)
    {
        LOGGER.info("Loading morefuelsmod-" + mcversion + " v" + version);
        MFMConfig.bakeConfig();
        LOGGER.info("MFMConfig: WE'RE FUCKIN BAKED");
        MFMOreGen.fuckingFuckEverythingFUCK();
        LOGGER.info("MFM: Lets Load some F*****G ores");
        MFMOreGen.setupOreGenPart1();
        LOGGER.info("MFM: F*****G ores loaded");
    }

    private void enqueueIMC(final InterModEnqueueEvent event){
    }

    private void processIMC(final InterModProcessEvent event){

    }

    private void doClientStuff(final FMLClientSetupEvent event) {

    }

    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {
        LOGGER.info("MFM: Server Instance Detected");
        //MFMOreGen.setupOreGenPart1(); Had this here before, but it still didn't do anything useful.
    }
}