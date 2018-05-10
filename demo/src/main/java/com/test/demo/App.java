package com.test.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    static WebDriver driver;
    public static void main( String[] args )
    {
    	Browser.Chrome();
        System.out.println( "Hello World!" );
        driver.manage().window().maximize();
		driver.navigate().to("http://google.com");
		driver.close();
    }
}
