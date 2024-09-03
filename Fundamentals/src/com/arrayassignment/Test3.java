package com.arrayassignment;

//smallest and largest number
public class Test3 {
	
	static int max;
	static int min;
	public static int largestElement(int[] arr) {
		max=arr[0];
		for(int i=1;i<=arr.length-1;i++) {
			if(arr[i]>max) {
				max=arr[i];
				
			}
		}
		return max;
	}
	
	public static int smallestElement(int[] arr) {
		min=arr[0];
		for(int i=1;i<=arr.length-1;i++) {
			if(arr[i]<min) {
				min=arr[i];
				//System.out.println(min);
				
			}
			
			
		}
		return min;
	}

	public static void main(String[] args) {
		int k;
		int[] arr= {3,2,1,6,8,4,5};
		largestElement(arr);
		smallestElement(arr);
		System.out.println("largest element is "+ max);
		System.out.println("smallest element is "+ min);

	}

}
