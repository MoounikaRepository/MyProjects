package com.Encapsulation;

 public class Car {
	
	//wrapping of code and data together
	 //we can achive security to app
	 //hiding the internal implimentation and showing the functionality
	
	//final is key word 
	//when you write final to the classses you can stop inheritnce
	//we cant override final methods we can overload final methods
	
	private  int  wheels;
	
	private String Seat;
	
	public  final void test() {
		
	}

    public  final void test(int a) {
		
	}
	
	
	public  int getCarWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public String getSeat() {
		return Seat;
	}

	public void setSeat(String seat) {
		Seat = seat;
	}
	
	

}
