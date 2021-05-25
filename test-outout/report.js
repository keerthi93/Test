$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/lenovo/eclipse-workspace/ProjectTest/src/main/java/Features/login.feature");
formatter.feature({
  "line": 1,
  "name": "Amazon Login Feature",
  "description": "",
  "id": "amazon-login-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 377700,
  "status": "passed"
});
formatter.before({
  "duration": 165100,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 4,
      "value": "#without Examples Keyword"
    }
  ],
  "line": 5,
  "name": "Amazon Login Test Scenario",
  "description": "",
  "id": "amazon-login-feature;amazon-login-test-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "user is in Shopping page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "title of Amazon login page",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user clicks on Sign-In Button",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.user_already_on_login_page()"
});
formatter.result({
  "duration": 199003034700,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.title_of_login_page_is_free_CRM()"
});
formatter.result({
  "duration": 113582600,
  "error_message": "junit.framework.ComparisonFailure: expected:\u003c[Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - A]mazon.in\u003e but was:\u003c[www.a]mazon.in\u003e\r\n\tat junit.framework.Assert.assertEquals(Assert.java:100)\r\n\tat junit.framework.Assert.assertEquals(Assert.java:107)\r\n\tat stepDefinitions.LoginStepDefinition.title_of_login_page_is_free_CRM(LoginStepDefinition.java:39)\r\n\tat ✽.When title of Amazon login page(C:/Users/lenovo/eclipse-workspace/ProjectTest/src/main/java/Features/login.feature:8)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "LoginStepDefinition.user_click_on_SignIn_Button()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 1028700,
  "status": "passed"
});
formatter.after({
  "duration": 467800,
  "status": "passed"
});
});