package com.SeleniumBasics;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowsHandling {
	
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();//server
		WebDriver d= new ChromeDriver();//session id
		
	d.get("https://opensource-demo.orangehrmlive.com/");//parent window
		
	d.findElement(By.xpath("//img[@alt=\"LinkedIn OrangeHRM group\"]")).click();//child window
		
	Set<String> handle=	d.getWindowHandles();//2 window id
	
	Iterator<String> it=handle.iterator();
	
	String ParentId=it.next();
	System.out.println("this is parent id"+ParentId);
	
	String childid=it.next();
	System.out.println("child id"+childid);
	
	
	d.switchTo().window(childid);
	System.out.println(d.getCurrentUrl());
	
	
	d.switchTo().window(ParentId);
	
	System.out.println(d.getCurrentUrl());
		

}

}