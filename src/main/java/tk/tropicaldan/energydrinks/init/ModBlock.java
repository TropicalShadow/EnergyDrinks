package tk.tropicaldan.energydrinks.init;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

import java.util.ArrayList;

public class ModBlock  {

    public static ArrayList<Block> blockRegistryList = new ArrayList<>();
    public static ArrayList<BlockItem> itemBlocksRegistryList = new ArrayList<>();

    //Items
    public static Block Debug;

    public static void initBlocks() {
        //Debug = new DebugBlock().addToBlockAndItemBlockRegistryList();//appends to Block Register
    }


}
