Feature: Funtionality of facebook Login

  Scenario: To validate the Login with invalid username and invalid password
    Given User as to launch the browser and hit the URL
    When User has to enter the username
    And User has the enter the password
    And User has to click the Login btn
    Then User has to close the browser

  Scenario Outline: To validate the login again with Username and password
    Given User has to launch the browser and hit the url
    When user has to enter the"<usernamedatas>" username
    And user has to enter the "<passworddatas>"password
    And user has to click the btn
    Then user has to cloase the program

    Examples: 
      | usernamedatas    | passworddatas |
      | samson@gmail.com |        654321 |
      | batman@gmail.com |        123456 |
