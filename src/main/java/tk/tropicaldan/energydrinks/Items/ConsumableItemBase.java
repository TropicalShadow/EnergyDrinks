package tk.tropicaldan.energydrinks.Items;

import net.minecraft.item.Food;
import net.minecraft.item.Foods;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.pipeline.LightUtil;

import java.util.Properties;

public class ConsumableItemBase extends Item {
    public ConsumableItemBase(Properties prop) {
        super(prop);
    }
    public ConsumableItemBase(Properties prop,Food food) {
        super(prop.food(food));
    }
}
