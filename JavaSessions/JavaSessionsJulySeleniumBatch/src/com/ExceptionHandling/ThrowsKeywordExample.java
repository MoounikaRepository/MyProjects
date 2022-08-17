package com.ExceptionHandling;

public class ThrowsKeywordExample {
	
	
	//using throws keyword we can throw the exception to the caller method
	
	public void m1() {
		
	}

	public void m2() { 
	try {//risky code
		
		m3();
		
	}catch(Exception e)//handing exception
		{
			System.out.println(e);
		}
		
	System.out.println("exception");	
	
	}
	
		
	
	public void m3()  throws ArithmeticException{  
		
		int a=8/0;
		
		
	}
	
	public static void main(String[] args) {
		ThrowsKeywordExample t =new ThrowsKeywordExample();
		t.m2();
		
	}
}
