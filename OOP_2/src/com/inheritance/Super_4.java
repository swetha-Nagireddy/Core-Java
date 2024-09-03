package com.inheritance;


class Vehicle{
	int numberOfWheels=4;
	
	public void getdata() {
		System.out.println("parent class called");
	}
}

class Bike extends Vehicle{
	int numberOfWheels=2;
	
	public void getdata() {
		int numberOfWheels=8;
		System.out.println(numberOfWheels);
		System.out.println(this.numberOfWheels);
		System.out.println(super.numberOfWheels);
		}
}
public class Super_4 {

	public static void main(String[] args) {
		Bike b = new Bike();
		b.getdata();
		
		//parent type reference can points to child type object
		Vehicle v = new Bike();
		System.out.println(v.numberOfWheels);
		v.getdata();
		
		
		
		//if we call with variables always try to find what is the type of reference
		//if we call with method always try to find what is the type of object
		// vehicle v is type of reference
		// new Bike() is type of object
		
	}

}
