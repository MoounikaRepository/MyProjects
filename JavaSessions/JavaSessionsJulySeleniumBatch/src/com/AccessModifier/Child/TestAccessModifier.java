package com.AccessModifier.Child;

import com.AccessModifier.Example.AccessModifierPublicPrivate;

public class TestAccessModifier  extends AccessModifierPublicPrivate {
	
	
	public static void main(String[] args) {
		
	
	AccessModifierPublicPrivate a = new AccessModifierPublicPrivate();
	
	a.Login();
	//a.bank();
	//a.test();
	
	
	TestAccessModifier t = new TestAccessModifier();
	
	t.Example();

	
	
	
	
	}
	
}
