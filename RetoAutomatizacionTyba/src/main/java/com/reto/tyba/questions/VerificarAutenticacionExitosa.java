package com.reto.tyba.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.reto.tyba.userinterfaces.LoginUsuario.LBL_LISTADO_PRODUCTOS;

public class VerificarAutenticacionExitosa implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return LBL_LISTADO_PRODUCTOS.resolveFor(actor).getText();
    }

    public static VerificarAutenticacionExitosa isCorrect() {
        return new VerificarAutenticacionExitosa();
    }
}
