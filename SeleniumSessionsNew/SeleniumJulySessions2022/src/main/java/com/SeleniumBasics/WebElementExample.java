package com.SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementExample {

	static WebDriver d;
	
	public WebElementExample(WebDriver d) {
		this.d=d;
	}

	public static void main(String[] args) {
		
		

		WebDriverManager.chromedriver().setup();// server
		d = new ChromeDriver();// session id

		d.get("https://www.opencart.com");

		// d.findElement(By.xpath("//a[@class='btn btn-black navbar-btn']"));

		// d.findElement(By.id("input-username")).sendKeys("test@890");

		// 2 way

		// webelement+ perform the action

		WebElement registerButton = d.findElement(By.xpath("//a[@class='btn btn-black navbar-btn']"));

		registerButton.click();

		/*
		 * WebElement userName=d.findElement(By.id("input-username"));
		 * 
		 * userName.sendKeys("test@gmail.com"); userName.clear();
		 * 
		 * userName.sendKeys("test56788@.com");
		 */

		// web elment +by locator+perform the action

		By usrName = By.id("input-username");

		// WebElement userName=d.findElement(usrName);

		// userName.sendKeys("Mounika@gmail.com");

		// 4th way

		By FirstName = By.id("input-firstname");

		getElement(usrName).sendKeys("testmm@gmail.com");

		getElement(FirstName).sendKeys("Mounika");

		SendKeys(usrName, "rettt@gmail.com");

	}

	public static WebElement getElement(By locator) {

		return d.findElement(locator);

	}

	public static void SendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);

	}

}
