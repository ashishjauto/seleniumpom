package com.aj.auto.web.orangehrm.eventlistener;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.openqa.selenium.support.events.WebDriverListener;

public class OrangeHrmListener implements WebDriverListener {

    @Override
    public  void beforeFindElement(WebDriver driver, By locator) {

        System.out.println("Before--> "+locator);

        System.out.println("Before--> "+driver);

    }

}
