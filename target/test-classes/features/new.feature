Feature: Application Login



Scenario: Home page default login
Given Initialize the browser with chrome
And Navigate to the "" site
And Click on login link on homepage to land on sign in page
When user enters username and passwaord
Then Should be logged in
