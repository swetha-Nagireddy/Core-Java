package com.inheritance;

class A{
	A(int a){
		System.out.println("parameterized parent class constructor ");
	}
}

class B extends A{
	B(){
		super(10);  // if we don't call super() then it will give compile time error. so we need to call it implicitly for parameterized constructor.
		
		System.out.println("no-arg child class constructor ");
	}
}
public class Super_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         B obj = new B();
	}

}
