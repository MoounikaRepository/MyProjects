package com.SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AmazonTest {
	// static WebDriver d;
	public static void main(String[] args) {

		BrowserUtil b = new BrowserUtil();
		WebDriver driver = b.Browserlaunch("Chrome");

		WebElementExample w = new WebElementExample(driver);

		b.getUrl("https:www.opencart.com");
		String title = b.getTitle();
		System.out.println(title);

		By registerButton = By.xpath("//a[@class='btn btn-black navbar-btn']");

		w.getElement(registerButton).click();

		b.closeBrowser();

	}

}
