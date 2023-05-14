package org.example.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SalesPage {
    public static WebDriver driver;

    public SalesPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//span[@class='title']")
    private WebElement verifySalesPage;

    @FindBy(xpath = "//select[@class='product_sort_container']")
    private WebElement sortProduct;

    @FindBy(xpath = "//a[.='2']")
    private WebElement btnCart;

    @FindBy(xpath = "//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']")
    private WebElement item1;

    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-onesie']")
    private WebElement item2;

    public void setSortProduct(String sort){
        Select a = new Select(sortProduct);
        a.selectByVisibleText(sort);
    }

    public void addItem1(){
        item1.click();
    }

    public void addItem2(){
        item2.click();
    }

    public void clickCart(){
        btnCart.click();

    }

    public boolean verifySalesPage(){
        return verifySalesPage.isDisplayed();
    }


}
