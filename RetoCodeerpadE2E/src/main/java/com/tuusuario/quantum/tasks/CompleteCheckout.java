package com.tuusuario.quantum.tasks;

import com.tuusuario.quantum.models.CustomerData;
import com.tuusuario.quantum.userinterfaces.CartPage;
import com.tuusuario.quantum.userinterfaces.CheckoutPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class CompleteCheckout implements Task {

    private final CustomerData customerData;

    public CompleteCheckout(CustomerData customerData) {
        this.customerData = customerData;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                Click.on(CartPage.CHECKOUT),

                Enter.theValue(customerData.getFirstName())
                        .into(CheckoutPage.FIRST_NAME),

                Enter.theValue(customerData.getLastName())
                        .into(CheckoutPage.LAST_NAME),

                Enter.theValue(customerData.getPostalCode())
                        .into(CheckoutPage.POSTAL_CODE),

                Click.on(CheckoutPage.CONTINUE),

                Click.on(CheckoutPage.FINISH)
        );
    }

    public static CompleteCheckout with(CustomerData customerData) {
        return Tasks.instrumented(
                CompleteCheckout.class,
                customerData
        );
    }
}