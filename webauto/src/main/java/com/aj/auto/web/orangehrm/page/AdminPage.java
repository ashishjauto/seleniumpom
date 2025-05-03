package com.aj.auto.web.orangehrm.page;

import com.aj.auto.web.orangehrm.base.OrangeHRMBase;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.function.Function;

public class AdminPage extends OrangeHRMBase {


    @FindBy(how = How.XPATH,using="//div[@class='oxd-form-row']//input")
    WebElement searchUser;





    public AdminPage()
    {

        PageFactory.initElements(driver,this);
    }


    public void searchUser(String userName){

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOf(searchUser));



        searchUser.sendKeys(userName);
    }




}
