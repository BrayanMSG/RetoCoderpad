# Reto Técnico Automatización

## Tecnologías utilizadas

### Automatización E2E

- Java 24
- Gradle
- Serenity BDD
- Screenplay Pattern
- Selenium WebDriver
- Cucumber

### Automatización API

- Java 24
- Gradle
- Karate Framework 2.0
- JUnit Jupiter

---

## Estructura

```text
e2e-saucedemo/
api-petstore/
```

---

## Ejecución E2E

```bash
cd e2e-saucedemo
gradlew clean test aggregate o ./gradlew clean test aggregate
```

---

## Ejecución API

```bash
cd api-petstore
gradlew clean test o ./gradlew clean test
```

---

## Reportes

### Serenity

```text
target/site/serenity/index.html
```

### Karate

```text
build/karate-reports/karate-summary.html
```

---

## Autor

Brayan Sánchez Gaviria