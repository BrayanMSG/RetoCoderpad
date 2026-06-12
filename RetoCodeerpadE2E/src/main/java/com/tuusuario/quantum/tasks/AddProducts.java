package com.tuusuario.quantum.tasks;

import com.tuusuario.quantum.userinterfaces.InventoryPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class AddProducts implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(InventoryPage.BACKPACK),
                Click.on(InventoryPage.BIKE_LIGHT)
        );
    }

    public static AddProducts toCart() {
        return Tasks.instrumented(AddProducts.class);
    }
}