package com.arrayassignment;

public class Task27 {
	public static void sumofContinuousArray(int[] arr,int k) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<=i+1;j++) {
			if(arr[i]+arr[j]==k) {
					System.out.print(i+" "+ j);
					System.out.print(" ");
				}
			}
		}
	}
	public static void main(String[] args) {
		int[] arr= {15,2,4,8,9,2,5,10,13}; 
		int k=23;
		sumofContinuousArray(arr,k);

	}

}
