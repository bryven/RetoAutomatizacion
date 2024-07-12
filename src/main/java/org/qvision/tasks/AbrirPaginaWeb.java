package org.qvision.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

import static org.qvision.utils.Diccionario.URL_APLICATIVO;

public class AbrirPaginaWeb implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(
                Open.url(URL_APLICATIVO)
        );
    }

    public static AbrirPaginaWeb abrirPaginaWeb() {
        return Tasks.instrumented(AbrirPaginaWeb.class);
    }
}
