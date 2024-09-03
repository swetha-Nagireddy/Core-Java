package com.basics;

 //octal to Decimal conversion

public class Test5 {
static int deci=0;
static int base=1;
	public static void octalToDecimal(int n) {
		while(n>0) {
			int rem=n%10;
			n=n/10;
			deci=deci+rem*base;
			base=base*8;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  octalToDecimal(123);
  System.out.println(deci);
	}

}
