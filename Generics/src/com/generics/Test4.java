package com.generics;

import java.util.Arrays;
import java.util.List;

public class Test4 {

	public static<T extends Number> void print(List<T> list) {
		for(T obj:list) {
			System.out.println(obj+" ");
		}
		
		System.out.println();
	}
	
	public static<T extends Number> double add(List<T> list) {
		int sum=0;
		for(T obj:list) {
			sum += obj.doubleValue();
		}
		return sum;
	}
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		List<String> list2 = Arrays.asList("AB","CD");
		List<Double> list3 = Arrays.asList(1.2,2.3,3.4);
		System.out.println(add(list));
		System.out.println(add(list3));
		//print(list);
		
		//print(list2); it gives error because we  have restricted with string we only give integers and number class

	}

}
