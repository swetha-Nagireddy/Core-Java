package in.basics;

public class Method_2 {
	int data =100;
	static int data2 = 200;
	public static void m1(Method_2 a ) {
		System.out.println(Method_2.data2);
		System.out.println(a.data);
		
	}

	public static void main(String[] args) {
		Method_2 obj = new Method_2();
		System.out.println(obj);
		Method_2.m1(obj);
		
	}

}
