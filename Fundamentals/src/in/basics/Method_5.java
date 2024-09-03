package in.basics;

public class Method_5 {

	public static void main(String[] args) {
		//1-5
		print(1);
		
		
		
	}
	public static void print(int num) {
		if(num>5) return;   //base condition
		System.out.println(num);
		print(num+1);  //general condition
	}
	

}
