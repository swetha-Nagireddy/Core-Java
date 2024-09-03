package com.basics;

//replace all 0s with 1 in a integer

public class Test9 {
	static int rem;
	public static void replace(int n) {
		while(n>0) {
			 rem=n%10;
			n=n/10;
			if(rem==0) {
				rem=1;
				System.out.println(rem);
			}else {
				System.out.println(rem);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Test9.replace(1001);
 // System.out.println(rem);
	}

}
