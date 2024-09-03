package com.exceptions;
//try-with multiple catch
public class Test5 {

	public static void m1(String str) {
		try {
			System.out.println(str.length());
			System.out.println(12/3);
			System.out.println(Integer.parseInt(str));
			
		}catch(ArithmeticException e) {
			System.out.println("exception handled by 1st catch-block");
		}catch(NullPointerException npe){
			System.out.println("Exception handled by 2nd catch-block");
		}catch(Exception e) {
			System.out.println(e.getClass().getName()+"exception handled by the 3rd catch-block");
		}
	}
	public static void main(String[] args) {
		String str="Hello123";
		m1(str);

	}

}
