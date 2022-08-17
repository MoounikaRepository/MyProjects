package com.Encapsulation;

public class EncapsulationTest {
	
	public static void main(String[] args) {
		
		
		Car c = new Car();
		
		c.setWheels(4);
		c.setSeat("seat colur is blue");
		
		System.out.println(c.getSeat()+"   "+c.getCarWheels());
	
		
		LaunchWebBrowser l = new LaunchWebBrowser();
		
		l.browserinfo();
	}

}
