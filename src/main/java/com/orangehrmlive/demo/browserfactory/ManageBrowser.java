package com.orangehrmlive.demo.browserfactory;

import com.orangehrmlive.demo.propertyreader.PropertyReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class ManageBrowser {
    //Web driver
    public static WebDriver driver;

    //BaseUrl
    String baseUrl = PropertyReader.getInstance().getProperty("baseUrl");

    //ImplicitWait
    int implicitWait = Integer.parseInt(PropertyReader.getInstance().getProperty("implicitWait"));

    /**
     * This method will open the browser
     */
    public void selectBrowser(String browser) {
        if (browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("Wrong browser name");
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(implicitWait));
        driver.get(baseUrl);
    }

    /**
     * This method will close the browser
     */
    public void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }
}
