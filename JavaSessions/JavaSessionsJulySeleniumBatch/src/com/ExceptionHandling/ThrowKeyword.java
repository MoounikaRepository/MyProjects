package com.ExceptionHandling;

public class ThrowKeyword {
	
	//using throw keyword you can customise your own exceptions
	
	public static void main(String[] args) {
		
			int a=10;
			int b=9;
			
			if(a!=b) {
				
		try {
			
		throw new Exception("Both are not equal");
		}
			catch(Exception e) {
			
			e.printStackTrace();
			System.out.println("data not equal");
			System.out.println(e.getMessage());
		}
		}
		
	}

}
