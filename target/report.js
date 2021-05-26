$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/AmazonLogin.feature");
formatter.feature({
  "name": "User has to validate the amazon login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User has to validate with valid username and invalid passward",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user as to launch the browser and hit amz url",
  "keyword": "Given "
});
formatter.match({
  "location": "AmazonLogin.user_as_to_launch_the_browser_and_hit_amz_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user as to pass the valid email",
  "keyword": "When "
});
formatter.match({
  "location": "AmazonLogin.user_as_to_pass_the_valid_email()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user as to click the continue btn",
  "keyword": "And "
});
formatter.match({
  "location": "AmazonLogin.user_as_to_click_the_continue_btn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user as to pass the invalid passward",
  "keyword": "And "
});
formatter.match({
  "location": "AmazonLogin.user_as_to_pass_the_invalid_passward()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user as to click the signin btn",
  "keyword": "And "
});
formatter.match({
  "location": "AmazonLogin.user_as_to_click_the_signin_btn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user as to the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "AmazonLogin.user_as_to_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});