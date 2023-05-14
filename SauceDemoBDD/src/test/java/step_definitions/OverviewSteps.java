package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.example.pageObject.OverviewPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class OverviewSteps {
    private WebDriver webDriver;

    public OverviewSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @Then("User will move to Checkout Overview Page")
    public void verifyOverviewPage(){
        OverviewPage overviewPage = new OverviewPage(webDriver);
        Assert.assertTrue(overviewPage.verifyOverviewPage());
    }

    @And("User will check the payment total")
    public void verifyTotalPay() throws InterruptedException {
        OverviewPage overviewPage = new OverviewPage(webDriver);
        Assert.assertEquals(overviewPage.verifyTotalPay(),overviewPage.verifyTotalPay());
    }

    @And("User click the Finish Button")
    public void clickFinishBtn() throws InterruptedException {
        OverviewPage overviewPage = new OverviewPage(webDriver);
        overviewPage.clickFinishBtn();

    }
}
