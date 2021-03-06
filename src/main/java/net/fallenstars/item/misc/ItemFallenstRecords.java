package net.fallenstars.item.misc;

import net.fallenstars.FallenStars;
import net.fallenstars.init.itemInit;
import net.fallenstars.utils.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemRecord;
import net.minecraft.util.SoundEvent;

public class ItemFallenstRecords extends ItemRecord implements IHasModel {
    public ItemFallenstRecords(String name, SoundEvent soundIn, String UnlocalizedName, String RegistryName) {
        super(name, soundIn);
        this.setUnlocalizedName(UnlocalizedName);
        this.setRegistryName(RegistryName);
        this.setCreativeTab(CreativeTabs.MISC);
        itemInit.ITEMS.add(this);
    }

    @Override
    public void registerModel() {
        FallenStars.proxy.registerItemRenderer(this,0,"moondisc");
    }
}
