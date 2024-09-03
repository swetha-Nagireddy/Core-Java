package com.arrayassignment;

//finding number of even and odd elements in an array
public class Test16 {
	static int count=0;
	static int count1=0;
	public static void evenAndOdd(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				count=count+1;
				
			}
			
			if(arr[i]%2!=0) {
				count1=count1+1;
				
			}
			
		}
		System.out.println("count of even numbers is "+count);
	System.out.println("count of odd number is "+count1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr = {5,6,16,4,7,9,11};
evenAndOdd(arr);
	}

}
