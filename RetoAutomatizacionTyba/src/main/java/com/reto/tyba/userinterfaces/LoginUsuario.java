package com.reto.tyba.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class LoginUsuario extends PageObject {

    public static final Target TXT_USUARIO_LOGIN =
            Target.the("Formulario de Ingreso Usuario").located(By.id("user-name"));

    public static final Target TXT_CLAVE_LOGIN =
            Target.the("Formulario de Ingreso clave").located(By.id("password"));

    public static final Target BTN_LOGIN =
            Target.the("Formulario de Ingreso para botón de ingreso").located(By.id("login-button"));

    public static final Target LBL_MENSAJE_AUTENTICACION_FALLIDA =
            Target.the("Formulario para verificar Mensaje de autenticacioón fallida").located(By.xpath("//div[@class='error-message-container error']"));

    public static final Target LBL_LISTADO_PRODUCTOS =
            Target.the("Formulario para verificar ingreso exitoso al portal").located(By.xpath("//div//span[contains(text(), 'Products')]"));

}
