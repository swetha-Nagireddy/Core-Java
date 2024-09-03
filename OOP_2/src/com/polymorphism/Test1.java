package com.polymorphism;


class AInfo{
	public  void m1(String str) {
		System.out.println(str.length());
	}
}

class BInfo extends AInfo{
	@Override
	public  void m1(String str) {
		System.out.println(str.toUpperCase());
	}
}
public class Test1 {

	public static void main(String[] args) {
		BInfo obj = new BInfo();
		obj.m1("Java");
		
		
		//Dynamic Dispatch
		AInfo obj1 =new BInfo();
		obj1.m1("java");
		
		/*if we use dynamic dispatch method for object creation then the method should also present in the
		parent class. if the method is not present it will give compile time error*/
		
		//access variable check the reference type
		//accessing the method check object type

	}

}
