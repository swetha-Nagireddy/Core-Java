package com.arrayassignment;

import java.util.Arrays;
//longest palindrome in an array
public class Test14 {

	public static void longestPalindrome(int[] arr) {
		int temp;
		int rev=0;
		int max=arr[0];
		for(int i=1;i<arr.length;i++) {
		     if(arr[i]>max) {
					max=arr[i];
			}
		}
		System.out.println("largest element is "+max);
		 temp=max;
		 while(max!=0) {
			 int rem=max%10;
			 max=max/10;
			 rev=rev*10+rem;
		 }
		System.out.println("reverse of largest is "+rev);
		 
		 if(temp==rev) {
			 System.out.println("it is a largest palindrome");
		 }else {
			 System.out.println("largest element is not palindrom");
		 }
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int[] arr = {121,1122211,1221,131};
  longestPalindrome(arr);
  //System.out.println(Arrays.toString(arr));
  
	}

}
