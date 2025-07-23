package com.constructors;

public class ConstructorChild extends ConstructorParent {
	static ConstructorChild CC2 = new ConstructorChild();

	public static void testMethod1() {
		oneMethod();
		ConstructorChild CC = new ConstructorChild();
		CC.testMethod2();
	}

	public void testMethod2() {
		oneMethod();
		anotherMethod();

	}

}
