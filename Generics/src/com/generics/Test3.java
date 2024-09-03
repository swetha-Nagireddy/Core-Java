package com.generics;
//Generic method
import java.util.Arrays;
import java.util.List;

class Print{
	public static <T> void PrintList(List<T> list) {
		//System.out.println(list.getClass());
		for(T obj:list) {
			System.out.println(obj+" ");
		}
		System.out.println();
	}
}
class Product{
	private int productId;
	private String productName;
	public Product(int productId, String productName) {
		super();
		this.productId = productId;
		this.productName = productName;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + "]";
	}
	
}
public class Test3 {

	public static void main(String[] args) {
		List<Integer>  intlist = Arrays.asList(1,2,3,4,5,6);
		
		List<Double> doublelist = Arrays.asList(1.2,2.3,3.4,4.5);
		
		List<Float> floatlist = Arrays.asList(9.9f,8.8f,7.7f);
		
		List<String> stringlist = Arrays.asList("swetha","satish","syamala","purushotham");
		
		Print.PrintList(intlist);
		Print.PrintList(doublelist);
		Print.PrintList(floatlist);
		Print.PrintList(stringlist);
		
		List<Product> productlist = Arrays.asList(new Product(1,"Laptop"),new Product(2,"mobile"));
        Print.PrintList(productlist);
	}

}
