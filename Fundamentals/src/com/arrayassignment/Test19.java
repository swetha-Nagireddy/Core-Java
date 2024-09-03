package com.arrayassignment;

//maximum product sub-array in a given array 
public class Test19 {
public static void maximumProduct(int[] arr) {
	
	int result=arr[0];
	for(int i=0;i<arr.length-1;i++) {
		int product=arr[i];
		for(int j=i+1;j<arr.length;j++) {
			if(product>result) {
					result=product;
				}else {
					result=result;
				}
			product=product*arr[j];
			
		}
		if(product>result) {
			result=product;
		}else {
			result=result;
		}
			 
			
			
		}
	System.out.println(result);
	}
	//System.out.println(arr[i]);

	public static void main(String[] args) {
		int[] arr = {-1,-3,2,4};
		maximumProduct(arr);
	}

}
