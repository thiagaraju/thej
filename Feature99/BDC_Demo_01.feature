Feature: Guest user actions in demowebshop
@Sanity
Scenario: User choice to opt for an account
Given user access the signup page
And gets the credentials
@Regression
Scenario: User access to login page of the demowebshop

Given User has valid account creds for demowebshop
And provide the valid creds as inputs for the login process
Then verefies the state for the login status
