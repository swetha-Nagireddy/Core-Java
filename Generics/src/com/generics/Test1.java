package com.generics;
//Generic class
class GenericClass<T,U>{
	private T obj;
	private U obj2;
	GenericClass(T obj,U obj2){
		this.obj = obj;
		this.obj2=obj2;
	}
	
	public T getObject() {
		return this.obj;
	}
	
	public U getObject2() {
		return this.obj2;
	}
}
public class Test1 {

	public static void main(String[] args) {
		GenericClass<Integer,String> obj =new GenericClass<>(10,"Java");
		System.out.println(obj.getObject()+" "+obj.getObject2());
        
		GenericClass<Double,Float> obj2= new GenericClass<>(45.22,456.33f);
		System.out.println(obj2.getObject()+" "+obj2.getObject2());
		
		
//		GenericClass<String> strobj = new GenericClass<>("java");
//		System.out.println(strobj.getObject());
	}

}
