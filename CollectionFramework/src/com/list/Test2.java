package com.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
//LinkedList: List,Deque - double linked list
public class Test2{
	//traversal
	public static void printLinkedList(LinkedList<Integer> list) {
		System.out.print("head-->");
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+"-->");
		}
		System.out.print("null");
		System.out.println();
	}
	public static List<Integer> getDuplicateElements(LinkedList<Integer> list){
		List<Integer> indexList= new ArrayList<>();
		for(int i=0;i<list.size();i++) {
			if(list.indexOf(list.get(i)) != list.lastIndexOf(list.get(i))) {
				if(! indexList.contains(list.indexOf(list.get(i)))) {
					indexList.add(list.indexOf(list.get(i)));
				}
			}
		}
		return indexList;
	}
	
//	public static List<Integer> removeDuplicateElements(LinkedList<Integer> list){
//		//List<Integer> list2= new ArrayList<>();
//		
//		for(int i=0;i<list.size();i++) {
//			if(list.indexOf(list.get(i)) != list.lastIndexOf(list.get(i))) {
//				
//				list.remove(list.lastIndexOf(list.get(i)));
//		}
//		}
//		return list;
//		}
	public static List<Integer> removeDuplicate_Elements(LinkedList<Integer> list){
		List<Integer> lst = new ArrayList<>();
		Collections.sort(list);
		for(int i=0;i<list.size()-1;i++) {
			if(list.get(i) != list.get(i+1)) {
				lst.add(list.get(i));
			}
		}
		return lst;
	}
	public static List<Integer> sortingList(LinkedList<Integer> list){
		for(int i=0;i<list.size()-1;i++) {
			for(int j=i+1;i<list.size();j++)
			if(list.get(i) < list.get(j)) {
				int temp=list.get(i);
				list.set(i, list.get(j));
				list.set(j, temp);
			}
		}
		return list;
	}
	
	public static void main(String[] args) {
		LinkedList<Integer> list= new LinkedList<>();
		
		//size()
		System.out.println(list.size());
		
		//add node at beginning position
		list.addFirst(10);
		printLinkedList(list);
		
		//add node at last position
		list.addLast(50);
		printLinkedList(list);
		
		//add node at given index position
		list.add(1,20);
		printLinkedList(list);
		
		list.add(2,30);
		list.add(3,40);
		list.add(3,50);
		list.add(4,20);
		printLinkedList(list);
		
		list.addFirst(5);
		printLinkedList(list);
		
		list.addLast(60);
		printLinkedList(list);
		
		//read headnode
		System.out.println(list.peek());
		System.out.println(list.peekFirst());
		//read last node
		System.out.println(list.peekLast());
		//read node at given index position
		int index=8;
		if(index>=0 && index<list.size()) {
			System.out.println("valid index "+list.get(index));
		}else {
			System.out.println("not valid index");
		}
		
		//search
		int key=40;
		if(list.contains(key)) {
			System.out.println(list.indexOf(key));
		}else {
			System.out.println("key not found");
		}
		
		System.out.println(getDuplicateElements(list));
		
		System.out.println(removeDuplicate_Elements(list));
		
		//sorting the list
		Collections.sort(list);
		System.out.println(list);
		
		//System.out.println(sortingList(list));
		}
	}

	