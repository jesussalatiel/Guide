Feature: Java Functions

  Scenario: Call Java Methods
    * def operations = Java.type('demo.JavaFunctions')
    * def result = new operations().plus(1, 2);
    Then print 'result--', result

  Scenario: Read from CSV
		* def jsonFromCsv = read('../resources/TestData.csv')
		Then print 'Data: ', jsonFromCsv