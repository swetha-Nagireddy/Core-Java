package com.arrayassignment;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//removing duplicate elements
public class Test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int[] arr= {1,2,3,1,2,3,4,5,4};
  for(int i=0;i<arr.length-1;i++) {
	  for(int j=i+1;j<arr.length;j++)
	  if(arr[i]>arr[j]) {
		  int temp=arr[i];
		  arr[i]=arr[j];
		  arr[j]=temp;
	  }
  }
 // System.out.print(Arrays.toString(arr));
   int n=arr.length;
   int[] temp=new int[n] ;
   int j=0;
   
   for(int i=0;i<n-1;i++) {
		   if(arr[i]!=arr[i+1]) {
			   temp[j]=arr[i];
			   System.out.print(temp[j]);
			   j++;
		   }
	   }
   }
  
   
	}
	

