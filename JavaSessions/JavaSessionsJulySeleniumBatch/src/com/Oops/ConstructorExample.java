package com.Oops;

public class ConstructorExample {

	// create object internaly constructor will call
	// constructor name should be same as classname
	// costructor don't have any return type
//	1.default constructor:jvm will give while executing object 
	// 2.Parameterized constructor:when you passed some parameters to the
	// constructor that is parameterized constructor
	// constructor also overloaded

	// this keyword will use for invoke current class variavles

	String name;
	String pwd;

	public ConstructorExample(String name, String pwd) {
		this.name = name;
		this.pwd = pwd;

		System.out.println("Paramerized constructor");

	}

	public ConstructorExample(String name, int otp) {

		System.out.println("Paramerized constructor");

	}

	public void test() {
		System.out.println("this is method");
	}

	public static void main(String[] args) {

		// ConstructorExample c = new ConstructorExample();
		ConstructorExample c1 = new ConstructorExample("mounika", "P@ssword");
		ConstructorExample c2 = new ConstructorExample("mounika", 9878);
		ConstructorExample c3 = new ConstructorExample("test", 3455);

		c1.test();
		c1.name = "test";
		c1.pwd = "test";

		c2.name = "testttttt";
		c2.pwd = "testttt";

		System.out.println(c1.name);
		System.out.println(c1.pwd);

	}

}
