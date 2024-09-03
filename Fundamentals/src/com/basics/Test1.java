package com.basics;
 //GCD (higest common divisor)  or HCF

public class Test1 {
  static int gcd=1;
  static int hcf=1;
	public static void gcd(int n,int m) {
		for(int i=1;i<n && i<m; i++) {
			if(n%i==0 && m%i==0) {
				gcd=i;
			}
		
		
		}
		System.out.println(gcd);
	}
		
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int n;
   int m;
   gcd(60,72);
   
	}

}
