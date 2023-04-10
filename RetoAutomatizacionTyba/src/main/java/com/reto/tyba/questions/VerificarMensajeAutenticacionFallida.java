package com.reto.tyba.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.reto.tyba.userinterfaces.LoginUsuario.LBL_MENSAJE_AUTENTICACION_FALLIDA;

public class VerificarMensajeAutenticacionFallida implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return LBL_MENSAJE_AUTENTICACION_FALLIDA.resolveFor(actor).getText();
    }

    public static VerificarMensajeAutenticacionFallida isCorrect() {
        return new VerificarMensajeAutenticacionFallida();
    }
}
