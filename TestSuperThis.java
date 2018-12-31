package com.inter;

class SuperClass {
	public SuperClass() {
		System.out.println("Super Class....");
	}
}

public class TestSuperThis extends SuperClass {

	public TestSuperThis() {
		//this(10);
		this(10);
		//super();
		System.out.println("Child class..");
	}
//	
	public TestSuperThis(int i) {
		//this(10, "mahesh");
		System.out.println("Single argument");
	}
//	
//	public TestSuperThis (int i, String s) {
//		System.out.println("Double argument..");
//	}
//	
	public static void main(String[] args) {
		TestSuperThis obj = new TestSuperThis();

	}

}
