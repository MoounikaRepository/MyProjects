package com.SeleniumBasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JSAlertsHandle {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();//server
		WebDriver d= new ChromeDriver();//session id
		
		d.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		d.findElement(By.name("proceed")).click();
		Thread.sleep(5000);
		
		Alert alert=d.switchTo().alert();
		
		//alert.accept();//accept
		
		alert.dismiss();//cancel the alert
		
		
		
	}
	

}
