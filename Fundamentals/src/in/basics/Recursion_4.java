package in.basics;

public class Recursion_4 {
 static int sum=0;
	public static void sumof(int n) {
		if(n==6) {return;}
	   sum=sum+n;
	   sumof(n+1);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Recursion_4 obj = new Recursion_4();
     obj.sumof(1);
     System.out.println(sum);
	}

}
