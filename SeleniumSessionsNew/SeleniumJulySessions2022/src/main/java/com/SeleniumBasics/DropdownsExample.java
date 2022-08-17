package com.SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownsExample {
	static WebDriver d;
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();//server
		 d= new ChromeDriver();//session id
		
		d.get("https://www.orangehrm.com/hris-hr-software-demo/#");
		
		WebElement country= d.findElement(By.id("Form_submitForm_Country"));
		
		WebElementExample w = new WebElementExample(d);
		
		By Country1= By.id("Form_submitForm_Country");
		
		dropdown(Country1,2);
		
		
		/*
		 * Select s = new Select(country);
		 * 
		 * //s.selectByIndex(1); 
		 * //s.selectByValue("Algeria");
		 * s.selectByVisibleText("American  Samoa");
		 * s.deselectbyall
		 */
		
	}
	
	
	public static void dropdown(By locator,int index) {
		
		Select s = new Select(WebElementUtil.getElement(locator));
		
		s.selectByIndex(index);
		
	}

}
