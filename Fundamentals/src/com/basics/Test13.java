package com.basics;

// in which quadrant does gives coordinates lies

public class Test13 {

	public static void quardant(int x, int y) {
		if(x>0 && y>0) {
			System.out.println("The Coordinates "+x +" "+" and "+y +" lies in : "+" first-Quardant");
			
		}else if(x>0 && y<0) {
			System.out.println("The Coordinates "+x +" "+" and "+y +" lies in : "+" Second-Quardant");
		}else if(x<0 && y<0) {
			System.out.println("The Coordinates "+x +" "+" and "+y +" lies in : "+" Third-Quardant");
		}else {
			System.out.println("The Coordinates "+x +" "+" and "+y +" lies in : "+" Fourth-Quardant");
		}
	}
	public static void main(String[] args) {
		quardant(-4,5);
		
	}

}
