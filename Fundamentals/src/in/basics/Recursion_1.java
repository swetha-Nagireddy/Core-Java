
package in.basics;

public class Recursion_1 {
	
public static void main(String[] args) {
	
       int n = 5;
	System.out.println(fibonacci(n));
}

public static int fibonacci(int n) {
	if(n <= 1) 
		return n;
	return fibonacci(n-1) + fibonacci(n-2);
	
}
}



	
	


