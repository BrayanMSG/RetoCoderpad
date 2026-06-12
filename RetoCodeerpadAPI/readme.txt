RETO TÉCNICO – AUTOMATIZACIÓN API

Tecnologías utilizadas:

- Java 24
- Gradle
- Karate Framework 2.0.0
- JUnit Jupiter


ESTRUCTURA DEL PROYECTO

src/test/java
    └── com.tuusuario.quantum.runners

src/test/resources
    ├── features
    └── data

Archivos principales:

- PetStoreRunner.java
- petstore.feature
- createPet.json
- karate-config.js


REQUISITOS PREVIOS

1. Java JDK 24 instalado.
2. Gradle instalado o Gradle Wrapper incluido.
3. Conexión a internet.

Verificar instalación:

java --version

gradle --version


CONFIGURACIÓN

La URL base se encuentra configurada en:

karate-config.js

URL utilizada:

https://petstore.swagger.io/v2


EJECUCIÓN DEL PROYECTO


Desde la raíz del proyecto ejecutar:

./gradlew clean test o gradlew clean test


ESCENARIO IMPLEMENTADO

Flujo CRUD de mascota utilizando la API pública de PetStore:

1. Crear mascota.
2. Consultar mascota por ID.
3. Actualizar nombre y estado de la mascota.
4. Consultar mascota actualizada mediante búsqueda por estado.


VALIDACIONES IMPLEMENTADAS

Creación:

- Código HTTP 200.
- Validación de nombre.
- Validación de estado.

Consulta por ID:

- Código HTTP 200.
- Validación de ID.
- Validación de nombre.
- Validación de estado.

Actualización:

- Código HTTP 200.
- Validación de ID.
- Validación de nombre actualizado.
- Validación de estado actualizado.

Consulta por estado:

- Código HTTP 200.
- Validación de existencia de la mascota actualizada.
- Validación de nombre actualizado.
- Validación de estado "sold".


REPORTES

Los reportes son generados automáticamente por Karate.

Ubicación:

build/karate-reports/karate-summary.html

También se generan reportes adicionales en:

build/reports/tests/test/index.html


AUTOR

Brayan Sanchez Gaviria