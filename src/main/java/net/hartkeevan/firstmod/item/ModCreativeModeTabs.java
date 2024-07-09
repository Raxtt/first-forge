package net.hartkeevan.firstmod.item;

import net.hartkeevan.firstmod.FirstMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.minecraft.world.item.ItemStack;
import net.minecraft.network.chat.Component;


public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FirstMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> FIRST_MOD_TAB = CREATIVE_MODE_TABS.register("first_mod_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.PERIDOT.get()))
                    .title(Component.translatable("creativetab.first_mod_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.PERIDOT.get());
                        pOutput.accept(ModItems.RAW_PERIDOT.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
