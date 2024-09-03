package com.exceptions;

class Student{
	private int studentid;
	private String studentname;
	 private String dept;
	 
	 Student(int studentid,String studentname,String dept){
		 super();
		 this.studentid=studentid;
		 this.studentname=studentname;
		 this.dept=dept;
	 }
	

public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
}
class StudentDB{
	static Student[] arr = new Student[5];
	static {
		Student s1 = new Student(101,"swetha","cse");
		Student s2 = new Student(102,"satish","cse");
		Student s3 = new Student(103,"syamala","mathematics");
		Student s4 = new Student(104,"purushotham","Architech");
		Student s5 = new Student(105,"Reddy","ece");
		
		arr[0]=s1;
		arr[1]=s2;
		arr[2]=s3;
		arr[3]=s4;
		arr[4]=s5;
		
	}
}

class StudentNotFound extends Exception{
	private String message;
	public StudentNotFound(String message) {
		this.message=message;
	}
	public String getErrorMessage() {
		return this.message;
	}
}
class SMS{
	public static void findstudentByName(String name) {
		
		boolean flag=false;
		for(Student s:StudentDB.arr) {
			if(s.getStudentname().equals(name)) {
				System.out.println(s);
				flag=true;
				return;
			}
		}
		if(!flag) {
			try {
			throw new StudentNotFound("student not found");
		}catch(StudentNotFound ex) {
			System.out.println(ex.getErrorMessage());
		}
	}
}
}
public class Test15 {

	public static void main(String[] args) {
		SMS.findstudentByName("giri");
	}

}
