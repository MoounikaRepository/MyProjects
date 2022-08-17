package com.Oops;

public class StaticExample {

	String employeeName;
	int age;
	double salary;
    static String CompanyName="TCS";
    
    
    //when we have common property for all the object then we will use static keyword
    //memory management easily using static keyword
	//to call static variables and static methods  no  need to create object 
    //outside class need to use classname to calll static variables
    //inside class you can directly call the static variables
    //method overloading possible for static and non static methods
	
	public void work() {
		
	}
	public  static void departmentIT() {
		System.out.println("This block is for IT");
	}
	public  static void departmentIT(int a) {
		System.out.println("This block is for IT");
	}
	
	
	public static void main(String[] args) {
		  
		StaticExample st = new StaticExample();
		st.employeeName="Tom";
		st.age=29;
		st.salary=23444.90;
		//st.CompanyName="TCS";//warning due to static
		//st.departmentIT();
		
		StaticExample s2 = new StaticExample();
		s2.employeeName="Sam";
		s2.age=32;
		s2.salary=23344.90;
		//s2.CompanyName="TCS";
		
		StaticExample s3 = new StaticExample();
		s3.employeeName="Ram";
		s3.age=42;
		s3.salary=73344.90;
		//s3.CompanyName="TCS";
		
		
		System.out.println(st.employeeName+st.age+st.salary+CompanyName);
		System.out.println(s2.employeeName+CompanyName);
		
		System.out.println(StaticExample.CompanyName);//outside class need to use classname to calll static variables
		
		departmentIT();
		
	}
	
	
	
}
