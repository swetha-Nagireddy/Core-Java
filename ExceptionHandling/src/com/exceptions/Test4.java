package com.exceptions;

public class Test4 {
	
	public static void m1() {
	try {
		String str=null;
		System.out.println(str.length());
		int result=12/0;
		System.out.println(result);
	}catch(Exception e) {
		System.out.println(e.getClass().getName()+" handled");
	}
	}
 public static void main(String[] args) {
	 m1();
 }
}
