Feature: Testmeapp login for a registered user

  Scenario Outline: Successful login of a registered user
    Given user launch the browser
    And user  clicks on the sign in button
    When user enter "<username>" and "<password>"
    And user clicks on login
    Then user  directed to testme app home page

    Examples: 
      | username | password    |
      | Lalitha  | Password123 |
      | alee123  | alee123     |
