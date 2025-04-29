package com.aj.auto.web.orangehrm.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {


@FindBy(how = How.XPATH,using="//input[@placeholder='Username']")
WebElement userName;

@FindBy(how = How.XPATH,using="//input[@placeholder='Password']")
WebElement password;



@FindBy(how = How.CSS,using="button[type='submit']")
    WebElement submitbutton;



private WebDriver driver;

 public LoginPage(WebDriver driver)
 {
    this.driver = driver;
     PageFactory.initElements(driver,this);
 }


 public void setUserName(String user){
     userName.sendKeys(user);
 }

    public void setPassword(String passwordString) {
        password.sendKeys(passwordString);
    }


    public void clickSubmit() {
        submitbutton.click();
    }



}
