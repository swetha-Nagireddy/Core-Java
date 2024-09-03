package in.basics;

// copy constructor : cloning

class Student{
	String studentname;
	Student(String name){
		studentname = name;
	}
	Student(Student s1){
		System.out.println(s1.studentname);
		
	}
	public void showdetails() {
		System.out.println(studentname);
	}
}
public class Constructor_3 {

	public static void main(String[] args) {
		Student s1= new Student("swetha");
		Student s2 = new Student(s1);
		
		s1.showdetails();
		s2.showdetails();
		
	}

}
