# Performance Testing
- API: Conjunto de funciones y procedimientos que cumplen una serie de funciones con el fin de ser usados por otro software añadiendoles una capa de abstraccion.
- WebServices API: Son APIs a las cuales solo se puede acceder por medio de internet. Normalmente bajo el protocolo HTTP/S.
- HTTP: Es un protocolo de comunicación que permite la transferencia de información a través de internet.
- REST: Es un sistema nuevo lanzado como protocolo de intercambio y manipulacion de datos en los servicios de Internet que utiliza HTTP. Es diseñado para ser rápido tanto en el desarrollo como en su adopción.
- Es cualquier servicio weo o WebServices API que esta basado en Rest y que, ademas, accede a recursos usando enteramente el protocolo HTTP.

# REST Assured
Es un framework escrito en Java y diseñado para simplificar las priebas sobre servicios basados en REST. Ofrece un DSL descriptivo, que muestra una unión a un punto de conexion HTTP y da los resultados esperados. Este framework soporta las operaciones POST, GET, PUT, DELETE, OPTIONS, PATCH y HEAD, contiene herramientas para invocarlas y verificarlas.

- Se puede comprobar el estado del código, del mensaje e incluso, se puede ver el cuerpo de la respuesta. Ademas resulta muy facil concatenar llamadas y en todo momento se tiene el control del codigo.
- Son faciles de integrar con pruebas de todo tipo: funcionales, unitarias. integradas, etc.
- Codificado en Java e integrable con librerias como JUnit, TestNG o Maven.
-Es posible ejecutar pruebas automatizadas de UI y no requiere herramientas externas para ejecutarse.

(Reference)[https://www.sdos.es/blog/descubre-como-automatizar-service-tests-con-rest-assured]
# Gherkin
[Documentation](https://cucumber.io/docs/gherkin/reference/)
Describe business behavior without goig into detail of implementation. It uses plain language to describe uses cases and allows users to remove logic details from behavior test. A gherkin document has an extension ".feature" and simply just a test file with a fancy extension. Cucumber reads Gherkins document and executes a test to validate that the software behaves as per the Gherkin syntax.

The primary keywords are:
- Feature
- Rule
- Example or Scenario
- Given, When, Then, And, But
- Background
- Scenario Outline or Scenario Template

There are a few secondary keywords as well:
- """ -> Doc Strings
- '|' -> Data Tables
- '@' -> Tags
- '#' Comments
# Karate