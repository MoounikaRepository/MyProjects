package com.SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBasics {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\MDOMMALA\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver d = new ChromeDriver();// session id

		// launch the url

		d.get("https://www.amazon.com");

		// getting title

		String title = d.getTitle();

		System.out.println(title);

		if (title.equals("Amazon.com. Spend less. Smile more.")) {
			System.out.println("title coming correct");
		} else {
			System.out.println("both are not matched");
		}

		// get the url

		String url = d.getCurrentUrl();
		System.out.println(url);
		
		String pageSource= d.getPageSource();
		//System.out.println(pageSource);

		d.close();// when we write d.close metll close
		// invalid session id exception

		// d.quit();//multiple windows will close
		// session id closed

		// Session ID is null. Using WebDriver after calling quit()?

		d.get("https:www.google.com");

	}

}
