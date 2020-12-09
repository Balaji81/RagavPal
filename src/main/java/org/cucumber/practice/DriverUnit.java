package org.cucumber.practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.IOException;

public class DriverUnit {

//    public  void getInstalledBrowserVersion() throws IOException, IOException {
//
//
//        ArrayList<String> output = new ArrayList<String>();
//        Process p = Runtime.getRuntime().exec("reg query \"HKLM\\Software\\Microsoft\\Internet Explorer\" /v Version");
//        BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()),8*1024);
//        BufferedReader stdError = new BufferedReader(new InputStreamReader(p.getErrorStream()));
//        String s = null;
//
//        while ((s = stdInput.readLine()) != null) {
//            output.add(s);
//        }
//
//        String internet_explorer_value = (output.get(2));
//        String version_ie = internet_explorer_value.trim().split("   ")[2];
//
//        // ------------------------------------
//
//        stdInput = null;
//        stdError = null;
//        s = null;
//        p = null;
//        output.clear();
//
//        p = Runtime.getRuntime().exec("reg query \"HKLM\\Software\\Mozilla\\Mozilla Firefox\" /v CurrentVersion");
//        stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()),8*1024);
//        stdError = new BufferedReader(new InputStreamReader(p.getErrorStream()));
//
//        while ((s = stdInput.readLine()) != null) {
//            output.add(s);
//        }
//
//        String ff_value = (output.get(2));
//        String version_ff = ff_value.trim().split("   ")[2];
//
//        // ------------------------------------
//
//        System.out.println("Browser Versions:\n");
//        System.out.println("  IE: " + version_ie);
//        System.out.println("  FF: " + version_ff);
//
//    }

    public static void main(String[] args)
    {
        WebDriverManager.chromedriver().version("87.0.4280.88").setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
    }
}
