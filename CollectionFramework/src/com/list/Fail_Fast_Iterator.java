package com.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//fail-fast-iterator
public class Fail_Fast_Iterator {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		Iterator<Integer> iterator=list.iterator();
		while(iterator.hasNext()) {
			list.add(12);
			System.out.println(iterator.next()+" ");
			
		}

	}

}