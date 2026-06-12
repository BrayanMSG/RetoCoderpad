package com.tuusuario.quantum.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InventoryPage {

    private InventoryPage() {}

    public static final Target BACKPACK =
            Target.the("producto backpack")
                    .located(By.id("add-to-cart-sauce-labs-backpack"));

    public static final Target BIKE_LIGHT =
            Target.the("producto bike light")
                    .located(By.id("add-to-cart-sauce-labs-bike-light"));

    public static final Target CART =
            Target.the("carrito de compras")
                    .located(By.className("shopping_cart_link"));
}