package com.arrayassignment;
//minimum sum of absolute difference
public class Task24 {
	static int sum=0;
public static int minimumsumOfAbsoluteDifference(int[] arr,int k) {
	
	int temp;
	for(int i=0;i<arr.length;i++) {
		//System.out.println((-(arr[i]-k)));
		temp=(arr[i]-k);
		if(temp>0) {
			temp=temp*1;
		}else {
			temp=temp*(-1);
		}
		sum=sum+temp;
		
	}
	return sum;
}
	public static void main(String[] args) {
		int[] arr= {1,3,9,3,6};
		int k=3;
   minimumsumOfAbsoluteDifference(arr,k);
   System.out.println(sum);
	}

}
