Feature: Login to the leaptaps application

Background:
Given Launch the Chrome Browser
And Load the URL and Maximize

Scenario Outline: Positive Login
When Enter the Username as <UserName>
And Enter the Password as <Password>
And Click on the Login button
Then Verify the homepage is displayed

Examples:
|UserName|Password|
#|DemoSalesManager|crmsfa|
|DemoCSR|crmsfa|

Scenario: Negative Login
And Enter the Username as DemoCSR
And Enter the Password as crm
When Click on the Login button
But Verify the error message is displayed