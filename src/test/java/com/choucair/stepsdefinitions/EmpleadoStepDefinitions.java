package com.choucair.stepsdefinitions;

import com.choucair.questions.VerificarDirigirsePortal;
import com.choucair.tasks.IrPortalEmpleados;
import com.choucair.userinterfaces.ChoucairEmpleos;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class EmpleadoStepDefinitions {

    @Before
    public void prepararActor() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActor("Ana");
    }

    @Given("^Ana se encuentra ubicada en el modulo de empleados$")
    public void anaSeEncuentraUbicadaEnElModuloDeEmpleados() {
        OnStage.theActorInTheSpotlight().wasAbleTo(
                Open.browserOn().the(ChoucairEmpleos.class)
        );
    }


    @When("^le da clic al boton ir al portal de empleados$")
    public void leDaClicAlBotonIrAlPortalDeEmpleados() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                IrPortalEmpleados.redireccionarPagina()
        );
    }

    @Then("^verifica que se direccione a la plataforma Magneto$")
    public void verificaQueSeDireccioneALaPlataformaMagneto() {
        OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(VerificarDirigirsePortal.verificarDireccionPagina())
        );
    }

}
