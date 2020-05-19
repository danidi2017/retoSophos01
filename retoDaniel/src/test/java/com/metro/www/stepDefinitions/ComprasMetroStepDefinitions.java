package com.metro.www.stepDefinitions;


import com.metro.www.tasks.BusquedaDeProducto;
import com.metro.www.userinterface.BuscarProducto;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ComprasMetroStepDefinitions {
private BuscarProducto metroProdcutos;

    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Before
    public void configuracionInicial() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.aNewActor().can(
                BrowseTheWeb.with(driver));
    }


    @Given("^ingrese a la pagina de metro y busque el producto (.+)$")
    public void quieroComprarUnProducto(String name) throws Throwable {
        theActorInTheSpotlight().attemptsTo(
                Open.browserOn(metroProdcutos),
                BusquedaDeProducto.conElProducto()
        );

    }

    @When("^agrego el (.+) al carro$")
    public void agregoElAlCarro(String producto) throws Throwable {
    }

    @Then("^verifica que se agrego al carro$")
    public void verificaQueSeAgregoAlCarro() throws Throwable {
    }
}
