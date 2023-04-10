package com.reto.tyba.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/autenticacion_exitosa_saucedemo.feature",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        glue = "com/reto/tyba/stepdefinitions")

public class RetoSauceDemo {
}
