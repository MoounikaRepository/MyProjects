package com.Abstraction;

public class Test12 {
	public static void main(String[] args) {
		String s1 = "HELLO";
		String s2 =  new String("HELLO");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
	}

}
