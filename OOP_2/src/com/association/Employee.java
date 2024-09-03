package com.association;

public class Employee {
 
	private int empId;
	private String empName;
	private Address address;
	
	//setter function
	public void setEmpId(int empId) {
		this.empId=empId;
	}
	
	//getter function
	public int getEmpId() {
		return this.empId;
	}
	
	public void setEmpName(String empName) {
		this.empName=empName;
	}
	
	public String getEmpNamed() {
		return this.empName;
	}
	
	
	public void setAddress(Address address) {
		this.address=address;
	}
	
	public Address getAddress() {
		return this.address;
	}
	
	
}
