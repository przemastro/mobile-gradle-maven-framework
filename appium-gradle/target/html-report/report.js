$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/Scenario.feature");
formatter.feature({
  "name": "Example",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Test1",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smokeTest"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I click on Espanol button",
  "keyword": "Given "
});
formatter.match({
  "location": "TestSteps.iClickOnEspanolButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Primero button",
  "keyword": "And "
});
formatter.match({
  "location": "TestSteps.iClickOnPrimeroButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Sortea button",
  "keyword": "When "
});
formatter.match({
  "location": "TestSteps.iClickOnSorteaButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Type word \"test\"",
  "keyword": "And "
});
formatter.match({
  "location": "TestSteps.typeWord(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Compra button",
  "keyword": "And "
});
formatter.match({
  "location": "TestSteps.iClickOnCompraButton()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});