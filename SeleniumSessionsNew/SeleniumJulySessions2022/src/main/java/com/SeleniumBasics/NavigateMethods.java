package com.SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigateMethods {
	
public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\MDOMMALA\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriverManager.chromedriver().setup();
		WebDriver d= new ChromeDriver();//session id
		
		d.get("https://www.amazon.com");
		
		d.navigate().refresh();
		d.navigate().to("https:flipkart.com");
		d.navigate().back();
		d.navigate().forward();

}

}