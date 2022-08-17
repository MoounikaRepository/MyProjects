package com.SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtil {

	WebDriver d;

	public WebDriver Browserlaunch(String browser) {

		switch (browser) {
		case "Chrome":

			WebDriverManager.chromedriver().setup();
			d = new ChromeDriver();

			break;
		case "Firefox":
			WebDriverManager.firefoxdriver().setup();
			// System.setProperty("webdriver.gecko.driver","C:\\Users\\MDOMMALA\\Downloads\\geckodriver-v0.31.0-win64//geckodriver");
			d = new FirefoxDriver();

			break;

		case "Safari":

			d = new SafariDriver();
			break;

		case "IE":
			WebDriverManager.edgedriver().setup();
			d = new EdgeDriver();
			break;

		default:

			System.out.println("no browser found");
			break;
		}

		return d;

	}

	public void getUrl(String url) {
		d.get(url);

	}

	public String getTitle() {

		return d.getTitle();

	}

	public void closeBrowser() {

		d.close();
	}

}
