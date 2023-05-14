@CheckOut
Feature: Check out feature
  As a User I wanna check out the item from first step until the end

  Scenario: User make a purchase with 2 items
    Given user already on website demo
    When User input "standard_user" as userName and input "secret_sauce" as password
    Then User already on sales page
    When User sort product list by "Name (Z to A)"
    And User pick product
    And User click the button cart
    Then User will move to Cart Page
    And User removed one item
    And User click the Check Out Button
    Then User will move to Check Out Information Page
    And User input "DindaMadu" as firstName, input "Tasya" as lastName and input "123" as zipPostalCode
    And User click the Continue Button
    Then User will move to Checkout Overview Page
    And User will check the payment total
    And User click the Finish Button
    Then The Complete Page will appear