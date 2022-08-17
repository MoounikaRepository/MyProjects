package com.JavaSessions.July;

public class StringConcatinationExample {
	
	public static void main(String[] args) {
	
	String s="Please give Email id Correct";
	
	int i = s.length();
	
	System.out.println(i);

	System.out.println(s.charAt(5));
	
	System.out.println(s.indexOf("E"));
	
	
	String s1="mounika";
	String s2="Test";
	
	System.out.println(s1+s2);
	
	int i1=100;
	int i2=200;
	
	System.out.println(s1+(i1+i2));
	
	System.out.println(i1+i2+s1);
	
	double d=97444.900;
	
	double d1=8764.0900;
	
	System.out.println(s1+d+d1);
	System.out.println(d+d1+s1);
	
	System.out.println(s1.toUpperCase());
	
	String s3="TEST";
	
	System.out.println(s3.toLowerCase());
	
	
	String st= "Selenium";
	String str="seleniumuuuu";
	
	System.out.println(st.equals(str));//false
	
	System.out.println(st.equalsIgnoreCase(str));//true
	
	
	System.out.println(st.concat(str));
	
	
	System.out.println(st.contains("test"));

}
}