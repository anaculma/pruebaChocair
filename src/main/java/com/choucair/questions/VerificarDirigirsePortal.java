package com.choucair.questions;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class VerificarDirigirsePortal implements Question<Boolean> {

    public static VerificarDirigirsePortal verificarDireccionPagina() {
        return new VerificarDirigirsePortal();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String url = Serenity.getWebdriverManager().getWebdriver().getCurrentUrl();
        return url.equals("https://www.magneto365.com/choucair");
    }
}
