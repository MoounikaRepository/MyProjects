package com.Action.Perform;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragandDrop {
	//click and hold the element move to element relese

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();// server
		WebDriver driver = new ChromeDriver();// session id

		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		
	WebElement soursefile=	driver.findElement(By.id("draggable"));
	
	WebElement targetfile=driver.findElement(By.id("droppable"));

		Actions act = new Actions(driver);
		act.clickAndHold(soursefile).moveToElement(targetfile).release().build().perform();
		

	}

}