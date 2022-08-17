package com.TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGBasics {
	

	@BeforeSuite
	public void CreateUserinDB() {
		
		System.out.println("DB connection");
	}

	@BeforeTest
	public void permission() {
		System.out.println("given permissions");

	}

	@BeforeClass

	public void browserLaunch() {
		System.out.println("launch url");

	}

	@BeforeMethod

	public void login() {

		System.out.println("login app");
	}
	
	@Test(priority=3)
	public void LoginAmazon() {
		WebDriverManager.chromedriver().setup();
		WebDriver d = new ChromeDriver();
		d.get("https://www.flipkart.in/");
		d.close();
	}

	@Test(priority = 1)

	public void testTitle() {
		System.out.println("title validation");
	}

	@Test(priority = 2)
	public void logo() {
		System.out.println("logo validation");
	}

	@AfterMethod

	public void logout() {
		System.out.println("logout");
	}

	@AfterClass

	public void closebrowser() {

		System.out.println("close browser");
	}

	@AfterTest
	public void closetest() {
		System.out.println("close the driver");
	}

	@AfterSuite
	public void DBclose() {
		System.out.println("db clouse");
	}

}
