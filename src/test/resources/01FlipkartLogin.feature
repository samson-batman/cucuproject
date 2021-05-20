Feature: user going to valid the flipkart login

  Scenario: user has to valid the invalid email and invalid passward
    Given user has to launch the browser and hit the flipkart url
    When user has to click the login btn
    And user has to pass the invalid email
    And user has to pass the inalid passward
    And user has to click the loginokbtn
    Then user has to close the browser
