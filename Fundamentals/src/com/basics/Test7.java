package com.basics;

// Decimal to Octal

public class Test7 {
	static int deci=0;
	static int base=1;
	static int i;
	public static void decimalToOctal(int[] arr, int n) {
		while(n>0) {
			for(i=0;i<=arr.length-1;i++) {
			arr[i]=n%8;
			n=n/8;
		
			//System.out.println(arr[i]);
			}
		}
		
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]);
		}
	}	
			
		
		
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int[] arr=new int[2];
decimalToOctal(arr,34);




	}

}