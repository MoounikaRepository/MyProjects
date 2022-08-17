package com.Action.Perform;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElement {
	
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();//server
		driver= new ChromeDriver();//session id
		
	driver.get("http://mrbool.com/search/?txtsearch=how-to-create-menu-with-submenu-using-css-html");
	
	Actions act = new Actions(driver);
	
	WebElement content= driver.findElement(By.xpath("//a[@class=\"menulink\"]"));
	act.moveToElement(content).perform();
	
	Thread.sleep(10000);
	
	driver.findElement(By.linkText("COURSES")).click();
	

}
}