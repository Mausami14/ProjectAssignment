package com.qa.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileNotFoundException;
import java.time.Duration;

import static com.qa.util.Constants.URL;

public class TestBase {

    public WebDriver driver;

    public WebDriver WebDriverManager() throws FileNotFoundException {


        if (driver == null) {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.get(URL);

        }

        return driver;
    }

}
