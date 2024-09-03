package com.encapsulation;

class BankingApp{
	private static final  String userName="swetha";
	private static final String password="2801";
	
	public static String getUserName() {
		return userName;
	}
	public static String getPassword() {
		return password;
	}
	
	
}


public class Test {
   public static void main(String[] args) {
	   BankingApp app = new BankingApp();
	   System.out.println(app.getUserName());
	   System.out.println(app.getPassword());
   }
}
