package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OverviewPage {
    public static WebDriver driver;

    public OverviewPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//span[@class='title']")
    private WebElement verifyOverviewPage;

    @FindBy(xpath = "//div[@class='summary_info_label summary_total_label']")
    private WebElement verifyTotalPay;

    @FindBy(xpath = "//button[@id='finish']")
    private WebElement finishBtn;


    public void clickFinishBtn(){
        finishBtn.click();
    }

    public boolean verifyOverviewPage(){
        return verifyOverviewPage.isDisplayed();
    }

    public String verifyTotalPay(){
        return verifyTotalPay.getText().replace("Total: ", "");
    }
}
