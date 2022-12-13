Feature: Application Login
Scenario: Salesforce Home page login

Given Initialize the chrome driver
When user navigates to URL
And user enter username and password and clicks on login button
Then user should be able to login