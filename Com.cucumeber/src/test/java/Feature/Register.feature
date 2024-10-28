Feature: Demo WebShop Registeration

Scenario: Register should be Successfull

And User should navigate demowebshop application for Registeration
And User should click on Register link
And User should select Gender
And User should enter First Name
And User should enter Last Name
And User should enter Email id
And User should enter Password
And User should enter same password to confirm
When User click on RegisterButton
Then Registeration should be successfull

