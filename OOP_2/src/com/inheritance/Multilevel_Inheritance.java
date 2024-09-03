package com.inheritance;

class G{
	int a=1;
	
}

class P extends G{
	int b =5;
	
	
}
class C extends P{
	int c=10;
	
	
	
}
public class Multilevel_Inheritance {

	public static void main(String[] args) {
		
    C obj = new C();
    System.out.println(obj.c);
    System.out.println(obj.b);
    System.out.println(obj.a);
    
	}

}
