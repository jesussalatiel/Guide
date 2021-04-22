Feature: Fetching User Details

  Background: 
    * url 'https://reqres.in/api' 
  

  Scenario Outline: Get Call for User Details
    Given path 'users', <user>
    When method GET
    Then status 200
    And match $..last_name contains <name>

    Examples: 
      | user | name     |
      |    2 | 'Weaver' |
      |    3 | 'Wong'   |
      |    1 | 'Bluth'  |
