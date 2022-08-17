package com.SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Openkart {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver d= new ChromeDriver();//session id
		
		d.get("https://www.opencart.com");
		
	
		WebElement Register= d.findElement(By.xpath("//a[@class='btn btn-black navbar-btn']"));
		
		Register.click();
		
		
		d.findElement(By.id("input-username")).sendKeys("test@890");
		d.findElement(By.id("input-firstname")).sendKeys("Test123");
		
		
		
	}

}
