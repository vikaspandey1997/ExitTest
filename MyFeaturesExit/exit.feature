Feature: Testme app casestudy exit test

  Scenario Outline: Login TestMeapp exit casestudy
    Given User launches the app
    Then User clicks on Signin
    Then enters his name "<user>"
    Then enters his password "<pass>"
    Then verifies the Signin
    Then verifies the title page

    Examples: 
      | user    | pass      |
      | Lalitha | Password123 |
      | Lalitha | Password123 |
      | Lalitha | Password123 |
