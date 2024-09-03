package com.list;

import java.util.Iterator;
import java.util.Vector;

public class Test3 {

	public static void main(String[] args) {
		Vector<Integer> vector = new Vector();
        System.out.println(vector.capacity());
        
        //isEmpty()
        System.out.println(vector.isEmpty());
        
        //add
        for(int i=0;i<50;i=i+10) {
        	vector.add(i);
        }
        System.out.println(vector);
        //traverse
        for(int i=0;i<vector.size();i++) {
        	System.out.println(vector.get(i));
        }
        
        for(Integer obj:vector) {
        	System.out.println(obj+" ");
        }
        
        Iterator<Integer> iterator= vector.iterator();
        while(iterator.hasNext()) {
        	System.out.println(iterator.next());
        }
        
        //collection
        Vector<Integer> vector2= new Vector<>();
        for(int i=100;i<150;i=i+20) {
        	vector.add(i);
        }
        
        //adding vector2 to vector 1
        vector.addAll(1, vector2);
        System.out.println(vector);
        
        //update
        vector.set(0, 5);
        System.out.println(vector);
        
        //delete
        vector.remove(0);
        System.out.println(vector);
        
	}

}
