package com.interface_concept;

public class Test {
public static void main(String[] args) {
	Airtel airtel=new Airtel();
	JIO jio =new JIO();
	Idea idea =new Idea();
	Mobile mobile=new Mobile(idea);
	System.out.println(mobile.getNetwork());
}
}
