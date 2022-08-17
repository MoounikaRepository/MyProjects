package com.JavaSessions.July;

public class Loops {
	
	//while loop 
	// do while loop
	//for loop
	
public static void main(String[] args) {
	
	/*
	 * System.out.println(1); System.out.println(2); System.out.println(3);
	 */
	
	int i=1;
	while(i<=10) {
		
	System.out.println(i);//1 2

	//i++;//2,3-----10
	++i;	
	}
	
	
	int n=1;
	
	do {
		System.out.println(n);//1
		n++;
		
	}while(n<=10);
	
	
	//
	for(int k=1;k<=100;k++) {
	
	System.out.println("kvalue"+k);//1
	
	if(k%5==0) {
		System.out.println("5 divides");
		break;
	}else {
		System.out.println("normal numbers");
	}
	
	
	
}
	
	

	
}
	

}
