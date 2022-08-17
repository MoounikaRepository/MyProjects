package com.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertionExample {
	@Test(priority=1)
	
	public void TitleValidation() {
	
	WebDriverManager.chromedriver().setup();
	WebDriver d = new ChromeDriver();
	d.get("https://www.google.com");
	
	Assert.assertEquals(d.getTitle(), "Google");
	Assert.assertTrue(d.findElement(By.xpath("//div[@class=\"FPdoLc lJ9FBc\"]//input[1]")).isDisplayed());
	
	//soft asser -->if test faieled in middle will go to next steps
	//hard asser-->if test failes it wont go to next steps
	
}
	
}
