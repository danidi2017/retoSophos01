package com.metro.www.questions;


import com.metro.www.userinterface.BuscarProducto;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class verificarProducto implements Question<Boolean> {
public Boolean answeredBy(Actor actor) {
		
		if (BuscarProducto.LISTA_RESULTADOS.resolveFor(actor).isVisible()){
			return true;
		}
		return false;
		}
		
		public static verificarProducto validar() {return new verificarProducto();}


}
