package com.basics;
//permutations for n people in r chairs
public class Test18 {

public static void main(String[] args) {
		// TODO Auto-generated method stub
       int n=5;
       int r=2;
       int number;
       int f1=1;
       int f2=1;
       int permutation;
      
       for(int i=n;i>=1;i--) {
    	   f1=f1*i;
    	   
       }
       
      number=n-r;
       for(int i=number;i>=1;i--) {
    	   f2=f2*i;
    	}
       
       permutation=f1/f2;
     System.out.println(permutation);
       
       
       
	}

}
