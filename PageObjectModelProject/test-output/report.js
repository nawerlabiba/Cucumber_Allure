$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Feature_Login_Functionalities.feature");
formatter.feature({
  "name": "Login Functionalities of your feature",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verify Login Functionality",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am in  Landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "step_definitions.TestDef_LogIn_Functionalitites.i_am_in_Landing_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on login menu",
  "keyword": "When "
});
formatter.match({
  "location": "step_definitions.TestDef_LogIn_Functionalitites.i_click_on_login_menu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify I am in Employee Login page",
  "keyword": "Then "
});
formatter.match({
  "location": "step_definitions.TestDef_LogIn_Functionalitites.i_verify_I_am_in_employee_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter log in id",
  "keyword": "And "
});
formatter.match({
  "location": "step_definitions.TestDef_LogIn_Functionalitites.i_enter_log_in_id()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter password",
  "keyword": "And "
});
formatter.match({
  "location": "step_definitions.TestDef_LogIn_Functionalitites.i_enter_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "step_definitions.TestDef_LogIn_Functionalitites.i_click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I will be in my homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "step_definitions.TestDef_LogIn_Functionalitites.i_will_be_in_my_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});