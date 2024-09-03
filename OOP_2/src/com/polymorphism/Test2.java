package com.polymorphism;


class Course{
	private int courseId;
	private String courseName;
	
	Course(int courseId,String courseName){
		this.courseId=courseId;
		this.courseName=courseName;
	}

	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + "]";
	}
	
	
}
public class Test2 {

	public static void main(String[] args) {
		Course c1 = new Course(101,"Java");
		System.out.println(c1);

	}

}
