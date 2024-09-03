package com.arrayassignment;
//sum of an array elements

public class Test4 {
	static int sum=0;
	public static void sumOfArray(int[] arr) {
		for(int i=0;i<=arr.length-1;i++) {
			sum=sum+arr[i];
		}
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		sumOfArray(arr);
	}

}
