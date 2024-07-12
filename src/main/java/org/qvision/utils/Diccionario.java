package org.qvision.utils;

public abstract class Diccionario {
    public static final String ACTOR = "Bartolo";
    public static final String URL_APLICATIVO = "https://www.booking.com/";

    // **** Tiempos ****
    public static final int TIME_OUT = 10;

    public static void waiting(long millisTime) {
        try {
            Thread.sleep(millisTime * 1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Application Load Failed" + e.getStackTrace());
        }
    }
}
