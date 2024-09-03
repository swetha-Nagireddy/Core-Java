package com.basics;

//decimal to binary

public class Test3 {
static int rem;
static int rev=1;
	public static void decimalToBinary(int n) {
		while(n>0) {
		 rem=n%2;
	     n=n/2;
		 System.out.print(rem);
		 
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  decimalToBinary(10);
  
	}

}
