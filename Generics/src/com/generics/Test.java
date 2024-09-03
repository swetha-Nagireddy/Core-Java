package com.generics;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Swetha");
		list.add("Satish");
		//list.add(new Integer(10));
		
		for(int i=0;i<list.size();i++) {
			System.out.println((String)list.get(i));
		}

	}

}
