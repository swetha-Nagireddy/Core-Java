package com.exceptions;

public class Test13 {

	public static int m1() {
		try {
			int result=10;
			return 10;
		}catch(Exception e) {
			return -1;
		}finally {
			return 2;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println(m1());
	}

}
