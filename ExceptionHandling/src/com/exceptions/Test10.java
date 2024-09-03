package com.exceptions;
//in inner try-catch if the exception is not handled then it checks in parent catch-block too
public class Test10 {

	public static void m1(String str) {
		try {
			System.out.println(str.charAt(str.length()-1));
			try {
				int result=12/0;
			}catch(ArithmeticException ae) {
				System.out.println("1st catch");
				try {
					System.out.println(str.length()/0);
				}catch(NullPointerException npe) {
					System.out.println("2nd catch");
					System.out.println("npe handled here");
				}
			}
		}catch(Exception e) {
			System.out.println("3rd Catch");
			System.out.println("any exception handled here");
		}
	}
	public static void main(String[] args) {
		String str="hello";
		m1(str);

	}

}
