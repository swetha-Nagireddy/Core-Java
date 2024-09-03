package com.arrayassignment;
//largest element in an array
public class Test {
	
	static int max;
	public static void largestElement(int[] arr) {
		//max=arr[0];
		for(int i=1;i<=arr.length-1;i++) {
			if(arr[i]>max) {
				max=arr[i];
				
			}
		}
		System.out.println(max);
	}

	public static void main(String[] args) {
		int[] arr= {2,6,5,4,3,7,1,8};
		largestElement(arr);
		

	}

}
