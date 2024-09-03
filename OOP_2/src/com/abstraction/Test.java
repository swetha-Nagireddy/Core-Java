package com.abstraction;
interface X{
	
}
abstract class  Vehicle{
	
	public static String Company() {
		return "mahindra Group";
	}
	
	public abstract int getSpeed(); //if we have one abstract method we needto declare class as abstract
	
	public String engineType(String type) {
		if(type.equals("petrol")) return "petrol-engine";
		return "disel-engine";
	}
}

class Car extends Vehicle{
	public int getSpeed() {
		return 122;
	}
}

public class Test {

	public static void main(String[] args) {
		
		Car c = new Car();
		System.out.println(c.getSpeed());
		System.out.println(c.engineType("petrol"));
		System.out.println(c.Company());
		
		
		

	}

}
