package org.qvision.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class PaginaAlojamiento extends PageObject {
    public static final Target FILTRO_ORDENAR_POR = Target.the("Filtro Ordenar Por")
            .locatedBy("//button[@data-testid='sorters-dropdown-trigger']");

    public static final Target OPCION_PRECIO_MAS_BAJO = Target.the("Opcion Precio Mas Bajo")
            .locatedBy("//button[@data-id='price']");

    public static final Target BARRA_RANGO_PRECIO = Target.the("Barra Rango Precio")
            .locatedBy("(//input[@class='a3ad3bc9e4'][@type='range'])[1]");

    public static final Target CATEGORIA_3_ESTRELLAS = Target.the("Categoria 3 Estrellas")
            .locatedBy("(//input[@name='class=3'])[1]");

    public static final Target CATEGORIA_4_ESTRELLAS = Target.the("Categoria 3 Estrellas")
            .locatedBy("(//input[@name='class=4'])[1]");

    public static final Target CATEGORIA_5_ESTRELLAS = Target.the("Categoria 3 Estrellas")
            .locatedBy("(//input[@name='class=5'])[1]");

    public static final Target BOTON_VER_DISPONIBILIDAD = Target.the("Boton Ver Disponibilidad")
            .locatedBy("(//a[@data-testid='availability-cta-btn'])[1]");

    public static final Target NOMBRE_ALOJAMIENTO = Target.the("Nombre Alojamiento")
            .locatedBy("//h2[@class='af32860db5 pp-header__title']");

    public static final Target DIRECCION_ALOJAMIENTO = Target.the("Direccion Alojamiento")
            .locatedBy("//span[@aria-describedby='tooltip-1']");

    public static final Target PRECIO_ALOJAMIENTO = Target.the("Precio Alojamiento")
            .locatedBy("(//span[@class='prco-valign-middle-helper'])[1]");



}
