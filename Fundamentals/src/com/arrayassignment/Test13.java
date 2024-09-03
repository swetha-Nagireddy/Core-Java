package com.arrayassignment;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


//removing duplicate elements in an array
public class Test13 {
public static int[] removingDuplicateElements(int[] arr) {
	
	Map<Integer,Integer> map = new HashMap<>();
	
	for(int data:arr) {
		if(map.containsKey(data)) {
			map.put(data, map.get(data)+1);
		}else {
			map.put(data,map.getOrDefault(data, 1));
		}
	}
	
	Set<Integer> remove=new HashSet<>();
		for(Map.Entry<Integer,Integer> set:map.entrySet()) {
			if(set.getValue()>1) {
				map.remove(set.getKey());
			}
		
		
	}
		return arr;
	
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr= {1,2,3,3,2,1,4,4,5,6};
removingDuplicateElements(arr);
System.out.println(arr);
	}

}

