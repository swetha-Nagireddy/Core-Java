package com.interface_concept;

interface Var{
	int a=10; //public ,static, final
}
public class Test3 {
public static void main(String[] args) {
	System.out.println(Var.a);
	//Var.a=20; it throws error because the Var is final we cant modify it
}
}
