package tk.tropicaldan.energydrinks.Items.items;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import tk.tropicaldan.energydrinks.Items.ConsumableItemBase;

public class DrinkOneConsumable extends ConsumableItemBase {
    public Food food = new Food(new Item.Properties().group(ItemGroup.FOOD));

    public DrinkOneConsumable(Properties prop, Food food) {
        super(prop, food);
    }

}
