package com.interface_concept;

interface Account{
	 
	//by defaults interfaces are public and abstract
	int salaryCalculation();
	
	public static String companyName() {
		return "ABC PVT Ltd";
	}
	
	
	public default int numberOfDepartments() {
		return 5;
	}
}

class FullTimeEmployee implements Account{
	public int salaryCalculation() {
		return 45000;
	}
}

class PartTimeEmployee implements Account{
	public int salaryCalculation() {
		return 15000;
	}
}

/*class Employee implements Account{
	public int salaryCalculation(String typeOfEmployee) {
		if(typeOfEmployee.equals("partTime"))return 45000;
		return 15000;
	}
}*/
 public class Test1 {
  
	 public static void main(String[] args) {
		// Account account = new Account();  we cannot create obj for interface
		 
		 FullTimeEmployee fte = new FullTimeEmployee();
		 System.out.println(fte.salaryCalculation());
		 System.out.println(fte.numberOfDepartments());
		 System.out.println(Account.companyName());
		 
		 
		/* Employee emp = new Employee();
		 System.out.println(emp.salaryCalculation("FullTime")); */
	 }
}
