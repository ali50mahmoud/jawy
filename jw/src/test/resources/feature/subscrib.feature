Feature: Subscription Packages
  As a user
  I want to validate the subscription packages
  So that I can see the type, price, and currency for different countries

  Scenario Outline: Validate Subscription Packages
    Given I navigate to the URL
    When I validate the Subscription Packages for country "<country>"
 Examples:

      | country         |
      | Select_AE       |
      | Select_EG       |
      | Select_JR       |
      
    #Then I verify the Type, Price, and Currency for all packages