package com.Strings;

public class ReversingString {
	
	public static void main(String[] args) {
		
		String s= "Selenium";
		
		StringBuilder sb= new StringBuilder(s);
	
		sb.reverse();
		sb.toString();
		
		System.out.println(sb.toString());
		
		
		char ch[]=s.toCharArray();
		String rev="";
		
		for(int i=ch.length-1;i>=0;i--) {//7>0
	
			 rev += ch[i];
		}
		
		System.out.println(rev);
		
	}

}
