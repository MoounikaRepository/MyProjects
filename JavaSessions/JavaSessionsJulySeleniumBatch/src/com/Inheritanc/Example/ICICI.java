package com.Inheritanc.Example;

public class ICICI extends RBI{
	
	public void pinChangeATM() {
		
		System.out.println("atm pin chnage");
	}
	
	
	public static void main(String[] args) {
		ICICI i = new ICICI();
		i.pinChangeATM();
		i.Balance();
		i.intrestRate();
	}

}
