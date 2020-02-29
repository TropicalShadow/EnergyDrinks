package tk.tropicaldan.energydrinks.init;


import net.minecraft.item.Item;
import net.minecraftforge.registries.ObjectHolder;
import tk.tropicaldan.energydrinks.Items.items.BlueBullDrinkItem;
import tk.tropicaldan.energydrinks.Items.items.MunsterDrinkItem;
import tk.tropicaldan.energydrinks.utils.EnergyDrinkInfo;

import java.util.ArrayList;

@ObjectHolder(EnergyDrinkInfo.MODID+":items")
public class ModItem {
    public static ArrayList<Item> itemsToRegister = new ArrayList<>();

    public static Item Munster;
    public static Item BlueBull;

    public static void initItems() {
        Munster = new MunsterDrinkItem(false).addToRegistryList();
        BlueBull = new BlueBullDrinkItem(false).addToRegistryList();
        //Debug = new DebugItem("debug").addToRegistryList();
    }
}
