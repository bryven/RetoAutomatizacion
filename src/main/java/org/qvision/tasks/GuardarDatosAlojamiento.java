package org.qvision.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.questions.Text;
import org.qvision.models.DatosReserva;
import org.qvision.userinterfaces.PaginaAlojamiento;

public class GuardarDatosAlojamiento implements Task {
    DatosReserva datosReserva = new DatosReserva();

    @Override
    public <T extends Actor> void performAs(T actor) {
        datosReserva.setNombreAlojamiento(Text.of(PaginaAlojamiento.NOMBRE_ALOJAMIENTO).answeredBy(actor));
        datosReserva.setPrecioAlojamiento(Text.of(PaginaAlojamiento.PRECIO_ALOJAMIENTO).answeredBy(actor));
        System.out.println(
                "------- Detalles Alojamiento -------" + '\n' +
                        "Nombre Alojamiento: " + datosReserva.getNombreAlojamiento() + '\n' +
                        "Precio Alojamiento: " + datosReserva.getPrecioAlojamiento() + '\n'


        );
    }

    public static GuardarDatosAlojamiento guardarDatosAlojamiento() {
        return Tasks.instrumented(GuardarDatosAlojamiento.class);
    }
}
