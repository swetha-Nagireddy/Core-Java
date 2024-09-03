package com.exceptions;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
	static String str;
static String  str1="hello";
  static int[] arr= {1,2,3,4};
   static String str2="123";
   static String str3="123abc";
   
   static List list =new ArrayList();
	public static void m1() {
		//System.out.println(str.length());
		//System.out.println(arr[arr.length]);
		//System.out.println(str1.CharAt(str1.length()));
		System.out.println(Integer.parseInt(str2));
		System.out.println(Integer.parseInt(str3));//this throws runtime error
		list.add("hello");
		list.add("java");
		list.add(new Integer(20));
		
		for(int i=0;i<list.size();i++) {
			System.out.println((String)list.get(i));
		}
		
	}
	public static void main(String[] args) {
		m1();

	}

}
