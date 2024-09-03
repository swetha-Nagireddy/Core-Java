package in.basics;

public class Method_3 {
	public void m1() {
		System.out.println("m1() started");
		System.out.println("m2()executed");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("main() started");
Method_3 obj = new Method_3();
obj.m1();
System.out.println("main() executed");
	}

}
