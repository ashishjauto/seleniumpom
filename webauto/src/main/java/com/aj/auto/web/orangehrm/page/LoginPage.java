package com.aj.auto.web.orangehrm.page;

import com.aj.auto.web.orangehrm.base.OrangeHRMBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends OrangeHRMBase {


@FindBy(how = How.XPATH,using="//input[@placeholder='Username']")
WebElement userName;

@FindBy(how = How.XPATH,using="//input[@placeholder='Password']")
WebElement password;



@FindBy(how = How.CSS,using="button[type='submit']")
    WebElement submitbutton;



 public LoginPage( )
 {
     PageFactory.initElements(driver, this);
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


    public HomePage login(String un, String pwd){
        setUserName(un);
        setPassword(pwd);
        clickSubmit();


        return new HomePage();
    }

}
