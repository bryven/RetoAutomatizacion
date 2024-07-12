package org.qvision.utils;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

public class DateTimeUtil {
    private DateTimeUtil() {
    }


    public static String obtenerFechaEntrada() {
        LocalDateTime now = LocalDateTime.now(ZoneOffset.UTC);
        LocalDateTime diasDespues = now.plusDays(2);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return diasDespues.format(formatter);
    }

    public static String obtenerFechaSalida() {
        LocalDateTime now = LocalDateTime.now(ZoneOffset.UTC);
        LocalDateTime diasDespues = now.plusDays(7);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return diasDespues.format(formatter);
    }
}
