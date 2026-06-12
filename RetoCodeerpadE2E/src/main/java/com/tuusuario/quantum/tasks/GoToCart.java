package com.tuusuario.quantum.tasks;

import com.tuusuario.quantum.userinterfaces.InventoryPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class GoToCart implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(InventoryPage.CART)
        );
    }

    public static GoToCart view() {
        return Tasks.instrumented(GoToCart.class);
    }
}