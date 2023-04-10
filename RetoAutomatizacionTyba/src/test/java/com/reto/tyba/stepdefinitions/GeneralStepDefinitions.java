package com.reto.tyba.stepdefinitions;

import com.reto.tyba.task.Abrir;
import io.cucumber.java.Before;
import io.cucumber.java.es.Dado;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class GeneralStepDefinitions {

    @Managed(driver = "chrome")
    WebDriver hisBrowser;

    @Before
    public void setTheStage() {
        OnStage.setTheStage(OnlineCast.whereEveryoneCan(BrowseTheWeb.with(hisBrowser)));
    }

    @Dado("^Que el (.*) ingresa al portal web de Sauce demo")
    public void ingresarPortalWeb(String actor) {
        theActorCalled(actor).wasAbleTo(Abrir.portalWeb());
    }
}
