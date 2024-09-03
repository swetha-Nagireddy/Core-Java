package com.encapsulation;

class Student{
	private int studentId;
	private String studentName;
	private String dept;
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getStudentId() {
		return studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public String getDept() {
		return dept;
	}
	
	
}
public class Test1 {
	public static void main(String[] args) {
		Student obj= new Student();
		obj.setStudentId(101);
		obj.setStudentName("swetha");
		obj.setDept("cse");
		
		System.out.println(obj.getStudentId()+" "+obj.getStudentName()+" "+obj.getDept());
	}

}
