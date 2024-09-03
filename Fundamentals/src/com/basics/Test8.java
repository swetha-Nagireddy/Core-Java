package com.basics;
 // decimal to hexadecimal
public class Test8 {

	

			
	public static void decimalToHexa(int n) {
		
		char hexa[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		String hex="";
		while(n>0) {
			int rem=n%16;
			 hex=hexa[rem]+hex;
			n=n/16;
			}
		System.out.println(hex);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
decimalToHexa(123);

	}

}
