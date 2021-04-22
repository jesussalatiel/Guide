@mio
Feature: Enclosed JavaScript with Arrays

  #https://github.com/intuit/karate/blob/master/karate-junit4/src/test/java/com/intuit/karate/junit4/demos/js-arrays.feature
  Background: 
    * def greeter = function(title, name){return 'Hello ' + title+ ' ' + name }

  Scenario: Print variables
    * def user = {name: 'Salatiel', age: 2}
    And def lang = 'es'
    * def embedded = {name: '#(user.name)', age:'#(user.age)', lang: '#(lang)'}
    * print embedded
    * match greeter('Mr', 'Salatiel') == 'Hello Mr Salatiel'
    * match greeter('Mr', 'Salatiel') != 'Hello Mr Salatiel.'
    * def cat = {name: ''}
    * set cat
      | path | value   |
      | name | 'Lucky' |
      | age  |      16 |
    * match cat == {name: 'Lucky', age:16}
    * set drinks
      | path  |         0 |         1 |
      | type  | 'beer'    | 'tequila' |
      | snack | 'Popcorn' | 'shrimp'  |
    * print drinks
    * match drinks == [{type: '#(drinks.type)', snack: '#(drinks.snack)' }, {type: '#(drinks.type)', snack: '#(drinks.snack)'}]
