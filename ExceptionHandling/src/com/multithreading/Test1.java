package com.multithreading;
//synchronized method
class Data{
	public synchronized  void m1() {
		for(int i=1;i<=5;i++) {
			System.out.println(i+"---->"+Thread.currentThread().getName());
		}
	}
}

class TA extends Thread{
	private Data resource;
	TA(Data resource){
		this.resource=resource;
	}
	
	public void run() {
		this.resource.m1();
	}
}

class TB extends Thread{
	private Data resource;
	TB(Data resource){
		this.resource=resource;
	}
	
	public void run() {
		this.resource.m1();
	}
}

class TC extends Thread{
	private Data resource;
	TC(Data resource){
		this.resource=resource;
	}
	
	public void run() {
		this.resource.m1();
	}
}
public class Test1 {

	public static void main(String[] args) {
		Data d = new Data();
		TA t = new TA(d);
		TB t1 = new TB(d);
		TC t2 = new TC(d);
		
		
		t.start();
		t1.start();
		t2.start();

	}

}
