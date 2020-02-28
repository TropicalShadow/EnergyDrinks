package tk.tropicaldan.energydrinks.utils;

import com.google.common.base.Preconditions;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.IForgeRegistry;
import tk.tropicaldan.energydrinks.init.ModBlock;
import tk.tropicaldan.energydrinks.init.ModItem;

@Mod.EventBusSubscriber(bus= Mod.EventBusSubscriber.Bus.MOD)
public class registeryHelper {
    @SubscribeEvent
    public static void registerBlocks(final RegistryEvent.Register<Block> event){
        final IForgeRegistry<Block> registry = event.getRegistry();
        for(Block block: ModBlock.blockRegistryList){
            registry.register(block);
        }
    }
    @SubscribeEvent
    public static void registerItems(final RegistryEvent.Register<Item> event){
        final IForgeRegistry<Item> registry = event.getRegistry();
        for(BlockItem itemBlock: ModBlock.itemBlocksRegistryList) {
            final Block block = itemBlock.getBlock();
            final ResourceLocation registryName = Preconditions.checkNotNull(block.getRegistryName(), "Block %s has null registry name", block);
            assert itemBlock.getGroup() != null;
            BlockItem itemBlock1 = (BlockItem) new BlockItem(block, new Item.Properties().group(itemBlock.getGroup())).setRegistryName(registryName);
            registry.register(itemBlock1);
        }
        for(Item item: ModItem.itemsToRegister){
            registry.register(item);
        }
    }
    @SubscribeEvent
    public void registerEntities(RegistryEvent.Register<EntityType<?>> event) {

    }
}
