package com.inheritance;

class A1{
	int a=10;
}

class B1 extends A1{
	int a=20;
	public void m1() {
		System.out.println(super.a);
	}
}

class C4 extends B1{
	int a=30;
	
	public void m1() {
		System.out.println(this.a);
		System.out.println(super.a);
		
		super.m1();
	}
}
public class Multilevel_Inheritance2 {

	public static void main(String[] args) {
		C4 obj = new C4();
		//System.out.println(obj.a);
		obj.m1();

	}

}
