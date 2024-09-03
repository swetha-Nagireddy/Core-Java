package com.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
//fail safe iterator
public class Fail_Safe_Iterator {

	public static void main(String[] args) {
		CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();
		//List<Integer> list= new ArrayList<>();//this throws an error ConcurrentModificationError

		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		Iterator<Integer> iterator=list.iterator();
		while(iterator.hasNext()) {
			
			System.out.println(iterator.next()+" ");
			list.add(7);
			
		}
		System.out.println(list);
		Iterator<Integer> iterator2=list.iterator();
		while(iterator2.hasNext()) {
			
			System.out.println(iterator2.next()+" ");
			list.add(8);
			
		}
		System.out.println(list);
	}

}
