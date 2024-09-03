package com.arrayassignment;

import java.util.Arrays;

//moving all negative elements to one side
public class Test20 {

	public static int[] movingElements(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[i]<0) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}
		}
		return arr;
	}
	public static void main(String[] args) {
     int[] arr= {3,-1,4,-6,5};
     movingElements(arr);
     System.out.println(Arrays.toString(arr));

	}

}
