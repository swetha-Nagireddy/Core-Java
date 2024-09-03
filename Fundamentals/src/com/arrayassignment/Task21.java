package com.arrayassignment;

import java.util.Arrays;

//sum of pairs in array equal to k
public class Task21 {
	
public static void sumOfPairs(int[] arr,int k) {
	for(int i=0;i<arr.length-1;i++) {
		for(int j=i+1;j<arr.length;j++) {
		
			if((arr[i]+arr[j])==k) {
				
				System.out.println(arr[i]+" "+arr[j]);
			}
		}
	
	}
	
	}
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int k=6;
		sumOfPairs(arr,k);
		
	}

}
