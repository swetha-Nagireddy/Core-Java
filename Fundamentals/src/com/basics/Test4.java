package com.basics;

//Binary to Decimal
public class Test4 {
static int deci=0;
static int base=1;
	public static void binaryToDecimal(int a) {
		while(a>0) {
		int rem=a%10;
		a=a/10;
		deci=deci+rem*base;
		//System.out.println(deci);
		base=base*2;
		
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   binaryToDecimal(011);
  System.out.println(deci);
	}

}
