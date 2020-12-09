package org.cucumber.practice;


import io.cucumber.java.After;
import io.cucumber.java.en.*;
import org.cucumnber.common.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login extends TestBase {



    @Given("^User is on (.*) opens KyTe login page$")
    public void user_is_on_KyTe_login_page(String browser) throws Exception {
        init(browser);  // creates browser instance
        System.out.println("in Login page");
        driver.get("http://kyte.net.in/kyte/");

    }

    @When("^user enters valid (.*) and (.*)$")
    public void user_enters_valid_username_and_password(String uid, String pwd) throws Exception {
        System.out.println("user is entering ID and PWD");
        driver.findElement(By.name("txtuname")).sendKeys(uid);
        driver.findElement(By.name("txtpwd")).sendKeys(pwd);
        Thread.sleep(2000);

    }

    @And("^user clicks login button$")
    public void user_clicks_login_button() throws Exception {
        System.out.println("user clicks login button");
        driver.findElement(By.name("Button1")).click();
        Thread.sleep(5000);
    }

    @Then("^user is navigated to home page$")
    public void user_is_navigated_to_home_page() throws Exception {
        System.out.println("user landed on home page");
        String title = driver.getTitle();

        if(title.equalsIgnoreCase("kpcl"))
        {
            System.out.println("#####  Test case is : PASSED ######");
        }
        else
        {
            System.out.println("#####  Test case is : FAILED ######");
        }



    }
    @And("^close browser$")
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
    @Given("^User is on (.*) open FreeCRM login page$")
    public void user_is_on_login_FreeCRM_login_page(String browser ) throws Exception {
        System.out.println("In Free CRM logn method....");
        init(browser);
         driver.get("http://ui.cogmento.com/");

    }

    @When("^User enter valid username and password$")
    public void user_enter_valid_username_and_password() throws Exception {
      driver.findElement(By.name("email")).sendKeys("Balaji.Koc@gmail.com");
      driver.findElement(By.name("password")).sendKeys("Jishnu#16");


    }

    @When("^user clicks FreeCRM login button$")
    public void user_clicks_FreeCRM_login_button() throws Exception {
        Thread.sleep(2000);

        driver.findElement(By.cssSelector("#ui > div > div > form > div > div.ui.fluid.large.blue.submit.button")).click();

    }

    @Then("^user is navigated to FreeCRM home page$")
    public void user_is_navigated_to_FreeCRM_home_page() throws Exception {
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.titleIs("Cogmento CRM"));
    }

    @After
    public void tearDown()
    {
        driver.quit();
    }


}
