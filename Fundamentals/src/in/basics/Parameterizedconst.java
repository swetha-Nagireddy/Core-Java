package in.basics;
class Employee{
	int empid;
	String empname;
	
 Employee(int id, String name){
	 empid=id;
	 empname=name;
 }
 public void Showdetails() {
	 System.out.println(empid+ " "+ empname);
 }
}
public class Parameterizedconst {

	public static void main(String[] args) {
		Employee e1 = new Employee(101,"swetha");
		Employee e2 = new Employee(102,"satish");
		e1.Showdetails();
		e2.Showdetails();
		
	}

}
