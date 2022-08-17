package com.SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();//server
		WebDriver d= new ChromeDriver();//session id
		
		d.get("https://www.opencart.com");
		
		
         WebElement Register= d.findElement(By.xpath("//a[@class='btn btn-black navbar-btn']"));
		
		Register.click();
		
		
		//id ,locator
		d.findElement(By.id("input-username")).sendKeys("test@890");
		d.findElement(By.id("input-firstname")).sendKeys("Test123");
		
		
		//name  locator
		d.findElement(By.name("username")).sendKeys("NameUser");
		
		
		//class name
		
		d.findElement(By.className("form-control")).sendKeys("testtttttt");
		
		
		//link text
		
		d.findElement(By.linkText("Features")).click();//anchor tag
		
		//partiel link text
		
		d.findElement(By.partialLinkText("Shipping,")).click();	//anchor tag
		
		d.findElement(By.tagName("input"));//when inside page having  multiple same tags 
		
		d.findElement(By.cssSelector("#input-email")).sendKeys("test@gmail.com");
		
		
		
		
		//xpath
		//absolute xpath:
		
	// /html/body/header/nav/div/div[2]/ul/li[1]/a
		
	//starts with single slash and starts from the root node
		
	//in middile if we add or remove any tag then it wont work	
		
		
		//relative xpath
		
     	//starts with double slash,starts with  middile of the element in DOM
		//tagname[@attribute='Value']
		
		//a[@class='btn btn-black navbar-btn']
		
		//a[text()='Register']
	}

}
