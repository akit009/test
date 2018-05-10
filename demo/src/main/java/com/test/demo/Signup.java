package com.test.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Signup {
	static WebDriver driver;

	@Test
	public void signupTest() {

		driver = Browser.Chrome();
		driver.manage().window().maximize();
		System.out.println("yo baby");
		driver.get("https://dev.rankwatch.com/member-signup.html");
		driver.findElement(By.id("userName")).sendKeys("Trial");
		driver.findElement(By.className("rc-anchor-center-item rc-anchor-checkbox-holder")).click();
		driver.close();
	}

}
