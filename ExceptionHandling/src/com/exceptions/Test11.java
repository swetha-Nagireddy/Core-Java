package com.exceptions;
//try and catch with return statement
public class Test11 {
	
	public static int m1(int a,int b,int c) {
		int result;
		try {
			result=a*b/c;
			return 10;
		}catch(Exception e) {
			return -1;
		}
		//return result;  //if we had given return in try bolck then we cant mention return for method outside the try block for the method
	}

	public static void main(String[] args) {
		System.out.println(m1(2,3,4));

	}

}
