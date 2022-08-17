package com.SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class WebElementUtil {

	static WebDriver d;

	public static WebElement getElement(By locator) {

		return d.findElement(locator);

	}

	public static void SendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);

	}

	public static void dropdown(By locator, int index) {

		Select s = new Select(WebElementExample.getElement(locator));

		s.selectByIndex(index);

	}

}
