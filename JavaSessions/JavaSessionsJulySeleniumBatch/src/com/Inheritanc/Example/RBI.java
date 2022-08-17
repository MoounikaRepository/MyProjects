package com.Inheritanc.Example;

public class RBI extends BankGrandParent {//is a relation ship
	
	
	public void intrestRate() {
		System.out.println("intrest rates should be min 5%  max 10%");
		
	}
	
	@Override
    public void dailyLimit() {
    	
    	System.out.println(" child class method over ridden------min amount 10000, to max 100000");
    	
		
	}
	
	public void parentclasmethod() {
		
		super.dailyLimit();
	}
	

}
