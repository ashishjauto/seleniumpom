package com.aj.web.test.orangehrm;

import com.aj.auto.web.orangehrm.base.OrangeHRMBase;
import com.aj.auto.web.orangehrm.page.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.io.IOException;

public class OrangeHRMLoginTest  extends OrangeHRMBase {
    LoginPage loginPage;


    @BeforeClass
    public void beforeClass() throws IOException {

        initialization();
        loginPage = new LoginPage();

    }


    @Test
    public void tc1_Login(){

        loginPage.setUserName("Admin");
        loginPage.setPassword("admin123");

        loginPage.clickSubmit();
        Assert.assertTrue(driver.getCurrentUrl().contains("orange"));

    }



    @AfterClass
    public void closeAll(){
        driver.quit();

    }


}
