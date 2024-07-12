# PRUEBAS AUTOMATIZADAS RETO AUTOMACION

## Contexto

Este proyecto contiene el features de pruebas de integración asociadas el proceso de reserva de alojamiento de la pagina de booking, utilizando Java y el framework de Serenity bajo el patrón de diseño screenplay.

En este repositorio se ubican las pruebas de front que exponen el flujo de ejecucion que muestra el proceso de realizacion de la reserva del alojamiento.

# Comando de ejecucion local
```sh
./gradlew clean build test --tests --stacktrace --info
```

# Variables de entorno
NO se manejan

*Nota: Para ejecución en pipeline, estas variables se configuran como variables de pipeline.*

# Reporte de Serenity

Después de ejecutar las pruebas, el informe generado por Serenity se encuentra en la siguiente ubicación:

```sh
target/site/serenity/index.html
``