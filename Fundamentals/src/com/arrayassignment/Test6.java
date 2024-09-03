package com.arrayassignment;
// sort first half in ascending and second half in descending order
public class Test6 {
	static int temp;
	
	
	public static void ascendingAnddescending(int[] arr) {
		for(int i=1;i<=((arr.length)/2);i++) {
			//for(int j=i+1;j<=arr.length/2;j++) {
				if(arr[i]>arr[i-1]) {
					int temp=arr[i-1];
					arr[i-1]=arr[i];
					arr[i]=temp;
				System.out.print(arr[i-1]);
				System.out.print(" ");
					
				}
				else {
					temp=arr[i];
					arr[i]=arr[i-1];
					arr[i-1]=temp;
					System.out.print(arr[i]);
					System.out.print(" ");
					
					
					
				}
			}
			for(int i=(arr.length)/2;i<=arr.length-1;i++) {
				if(arr[i]<arr[i-1]) {
					int temp=arr[i];
					//System.out.println(temp);
					arr[i]=arr[i-1];
					arr[i-1]=temp;
					System.out.print(arr[i]);
				}
			}
			
			}
	
	
		
	

	public static void main(String[] args) {
		
     int[] arr= {3,8,5,1,6,4,2};
     ascendingAnddescending(arr);
	}

}
