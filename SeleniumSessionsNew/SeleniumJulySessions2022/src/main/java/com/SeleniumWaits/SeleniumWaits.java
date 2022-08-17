package com.SeleniumWaits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumWaits {
	
	//Thread.sleep -->static wait
	//implicit wait-->dynamic wait,global wait  it will applicable for the all the elements
	//explicitwait, webdriver wait -->only perticular element applicable
	//it wont support nonwebelements -->url,title,alerts
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();//server
	    WebDriver driver= new ChromeDriver();//session id
	    
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	   driver.get("http://mrbool.com/search/?txtsearch=how-to-create-menu-with-submenu-using-css-html");

	   WebElement soursefile= driver.findElement(By.id("draggable"));//1sec
		
		WebElement targetfile=driver.findElement(By.id("droppable"));//3sec
	   
	}
	
	
}
