@Login
  Feature: Login
    As a user I want to login website sauce demo

  Scenario: Normal Login
    Given user already on website demo
    When User input "standard_user" as userName and input "secret_sauce" as password
    Then User already on sales page

#  Scenario Outline: Invalid Login
#    Given user already on website demo
#    When User input "<userName>" as userName and input "<password>" as password
#    Then User see error "<errorText>" on login page
#
#  Examples:
#    | userName     | password     | errorText                                                                 |
#    | standar_user |              | Epic sadface: Password is required                                        |
#    |              | secret_sauce | Epic sadface: Username is required                                        |
#    | test         | 123          | Epic sadface: Username and password do not match any user in this service |