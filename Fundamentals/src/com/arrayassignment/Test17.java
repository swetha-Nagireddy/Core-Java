package com.arrayassignment;

//symmetric pairs in an array
public class Test17 {
	public static void symmetricPairs(int[][]arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i][0]==arr[j][1] && arr[i][1]==arr[j][0]) {
					System.out.println("symettric pairs are: "+arr[i][0]+" "+arr[i][1]);
				}
				
				}
			
				
			
			}
		
		}
	

	public static void main(String[] args) {
		
	int[][] arr= {{2,3},{3,2},{5,6},{7,8}};
	symmetricPairs(arr);

	}
}
