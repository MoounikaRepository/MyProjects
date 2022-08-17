package com.JavaSessions.July;

public class ConditionalOperaters {
	//if
	//if else 
	//if else if
	//switch
	
	public static void main(String[] args) {
		
	
	int i=10;
	
	int j=20;
	
	if(i<=j) {
		
		System.out.println("I values is less than j value ");
	}
	else {
		System.out.println("Both are not matching");
	}
	
	if(true) {
		System.out.println("Condition true");
	}
	else {
		System.out.println("Condition false");
	}
	
	boolean b=false;
	
	if(b) {
		System.out.println("condition true");
	}
	
	else {
		System.out.println("condition false");
	}
	
	
	//student marks
	
	String name="Test2";
	
	if(name.equals("Test2")) {
		System.out.println("student marks is 90");
	}
	
	if(name.equals("Test4")) {
		System.out.println("student marks is 78");
	}
	
	if(name.equals("Test3")) {
		System.out.println("student marks is 98");
	}
	
	if(name.equals("Test5")) {
		System.out.println("student marks is 88");
	}
	
	else {
		System.out.println("no student found");
	}
	
	
	//if else if
	
	String studentName="Rama1";
	
	if(studentName.equals("Sita")) {
		System.out.println("tom marks is 90");
	}
	else if(studentName.equals("Sita")) {
		System.out.println("sita marks is 100");
	}
	
	
	else if (studentName.equals("Rama")) {
		System.out.println("rama marks is 80");
	
	}
	
	else {
		System.out.println("no student found");
	}
	
	
	}

}
