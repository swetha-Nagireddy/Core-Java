package in.basics;

public class Recursive_2 {

	public static void main(String[] args) {
		pow(2,3);
	}
	static int r = 1;
public static void pow(int m , int n) {
	if (n==0) {
		System.out.println(r);
		return;
	}
	r = r*m;
	pow(m, n-1);
	
}
}
