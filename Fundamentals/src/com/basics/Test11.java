package com.basics;

//prime numbers in a range
public class Test11 {
static int flag;
static int i;
	public static void prime(int n,int m) {
		for(int i=n;i<=m;i++) {
			if(i==1 || i==0) continue;
			  flag=1;
			 for(int j=2;j<=i;j++) {
				 if(i%j==0) {
					 flag=0;
					 break;
				 }
				 
			 }if(flag==1) {
					System.out.println(i);
			 }
				 
			 }
			
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 prime(1,100);
 
	}

}
