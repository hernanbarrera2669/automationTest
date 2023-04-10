package steps;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import models.Ingreso;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

import java.util.Map;

import static net.serenitybdd.rest.RestRequests.given;

public class ConsumoServicioRestStep {

    public Response response;
    public RequestSpecification request;

    @Step
    public void crearEstructuraServicio(String cabecera, String valor) {
        request = given().header(cabecera, valor);
    }

    @Step
    public void llamarServicioRestPost(String url, String usuario, String clave) {
        response = request.when().body(datosIngreso(usuario, clave)).post(url);
    }

    @Step
    public void verificarDatosServicioPost(String estado) {
        Assert.assertEquals(Integer.parseInt(estado), response.getStatusCode());
    }

    @Step
    public void verificarDatosServicioPostClaveErronea(String estado, String reason) {
        Map<String, String> datosJsonPost = response.jsonPath().get();
        Assert.assertEquals(Integer.parseInt(estado), response.getStatusCode());
        Assert.assertEquals(reason, datosJsonPost.get("reason"));
    }

    public Ingreso datosIngreso(String usuario, String clave) {
        Ingreso registro = new Ingreso(usuario, clave);
        registro.setUsuario(usuario);
        registro.setClave(clave);
        return registro;
    }
}
