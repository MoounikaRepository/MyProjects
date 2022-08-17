package com.Action.Perform;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClickExample {
	//context click method in action class
	
static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();//server
		driver= new ChromeDriver();//session id
		
	driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
	
	Actions act = new Actions(driver);
	
	WebElement rightclick= driver.findElement(By.xpath("//span[@class=\"context-menu-one btn btn-neutral\"]"));
	
	act.contextClick(rightclick).perform();
	
	List<WebElement> option= driver.findElements(By.xpath("//ul[@class=\"context-menu-list context-menu-root\"]/li/span"));
	
	for(WebElement e:option) {
		
	String text=e.getText();
	System.out.println(text);

	
	if(text.equals("Cut")) {
		e.click();
		break;
		
	}
		
	}

}

}