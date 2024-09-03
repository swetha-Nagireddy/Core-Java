package com.arrayassignment;
//smallest Element in an array
public class Test1 {
	static int min;
	public static void smallestElement(int[] arr) {
		min=arr[0];
		for(int i=1;i<=arr.length-1;i++) {
			if(arr[i]<min) {
				min=arr[i];
				
			}
		}
		System.out.println(min);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int[] arr = {3,2,4,5,1};
    smallestElement(arr);
	}

}
