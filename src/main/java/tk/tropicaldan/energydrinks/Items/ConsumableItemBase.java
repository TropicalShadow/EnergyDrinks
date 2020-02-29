package tk.tropicaldan.energydrinks.Items;

import net.minecraft.item.*;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.model.pipeline.LightUtil;
import tk.tropicaldan.energydrinks.utils.EnergyDrinkInfo;

import java.util.Properties;

public class ConsumableItemBase extends ItemBase {
    public ConsumableItemBase(Properties prop) {
        super(prop);
    }
    public ConsumableItemBase(String name,int StackSize,int Hunger,float saturation)
    {
        super(new Item.Properties().group(ItemGroup.FOOD).maxStackSize(StackSize)
                .food((new Food.Builder()).hunger(Hunger).saturation(saturation).setAlwaysEdible().build()));
        setRegistryName(new ResourceLocation(EnergyDrinkInfo.MODID,name));

    }
    @Override
    @OnlyIn(Dist.CLIENT)
    public boolean hasEffect(ItemStack itemstack) {
        return true;
    }

    @Override
    public UseAction getUseAction(ItemStack par1ItemStack) {
        return UseAction.DRINK;
    }

}
