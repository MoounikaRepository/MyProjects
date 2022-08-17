package com.Collections;

import java.util.LinkedList;

public class LinkedListExample {
	
	//Linkedlist will follow insertion order,it will allow duplicates 
	//Advantage is when you want add or remove values from middile it is very fast comapre to arrray listt
	//Linked list retrieving operation is slow
	//default size 16

	public static void main(String[] args) {
		
		
		LinkedList<String>l= new LinkedList<String>();
		
		l.add("Test10");
		l.add("Test1");
		l.add("test2");
		l.add("test3");
		l.add("test4");	
		l.add("test5");
		l.add("Test10");
		l.add("Test1");
		l.add("test2");
		l.add("test3");
		l.add("test4");	
		l.add("test5");
		l.add("Test10");
		l.add("Test1");
		l.add("test2");
		l.add("test5");
		l.add("Test10");
		l.add("Test1");
		l.add("test2");
		l.add("test3");
		l.add("test4");	
		l.add("test5");
		
		System.out.println(l.get(4));
		System.out.println(l.remove(5));
		System.out.println(l.size());
		
		//for each Loop
		
		for(String name:l) {
			
			System.out.println(name);
		}
		
		
		
	}
	
	
}
