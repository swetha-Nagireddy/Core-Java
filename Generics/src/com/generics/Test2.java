package com.generics;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//Generic Interface

interface CustomComparable<T> extends Comparable<T>{
	
}

 class Employee implements CustomComparable<Employee>{
	private int empId;
	private String empName;
	private int salary;
	public Employee(int empId, String empName, int salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + "]";
	}
	@Override
	public int compareTo(Employee obj) {
		
		//return this.empId-obj.empId;
		//return this.getSalary()-obj.getSalary();
		return obj.getSalary() - this.getSalary(); //if we want in descending order then reverse it 
	}
	
}
public class Test2 {

	public static void main(String[] args) {
		Employee e1 = new Employee(102,"emp1",60000);
		Employee e2 = new Employee(101,"emp2",69000);
		Employee e3 = new Employee(103,"emp3",50000);
		
		List<Employee> list = Arrays.asList(e1,e2,e3);
		System.out.println("Before sorting....");
		System.out.println(list);
		Collections.sort(list);
		System.out.println("After sorting...");
		System.out.println(list);
		
		

	}

}
