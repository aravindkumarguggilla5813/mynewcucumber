Feature: Login Action

  Scenario Outline: Successful Login with Valid Credentials
    Given User is open the application
    When User click on  to login link
    And User enters "<username>" and "<password>"
    Then Message displayed Login Successfully

    Examples: 
      | username                       | password    |
      | aravind.guggilla57@gmail.com   | aravind     |
      | aravindkumarguggilla@gmail.com | Aravind@123 |
