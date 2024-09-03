package com.generics;
//upperBound wildCard
import java.util.Arrays;
import java.util.List;

public class Test5 {
    public static void print(List<? extends Number> list) {
    	for(Number obj:list) {
    		System.out.println(obj+" ");
    	}
    }
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4);
		List<Double> list3 = Arrays.asList(1.2,2.3,3.4);
		List<Float> floatlist = Arrays.asList(9.9f,8.8f,7.7f);
		
		Print.PrintList(list);
		Print.PrintList(list3);
		Print.PrintList(floatlist);
		
		List<Object> list4 = Arrays.asList(21,22,33,"hello",8.8,9.9); 
	}

}
