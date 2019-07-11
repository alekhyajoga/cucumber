
@tag
Feature: Register to testme app
  

  @tag1
  Scenario: Successful registration
    Given User shall launch testme app url
    And user clicks on sign up
    When user provides data
    And end user clicks on register
    #Then user is directed to testme app login page
   