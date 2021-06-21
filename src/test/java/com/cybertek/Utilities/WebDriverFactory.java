package com.cybertek.Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {
/*Task
Write a static method that takes string parameter name:browserType
Based on the value of parameter
it will set up the browser and
the method will return chromedriver or firefoxdriver object.
name of the method:getDriver
 */

    public static WebDriver getDriver (String browserType ){
        WebDriver driver=null;

 switch (browserType.toLowerCase()){
     case "chrome":
         WebDriverManager.chromedriver().setup();
         driver=new ChromeDriver();
         break;
     case "firefox":
         WebDriverManager.firefoxdriver().setup();
         driver=new FirefoxDriver();
         break;


 }

        return driver;
    }

}