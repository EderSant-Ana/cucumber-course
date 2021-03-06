Feature: Final Bill Calculation

@ScenariOutlineExample
Scenario Outline: Customer Bill Amount Calculation
Given I have a Customer
And user enters initial bill amount as <InitialBillAmount>
And Sales Tax Rate is <TaxRate> Percent
Then final bill amount calculated is <CalculatedBillAmount>
Examples:
|InitialBillAmount|TaxRate|CalculatedBillAmount|
|100              |10     |110|
|200              |8      |216|
|100              |1.55   |101.55|
|300              |13.00  |339|
|1000             |15.00  |1150.0|