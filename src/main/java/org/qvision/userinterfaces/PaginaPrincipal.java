package org.qvision.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class PaginaPrincipal extends PageObject {
    public static final Target IGNORAR_INICIO_SESION = Target.the("Ignorar Inicio de Sesion")
            .locatedBy("//button[@class='bf33709ee1 a190bb5f27 dc0e35d124 a746857c37 e8d0e5d0c1 b81c794d25 f0298d74a8']");

    public static final Target CAMPO_DESTINO = Target.the("Campo Destino")
            .locatedBy("//input[@id=':rh:']");


    public static Target getFechaEntrada(String fecha) {
        return Target.the("Obtener Fecha Entrada")
                .locatedBy("//span[@data-date='" + fecha + "']");
    }

    public static Target getFechaSalida(String fecha) {
        return Target.the("Obtener Fecha Salida")
                .locatedBy("//span[@data-date='" + fecha + "']");
    }

    public static final Target INFORMACION_OCUPACION = Target.the("Informacion Ocupacion")
            .locatedBy("//button[@data-testid='occupancy-config']");

    public static final Target AGREGAR_ADULTOS = Target.the("Agregar Adultos")
            .locatedBy("(//button[@class='dba1b3bddf e99c25fd33 aabf155f9a f42ee7b31a a86bcdb87f e137a4dfeb d1821e6945'])[1]");

    public static final Target AGREGAR_INFANTES = Target.the("Agregar INFANTES")
            .locatedBy("(//button[@class='dba1b3bddf e99c25fd33 aabf155f9a f42ee7b31a a86bcdb87f e137a4dfeb d1821e6945'])[2]");

    public static final Target EDAD_INFANTE_1 = Target.the("Edad Infante 1")
            .locatedBy("(//select[@name='age'])[1]");

    public static final Target EDAD_INFANTE_2 = Target.the("Edad Infante 2")
            .locatedBy("(//select[@name='age'])[2]");

    public static final Target AGREGAR_HABITACIONES = Target.the("Agregar Kids")
            .locatedBy("(//button[@class='dba1b3bddf e99c25fd33 aabf155f9a f42ee7b31a a86bcdb87f e137a4dfeb d1821e6945'])[3]");

    public static final Target GUARDAR_INFORMACION_OCUPACION = Target.the("Guardar Informacion Ocupacion")
            .locatedBy("//button[@class='dba1b3bddf e99c25fd33 ea757ee64b a86bcdb87f ea220f5cdc ed852f1b1f c437808707']");

    public static final Target BOTON_BUSCAR = Target.the("Boton Buscar")
            .locatedBy("//button[@type='submit']");


}
