package com.inheritance;


class X{
	X(){
		System.out.println("no-arg parent cls constructor is called");
	}
}

class Y extends X{
	Y(){
		
		super();
		// super();   we cannot call super and this with in a same constructor because the rule for constructor is that the other constructor needs first to be executed
		System.out.println(" child no-arg constructor is called");
	}
	Y(int a){
		this();
		System.out.println(" child parameterized  constructor is called");
	}
}
public class Super_3 {

	public static void main(String[] args) {
		Y y = new Y(10);

	}

}
