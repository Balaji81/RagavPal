package org.selenium;

import org.cucumnber.common.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Iterator;
import java.util.List;

public class Links extends TestBase {

    public static void main(String[] args)
    {
        init("chrome");
        driver.get("http://www.google.com");
        List<WebElement> lang_links = driver.findElements(By.xpath("//div[@id='SIvCob']//descendant::a"));
        Iterator it = lang_links.iterator();


        for(WebElement temp:lang_links)
        {
            System.out.println( temp.getText());
        }


    }



}
