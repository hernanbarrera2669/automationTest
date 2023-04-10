package com.reto.tyba.stepdefinitions;

import com.reto.tyba.enums.Mensajes;
import com.reto.tyba.exceptions.ExcepcionesGenerales;
import com.reto.tyba.questions.VerificarAutenticacionExitosa;
import com.reto.tyba.questions.VerificarMensajeAutenticacionFallida;
import com.reto.tyba.task.IngresoUsuario;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class SauceDemoStepDefinitions {

    @Cuando("^Ingrese con el usuario (.*) y contraseña (.*)")
    public void datosIngresoPortal(String usuario, String clave) {
        theActorInTheSpotlight().attemptsTo(IngresoUsuario.realizarLoginUsuario(usuario, clave));
    }

    @Entonces("Se mostrará un error de autenticación$")
    public void verificarIngresoFallido() {
        theActorInTheSpotlight().should(seeThat(VerificarMensajeAutenticacionFallida.isCorrect(), equalTo(Mensajes.MENSAJE_AUTENTICACION_FALLIDA.getMensaje()))
                .orComplainWith(
                        ExcepcionesGenerales.class, Mensajes.USUARIO_DISPONIBLE.getMensaje()));
    }

    @Entonces("Se ingresa de manera exitosa al portal web$")
    public void verificarIngresoExitoso() {
        theActorInTheSpotlight().should(seeThat(VerificarAutenticacionExitosa.isCorrect(), equalTo(Mensajes.LISTADO_PRODUCTOS.getMensaje()))
                .orComplainWith(
                        ExcepcionesGenerales.class, Mensajes.USUARIO_BLOQUEADO.getMensaje()));
    }
}
