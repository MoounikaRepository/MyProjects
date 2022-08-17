package com.Abstraction;

public class Test extends Hospital {

	@Override
	public void GeneralServices() {
		
		System.out.println("general services");
	}
	
	public static void main(String[] args) {
		
	//Hospital h = new Hospital(); abstarct class object
		Test t = new Test();
		
		t.GeneralServices();
		t.CardiServices();
		
		Hospital h= new Test();
		h.CardiServices();
		h.GeneralServices();
}
	}
