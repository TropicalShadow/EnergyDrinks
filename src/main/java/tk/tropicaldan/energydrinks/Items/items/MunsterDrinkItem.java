package tk.tropicaldan.energydrinks.Items.items;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import tk.tropicaldan.energydrinks.Items.ConsumableItemBase;

public class MunsterDrinkItem extends ConsumableItemBase {
    private static boolean glowing = false;
    public MunsterDrinkItem(boolean glow) {
        super("munster",1,5,1,false);
    }


}
