package com.arrayassignment;

//Arrays are disjoint are not
public class Test18 {
	public static void disjointOrNot(int[] arr1, int[] arr2) {
		 boolean flag=false;
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<=arr2.length-1;j++) {
				if(arr1[i]==arr2[j]){
					System.out.println("the arrays are not disjoint");
				}
					
			}
			
		}
		
		
	}

	public static void main(String[] args) {
		int[] arr1= {2,3,4,5,1};
		int[] arr2= {6,7,1,8,9};
		disjointOrNot(arr1,arr2);
	}

}
