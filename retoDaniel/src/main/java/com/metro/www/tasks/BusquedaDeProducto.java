package com.metro.www.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


import java.time.Duration;

import static com.metro.www.userinterface.BuscarProducto.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class BusquedaDeProducto implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CERRAR_MODAL.waitingForNoMoreThan(Duration.ofSeconds(15))),
                Enter.theValue("xbox \n").into(CAMPO_BUSCAR)

                );
    }


    public static BusquedaDeProducto conElProducto() {
        return instrumented(BusquedaDeProducto.class);
    }

}
