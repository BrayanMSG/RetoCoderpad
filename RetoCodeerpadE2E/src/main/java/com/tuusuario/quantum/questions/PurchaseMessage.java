package com.tuusuario.quantum.questions;

import com.tuusuario.quantum.userinterfaces.ConfirmationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class PurchaseMessage implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(
                ConfirmationPage.PURCHASE_MESSAGE
        ).answeredBy(actor);
    }

    public static PurchaseMessage displayed() {
        return new PurchaseMessage();
    }
}