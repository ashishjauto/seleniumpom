package com.aj.auto.web.orangehrm.page;

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

public class DashBoardPage {


    @FindBy(how = How.XPATH,using="//span[normalize-space()='Admin']")
    WebElement adminTab;

    @FindBy(how = How.XPATH,using="//input[@class='oxd-input oxd-input--focus']")
    WebElement usernameSearch;






    private WebDriver driver;

    public DashBoardPage(WebDriver driver)
    {
        this.driver = driver;
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
                    if (usernameSearch.isDisplayed()) {

                     usernameSearch.sendKeys(userNameString);
                        return true;
                    }
                    return false;
                }
            }
        };
    wait.until(function);


    }



}
