package com.Collections;

import java.util.ArrayList;

public class ArrayListExample {
	
	//Array list follow insertion order
	//it will allow duplicates 
	//disadvantage
	//when ever we want add or remove values from arraylist it will take more time due to shifting
	
	// advantage :
	//Retriving data is very fast 
	//vc by default 10
	
	public static void main(String[] args) {
		
		
		ArrayList<Integer> a= new ArrayList<Integer>(20);
		
		a.add(100);//0
		a.add(200);//1-->0
		a.add(200);//2-->1
		a.add(300);//3
		a.add(100);//4
		a.add(200);//5
		a.add(200);//6
		a.add(300);//7
		
		System.out.println(a.size());
		
		System.out.println("4 th indes value"+a.get(4));
		
		a.remove(0);
		
		for(int i=0;i<a.size();i++) {
			System.out.println(a.get(i));
		}
		
		
	}

}
