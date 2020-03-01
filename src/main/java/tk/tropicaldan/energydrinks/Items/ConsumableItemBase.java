package tk.tropicaldan.energydrinks.Items;

import net.minecraft.item.*;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import tk.tropicaldan.energydrinks.utils.EnergyDrinkInfo;

import java.util.function.Supplier;


public class ConsumableItemBase extends ItemBase {
    public static boolean glow = false;
    public static Supplier Effects = () -> new EffectInstance(net.minecraft.potion.Effects.STRENGTH.getEffect(),10000,3);
    //TODO - Duration of Effect && maybe setup better effect on drinks
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
                .food((new Food.Builder()).hunger(Hunger).saturation(saturation).setAlwaysEdible().effect(Effects,1).build()));
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
