package com.exceptions;

public class Test9 {
	public static void m1() {
		try {
			String str="hello";
			System.out.println(str.length());
			try {
				int result=12/0;
				System.out.println(result);
			}catch(Exception e) {
				System.out.println("exception handled by inner try-catch block");
			}
		}catch(NullPointerException npe) {
			System.out.println("outer catch handled");
		}
	}

	public static void main(String[] args) {
		m1();

	}

}
