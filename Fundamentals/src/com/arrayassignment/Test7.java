package com.arrayassignment;

import java.util.Arrays;

//sorting elements of an array
public class Test7 {
	
	public static int[] sortOfArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
			if(arr[i]>arr[j]){
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				
			}
		}
		
	}
		return arr;
	}

public static void main(String[] args) {
	int[]arr= {3,2,1,5,6,4};
	System.out.println((Arrays.toString(sortOfArray(arr))));
	
}
}