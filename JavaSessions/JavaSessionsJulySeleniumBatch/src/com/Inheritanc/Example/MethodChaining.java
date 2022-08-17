package com.Inheritanc.Example;

public class MethodChaining {
	
	
	public void m1() {
		
	System.out.println("method1");
	
	
	}
	
	public void m2() {
		System.out.println("method 2");
		
	    m1();
		m3();
		
	}
	public void m3() {
		System.out.println("method3");
	}
	
	public static void main(String[] args) {
		MethodChaining m = new MethodChaining();
		
		m.m2();
		
		
	}

}
