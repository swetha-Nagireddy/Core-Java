package com.exceptions;
//finally block

public class Test12 {
   
	public static void m1() {
		try {
			int result=12/3;
			System.out.println(result);
			System.exit(0); //by using this we can stop the execution of the finally block
		}catch(Exception e){
			System.out.println("exception handled");
		}finally {
			System.out.println("code executed inside finally block");
		}
	}
	public static void main(String[] args) {
		m1();
	}

}
//the final block will execute even if exception handled or not handled