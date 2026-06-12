package com.tuusuario.quantum.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CheckoutPage {

    private CheckoutPage() {}

    public static final Target FIRST_NAME =
            Target.the("nombre")
                    .located(By.id("first-name"));

    public static final Target LAST_NAME =
            Target.the("apellido")
                    .located(By.id("last-name"));

    public static final Target POSTAL_CODE =
            Target.the("código postal")
                    .located(By.id("postal-code"));

    public static final Target CONTINUE =
            Target.the("continuar")
                    .located(By.id("continue"));

    public static final Target FINISH =
            Target.the("finalizar compra")
                    .located(By.id("finish"));
}