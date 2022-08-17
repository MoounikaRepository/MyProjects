package com.Collections;

import java.util.HashSet;

public class SetExample {
	
	
	//set wont allow duplicate values 
	//set wont follow any insertion order
	//Based hash code it will execute

	public static void main(String[] args) {
		
		
		HashSet<Integer>h = new HashSet<Integer>();
		
		h.add(1000);
		h.add(2000);
		h.add(3000);
		h.add(4000);
		h.add(5000);
		h.add(5000);
		h.add(5000);
		h.add(5000);
		
		/*
		 * for(int i=0;i<h.size();i++) { System.out.println(h); }
		 */
		
	System.out.println(h);
	
	
	
	}
	
}
