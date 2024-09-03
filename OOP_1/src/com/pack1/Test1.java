package com.pack1;

public class Test1 {

	public static void main(String[] args) {
		
  Vehicle obj = new Vehicle();
  System.out.println(obj.vehiclename);
  System.out.println(obj.price);
  System.out.println(obj.getvehicleowner());
  
  
  Car car = new Car();
  System.out.println(car.wheels);
  //car.getData();
	}

}

//com.pack1.Test1  - one class object is created in heap memory
/* Default:
 * within package:allowed
 * outside package:not allowed
 */

