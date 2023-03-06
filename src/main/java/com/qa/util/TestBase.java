package com.qa.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileNotFoundException;
import java.time.Duration;

public class TestBase {

    public WebDriver driver;

    public WebDriver WebDriverManager() throws FileNotFoundException {


        if (driver == null) {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.get("https://www.anz.com.au/personal/home-loans/calculators-tools/much-borrow/");

        }

        return driver;
    }

}
