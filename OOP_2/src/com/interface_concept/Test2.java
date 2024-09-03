package com.interface_concept;

interface X{
	
}
interface A{
	void m1();
}

interface B extends A,X{
	void m2();
}

 class C implements A,X{
	public void m1() {
		System.out.println("hello java");
	}
	public void m2() {
		System.out.println("welcome to programming");
	}
}
public class Test2 {
	public static void main(String[] args) {
		C c= new C();
		c.m1();
		c.m2();
	}

}
