package com.ExceptionHandling;

public class FinallyBlockEx {
	
	//finally block always excute if exception handles or not dose not matter
	
	public static void main(String[] args) {
	
		try {
			int b=8/0;	
		}catch(Exception e){
		System.out.println(e);
			
		}
		
		finally{
			System.out.println("testttt");
			
		}
		
		
		
	}

}
