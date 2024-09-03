package com.basics;
// number is sum of two prime numbers
public class Test17 {
static int n1;
static int n2;
	public static void prime(int n) {
		
		for(int i=1;i<n;i++) {
			for(int j=2;j<i;j++) {
				if(!(i%j==0)) {
					n1=i;
					n2=n-i;
					//System.out.println(n2);
				}
					for(i =2;i<n2;i++) {
						if((n2%i==0)) {
							
							break;
						}else {
							 System.out.println(n1 +" "+n2 +" sum of prime number "+n);
							 return;
							
						}
						
					}
			}
			 
				
			
			
		}
		
			
	}
	
	
	public static void main(String[] args) {
	
		int n=100;
         prime(100);
  
	}

}
