package org.qvision.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static org.qvision.userinterfaces.PaginaPrincipal.*;

public class AgregarHabitaciones implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(AGREGAR_HABITACIONES)
        );
    }

    public static AgregarHabitaciones agregarHabitaciones() {
        return Tasks.instrumented(AgregarHabitaciones.class);
    }
}
