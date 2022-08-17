package com.ExceptionHandling;

public class TryCatch {
	public static void main(String[] args) {
		
		System.out.println("testing");
		
		
		try {
		int a=5/0;
		}catch(Exception e) {
			System.out.println(e);
		}
		
		System.out.println("exception");
	}

}
