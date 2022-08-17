package com.SeleniumWaits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverWaitExample {

//webdroverwait child class extends fluent wait  parent class--->wait interface

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();// server
		WebDriver driver = new ChromeDriver();// session id

		driver.get("https://classic.crmpro.com/index.html");

		By username = By.name("username");

		By password = By.name("password");

		WebDriverWait wait = new WebDriverWait(driver, 10);

//An expectation for checking that an element is present on the DOM of a page. 
		// This does notnecessarily mean that the element is visible.

		WebElement user = wait.until(ExpectedConditions.presenceOfElementLocated(username));

		user.sendKeys("mounika.@gmail.com");

		// An expectation for checking that an element,
		// known to be present on the DOM of a page, isvisible.
		// Visibility means that the element is not only displayed but also has a
		// height andwidth that is greater than 0.

		WebElement visible = wait.until(ExpectedConditions.visibilityOf(user));
		System.out.println(visible);

		wait.until(ExpectedConditions.alertIsPresent());

	}

}