package com.inheritance;

class Base{
	Base(){
		
		System.out.println("parent class constructor called");
	}
}

class Derived extends Base{
	Derived(){
		super(); //if we wont call the super() then jvm will implicitly will call super()
		System.out.println("child class constructor called");
	}
}

public class Super_1 {
	
public static void main(String[] args) {
		Derived d = new Derived();

	}

}
