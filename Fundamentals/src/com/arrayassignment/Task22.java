package com.arrayassignment;

public class Task22 {
//rotating elements to left
	public static void leftRotateofElements(int[] arr,int d,int n) {
		int[] temp=new int[d];
	
		for(int i=0;i<d;i++) {
			temp[i]=arr[i];
		}
		for(int i=d;i<n;i++) {
			arr[i-d]=arr[i];
			//System.out.println(arr[i-d]);
		}
		for(int i=0;i<d;i++) {
			arr[i+n-d]=temp[i];
		}
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6};
		int n=arr.length;
		leftRotateofElements(arr,2,n);
}
}
