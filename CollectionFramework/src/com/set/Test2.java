package com.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class Test2 {

	public static void main(String[] args) {
		Set<Integer> set = new LinkedHashSet<>();
		set.add(10);
		set.add(50);
		set.add(20);
		set.add(null);
		System.out.println(set);

	}

}
