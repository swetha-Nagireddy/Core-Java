package com.list;

import java.util.Stack;

public class Test4 {

	public static void main(String[] args) {
		Stack<Integer> stack=new Stack<>();
		
		//add
		for(int i=1;i<=5;i++) {
			stack.push(i);
		}
		//print
		System.out.println(stack);
		
		//deleting the element
		Integer ele = stack.pop();
		System.out.println(ele);
	}

}
