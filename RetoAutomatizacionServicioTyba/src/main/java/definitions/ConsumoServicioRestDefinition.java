package definitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.thucydides.core.annotations.Steps;
import steps.ConsumoServicioRestStep;

public class ConsumoServicioRestDefinition {

    @Steps ConsumoServicioRestStep autenticacionServicioPostStep;

    @Dado("^Que se crea la estructura del servicio con la (.*) y (.*)$")
    public void crearEstructura(String cabecera, String valor) {
        autenticacionServicioPostStep.crearEstructuraServicio(cabecera, valor);
    }

    @Cuando("^Se realiza un llamado al servicio (.*) con los datos (.*) y (.*)$")
    public void llamarServicioRestPost(String url, String usuario, String clave) {
        autenticacionServicioPostStep.llamarServicioRestPost(url, usuario, clave);
    }

    @Cuando("^Se realiza el llamado al servicio (.*) con usuario (.*) y clave incorrectos (.*)$")
    public void llamarServicioRestPostClaveErronea(String url, String usuario, String clave) {
        autenticacionServicioPostStep.llamarServicioRestPost(url, usuario, clave);
    }

    @Entonces("^Se verifica que el (.*) sea exitoso$")
    public void verificarDatosServicioRest(String estado) {
        autenticacionServicioPostStep.verificarDatosServicioPost(estado);
    }

    @Entonces("^Se verifica que el (.*) sea exitoso y el mensaje sea (.*)$")
    public void verificarDatosServicioRestClaveErronea(String estado, String reason) {
        autenticacionServicioPostStep.verificarDatosServicioPostClaveErronea(estado, reason);
    }
}
