package com.SeleniumWaits;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWaitExample {
	public static void main(String[] args) {
	
	WebDriverManager.chromedriver().setup();// server
	WebDriver driver = new ChromeDriver();// session id

	driver.get("https://classic.crmpro.com/index.html");

	By username = By.name("username");

	By password = By.name("password");
	
	
	Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10)).
			                                                  pollingEvery(Duration.ofSeconds(2))
			                                                  .ignoring(NoSuchElementException.class)
			                                                  .ignoring(ElementNotVisibleException.class);
	
	wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(username));
}


}
