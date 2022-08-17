package com.Interface;

public interface USMedical extends WHO {
	
	// Interface is looklike class only 
	//we can't write method body inside interface only method declararion
	//we can not  create object for interface
	//interface to class need to write implements keyword
	//cant create constructor for the interfaces 
	//interfaces allow only final and static method 
	
	public void generalService();
	public void Ortho();
	
	public static void billing() {
		System.out.println("billing");
	}
	
	//1.8 java version
	public static void main(String[] args) {
		System.out.println("testt");
		
		
	}
	
	default void login() {
		System.out.println("test default");
	}

}
