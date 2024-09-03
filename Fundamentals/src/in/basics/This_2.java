package in.basics;

// differentiate between the instance variable and local variable
class Studentinfo{
	int studentid;
	String studentname;
	
	Studentinfo(int id, String name){
		studentid= id;
		studentname= name;
		
	}
	public void show() {
		int studentid=200;
		String studentname="joe";
		System.out.println(studentid+""+this.studentname);
	}
}

public class This_2 {

	public static void main(String[] args) {
	Studentinfo s1 = new Studentinfo(101, "swetha");
	Studentinfo s2 = new Studentinfo(102, "satish");
	
	s1.show();
	s2.show();
	

	}

}
