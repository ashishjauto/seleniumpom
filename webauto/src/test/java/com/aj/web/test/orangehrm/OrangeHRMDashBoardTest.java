package com.aj.web.test.orangehrm;

import com.aj.auto.web.orangehrm.device.browser.DesktopBrowserFactory;
import com.aj.auto.web.orangehrm.page.DashBoardPage;
import com.aj.auto.web.orangehrm.page.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.io.IOException;

public class OrangeHRMDashBoardTest {




    public static WebDriver driver ;
    LoginPage testLogin = new LoginPage(driver);
    DashBoardPage dashBoardPage ;

    @BeforeClass
    @Parameters({"browser", "env"})
    public void beforeClass(@Optional("chrome") String browser, @Optional("dev") String env) throws IOException {

        driver = DesktopBrowserFactory.getDriver(browser, "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

    }


    @Test
    public void tc1_Login(){

        LoginPage testLogin = new LoginPage(driver);
        testLogin.setUserName("Admin");
        testLogin.setPassword("admin123");
        testLogin.clickSubmit();

        Assert.assertTrue(driver.getCurrentUrl().contains("orange"));

    }


    @Test
    public void tc2_clickOnAdmin(){
        dashBoardPage = new DashBoardPage(driver);
        dashBoardPage.clickOnAdmin();


        Assert.assertTrue(driver.getCurrentUrl().contains("orange"));

    }
    @Test
    public void tc3_SearchUser(){

        dashBoardPage.searchUser("John");
              Assert.assertTrue(driver.getCurrentUrl().contains("orange"));



    }






    @AfterClass
    public void closeAll(){
        driver.quit();

    }
}
