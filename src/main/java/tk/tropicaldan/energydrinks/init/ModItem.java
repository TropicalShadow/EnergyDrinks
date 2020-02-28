package tk.tropicaldan.energydrinks.init;


import net.minecraft.item.Item;
import tk.tropicaldan.energydrinks.utils.EnergyDrinkInfo;

import java.util.ArrayList;

@net.minecraftforge.registries.ObjectHolder(EnergyDrinkInfo.MODID+":items")
public class ModItem {
    public static ArrayList<Item> itemsToRegister = new ArrayList<>();

    public static void initItems() {
        //Debug = new DebugItem("debug").addToRegistryList();
    }
}
