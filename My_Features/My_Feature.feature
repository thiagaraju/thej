Feature: my Validations demo for testme in bdc

Scenario: User access to Guest Registration
Given Application is launched by Guest User
When Uer clicks on Sign In link available
And provides the required data in the form
Then user submits data
And verifies the account creation