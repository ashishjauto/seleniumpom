package com.aj.auto.web.orangehrm.page;

import com.aj.auto.web.orangehrm.base.OrangeHRMBase;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;
import java.util.function.Function;

public class HomePage extends OrangeHRMBase {


    @FindBy(how = How.XPATH,using="//span[normalize-space()='Admin']")
    WebElement adminTab;

    @FindBy(how = How.XPATH,using="//button[normalize-space()='Upgrade']")
    WebElement upgardeButton;





    public HomePage()
    {

        PageFactory.initElements(driver,this);
    }



    public void clickOnAdmin( ) {
        adminTab.click();
    }

    public void searchUser(String userNameString) {

        FluentWait<WebDriver> wait= new FluentWait<>(driver);

        wait.pollingEvery(Duration.ofSeconds(2));
        wait.withTimeout(Duration.ofSeconds(30));
        wait.ignoring(StaleElementReferenceException.class, NoSuchElementException.class);


        Function<WebDriver, Boolean> function = new Function<WebDriver, Boolean>() {
            public Boolean apply(WebDriver arg0) {

                while (true) {
                    if (upgardeButton.isDisplayed()) {

                        upgardeButton.click();
                        return true;
                    }
                    return false;
                }
            }
        };
    wait.until(function);


    }
    public AdminPage clickOnAdminTab(){
        adminTab.click();
        return new AdminPage();
    }


}
