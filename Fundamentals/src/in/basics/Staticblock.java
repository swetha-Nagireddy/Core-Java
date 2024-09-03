package in.basics;

public class Staticblock {
	static int data;
	static {
		data = 20;

	}
	
	public void m1() {
		System.out.println(Staticblock.data);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Staticblock obj = new Staticblock();
         Staticblock obj2 = new Staticblock();
         obj.m1();
         obj2.m1();
	}

}
