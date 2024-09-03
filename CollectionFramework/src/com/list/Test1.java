package com.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

//ArrayList  //is not a synchronized one
public class Test1 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		//Addition
		list.add(new Integer(12));
		list.add(13);
		list.add(14);
		list.add(null);
		list.add(12);
		//list.add("swetha");//it gives error bcs the type is only integer
		
		//adding another List
		List<Integer> list2 = Arrays.asList(1,2,3,4);
		list.addAll(list2);
		
		//printing list
		System.out.println(list);
		
		
		//for
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		//enhanced for loop
		for(Integer obj:list) {
			System.out.println(obj);
		}
		
		//Iterator
		Iterator<Integer> iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		
		//accessing element based on index
		
		System.out.println(list.get(1));
		
		//current element
		System.out.println(list);
		
		//updating the existing value
		list.set(0, 100);
		System.out.println(list);
		
		//search
		System.out.println(list.contains(100));
     
		//delete
		if(list.contains(12)) {
			int index=list.indexOf(12);
			list.remove(index);
		}
		System.out.println(list);
		
		
	  
	}
	
	
	//CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<Integer>(); //this is a synchronized version of a arrayList

}
