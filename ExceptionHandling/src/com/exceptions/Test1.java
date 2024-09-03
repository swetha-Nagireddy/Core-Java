package com.exceptions;

public class Test1 {

	//checked exceptions:
	
	public static void getConnection() {
		//Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println(12/0);
	}
	public static void main(String[] args) {
		getConnection();

	}

}
