package com.tuusuario.quantum.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CartPage {

    private CartPage() {}

    public static final Target CHECKOUT =
            Target.the("botón checkout")
                    .located(By.id("checkout"));
}