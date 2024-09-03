package com.basics;

// roots of a quadratic equation
public class Test16 {

	public static void rootsOfQuadratic(double a, double b, double c) {
		double  d=(b*b)-(4*a*c);
		//System.out.println(d);
		double r1;
		double r2;
		if(d>0) {
            r1= ((-b) + (Math.sqrt(d)))/(2*a);
			r2=((-b) - (Math.sqrt(d)))/(2*a);
			System.out.println("root1 = "+ r1 +"root2 = "+r2);
			}else if(d==0) {
				r1=r2=(-b)/(2*a);
				System.out.println("root1 = "+ r1 +"root2 = "+r2);
				}else {
					 r1=(-b)/(2*a);
					 r2= (Math.sqrt(-d))/(2*a);
					 System.out.println("root1 ="+r1+" +"+r2+" i");
					 System.out.println("root1 ="+r1+" -"+r2+" i");
				}
			
	}
				public static void main(String[] args) {
					rootsOfQuadratic(2,9,4);
					
					
				}
			
		
}
