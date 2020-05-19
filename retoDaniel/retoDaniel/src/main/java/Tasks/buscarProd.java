package Tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import org.openqa.selenium.By;


import com.metro.www.userinterface.BuscarProducto;



public class buscarProd implements Task {
    private String producto;
    

    public buscarProd(String producto) {
        this.producto = producto;
       
    }

    public static Performable lasCredenciales(String producto) {
        return instrumented(buscarProd.class, producto);
    }

	@Override
	public <T extends Actor> void performAs(T actor) {
		 actor.attemptsTo(Click.on(BuscarProducto.CAMPO_BUSCAR),
	                Enter.theValue(producto).into(BuscarProducto.CAMPO_BUSCAR),
	                Click.on(BuscarProducto.CAMPO_BUSCAR),	              
	                Click.on(BuscarProducto.BOTON_CARRITO)
	               
        );
		 
	}
		 
		 public static buscarProd conLosSiguientesDatos(String producto) {
			 return instrumented(buscarProd.class, producto);
		    }
  
}
