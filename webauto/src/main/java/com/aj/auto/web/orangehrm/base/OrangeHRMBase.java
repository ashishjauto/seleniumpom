package com.aj.auto.web.orangehrm.base;

import com.aj.auto.web.orangehrm.eventlistener.OrangeHrmListener;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringDecorator;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class OrangeHRMBase {

    public static  WebDriver driver;

    public static OrangeHrmListener listener ;

    public OrangeHRMBase(){
        listener = new OrangeHrmListener();
    }


    public static void initialization(){


      //   decorator = new EventFiringDecorator<>(listener); //Pass listener to constructor

        driver =new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));





    }


}
