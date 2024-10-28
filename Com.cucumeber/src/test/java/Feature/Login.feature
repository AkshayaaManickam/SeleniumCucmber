Feature: DemoWebShop Application

 Background: 
    Given user should navigate to demowebShop application
    And user should click on login link

 @smoke
  Scenario: Login should be successfull
    And user should Enter username as "javaseleniumA4@gmail.com"
    And user should enter the password as "123456"
    And user click on login button
    And user should click on Digital Downloads link
    When user add one product to cart
    Then product should added to cart
