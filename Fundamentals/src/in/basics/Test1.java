package in.basics;

public class Test1 {
	
	int data=100;
	
	public static void m1(Test1 obj) {
		System.out.println(obj.data);
	}
	public void m2(Test1 obj) {
		int data=200;
		System.out.println(obj.data);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Test1 obj = new Test1();
    obj.m2(obj);
    Test1.m1(obj);
	}

}
