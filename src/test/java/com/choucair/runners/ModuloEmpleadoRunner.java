package com.choucair.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/feature/modulo_empleado.feature",
        glue = "com.choucair.stepsdefinitions",
        snippets = SnippetType.CAMELCASE
)
public class ModuloEmpleadoRunner {
}
