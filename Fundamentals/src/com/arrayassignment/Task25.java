package com.arrayassignment;
//order without sorting techniques
public class Task25 {
	
public static void orderWithOutSorting(int[] arr) {
	int len=getcountZero(arr);
	int len1=getcountOne(arr);

	for(int i=0;i<len;i++) {
		arr[i]=0;
		//System.out.print(arr[i]+" ");
		
	}
	
	for(int i=len;i<len+len1;i++) {
		arr[i]=1;
		
	}
	
	for(int i=len+len1;i<arr.length;i++) {
		arr[i]=2;
	}
	
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
	}
	}
public static int getcountZero(int[] arr) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				count=count+1;
				
			}
			}
		return count;
		}
	public static int getcountOne(int[] arr) {
		  int count1=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==1) {
				count1=count1+1;
			}
		}
		return count1;
	}
	
	public static int getcountTwo(int[] arr) {
		int count2=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==2) {
				count2=count2+1;
			}
		}
		return count2;
	}
	
	
	


	
	public static void main(String[] args) {
		int[] arr= {1,2,2,2,1,0,1,0,0};
		orderWithOutSorting(arr);

	}

}
