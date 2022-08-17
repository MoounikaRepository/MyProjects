package com.Action.Perform;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DoubleClick {
	
static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();//server
		driver= new ChromeDriver();//session id
		
	driver.get("https://artoftesting.com/sampleSiteForSelenium");
	
	Actions act = new Actions(driver);
	
	WebElement doubleclick= driver.findElement(By.xpath("//h2[text()='Sample Page']"));
	act.doubleClick(doubleclick).perform();
	
	}

}
