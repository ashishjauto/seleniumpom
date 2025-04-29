package com.aj.web.test.orangehrm;

import com.aj.auto.web.orangehrm.base.OrangeHRMBasePage;
import com.aj.auto.web.orangehrm.device.browser.DesktopBrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.io.IOException;
import java.time.Duration;

public class OrangeHRMLoginTest  {

    public static WebDriver driver ;

    @BeforeClass
    @Parameters({"browser", "env"})
    public void beforeClass(@Optional("chrome") String browser, @Optional("dev") String env) throws IOException {

            driver = DesktopBrowserFactory.getDriver(browser, "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

    }


    @Test
    public void tc1_Login(){


        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
        driver.findElement(By.cssSelector("button[type='submit']")).submit();

    }



    @AfterClass
    public void closeAll(){
        driver.quit();

    }


}
