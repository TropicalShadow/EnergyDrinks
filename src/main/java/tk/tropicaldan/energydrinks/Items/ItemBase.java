package tk.tropicaldan.energydrinks.Items;

import net.minecraft.item.Item;
import tk.tropicaldan.energydrinks.init.ModItem;

public class ItemBase extends Item{
    public ItemBase(Item.Properties prop){
        super(prop);
    }
    public Item addToRegistryList(){
        ModItem.itemsToRegister.add(this);
        return this;
    }
}
