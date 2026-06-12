package com.tuusuario.quantum.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ConfirmationPage {

    private ConfirmationPage() {}

    public static final Target PURCHASE_MESSAGE =
            Target.the("mensaje de compra exitosa")
                    .located(By.className("complete-header"));
}