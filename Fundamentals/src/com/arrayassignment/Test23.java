package com.arrayassignment;

public class Test23 {
public static void largestSumSubarray(int[] arr,int n) {
	int currentsum=0;
	for(int i=0;i<arr.length;i++) {
		currentsum=currentsum+arr[i];
		if(currentsum>n) {
			for(int j=0;j<=n;j++) {
				currentsum=currentsum-arr[j];
				System.out.println(arr[j]);
			}
		}
	}
}
	
	public static void main(String[] args) {
		int[] arr= {1,4,20,3,10};
		int n=33;
		largestSumSubarray(arr,n);

	}

}
