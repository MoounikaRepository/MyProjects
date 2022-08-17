package com.Abstraction;

public abstract class Hospital {//abstarct class
	
	//can't create object for abstract class
	//abstarct classes allow abstract methods and non abastarct methods
	//abstarct class allow static and non static methods
	//abstarct class allow final and non final methods
	//partiel abstraction
	
	public abstract void GeneralServices();//abstarct method
	
	public void CardiServices() {
		System.out.println("testing");
	}
	
	public static void Billing() {
		System.out.println("Billing");
	}
	
	public final void Aadhar() {
		System.out.println("aadhar card number");
	}

}
