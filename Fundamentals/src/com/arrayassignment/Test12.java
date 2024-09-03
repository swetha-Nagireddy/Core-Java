package com.arrayassignment;

import java.util.Arrays;

//sorting array
public class Test12 {

	public static void sortOfArray(int[] arr) {
		int temp;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					 temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}
			
		}//return arr;
	}
	public static void main(String[] args) {
		int[] arr = {1,2,3,1,3,2};
		sortOfArray(arr);
   System.out.println(Arrays.toString(arr));
	}

}
