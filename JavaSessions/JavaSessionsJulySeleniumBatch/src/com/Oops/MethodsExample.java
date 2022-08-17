package com.Oops;

public class MethodsExample {

	public void eat() {

		System.out.println("employee eat");

	}

	//method may or may not be return type
	// 1st type method
	public void walk() {
		System.out.println("emp walk");
	}

	// no input return some out
	public int add() {

		int a = 100;
		int b = 200;
		int c = a + b;

		return c;
	}

	public String empname() {

		String name = "test";
		return name;
	}

	// 3 rd method
	//method with parameter 

	public int sub(int a, int b,int d,int e) {
		
		int c=a-b;
		
		return c;

	}
	
	//student marks 
	
	public int getMarks(String studentName) {
		
		if(studentName.equals("Tom")) {
			return 90;
		}
		else if(studentName.equals("Nasha")) {
			return 80;
		}
		
		return 0;
	}
	
	
	public static void main(String[] args) {

		MethodsExample m = new MethodsExample();// object
		m.eat();
		m.walk();
		System.out.println(m.add());

		int d = m.add();
		System.out.println(d);

		System.out.println(m.empname());

		String empName = m.empname();// test
		System.out.println(empName);
		
		
		System.out.println(m.sub(200, 100,900,800));//arguments
		System.out.println(m.sub(30, 20, 10, 5));
		m.sub(1000, 500, 90, 80);
		
	System.out.println(	m.getMarks("Nasha"));
	}

}
