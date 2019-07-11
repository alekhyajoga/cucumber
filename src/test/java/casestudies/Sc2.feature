@tag
Feature: Testmeapp login for a registered user

  @tag1
  Scenario Outline: Successful login of a register user
    Given user launches the browser
    And user then clicks on the sign in button
    When user enters "<username>" and "<password>"
    And user clicks on login 
    Then user is directed to testme app home page

    Examples: 
      | username     | password    |
      | Lalitha      | Password123 |
      | Chaithu13421 | Chikki689   |