package com.basics;
//LCM least common multiple
public class Test2 {
  static int gcd=1;
  static int lcm;
	public static void lcm(int n, int m) {
		for(int i=1;i<n && i<m;i++) {
			if(n%i==0 && m%i==0) {
				 gcd=i;
			}
			
			int product=n*m;
			 lcm=product/gcd;
			
			
		}
		System.out.println("LCM Is"+" "+lcm);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   lcm(60,72);
	}

}
