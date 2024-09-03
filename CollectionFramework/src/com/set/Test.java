package com.set;

import java.util.HashSet;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		Set<String> set= new HashSet<>();
		set.add("swetha");
		set.add("satish");
		set.add("satish");
		System.out.println(set);
	}

}
//set doesn't allow duplicate elements
//set allow to add at most only one null value
//set doesn't allow indexing or positioning