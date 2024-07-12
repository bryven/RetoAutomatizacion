package org.qvision.stepsdefinitions.setup;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.*;
import static org.qvision.utils.Diccionario.ACTOR;

public class SetUpFrontEnd {

    @Managed
    protected WebDriver webDriver;

    private void inicializarActorEscenario() {
        setTheStage(Cast.ofStandardActors());
        theActorCalled(ACTOR);
        theActorInTheSpotlight().can(BrowseTheWeb.with(webDriver));
    }

    protected void configurarPrueba() {
        inicializarActorEscenario();
    }
}
