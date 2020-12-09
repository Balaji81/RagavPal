package org.cucumnber.common;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class TestBase {

    public static WebDriver driver;

     public static void init(String browser)
     {
            System.out.println("Browse is :: "+browser );
         switch(browser.toUpperCase()) {
             case "CHROME":
                 WebDriverManager.chromedriver().version("87.0.4280.88").setup();
                 driver = new ChromeDriver();
                 break;
             case "FIREFOX":
                 WebDriverManager.firefoxdriver().setup();
                 driver = new FirefoxDriver();
                 break;

             case "EDGE":
                 WebDriverManager.edgedriver().version("87.0.664.55").setup();
                 driver = new EdgeDriver();
         }
         driver.manage().window().maximize();
         driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);

     }
}
