package com.AccessModifier.Example;

public class AccessModifierPublicPrivate {

	public void Login() {// public access modifier

		System.out.println("every where can access");
	}

	private void bank() {
		System.out.println("private method is only class leve ");
	}

	void test() {

		System.out.println("only with in class and with in package");
	}

	protected void Example() {

		System.out.println("we can call same package and same class,different package through child classess");
	}

	public static void main(String[] args) {

		AccessModifierPublicPrivate a = new AccessModifierPublicPrivate();

		a.bank();
		a.Login();
		a.test();
		a.Example();

	}

}
