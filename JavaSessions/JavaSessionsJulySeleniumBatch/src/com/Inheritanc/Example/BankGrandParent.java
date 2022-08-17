package com.Inheritanc.Example;

public class BankGrandParent  {
	
	//when one child class object aquires all the properties from the parent class 
	//using extends we can achive inheritance
	//code reusability is the main advantage
	//using super keyword you can call parent class variable and parent class methods
	
	public void Balance() {
		System.out.println("balnce");
	}
	
   public void dailyLimit() {
    	
    	System.out.println(" parent class min amount 10000, to max 100000");
		
	}


}
