package com.multithreading;
//synchronized block
class Block{
	public  void m1() {
		System.out.println(Thread.currentThread().getName()+"entered m1()");
		synchronized(this) {
		for(int i=1;i<=5;i++) {
			System.out.println(i+"---->"+Thread.currentThread().getName());
		}
	}
}
}
class BA extends Thread{
	private Block resource;
	BA(Block resource){
		this.resource=resource;
	}
	
	public void run() {
		this.resource.m1();
	}
}

class BB extends Thread{
	private Block resource;
	BB(Block resource){
		this.resource=resource;
	}
	
	public void run() {
		this.resource.m1();
	}
}

class BC extends Thread{
	private Block resource;
	BC(Block resource){
		this.resource=resource;
	}
	
	public void run() {
		this.resource.m1();
	}
}
public class Test2 {

	public static void main(String[] args) {
		Block d = new Block();
		BA t = new BA(d);
		BB t1 = new BB(d);
		BC t2 = new BC(d);
		
		t.setName("Thread-A");
		t1.setName("Thread-B");
		t2.setName("Thread-C");
		
		t.start();
		t1.start();
		t2.start();

	}

}

