package com.test.demo;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Login {

	static WebDriver driver;

	@Test
	public void RWloginTest() {
		driver = Browser.Chrome();
		driver.manage().window().maximize();
		driver.get("https://www.rankwatch.com/member/login");
		driver.findElement(By.name("amember_login")).sendKeys("ankit.k@rankwatch.com");
		driver.findElement(By.name("amember_pass")).sendKeys("rankwatch123");
		driver.findElement(By.className("loginSubmit")).click();
		String actual = driver.findElement(By.xpath("//div[@class=\"MunuName menuNameOverview\"]")).getText();
		String expected = "Dashboard";
		String message = "----------pass-------------";
		assertEquals(actual, expected, message);
		driver.close();
	}

	@Test
	public void MuserloginTest() {
		driver = Browser.Chrome();
		driver.manage().window().maximize();
		driver.get("http://musers.rankwatch.com/project-login.html");
		driver.findElement(By.name("form[login][email_id]")).sendKeys("ankit@yopmail.com");
		driver.findElement(By.name("form[login][password]")).sendKeys("rankwatch123");
		driver.findElement(By.className("loginSubmit")).click();
		driver.close();

		

	}

}
