package com.arrayassignment;

import java.util.Arrays;

//minum scalar product of two vectors
public class Test15 {

	public static int[] scalarProductOfVectors(int[] arr,int[] arr2) {
		int temp;
		//descending order
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		//ascending order
		for(int i=0;i<arr2.length;i++) {
			for(int j=i+1;j<arr2.length;j++) {
				if(arr[i]<arr[j]) {
					int temp1=arr[i];
					arr[i]=arr[j];
					arr[j]=temp1;
				}
			}
		}
		return arr;
		
		
	}
	public static void main(String[] args) {
		int[] arr= {10,7,45,3,7};
		int[] arr2= {1,2,6,3,7};
		scalarProductOfVectors(arr,arr2);
		//System.out.println(Arrays.toString(arr2));
		int product=0;
		for(int i=0;i<arr.length;i++) {
			product=product+arr[i]*arr2[i];
			System.out.println(product);
		}
	}

}
