package com.pack1;

public class Vehicle {
	//default
  String vehiclename="Lamborgini";
  
  
  //public
  public int price=12364890;
  
  
  //private
  private String vehicleowner="satish";
  //getter
  public String getvehicleowner() {
	  return this.vehicleowner;
  }
  
  protected int wheels=4;
}




/* Default:
	 * within package:allowed
	 * outside package:not allowed
	 */

/* public:
 * within package: allowed
 * ouside pacakage: allowed
 */

/* private
 * within package:direct access is not allowed in another cls in same package. it can be accessed using getter function
 * direct access is allowed only within package
 * outside package: direct access is not allowed
 */

/*protected:
 * within package:allowed
 * outside package: not allowed
 */


