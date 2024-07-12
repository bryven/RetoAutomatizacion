package org.qvision.interactions;

import com.github.javafaker.Faker;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import net.serenitybdd.screenplay.ui.Select;

import static org.qvision.userinterfaces.PaginaPrincipal.*;

public class AgregarInfantes implements Interaction {

    private final Faker faker = new Faker();

    @Override
    public <T extends Actor> void performAs(T actor) {
        String edadAleatoria = String.valueOf(faker.random().nextInt(0, 17));
        String edadAleatoria2 = String.valueOf(faker.random().nextInt(0, 17));
        actor.attemptsTo(
                Click.on(AGREGAR_INFANTES),
                Click.on(AGREGAR_INFANTES),
                Click.on(EDAD_INFANTE_1),
                Select.value(edadAleatoria).from(EDAD_INFANTE_1),
                Click.on(EDAD_INFANTE_2),
                Select.value(edadAleatoria2).from(EDAD_INFANTE_2)
        );
    }

    public static AgregarInfantes agregarInfantes() {
        return Tasks.instrumented(AgregarInfantes.class);
    }
}
