package com.google.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GoogleHello 
{
	@Test
	public void begin() {
		System.out.println("Success!!");
	}
	
	@Test
	public void google() 
	{
		System.setProperty("webdriver.firefox.marionette", "c:/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://google.co.in");
		WebElement emt = driver.findElement(By.name("q"));
		
		emt.sendKeys("Hello World!");
		emt.sendKeys(Keys.ENTER);
		
	}

}
