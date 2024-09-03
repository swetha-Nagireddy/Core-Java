package com.basics;

//Number of days for a given month
public class Test15 {

public static void numberOfDays(int n) {
	if(n>=1 && n<=12) {
	if(n==1 ||n==3 ||n==5 ||n==7 ||n==8 || n==10 || n==12) {
		System.out.println(" Number of days for "+ n+" month is 31 days.");
	}else if(n==4 || n==6 ||n==9|| n==11) {
		System.out.println(" Number of days for "+ n+" month is 30 days.");
	}else if(n==2) {
		System.out.println("Number of days for "+n+" month is 28 or 29 days");
	}else {
		System.out.println("invalid number");
	}

	}		
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
numberOfDays(2);
	}

}
