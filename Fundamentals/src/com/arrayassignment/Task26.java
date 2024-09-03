package com.arrayassignment;
//sum of continuous subArray equal to k
public class Task26 {

	public static void sumofContinuousArray(int[] arr,int k) {
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]+arr[i+1]==k) {
					System.out.print(i+" "+ (i+1));
					System.out.print(" ");
				}
			}
		}
	
	public static void main(String[] args) {
		int[] arr= {15,2,4,8,9,2,5,10,13}; 
		int k=23;
		sumofContinuousArray(arr,k);

	}

}
