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

The primary keywords are:
- Given
- When
- Get
- Then 
```java
    @Test
    public void test() {

		Response response = RestAssured.get("https://reqres.in/api/users?page=2");
		System.out.println(response.statusCode());
		System.out.println(response.asString());
		System.out.println(response.getBody().asString());
		System.out.println(response.statusLine());

		int statusCode = response.getStatusCode();
		Assert.assertEquals(statusCode, 200);

	}

	@Test
	public void test1() {
		given().get("https://reqres.in/api/users?page=2").then().statusCode(200).body("data.id[1]", equalTo(8))
				.body("data.first_name", hasItems("Michael", "Lindsay")).log().all();
	}
```
[Reference](https://www.sdos.es/blog/descubre-como-automatizar-service-tests-con-rest-assured)
# Gherkin
Describe business behavior without goig into detail of implementation. It uses plain language to describe uses cases and allows users to remove logic details from behavior test. A gherkin document has an extension ".feature" and simply just a test file with a fancy extension. Cucumber reads Gherkins document and executes a test to validate that the software behaves as per the Gherkin syntax.

The primary keywords are:
- Feature: The file should have extension ".feature" and each feature file should have only one feature.
- Rule: Represent one bussines rule that should be implemented. It provides additional information for a feature.
- Example or Scenario: Each feature file may have multiple scenarios, and each scenario start with Scenario: followed by scenario name.
- Given: The use of Given keyword is to put the system in a familira state before the users starts interating with the system.
- When: The step is to define action performed by the user.
- Then: The use of 'then' is to see the outcome after the action in when step-
- And & But: You may have multiple given when or then 
- Background: Help to add some context to the scenario. It can contain some steps of the scenario, but the only difference is that it should be run before each scenario.
- Scenario Outline or Scenario Template

There are a few secondary keywords as well:
- """ -> Doc Strings
- '|' -> Data Tables
- '@' -> Tags
- '#' Comments

## Example
```feature
Feature: Login functionality of social networking site Facebook.
Given: I am a facebook user.
When: I enter username as username.
And: I enter the password as the password
Then: I should be redirected to the home page pf facebook.
```
[Documentation](https://cucumber.io/docs/gherkin/reference/)

# Karate
Karate is the only open-source tool to combine API test-automation, mocks, performance testing and even UI automation into a single, unified framework. The BDD syntax popularized by Cucumber is language neutral. Assertions and HTML reports are built-in, and you can run test in parallel for speed. You don't have to compile code. Just write tests in a simple, readable syntax carefully designed for HTTP, JSON, GraphQL and XML. A Java API also exist for those who prefer to programmatically integrate Karate's rich automation and data assertion capabilities.

Keywords:
- match ==
- match !=
- match contains, match contains only, match contains any y match !contains

Comprobaciones Generucas
- @ :      Ignora el campo.
- @null:           El valor debe ser nulo.
- @notnull:    El valor no debe ser nulo.
- @array:        El valor debe ser una matriz JSON.
- @object:       El valor debe ser un objeto JSON.
- @boolean:   El valor debe ser verdadero o falso.
- @number:   El valor debe ser un número.
- @string:       El valor debe ser una cadena.
- @uuid:          El valor debe coincidir con el formato UUID.
- @regex:        El valor coincide con una expresión regular.
- @? EX:          La expresión de Javascript EX debe evaluarse como verdadera.

- tags = {“@SmokeTest”} Ejecuta todos los escenarios bajo el tag @SmokeTest

- tags = {“@gui”} Ejecuta todos los escenarios bajo el tag @gui, como en el ejemplo tenemos una feature bajo este tag, se ejecutarán todos los escenarios de esa feature.

- tags = {“@SmokeTest, @wip”} Ejecuta todos los escenarios que estén bajo el tag @SmokeTest o bajo el tag @wip (condición OR).

- tags = {“@SmokeTest”, “@RegressionTest”} Ejecuta todos los escenarios que estén bajo los tags @SmokeTest y @RegressionTest (condición AND).

- tags = {“~@SmokeTest”} ignora todos los escenarios bajo el tag @SmokeTest

- tags = {“@RegressionTest, ~@SmokeTest”} ejecuta todos los escenarios bajo el tag @RegressionTest, pero ignora todos los escenarios bajo el tag @SmokeTest

- tags = {“@gui“, “~@SmokeTest”, “~@RegressionTest”} ignora todos los escenarios bajo el tag @SmokeTest y @RegressionTest pero ejecuta todos los que estén bajo el tag “@gui”, si seguimos el ejemplo es como ejecutar todos los escenarios de la feature que no estén bajo ningún otro tag.


1. url : Defines the URL which we want to hit and get some data. Asterisk (*) means that this URL will be used in all the requests in the particular feature file.
2. def: Defines the values of the variables.
3. path : It defines the path of the URL. So, if you are using same base URL but are required to hit multiple endpoints to can use this feature.
4. method : It defines the type of HTTP method which is to be used in the request.
5. status : It is the expected status code from the service. It validates that the service returns the correct status code in response.
6. print : It is used to print the response body of the request.
7. match : Is is used for asserting values on the response body.
8. $ : Denotes response body.

[Documentation](https://github.com/intuit/karate)
[Documentation](https://www.sngular.com/es/automatizacion-de-pruebas-con-karate-i/)

[Good Practices](https://www.federico-toledo.com/buenas-practicas-de-cucumber/)

[Mistakes Gherkin](https://www.spritecloud.com/the-3-most-common-mistakes-writing-gherkin-features/)
# BDD
Es una estrategia de desarrollo, cucumber "obliga" a documentar las pruebas automatizadas antes de implementarlas. Esto es fundamental para los test tal que se tienen que hacer legibles y claros para el usuario que a priori no conozca el comportamiento de la funcionalidad que se describe y mas mantenibles para reducir los costos de hacer modificaciones en los de los test. Estos scripts "feature" se deben o es recomendado redactarlos en primera persona "Como usuario [tipo de usuario] quiero [accion] para [resultado]"

[Custom Functions using Java and Javascript in Karate](https://tech.trivago.com/2019/11/14/automation-first-approach-using-the-karate-api-testing-framework/)


[](https://www.udemy.com/course/a4q-selenium-practice-exam-foundation-eng/)

[Creator Karate Test](https://hackernoon.com/the-world-needs-an-alternative-to-selenium-so-we-built-one-zrk3j3nyr)

# ITestListener
Listener is defined as interface that modifies the default TestNG's behavior. As the name suggests Listeners "listen" to the event defined in the selenium script and behave accordingly. It is used in selenium by implementing Listeners Interface. It allows customizing TestNG reports or logs. There are many types of TestNG listeners available.

Below are the few TestNG listeners:

1. IAnnotationTransformer ,
2. IAnnotationTransformer2 ,
3. IConfigurable ,
4. IConfigurationListener ,
5. IExecutionListener,
6. IHookable ,
7. IInvokedMethodListener ,
8. IInvokedMethodListener2 ,
9. IMethodInterceptor ,
10. IReporter,
11. ISuiteListener,
12. ITestListener .

## ITestListener has following methods
1. OnStart- OnStart method is called when any Test starts.
2. onTestSuccess- onTestSuccess method is called on the success of any Test.
3. onTestFailure- onTestFailure method is called on the failure of any Test.
4. onTestSkipped- onTestSkipped method is called on skipped of any Test.
5. onTestFailedButWithinSuccessPercentage- method is called each time Test fails  but is within success percentage.
6. onFinish- onFinish method is called after all Tests are executed.
```java
public class ListenersTestNG implements ITestListener, IInvokedMethodListener {

	public void onStart(ITestContext context) {
		System.out.println("onStart method started");
	}

	public void onFinish(ITestContext context) {
		System.out.println("onFinish method started");
	}

	public void onTestStart(ITestResult result) {
		System.out.println("New Test Started " + "[ " + result.getName() + " ]");
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("onTestSuccess Method " + "[ " + result.getName() + " ]");
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("onTestFailure Method " + "[ " + result.getName() + " ]");
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("onTestSkipped Method " + "[ " + result.getName() + " ]");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("onTestFailedButWithinSuccessPercentage " + "[ " + result.getName() + " ]");
	}

	public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {

		System.out.println("Before Invocation Method Started For: " + "{ " + method.getTestMethod().getMethodName()
				+ "of Class:" + testResult.getTestClass() + " }");
	}

	public void afterInvocation(IInvokedMethod method, ITestResult testResult) {

		System.out.println("After Invocation Method Started For: " + "{[ " + method.getTestMethod().getMethodName()
				+ "of Class:" + testResult.getTestClass() + " }");

	}
```