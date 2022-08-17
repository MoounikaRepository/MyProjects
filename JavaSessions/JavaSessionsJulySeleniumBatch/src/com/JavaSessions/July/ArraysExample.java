package com.JavaSessions.July;

public class ArraysExample {
	
	public static void main(String[] args) {
		
	//arrays:
		
		//similar type of data can store
		//static array 
		//dynamic array
		//index wise we can store values in array
		//Array are fixed size
		
		//disadvantage:fixed size 
		//we cant increase or decrese the size of array 
		
		int studentId[]= {1,2,3,4,5,6,7,8,9};
		
		
		int i[]=new int[10];//
		
		i[0]=2000;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		i[4]=50;
		
		System.out.println(i[0]);
		System.out.println(i.length);
		
		
		for(int j=0;j<i.length;j++) {//0<10,1<10
			
			System.out.println(i[j]);//i[0],i[1]
			
		}
		
		//string array
		
		
		String studentname[]=new String[10];
		
		studentname[0]="Ram";
		studentname[1]="Tom";
		studentname[2]="Sam";
		
		for(int k=0;k<studentname.length;k++) {
			
			System.out.println(studentname[k]);
		}
		
	
	//Store diff type of data using static
	Object ob[]= new Object[6];
	ob[0]=2000900;
	ob[1]="Empname";
	ob[5]=765373.90;
	ob[3]=975625711;
	ob[2]='A';
	
	for(int w=0;w<ob.length;w++ ) {
		System.out.println(ob[w]);
	}
	
	
	}
}
