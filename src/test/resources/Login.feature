
Feature: Login functionality of KyTe site

   @Smoke
    Scenario Outline: Login to FreeCRM
      Given User is on <browser> open FreeCRM login page
      When User enter valid username and password
      And   user clicks FreeCRM login button
      Then  user is navigated to FreeCRM home page
      And   close browser
      Examples:
        | browser |
        | chrome  |
        | edge    |

    @Regression
    Scenario Outline: Login to to Kyte with valid credentials
      Given User is on <browser> opens KyTe login page
      When  user enters valid <username> and <password>
      And   user clicks login button
      Then  user is navigated to home page
      And   close browser



      Examples:
          | username | password | browser |
          |  2925    |2925      | chrome  |
          |  2934    |2934      | edge    |

