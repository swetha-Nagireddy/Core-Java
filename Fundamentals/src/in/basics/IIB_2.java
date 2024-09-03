package in.basics;

 //IIB

public class IIB_2 {
	 static int count=0;
	
	static{
		count=0;
	}
	{
		count++;
	}
	
	public static int getcount() {
	return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IIB_2 a = new IIB_2();
		IIB_2 b = new IIB_2();
		IIB_2 c = new IIB_2();
		
		System.out.println(IIB_2.getcount());

	}

}
