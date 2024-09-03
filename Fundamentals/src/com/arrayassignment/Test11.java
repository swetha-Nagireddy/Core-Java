package com.arrayassignment;

import java.util.HashMap;
import java.util.Map;


//finding frequency of elements in an array
public class Test11 {
public static void frequencyOfElements(int[] arr) {
	
	Map<Integer,Integer> map = new HashMap<>();
	
	for(int data:arr) {
		if(map.containsKey(data)) {
			map.put(data, map.get(data)+1);
		}else {
			map.put(data,map.getOrDefault(data, 1));
		}
	}
	
	for(Map.Entry<Integer,Integer> set:map.entrySet()) {
		if(set.getValue()>1) {
			System.out.println(set.getKey()+"="+set.getValue());
		}
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr= {1,2,3,3,2,1,4,4,5,6};
frequencyOfElements(arr);
	}

}
