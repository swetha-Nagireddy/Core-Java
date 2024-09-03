package com.association;

public class Test {

	public static void main(String[] args) {
		Address addr = new Address();
		addr.setCityName("Banglore");
		addr.setState("Karnataka");
		addr.setCountry("India");
		
		Address addr1 = new Address();
		addr1.setCityName("kadiri");
		addr1.setState("Andhra");
		addr1.setCountry("India");
		
		Employee emp=new Employee();
		emp.setEmpId(101);
		emp.setEmpName("swetha");
		emp.setAddress(addr);
		emp.setAddress(addr1);
		
		
		//get all values
		System.out.println(emp.getEmpId());
		System.out.println(emp.getEmpNamed());
		System.out.println(emp.getAddress().getCityName());
		System.out.println(emp.getAddress().getState());
		System.out.println(emp.getAddress().getCountry());
		
		
	}

}
