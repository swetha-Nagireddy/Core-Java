package com.inheritance;

class GP{
	int a =50;
}
class C1 extends GP{
	int b=10;
	
}
class C2 extends GP{
	int c=20;
}

class C3 extends GP{
	int d=30;
}
public class Hierarchical_Inheritance {

	public static void main(String[] args) {
		C1 obj = new C1();
		System.out.println(obj.b);
		System.out.println(obj.a);
		
		C2 obj2 = new C2();
		System.out.println(obj2.c);
		System.out.println(obj2.a);
		
		C3 obj3 = new C3();
		System.out.println(obj3.d);
		System.out.println(obj3.a);

	}

}
