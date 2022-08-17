package com.TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGSession {
	
	static WebDriver d;
	
	
	@Test
	public void LoginAmazon() {
		WebDriverManager.chromedriver().setup();
		WebDriver d = new ChromeDriver();
		d.get("https://www.amazon.in/");
		d.close();
	}
	
	@Test(enabled=true)
	
	public void title() {
		System.out.println("title test");
	}
	
    @Test
	
	public void logovalidation() {
		System.out.println("Logo test");
	}

}
