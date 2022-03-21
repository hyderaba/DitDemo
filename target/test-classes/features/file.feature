Feature: Application Login



Scenario: Home page default login
Given initialize the browrser
When enter the page by login "john" and "4567"
Then logged in to page 
And displayed the message

Scenario: Home page default login
Given initialize the browrser
When enter the page by login "jin" and "1234"
Then logged in to page 
And displayed the message

