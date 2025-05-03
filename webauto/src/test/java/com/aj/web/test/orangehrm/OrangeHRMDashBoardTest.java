package com.aj.web.test.orangehrm;

import com.aj.auto.web.orangehrm.base.OrangeHRMBase;
import com.aj.auto.web.orangehrm.page.DashBoardPage;
import com.aj.auto.web.orangehrm.page.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.io.IOException;

public class OrangeHRMDashBoardTest extends OrangeHRMBase {





    LoginPage testLogin ;
    DashBoardPage dashBoardPage ;

    @BeforeClass

    public void beforeClass() throws IOException {
        initialization();
        testLogin = new LoginPage();
        dashBoardPage = testLogin.login("Admin","admin123");
    }





    @Test
    public void tc1_clickOnAdmin(){
        dashBoardPage.clickOnAdmin();


        Assert.assertTrue(driver.getCurrentUrl().contains("orange"));

    }
    @Test
    public void tc2_SearchUser(){

        dashBoardPage.searchUser("John");
              Assert.assertTrue(driver.getCurrentUrl().contains("orange"));



    }






    @AfterClass
    public void closeAll(){
       driver.quit();

    }
}
