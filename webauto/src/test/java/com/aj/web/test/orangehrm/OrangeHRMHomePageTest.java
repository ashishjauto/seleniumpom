package com.aj.web.test.orangehrm;

import com.aj.auto.web.orangehrm.base.OrangeHRMBase;
import com.aj.auto.web.orangehrm.page.HomePage;
import com.aj.auto.web.orangehrm.page.LoginPage;
import org.testng.Assert;
import org.testng.annotations.*;

import java.io.IOException;

public class OrangeHRMHomePageTest extends OrangeHRMBase {





    LoginPage testLogin ;
    HomePage homePage ;

    @BeforeClass

    public void beforeClass() throws IOException {
        initialization();
        testLogin = new LoginPage();
        homePage = testLogin.login("Admin","admin123");
    }





    @Test
    public void tc1_clickOnAdmin(){
        homePage.clickOnAdmin();


        Assert.assertTrue(driver.getCurrentUrl().contains("orange"));

    }







    @AfterClass
    public void closeAll(){
       driver.quit();

    }
}
