package com.java.oops.inheritance;

public class StaticWithInheritance {//protected

	public static void main(String[] args) {
		B b = new B();
		b.test();
		
		A.test();
		B.test();
	}

}

class A {
	static void test() {// static fn gets inherited
		System.out.println("A");
	}
}

class B extends A {
	
//	@Override static fn cannot be overidden ACTUALLY method hiding is happening
	static void test() {// static fn gets inherited
		System.out.println("B");
	}
}