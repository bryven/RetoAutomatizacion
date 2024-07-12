package org.qvision.stepsdefinitions.reserva;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.qvision.stepsdefinitions.setup.SetUpFrontEnd;

import static net.serenitybdd.screenplay.actors.OnStage.*;
import static org.qvision.tasks.AbrirPaginaWeb.abrirPaginaWeb;
import static org.qvision.tasks.GuardarDatosAlojamiento.guardarDatosAlojamiento;;
import static org.qvision.tasks.SeleccionarCategoria.seleccionarCategoria;
import static org.qvision.tasks.SeleccionarDestino.*;
import static org.qvision.tasks.SeleccionarDetallesAlojamiento.*;
import static org.qvision.tasks.SeleccionarRangoPrecio.*;

public class ReservaSteps extends SetUpFrontEnd {
    @Before
    public void inicializarTest() {
        configurarPrueba();
    }

    @Given("que el usuario se encuentra en el portal")
    public void queElUsuarioSeEncuentraEnElPortal() {
        theActorInTheSpotlight().wasAbleTo(abrirPaginaWeb());
    }

    @When("realice la reserva del hotel con {string}")
    public void realiceLaReservaDelHotelCon(String destino) {
        theActorInTheSpotlight().attemptsTo(seleccionarDestino().hacia(destino));
    }

    @When("con numeroHabitaciones, numeroAdultos y numeroNiños")
    public void conNumeroHabitacionesNumeroAdultosYNumeroNiños() {
       theActorInTheSpotlight().attemptsTo(seleccionarDetallesAlojamiento());
    }

    @When("con rangoDePrecios")
    public void conRangoDePrecios() {
        theActorInTheSpotlight().attemptsTo(seleccionarRangoPrecio());
    }

    @When("con numeroDeEstrellas")
    public void conNumeroDeEstrellas() {
        theActorInTheSpotlight().attemptsTo(seleccionarCategoria());
    }

    @Then("el usuario guarda la informacion del hotel")
    public void elUsuarioGuardaLaInformacionDelHotel() {
        theActorInTheSpotlight().attemptsTo(guardarDatosAlojamiento());
    }

}
