package com.aj.web.test.orangehrm;

import com.aj.auto.web.orangehrm.base.OrangeHRMBase;
import com.aj.auto.web.orangehrm.page.AdminPage;
import com.aj.auto.web.orangehrm.page.HomePage;
import com.aj.auto.web.orangehrm.page.LoginPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.*;

import java.io.IOException;

public class OrangeHRMAdminPageTest extends OrangeHRMBase {





    LoginPage testLogin ;

    AdminPage adminPage;

    @BeforeClass
    @Parameters({"browser"})
    public void beforeClass(@Optional ("chrome") String browser) throws IOException {
        initialization();
        testLogin = new LoginPage();
        adminPage = testLogin.login("Admin","admin123").clickOnAdminTab();
    }





    @Test
    public void tc2_SearchUser(){
        adminPage.searchUser("John");


        Assert.assertTrue(driver.findElement(By.xpath("//div[@class='oxd-form-row']//input")).isDisplayed());

    }







    @AfterClass
    public void closeAll(){
      //  driver.quit();

    }
}
