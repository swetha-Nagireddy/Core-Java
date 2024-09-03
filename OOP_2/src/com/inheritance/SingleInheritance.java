package com.inheritance;


class Parent{
	int data=10;
	private int data2=100;
	


public int getData2() {
	return this.data2;
}
}

class Child extends Parent{
	public int getdata() {
		return this.data;
	}


}
public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p = new Parent();
		System.out.println(p.data);
		
		Child ch = new Child();
		System.out.println(ch.data);
		System.out.println(ch.getdata());
		System.out.println(ch.getData2());

	}

}

