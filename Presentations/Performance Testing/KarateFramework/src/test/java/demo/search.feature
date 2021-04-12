Feature: Java Functions

  Scenario: Call Java Methods
    * def javaDemo = Java.type('demo.JavaFunctions')
    * def result = new javaDemo().greeting();
    Then print 'result--', result
