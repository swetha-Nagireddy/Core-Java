package in.basics;

public class IIB {
	
	static {
		System.out.println("static block executed");
	}
	
	IIB(){
		//IIB is called implicitly
		System.out.println("constructor executed");
	}
	{
		System.out.println("IIB executed");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IIB obj = new IIB();

	}

}
