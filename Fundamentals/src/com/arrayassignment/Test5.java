package com.arrayassignment;
//reverse of an array
public class Test5 {
static int rev;
	public static void reverseofarray(int[] arr) {
		for(int i=arr.length-1;i>=0;i--) {
			rev=arr[i];
			System.out.print(rev);
			System.out.print(" ");
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr= {2,3,4,5,1};
reverseofarray(arr);
	}

}
