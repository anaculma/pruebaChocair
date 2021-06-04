package com.choucair.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.choucair.userinterfaces.ChoucairEmpleos.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IrPortalEmpleados implements Task {


    public static Performable redireccionarPagina(){
        return instrumented(IrPortalEmpleados.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_COOKIES),
                Click.on(BTN_IR_PORTAL),
                Click.on(BTN_CONTINUAR)
        );
    }
}
