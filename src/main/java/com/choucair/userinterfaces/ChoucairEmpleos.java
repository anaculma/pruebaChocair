package com.choucair.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class ChoucairEmpleos extends PageObject {

    public static final Target BTN_IR_PORTAL = Target.the("Boton que dirige a la pagina empleo").locatedBy("(//span[@class='elementor-button-text'])[1]");
    public static final Target BTN_COOKIES = Target.the("Boton que acepta las cookies").locatedBy("//a[@id='cookie_action_close_header']");
    public static final Target BTN_CONTINUAR = Target.the("Boton que permite ir al portal de empleo ").locatedBy("//span[@class='elementor-button-text'][contains(.,'Continuar')]");
 }

