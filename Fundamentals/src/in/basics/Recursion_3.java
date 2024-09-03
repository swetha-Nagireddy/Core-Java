package in.basics;

public class Recursion_3 {

	public void multipleof2(int n,int m) {
		if(m>10) {return;}
		
		System.out.println(n+"*"+m+"="+n*m);
		multipleof2(n,m+1);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Recursion_3 obj =new Recursion_3();
   obj.multipleof2(2,1);
	}

}
