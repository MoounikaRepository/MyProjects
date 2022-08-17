package com.Inheritanc.Example;

public class Test {
	
	//when child class and parent class having same method name and same no of parameters that is overriding
	
	public static void main(String[] args) {
		
	   RBI r = new RBI();
	    r.dailyLimit();//child class method will call
	    r.parentclasmethod();// parent class min amount 10000, to max 100000
		
		BankGrandParent b = new BankGrandParent();
		b.dailyLimit();
		
		HasaRelation h =new HasaRelation();
		h.test123();
		
	}

}
