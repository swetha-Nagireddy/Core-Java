package com.basics;

// find no.of time x appears
public class Test12 {
static int count=0;

	public static void occuranceOfNum(int n,int x) {
		for(int i=0;n!=0;i++) {
			int rem=n%10;
			n=n/10;
			if(rem==x) {
				count=count+1;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=2;
occuranceOfNum(212312,2);
System.out.println("occurance of "+ x + " is "+ count);
	}

}
