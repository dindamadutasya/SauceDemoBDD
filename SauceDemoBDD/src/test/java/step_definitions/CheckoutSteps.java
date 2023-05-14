package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.pageObject.CheckoutInformationPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class CheckoutSteps {
    private WebDriver webDriver;

    public CheckoutSteps() {
        super();
        this.webDriver = Hooks.webDriver;
    }

    @Then("User will move to Check Out Information Page")
    public void verifyCheckoutInformation() {
        CheckoutInformationPage checkoutInformationPage = new CheckoutInformationPage(webDriver);
        Assert.assertTrue(checkoutInformationPage.verifyCheckoutInformationPage());
    }

    @And("User input \"(.*)\" as firstName, input \"(.*)\" as lastName and input \"(.*)\" as zipPostalCode")
    public void inputInformation(String firstName, String lastName, String zipPostalCode) throws InterruptedException {
        CheckoutInformationPage checkoutInformationPage = new CheckoutInformationPage(webDriver);
        checkoutInformationPage.setFirstName(firstName);
        checkoutInformationPage.setLastName(lastName);
        checkoutInformationPage.setZipPostalCode(zipPostalCode);

    }

    @And("User click the Continue Button")
    public void btnContinue(){
        CheckoutInformationPage checkoutInformationPage = new CheckoutInformationPage(webDriver);
        checkoutInformationPage.clickBtnContinue();
    }
}

