package com.metro.www.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class BuscarProducto extends PageObject {

    public static final Target CAMPO_BUSCAR = Target.the("") .locatedBy("#search-autocomplete-input");
    public static final Target LISTA_RESULTADOS = Target.the("") .locatedBy("product-item--search product-item--inline");
    public static final Target LISTA_BOTON_AGREGAR_CARRO = Target.the("").locatedBy("button.product-add-to-cart");
    public static final Target BOTON_CARRITO = Target.the("").locatedBy("button.minicart__action--toggle-open");
    public static final Target BOTON_VER_CARRO = Target.the("").locatedBy("a.minicart__action");

  
 
}
