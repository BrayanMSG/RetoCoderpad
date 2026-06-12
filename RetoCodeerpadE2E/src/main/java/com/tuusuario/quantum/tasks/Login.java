package com.tuusuario.quantum.tasks;

import com.tuusuario.quantum.userinterfaces.LoginPage;
import com.tuusuario.quantum.utils.Environment;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                Enter.theValue(
                        Environment.get("credentials.username")
                ).into(LoginPage.USERNAME),

                Enter.theValue(
                        Environment.get("credentials.password")
                ).into(LoginPage.PASSWORD),

                Click.on(LoginPage.LOGIN_BUTTON)
        );
    }

    public static Login successfully() {
        return Tasks.instrumented(Login.class);
    }
}