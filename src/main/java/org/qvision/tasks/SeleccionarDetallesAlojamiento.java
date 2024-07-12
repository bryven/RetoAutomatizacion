package org.qvision.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static org.qvision.interactions.AgregarAdultos.*;
import static org.qvision.interactions.AgregarHabitaciones.*;
import static org.qvision.interactions.AgregarInfantes.*;
import static org.qvision.userinterfaces.PaginaPrincipal.*;

public class SeleccionarDetallesAlojamiento implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(INFORMACION_OCUPACION),
                agregarAdultos(),
                agregarInfantes(),
                agregarHabitaciones(),
                Click.on(GUARDAR_INFORMACION_OCUPACION),
                Click.on(BOTON_BUSCAR)
        );
    }

    public static SeleccionarDetallesAlojamiento seleccionarDetallesAlojamiento() {
        return Tasks.instrumented(SeleccionarDetallesAlojamiento.class);
    }
}
