package com.test.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {
	public static WebDriver Chrome() {
		System.setProperty("webdriver.chrome.driver", "/home/administrator/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();	
		return driver ;
	}
	public static WebDriver Firefox() {
        System.setProperty("webdriver.gecko.driver","/home/administrator/Downloads/geckodriver");
		WebDriver driver = new FirefoxDriver();	
		return driver;
	}
	
}
