package com.aj.auto.web.orangehrm.base;

import com.aj.auto.web.orangehrm.eventlistener.OrangeHrmListener;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public abstract class OrangeHRMBase {

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
