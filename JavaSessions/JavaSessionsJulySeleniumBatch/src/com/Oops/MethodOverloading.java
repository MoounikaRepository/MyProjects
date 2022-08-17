package com.Oops;

public class MethodOverloading {
	// compile time polymorphism

	// same method name parameters are differnt,and different datatypes

	public void login() {
		System.out.println("Login with zero parameters");
	}

	public void login(String username, String pwd) {
		System.out.println("login with username and pwd ");

	}

	public void login(long mobileno, int otp) {

		System.out.println("login with mobile number");
	}

	public int login(int a, int b) {

		int c = a + b;

		return c;
	}

	public boolean login(int a, int b, int c) {

		return true;
	}

	public static void main(String[] args) {

		String s = "Mounika";
		System.out.println(s);

		MethodOverloading m = new MethodOverloading();

		m.login();
		m.login("test", "admin");
		m.login(986287871, 9089);

		System.out.println(m.login(100, 500));
	}

}
