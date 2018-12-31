package com.inter;

class A{
	public void m1() {
		System.out.println("A m1");
	}
}

class B extends A{
	public void m1() {
		System.out.println("B m1");
	}
}

class C extends B{
	public void m1() {
		super.m1();
		System.out.println("C m1");
	}
}

public class ConstrutorOverloading {

	public static void main(String[] args) {
		A a  = new C();
		a.m1();
	}

}
