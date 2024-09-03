package com.exceptions;
//catch block containing parent exception class must be the last catch block
public class Test6 {
	public static void m1() {
		try {
			String str="Hello";
			System.out.println(str.charAt(7));
		}catch(ArithmeticException ae){
			System.out.println("1st catch-block");
		}catch(Exception e) {
			System.out.println("2nd catch-block");
		}
//		catch(StringIndexOutOfBoundsException se) {
//			System.out.println("3rd catch-block");
//		}
	}

	public static void main(String[] args) {
		m1();
	}

}
