package com.set;

import java.util.HashSet;
import java.util.Set;

public class Test1 {

	public static void main(String[] args) {
		Set<Integer> A= new HashSet<>();
		A.add(20);
		A.add(10);
		A.add(30);
		A.add(100);
		
		Set<Integer> B= new HashSet<>();
		B.add(20);
		B.add(40);
		B.add(50);
		
		
		//union
//		A.addAll(B);
//		System.out.println(A);
		
		//intersection
//		A.retainAll(B);
//		System.out.println(A);
//		
		//A-B
//		A.removeAll(B);
//		System.out.println(A);
//	
		//B-A
		B.removeAll(A);
		System.out.println(B);
		

	}

}
