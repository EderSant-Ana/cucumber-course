Feature: Data Tables

@ListOfString
Scenario: Bill Amount Generation as a List
Given I placed an order for the following items
|Cucumber Sandwich|2|20|
When I generate the bill
Then a bill for $40 should be generated 

@ListOfListOfString
Scenario: Bill another Amount Generation as a List of Lists
Given I placed another order for the following items
|Cucumber Sandwich|2|20|
|Cucumber Salad|1|15|
When I generate the bill
Then a bill for $55 should be generated 

@ListOfMaps
Scenario: Bill another Amount Generation as a List of Map
Given I placed another order for the following list of maps
|ItemName         |Units|UnitPrice|
|Cucumber Sandwich|2    |20|
|Cucumber Salad   |1    |15|
When I generate the bill
Then a bill for $55 should be generated