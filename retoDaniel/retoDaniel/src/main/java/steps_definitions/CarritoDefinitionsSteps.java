package steps_definitions;


import com.metro.www.questions.verificarProducto;
import com.metro.www.userinterface.OpcionPagina;
import Tasks.Navegar;
import Tasks.buscarProd;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Screenshots;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class CarritoDefinitionsSteps {
	
	   @Given("^el usuario ingresa a la pagina web$")
	    public void el_usuario_ingresa_a_la_pagina_web() throws Throwable {
		 theActorInTheSpotlight().wasAbleTo(Navegar.en(OpcionPagina.WEB));
	    }
           
        
        @When("^busca_el_producto_a_comprar (.+) $")
        public void buscaelproductoacomprar(String producto) throws Throwable {
        theActorInTheSpotlight().attemptsTo(buscarProd.conLosSiguientesDatos(producto));
        }

        @Then("^verifica que se agrego al carro $")
        public void verifica_que_se_agrego_al_carro() throws Throwable {
        theActorInTheSpotlight().should(seeThat(verificarProducto.validar()));
        }

    }
