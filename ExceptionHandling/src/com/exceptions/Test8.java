package com.exceptions;
//Nested try-catch
public class Test8 {

	public static void m1(String str, int a , int b) {
		try {
			System.out.println("inside outer try-block");
			System.out.println(str.length());
			try {
				System.out.println("inside inner try-block");
				int result =a/b;
				System.out.println(result);
			}catch(ArithmeticException ae) {
				System.out.println("exception handled by inner catch block");
			}
		    }catch(NullPointerException npe) {
			System.out.println("exception handled by outer catch");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   m1(null,12,0);
	}

}

