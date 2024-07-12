package org.qvision.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.Switch;

import static org.qvision.userinterfaces.PaginaAlojamiento.*;


public class SeleccionarCategoria implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(FILTRO_ORDENAR_POR),
                Click.on(OPCION_PRECIO_MAS_BAJO),
                Scroll.to(CATEGORIA_3_ESTRELLAS),
                Click.on(CATEGORIA_3_ESTRELLAS),
                Click.on(CATEGORIA_4_ESTRELLAS),
                Click.on(CATEGORIA_5_ESTRELLAS),
                Click.on(BOTON_VER_DISPONIBILIDAD),
                Switch.toNewWindow()

        );

    }

    public static SeleccionarCategoria seleccionarCategoria() {
        return Tasks.instrumented(SeleccionarCategoria.class);
    }
}
