Feature: Search

Scenario Outline: Search Articles

Given the user is in the index page
When the user enters <article> in the search bar
And the user clicks the search button
Then the <article> page appears
Then Close Browser

Examples:
 | article |
 | dresses |
 | blouses |

