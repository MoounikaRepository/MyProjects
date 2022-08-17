package com.JavaSessions.July;

public class IncrementDecrementExample {
	
	//post increment 
	//pre increment
	//post decrement
	//pre decrement
	
	public static void main(String[] args) {
	
	int a=1;
	int b=a++;
	
	System.out.println(a);//2
	System.out.println(b);//1
	
	
	//pre increment
	
	int c=1;
	int d=++c;//2
	
	System.out.println(c);//2
	System.out.println(d);//2
	
	//post decrement
	
	int i=10;
	int j=i--;
	
	System.out.println(i);//9
	System.out.println(j);//10
	
	//pre decrement
	
	int k=10;
	int l=--k;
	
	System.out.println(k);//9
	System.out.println(l);//9
	
	}

}
