package com.arrayassignment;

import java.util.ArrayList;
import java.util.List;

public class Task {
  public static void reverse_Vowels(String s) {
	  String rev="";
	  for(int i=s.length()-1;i>=0;i--) {
		  rev=rev+s.charAt(i);
		  
	  }
	  System.out.println(rev);
	  
  }
	    
	
	public static void main(String[] args) {
		 String s="hello";
		 reverse_Vowels(s);
	}
}
