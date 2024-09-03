package in.basics;

public class Method_1 {
	//function definition
	public static void m1()
	{
		
		System.out.println("static method execute");
		
	}
	public static String getName() {
		return "harsh";
	}
	public static void getNumber(int num) {
		if(num%2==0) {
			System.out.println(num);
			return;
		}
		System.out.println(num*num);
	}
	public static void main(String[] args) {
		System.out.println("main method executed");
		Method_1.m1();
		String name = Method_1.getName();
		System.out.println(name);
		Method_1.getNumber(4);
	}

}
