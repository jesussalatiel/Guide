Feature: Fetching User Details

  Scenario: Get Call for User Details
    Given url 'https://reqres.in/api/users/2'
    When method GET
    Then status 200

    #We are printing the Response of the API using the print keyword
    Then print response

    #Declaring and assigning a string value
    Given def varName = 'value'

    #Using a variable
    Then print varName

    
