package in.basics;

public class Recursion_5 {

	static int rev;
	public static void reversenum(int n) {
		if(n==0) {
			return;
		}
		 rev=n;
		 System.out.println(rev);
		reversenum(n-1);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Recursion_5.reversenum(5);
        
	}

}
