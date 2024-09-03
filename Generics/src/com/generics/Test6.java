package com.generics;
//LowerBound wildCard
import java.util.Arrays;
import java.util.List;

public class Test6 {

	public static void print(List<? super Integer> list) {
		for(Object obj:list) {
			System.out.println(obj+" ");
		}
	}
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4);
		List<Double> list2 = Arrays.asList(1.2,2.3,3.4);
        List<Object> list3 = Arrays.asList("swetha",9.9,12);
        List<Number> list4 = Arrays.asList(22,3.3,4.4);
        
        Print.PrintList(list);
        Print.PrintList(list2);
        Print.PrintList(list3);
        Print.PrintList(list4);
	}

}
