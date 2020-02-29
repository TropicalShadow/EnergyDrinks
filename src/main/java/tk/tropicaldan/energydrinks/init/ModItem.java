package tk.tropicaldan.energydrinks.init;


import net.minecraft.item.Item;
import net.minecraftforge.registries.ObjectHolder;
import tk.tropicaldan.energydrinks.Items.items.DrinkOneConsumable;
import tk.tropicaldan.energydrinks.utils.EnergyDrinkInfo;

import java.util.ArrayList;

@ObjectHolder(EnergyDrinkInfo.MODID+":items")
public class ModItem {
    public static ArrayList<Item> itemsToRegister = new ArrayList<>();

    public static Item Munster;

    public static void initItems() {
        Munster = new DrinkOneConsumable("munster").addToRegistryList();
        //Debug = new DebugItem("debug").addToRegistryList();
    }
}
