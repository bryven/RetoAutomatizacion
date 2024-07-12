package org.qvision.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import static org.qvision.userinterfaces.PaginaAlojamiento.BARRA_RANGO_PRECIO;

public class SeleccionarRangoPrecio implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

        );
    }

    public static SeleccionarRangoPrecio seleccionarRangoPrecio() {
        return Tasks.instrumented(SeleccionarRangoPrecio.class);
    }
}
