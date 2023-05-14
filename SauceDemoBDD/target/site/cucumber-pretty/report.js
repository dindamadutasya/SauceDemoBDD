$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/CheckOut.feature");
formatter.feature({
  "line": 2,
  "name": "Check out feature",
  "description": "As a User I wanna check out the item from first step until the end",
  "id": "check-out-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@CheckOut"
    }
  ]
});
formatter.before({
  "duration": 11293660200,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "User make a purchase with 2 items",
  "description": "",
  "id": "check-out-feature;user-make-a-purchase-with-2-items",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "user already on website demo",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User input \"standard_user\" as userName and input \"secret_sauce\" as password",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User already on sales page",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "User sort product list by \"Name (Z to A)\"",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User pick product",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User click the button cart",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User will move to Cart Page",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "User removed one item",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "User click the Check Out Button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User will move to Check Out Information Page",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "User input \"DindaMadu\" as firstName, input \"Tasya\" as lastName and input \"123\" as zipPostalCode",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User click the Continue Button",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User will move to Checkout Overview Page",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "User will check the payment total",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "User click the Finish Button",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "The Complete Page will appear",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.verifyLandingPage()"
});
formatter.result({
  "duration": 1030597700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "standard_user",
      "offset": 12
    },
    {
      "val": "secret_sauce",
      "offset": 50
    }
  ],
  "location": "LoginSteps.inputCredential(String,String)"
});
formatter.result({
  "duration": 1664203400,
  "status": "passed"
});
formatter.match({
  "location": "SalesSteps.verifySalesPage()"
});
formatter.result({
  "duration": 429237100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Name (Z to A)",
      "offset": 27
    }
  ],
  "location": "SalesSteps.sortProduct(String)"
});
formatter.result({
  "duration": 535465600,
  "status": "passed"
});
formatter.match({
  "location": "SalesSteps.clickProduct()"
});
formatter.result({
  "duration": 316161000,
  "status": "passed"
});
formatter.match({
  "location": "SalesSteps.buttonCart()"
});
formatter.result({
  "duration": 182532800,
  "status": "passed"
});
formatter.match({
  "location": "CartSteps.verifyCartShoppingPage()"
});
formatter.result({
  "duration": 138526200,
  "status": "passed"
});
formatter.match({
  "location": "CartSteps.removeTshirtRed()"
});
formatter.result({
  "duration": 126526400,
  "status": "passed"
});
formatter.match({
  "location": "CartSteps.btnCheckout()"
});
formatter.result({
  "duration": 134863700,
  "status": "passed"
});
formatter.match({
  "location": "CheckoutSteps.verifyCheckoutInformation()"
});
formatter.result({
  "duration": 61605000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "DindaMadu",
      "offset": 12
    },
    {
      "val": "Tasya",
      "offset": 44
    },
    {
      "val": "123",
      "offset": 74
    }
  ],
  "location": "CheckoutSteps.inputInformation(String,String,String)"
});
formatter.result({
  "duration": 676016600,
  "status": "passed"
});
formatter.match({
  "location": "CheckoutSteps.btnContinue()"
});
formatter.result({
  "duration": 233553100,
  "status": "passed"
});
formatter.match({
  "location": "OverviewSteps.verifyOverviewPage()"
});
formatter.result({
  "duration": 88697900,
  "status": "passed"
});
formatter.match({
  "location": "OverviewSteps.verifyTotalPay()"
});
formatter.result({
  "duration": 88715200,
  "status": "passed"
});
formatter.match({
  "location": "OverviewSteps.clickFinishBtn()"
});
formatter.result({
  "duration": 95290900,
  "status": "passed"
});
formatter.match({
  "location": "CheckoutCompleteSteps.verifyCheckoutCompletePage()"
});
formatter.result({
  "duration": 86793000,
  "status": "passed"
});
formatter.after({
  "duration": 1011421200,
  "status": "passed"
});
});