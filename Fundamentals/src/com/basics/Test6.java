package com.basics;

//Hexadecimal to decimal
public class Test6 {
static int val;
	public static int hexaToDecimal(String hex) {
		String digits="0123456789ABCDEF";
		hex=hex.toUpperCase();
		 val=0;
		for(int i=0;i<hex.length();i++) {
		char c=hex.charAt(i);
		int d =digits.indexOf(c);
		val=16*val+d;
		
		
		
	}
		return val;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     hexaToDecimal("121");
     System.out.println(val);
	}

}
