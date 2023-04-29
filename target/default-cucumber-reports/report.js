$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/magento.feature");
formatter.feature({
  "name": "Add products to cart and check cart total",
  "description": "  As a customer\n  I want to add items to my cart\n  So that I can purchase them",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.scenario({
  "name": "Add products to cart and check cart total",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "name": "I am on the homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "com.magento.stepdef.MagentoStepDef.open_the_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I add \"Gwyn Endurance Tee Medium Green\" to the cart with quanitiy \"4\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.magento.stepdef.MagentoStepDef.iAddToTheCartWithQuanitiy(java.lang.String,int)"
});
formatter.result({
  "error_message": "io.cucumber.core.exception.CucumberException: Could not invoke step [I add {string} to the cart with quanitiy {string}] defined at \u0027com.magento.stepdef.MagentoStepDef.iAddToTheCartWithQuanitiy(java.lang.String,int)\u0027.\nIt appears there was a problem with the step definition.\nThe converted arguments types were (java.lang.String, java.lang.String)\n\nThe details are in the stacktrace below.\r\n\tat io.cucumber.core.runner.PickleStepDefinitionMatch.couldNotInvokeStep(PickleStepDefinitionMatch.java:81)\r\n\tat io.cucumber.core.runner.PickleStepDefinitionMatch.runStep(PickleStepDefinitionMatch.java:65)\r\n\tat io.cucumber.core.runner.TestStep.executeStep(TestStep.java:64)\r\n\tat io.cucumber.core.runner.TestStep.run(TestStep.java:49)\r\n\tat io.cucumber.core.runner.PickleStepTestStep.run(PickleStepTestStep.java:46)\r\n\tat io.cucumber.core.runner.TestCase.run(TestCase.java:51)\r\n\tat io.cucumber.core.runner.Runner.runPickle(Runner.java:67)\r\n\tat io.cucumber.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:149)\r\n\tat io.cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:83)\r\n\tat io.cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:24)\r\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)\r\n\tat org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)\r\n\tat org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:413)\r\n\tat io.cucumber.junit.Cucumber.runChild(Cucumber.java:185)\r\n\tat io.cucumber.junit.Cucumber.runChild(Cucumber.java:83)\r\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)\r\n\tat org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)\r\n\tat io.cucumber.junit.Cucumber$RunCucumber.evaluate(Cucumber.java:219)\r\n\tat org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:413)\r\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:137)\r\n\tat com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:69)\r\n\tat com.intellij.rt.junit.IdeaTestRunner$Repeater$1.execute(IdeaTestRunner.java:38)\r\n\tat com.intellij.rt.execution.junit.TestsRepeater.repeat(TestsRepeater.java:11)\r\n\tat com.intellij.rt.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:35)\r\n\tat com.intellij.rt.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:235)\r\n\tat com.intellij.rt.junit.JUnitStarter.main(JUnitStarter.java:54)\r\nCaused by: io.cucumber.core.backend.CucumberBackendException: Failed to invoke public void com.magento.stepdef.MagentoStepDef.iAddToTheCartWithQuanitiy(java.lang.String,int)\r\n\tat io.cucumber.java.Invoker.invoke(Invoker.java:29)\r\n\tat io.cucumber.java.JavaStepDefinition.execute(JavaStepDefinition.java:27)\r\n\tat io.cucumber.core.runner.PickleStepDefinitionMatch.runStep(PickleStepDefinitionMatch.java:63)\r\n\t... 32 more\r\nCaused by: java.lang.IllegalArgumentException: argument type mismatch\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:566)\r\n\tat io.cucumber.java.Invoker.invoke(Invoker.java:27)\r\n\t... 34 more\r\n",
  "status": "failed"
});
formatter.step({
  "name": "I select \"United Kingdom\" as the shipping address",
  "keyword": "And "
});
formatter.match({
  "location": "com.magento.stepdef.MagentoStepDef.i_select_as_the_shipping_address(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the cart total should be \"$92.00\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.magento.stepdef.MagentoStepDef.the_cart_total_should_be(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I update the quantity of \"Gwyn Endurance Tee Medium Green\" to \"3\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.magento.stepdef.MagentoStepDef.i_update_the_quantity_of_to(java.lang.String,int)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I add to quantity \"1\" \"Gwyn Endurance Tee Small Yellow\" to chart",
  "keyword": "And "
});
formatter.match({
  "location": "com.magento.stepdef.MagentoStepDef.i_add_to_quantity_to_chart(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I add again \"Quest Lumaflex™ Band\" to the cart with quantity \"1\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.magento.stepdef.MagentoStepDef.i_add_again_to_the_cart_with_quantity(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the latest cart total should be \"$116.00\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.magento.stepdef.MagentoStepDef.the_latest_cart_total_should_be(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
});