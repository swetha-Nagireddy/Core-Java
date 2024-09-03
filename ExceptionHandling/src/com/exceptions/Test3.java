package com.exceptions;

public class Test3 {
	
	public static void m1() {
		try {
			System.out.println("statement1");
			System.out.println(12/0);
			System.out.println("statement2");
			
			
		}catch(Exception e) {
			System.out.println(e.getClass().getName());
		}
		System.out.println("out-side try-catch");
	}


	public static void main(String[] args) {
		m1();
	}

}
