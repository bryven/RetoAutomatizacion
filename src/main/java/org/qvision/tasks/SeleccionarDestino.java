package org.qvision.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;
import static org.openqa.selenium.Keys.ENTER;
import static org.qvision.userinterfaces.PaginaPrincipal.*;
import static org.qvision.utils.DateTimeUtil.*;
import static org.qvision.utils.Diccionario.TIME_OUT;

public class SeleccionarDestino implements Task {

    private String destino;

    public SeleccionarDestino hacia(String destino) {
        this.destino = destino;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(IGNORAR_INICIO_SESION, isVisible()).forNoMoreThan(TIME_OUT).seconds(),
                Click.on(IGNORAR_INICIO_SESION),
                Click.on(CAMPO_DESTINO),
                SendKeys.of(destino).into(CAMPO_DESTINO).thenHit(ENTER),
                WaitUntil.the(getFechaEntrada(obtenerFechaEntrada()), isVisible()).forNoMoreThan(TIME_OUT).seconds(),
                Click.on(getFechaEntrada(obtenerFechaEntrada())),
                Click.on(getFechaSalida(obtenerFechaSalida()))

        );
    }

    public static SeleccionarDestino seleccionarDestino() {
        return Tasks.instrumented(SeleccionarDestino.class);
    }
}
