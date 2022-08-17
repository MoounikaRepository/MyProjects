package com.Oops;

public class EmployeeObjectExample {
	
	//how you will create object -->using new keyword
	
	String empName;
	String CompName;
	int age;
	double salary;
	
	public static void main(String[] args) {
		
		 EmployeeObjectExample e1 = new EmployeeObjectExample();
		 
		 e1.empName="Ram";
		 e1.CompName="TCS";
		 e1.age=22;
		 e1.salary=54621.90;
		 
		 EmployeeObjectExample e2 = new EmployeeObjectExample();
		 e2.empName="test";
		 e2.CompName="IBM";
		 e2.age=27;
		 e2.salary=57821.90;
		 
		System.out.println(e1.empName+ " "+ e1.CompName+" "+e1.age+e1.salary); 
		System.out.println(e2.empName+e2.CompName+e2.age+e2.salary);
		
		//new EmployeeObjectExample();
		
		e2=null;
		System.out.println(e1.empName+ " "+ e1.CompName+" "+e1.age+e1.salary);
		
		System.out.println(e2.empName);
		
		System.out.println(e2.empName+e2.CompName+e2.age+e2.salary);
	}

}
