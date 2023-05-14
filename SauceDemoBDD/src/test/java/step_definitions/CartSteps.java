package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.example.pageObject.CartShoppingPage;
import org.example.pageObject.SalesPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class CartSteps {
    private WebDriver webDriver;

    public CartSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @Then("User will move to Cart Page")
    public void verifyCartShoppingPage(){
        CartShoppingPage cartShoppingPage = new CartShoppingPage(webDriver);
        Assert.assertTrue(cartShoppingPage.verifyCartShoppingPage());
    }

    @And("User removed one item")
    public void removeTshirtRed(){
        CartShoppingPage cartShoppingPage = new CartShoppingPage(webDriver);
        cartShoppingPage.clickRemoveTshirtRed();
    }

    @And("User click the Check Out Button")
    public void btnCheckout(){
        CartShoppingPage cartShoppingPage = new CartShoppingPage(webDriver);
        cartShoppingPage.clickBtnCheckout();
    }
}
