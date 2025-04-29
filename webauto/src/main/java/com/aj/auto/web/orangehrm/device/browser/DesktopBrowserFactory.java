package com.aj.auto.web.orangehrm.device.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.HashMap;

public class DesktopBrowserFactory {


    private DesktopBrowserFactory(){}


    public static final WebDriver getDriver(String browser, String url) throws MalformedURLException {
        WebDriver driver = null;

        switch (browser) {

            case "chrome":

                HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
                chromePrefs.put("profile.default_content_settings.popups", 0);
                    ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.setExperimentalOption("prefs", chromePrefs);
                chromeOptions.addArguments("--test-type");
                chromeOptions.addArguments("--disable-extensions"); //to disable browser extension popup

                driver = new ChromeDriver(chromeOptions);
//                Selenium GRID line (comment previous 5 lines)
//                driver = new RemoteWebDriver(new URL("http://10.192.64.131:4444/wd/hub"),new ChromeOptions());
                break;

            default:
                throw new IllegalArgumentException("Invalid browser type");
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();
        driver.get(url);
        return driver;
    }
}
