package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CartShoppingPage {
    public static WebDriver driver;

    public CartShoppingPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//span[@class='title']")
    private WebElement verifyCartPage;

    @FindBy(xpath = "//button[@id='remove-test.allthethings()-t-shirt-(red)']")
    private WebElement removeTshirtRed;

    @FindBy(xpath = "//button[@id='checkout']")
    private WebElement btnCheckout;

    public void clickRemoveTshirtRed(){
        removeTshirtRed.click();
    }

    public void clickBtnCheckout(){
        btnCheckout.click();
    }

    public boolean verifyCartShoppingPage() {
        return verifyCartPage.isDisplayed();
    }
}