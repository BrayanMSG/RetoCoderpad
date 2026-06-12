package com.tuusuario.quantum.stepdefinitions;

import com.tuusuario.quantum.questions.PurchaseMessage;
import com.tuusuario.quantum.tasks.AddProducts;
import com.tuusuario.quantum.tasks.CompleteCheckout;
import com.tuusuario.quantum.tasks.GoToCart;
import com.tuusuario.quantum.tasks.Login;
import com.tuusuario.quantum.userinterfaces.HomePage;
import com.tuusuario.quantum.models.CustomerData;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static org.hamcrest.Matchers.equalTo;

public class SauceDemoStepDefinition {

    private Actor actor;

    @Before
    public void configuracionInicial() {
        OnStage.setTheStage(new OnlineCast());
        actor = theActorCalled("Cliente");
    }

    @After
    public void tearDown() {
        OnStage.drawTheCurtain();
    }

    @Given("que el usuario ingresa a Saucedemo")
    public void queElUsuarioIngresaASaucedemo() {

        actor.wasAbleTo(
                Open.browserOn().the(HomePage.class)
        );
    }

    @When("inicia sesion con credenciales validas")
    public void iniciaSesionConCredencialesValidas() {

        actor.attemptsTo(
                Login.successfully()
        );
    }

    @And("agrega dos productos al carrito")
    public void agregaDosProductosAlCarrito() {

        actor.attemptsTo(
                AddProducts.toCart()
        );
    }

    @And("visualiza el carrito")
    public void visualizaElCarrito() {

        actor.attemptsTo(
                GoToCart.view()
        );
    }

    @And("completa el checkout")
    public void completaElCheckout(DataTable dataTable) {

        Map<String, String> data = dataTable.asMaps(String.class, String.class).getFirst();

        CustomerData customerData = new CustomerData(
                data.get("firstName"),
                data.get("lastName"),
                data.get("postalCode")
        );

        actor.attemptsTo(
                CompleteCheckout.with(customerData)
        );
    }

    @Then("deberia visualizar el mensaje {string}")
    public void deberiaVisualizarElMensaje(String MessageExpected) {

        actor.should(
                seeThat(
                        PurchaseMessage.displayed(),
                        equalTo(MessageExpected)
                )
        );
    }
}