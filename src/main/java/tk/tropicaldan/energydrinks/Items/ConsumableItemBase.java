package tk.tropicaldan.energydrinks.Items;

import net.minecraft.item.*;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import tk.tropicaldan.energydrinks.utils.EnergyDrinkInfo;


public class ConsumableItemBase extends ItemBase {
    public static boolean glow = false;
    public ConsumableItemBase(Properties prop) {
        super(prop);
    }
    public ConsumableItemBase(String name,int StackSize,int Hunger,float saturation)
    {
        super(new Item.Properties().group(ItemGroup.FOOD).maxStackSize(StackSize)
                .food((new Food.Builder()).hunger(Hunger).saturation(saturation).setAlwaysEdible().build()));
        setRegistryName(new ResourceLocation(EnergyDrinkInfo.MODID,name));

    }
    public ConsumableItemBase(String name,int StackSize,int Hunger,float saturation,boolean Glow)
    {
        super(new Item.Properties().group(ItemGroup.FOOD).maxStackSize(StackSize)
                .food((new Food.Builder()).hunger(Hunger).saturation(saturation).setAlwaysEdible().build()));
        setRegistryName(new ResourceLocation(EnergyDrinkInfo.MODID,name));
        glow = Glow;
    }
    @Override
    @OnlyIn(Dist.CLIENT)
    public boolean hasEffect(ItemStack itemstack) {
        return glow;
    }

    @Override
    public UseAction getUseAction(ItemStack par1ItemStack) {
        return UseAction.DRINK;
    }

}
