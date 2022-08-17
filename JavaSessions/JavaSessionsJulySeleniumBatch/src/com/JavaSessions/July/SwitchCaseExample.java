package com.JavaSessions.July;

public class SwitchCaseExample {
	
	public static void main(String[] args) {
		
		String name="Sita";
		
		switch (name) {
		case "Sam":
			System.out.println(name+"marks is 90");
			break;
			
		case "Ram":
			System.out.println(name+"marks is 90");
			break;
		case "Tom":
			System.out.println(name+"marks is 90");
			break;
			
		case "Sita":
			System.out.println(name+"marks is 90");
			break;
	
		default:
			System.out.println("no student found");
			break;
		}
	
	
	//browser
	
	String browser="Chrome";
	
	
	switch (browser.toLowerCase()) {
	case "chrome":
		System.out.println(browser +"launch  browser");
		break;
		
	case "firefox":
		System.out.println(browser+"marks is 90");
		break;
	case "Safari":
		System.out.println(browser+"marks is 90");
		break;
		
	case "IE":
		System.out.println(browser+"marks is 90");
		break;

	default:
		System.out.println("no browser found");
		break;
	}
}
	
}
	
	

