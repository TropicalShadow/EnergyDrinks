package tk.tropicaldan.energydrinks.Items.items;

import net.minecraft.potion.Effect;
import net.minecraft.potion.Effects;
import tk.tropicaldan.energydrinks.Items.ConsumableItemBase;

public class BlueBullDrinkItem extends ConsumableItemBase {
    private static boolean glowing = false;

    public BlueBullDrinkItem(boolean glow) {
        super("bluebull", 2, 3, 0.7f, glow);
    }
}
