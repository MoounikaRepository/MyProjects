package com.Inheritanc.Example;

public class SBIBank extends RBI {
	
	
	public void loan() {
		System.out.println("sbiloans");
	}
	
	public void withdraw() {
		System.out.println("withdraw");
	}
	
	
	
public static void main(String[] args) {
	
	
	SBIBank s = new SBIBank();
	s.dailyLimit();
	s.intrestRate();
	s.loan();
	s.withdraw();
	s.Balance();
	
	 //topcasting
	RBI r = new SBIBank();
	
	r.dailyLimit();
	r.intrestRate();
    // r.withdraw();
    //r.loan();
	
	//down casting
	//SBIBank s()= new RBI();
	
	
	RBI r1 = new RBI();
	r1.Balance();
	r1.dailyLimit();
	
}
}
