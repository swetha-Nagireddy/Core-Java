package com.arrayassignment;

//counting DistinctElements

import java.util.HashMap;
import java.util.Map;

public class Test8 {

	public static void distinctElements(int[] arr) {
		Map<Integer,Integer> map = new HashMap<>();
		
		for(int data:arr) {
			if(map.containsKey(data)) {
				map.put(data,map.get(data)+1);
			}else {
				map.put(data, map.getOrDefault(data,1));
			}
			
		}
		for(Map.Entry<Integer,Integer> set:map.entrySet()){
			if(set.getValue()==1) {
				System.out.println(set.getKey());
				
			}
			
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr= {1,2,3,2,4,3,4,5,6,5};
distinctElements(arr);
	}

}
