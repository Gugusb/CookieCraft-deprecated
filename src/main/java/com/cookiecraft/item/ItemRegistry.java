package com.cookiecraft.item;

import com.cookiecraft.CookieCraftMod;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CookieCraftMod.MODID);

    public static RegistryObject<Item> special_cookie = ITEMS.register("special_cookie", ItemSpecialCookie::new);
    public static RegistryObject<Item> cookie_ingot = ITEMS.register("cookie_ingot", ItemCookieIngot::new);
    public static RegistryObject<Item> cookie_sowrd = ITEMS.register("cookie_sword", ItemCookieSword::new);
}
