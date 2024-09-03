package com.polymorphism;

//Method overloading

class Shape{
	
	public static void area(int radius) {
		System.out.println(Math.PI*radius*radius);
	}
	
	public static void area(int length,int breadth) {
		System.out.println(length*breadth);
	}
	public static void area(float side) {
		System.out.println(side*side);
	}
}
public class Test {

	public static void main(String[] args) {
		Shape.area(12);
		Shape.area(10.5f);
		Integer[] arr = {};
		Test.main(arr);
	}
	//we can overload main function
	
	public static void main(Integer[] arr) {
		System.out.println("custom main method");
	}

}
