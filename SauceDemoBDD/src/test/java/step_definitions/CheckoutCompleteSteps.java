package step_definitions;

import cucumber.api.java.en.Then;
import org.example.pageObject.CheckoutCompletePage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class CheckoutCompleteSteps {

    private WebDriver webDriver;

    public CheckoutCompleteSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @Then("The Complete Page will appear")
    public void verifyCheckoutCompletePage(){
        CheckoutCompletePage checkoutCompletePage = new CheckoutCompletePage(webDriver);
        Assert.assertTrue(checkoutCompletePage.verifyCheckoutCompletePage());
    }
}
