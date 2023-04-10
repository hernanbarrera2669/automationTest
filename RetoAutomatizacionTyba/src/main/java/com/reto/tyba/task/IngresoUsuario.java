package com.reto.tyba.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static com.reto.tyba.userinterfaces.LoginUsuario.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class IngresoUsuario implements Task {
    private final String usuario ;
    private final String clave;

    protected IngresoUsuario(String usuario, String clave){
        this.usuario=usuario;
        this.clave=clave;
    }

    public static IngresoUsuario realizarLoginUsuario(
            String usuario,
            String clave){
        return Tasks.instrumented(
                IngresoUsuario.class, usuario, clave);
    }

    @Step("{0} Se ingresan los datos del usuario")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(usuario).into(TXT_USUARIO_LOGIN),
                Enter.theValue(clave).into(TXT_CLAVE_LOGIN),
                WaitUntil.the(BTN_LOGIN, isClickable()).forNoMoreThan(5).seconds(),
                Click.on(BTN_LOGIN)
        );
    }
}
