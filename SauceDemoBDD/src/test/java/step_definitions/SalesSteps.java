package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.pageObject.SalesPage;
import org.junit.Assert;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.WebDriver;

public class SalesSteps {
    private WebDriver webDriver;

    public SalesSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @Then("User already on sales page")
    public void verifySalesPage(){
        SalesPage salesPage = new SalesPage(webDriver);
        Assert.assertTrue(salesPage.verifySalesPage());
    }

    @When("User sort product list by \"(.*)\"")
    public void sortProduct(String sort) throws InterruptedException {
        SalesPage salesPage = new SalesPage(webDriver);
        salesPage.setSortProduct(sort);
    }
    @And("User pick product")
    public void clickProduct() throws InterruptedException {
        SalesPage salesPage = new SalesPage(webDriver);
        salesPage.addItem1();
        salesPage.addItem2();

    }
    @And("User click the button cart")
    public void buttonCart() throws InterruptedException {
        SalesPage salesPage = new SalesPage(webDriver);
        salesPage.clickCart();

    }



}
