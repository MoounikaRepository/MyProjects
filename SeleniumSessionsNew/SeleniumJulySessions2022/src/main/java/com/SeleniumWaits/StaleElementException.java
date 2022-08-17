package com.SeleniumWaits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaleElementException {
	
	//after page refresh when element not found that time we will get stale element exception
	//again if you given driver and find the element locator
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();// server
		WebDriver driver = new ChromeDriver();// session id

		driver.get("https://classic.crmpro.com/index.html");

		By username = By.name("username");
		
		
	    WebElement user= driver.findElement(username);
	
	    user.sendKeys("test@gmail.com");
	
	   Thread.sleep(10000);
	
     	driver.navigate().refresh();
	
	
	  WebElement user1= driver.findElement(username);
	
	user1.sendKeys("Mounika@gmail.com");

}
}