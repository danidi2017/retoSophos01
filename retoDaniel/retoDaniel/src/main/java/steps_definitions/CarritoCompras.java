package steps_definitions;


import com.metro.www.questions.verificarProducto;
import com.metro.www.userinterface.OpcionPagina;
import Tasks.Navegar;
import Tasks.buscarProd;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Screenshots;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import org.openqa.selenium.WebDriver;


public class CarritoCompras {
	
	@Managed(uniqueSession = true)
    private WebDriver driver;

        @Given("^el usuario ingresa a la pagina web$")
        public void elUsuarioIngresaALaPaginaWeb() {
        	OnStage.setTheStage(new OnlineCast());

            OnStage.aNewActor().can(BrowseTheWeb.with(driver));
        	theActorInTheSpotlight().wasAbleTo(Navegar.en(OpcionPagina.WEB));
        }
     
        @When("^busca el producto a comprar samsung$")
        public void buscaElProductoAComprarSamsung(String producto) {
        	theActorInTheSpotlight().attemptsTo(buscarProd.conLosSiguientesDatos(producto));
           
        }

        @Then("^verifica que se agrego al carro$")
        public void verificaQueSeAgregoAlCarro() {
        	theActorInTheSpotlight().should(seeThat(verificarProducto.validar()));
        }
    }

    
