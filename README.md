# 🧮 Calculator Project - Java TDD
Este proyecto consiste en una calculadora funcional desarrollada siguiendo la metodología TDD (Test-Driven Development). El objetivo es proporcionar una herramienta robusta para realizar las cuatro operaciones aritméticas básicas, garantizando la fiabilidad mediante una suite completa de pruebas unitarias.

## 🚀 Funcionalidades y Métodos
La clase Calculator implementa los siguientes métodos estáticos:

**Suma (sum):** Realiza la adición de dos números de punto flotante (float).

**Resta (subtract):** Calcula la diferencia entre dos números.

**Multiplicación (multiply):** Obtiene el producto de dos factores.

**División (divide):** Realiza el cociente, incluyendo un control de errores para evitar la división por cero.

## 🧪 Estrategia de Testing (TDD)
Se han implementado pruebas exhaustivas utilizando JUnit 5 y Tests Parametrizados para cubrir diversos escenarios de entrada.

Tipos de Tests realizados:
* **Pruebas de éxito:** Validan resultados esperados para números positivos, negativos y decimales.

* **Tests Parametrizados (@CsvSource):** Permiten ejecutar el mismo test con múltiples conjuntos de datos, optimizando la cobertura.

* **Control de bordes:** Validación específica para la división por cero, asegurando que el sistema no colapse y devuelva un valor controlado (0) con un mensaje de advertencia.

**Resultado de los Tests:**

![Captura de pantalla 2026-03-09 134905.png](src/main/java/images/Captura%20de%20pantalla%202026-03-09%20134905.png)

## 🏗️ Arquitectura y Principios SOLID
El código ha sido estructurado siguiendo buenas prácticas de ingeniería de software:

**S (Single Responsibility):**![Captura de pantalla 2026-03-09 134905.png](src/main/java/images/Captura%20de%20pantalla%202026-03-09%20134905.png) La clase Calculator se encarga exclusivamente del cálculo, mientras que Main se encarga de la interacción y CalculatorTest de la validación.

**![Captura de pantalla 2026-03-09 134905.png](src/main/java/images/Captura%20de%20pantalla%202026-03-09%20134905.png)Naming Profesional:**![Captura de pantalla 2026-03-09 134905.png](src/main/java/images/Captura%20de%20pantalla%202026-03-09%20134905.png) Métodos nombrados bajo el estándar should_behavior_when_condition.

**![Captura de pantalla 2026-03-09 134905.png](src/main/java/images/Captura%20de%20pantalla%202026-03-09%20134905.png)Encapsulamiento:**![Captura de pantalla 2026-03-09 134905.png](src/main/java/images/Captura%20de%20pantalla%202026-03-09%20134905.png) Métodos públicos y estáticos para facilitar el acceso sin necesidad de instanciación innecesaria.

## 💻 Ejecución
Para ejecutar el programa y ver la demostración en consola:

Clona el repositorio.

Ejecuta la clase Main.java.

Para ejecutar los tests, usa el comando: mvn test o el ejecutor de JUnit de tu IDE.