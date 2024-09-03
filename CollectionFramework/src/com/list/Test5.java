package com.list;

import java.util.Stack;

public class Test5 {

	public static void main(String[] args) {
		String str="[()]";
		Stack<Character> stack = new Stack<>();
		for(int i=0;i<str.length()-1;i++) {
			if(str.charAt(i)=='[' || str.charAt(i)=='(' ) {
				stack.push(str.charAt(i));
			}
			}
			
		}

	}


