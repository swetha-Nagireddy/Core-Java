
package com.multithreading;
//static synchronized block
class Static_synchronization{
	public static synchronized void m1() throws InterruptedException  {
		System.out.println(Thread.currentThread().getName()+"entered m1()");
		
		for(int i=1;i<=5;i++) {
			//Thread.sleep(1000);
			System.out.println(i+"---->"+Thread.currentThread().getName());
		}
	
}
}
class BD extends Thread{
	private Static_synchronization resource;
	BD(Static_synchronization resource){
		this.resource=resource;
	}
	
	public void run() {
		try {
		this.resource.m1();
	}catch(InterruptedException e) {
		e.printStackTrace();
	}
}
}
class BE extends Thread{
	private Static_synchronization resource;
	BE(Static_synchronization resource){
		this.resource=resource;
	}
	
	public void run() {
		try {
		this.resource.m1();
		}catch(InterruptedException ie) {
			ie.printStackTrace();
		}
}
}
class BF extends Thread{
	private Static_synchronization resource;
	BF(Static_synchronization resource){
		this.resource=resource;
	}
	
	public void run() {
		try {
		this.resource.m1();
		}catch(InterruptedException ei) {
			ei.printStackTrace();
		}
}
}
public class Test3 {

	public static void main(String[] args)  {
		Static_synchronization d = new Static_synchronization();
		Static_synchronization d1=new Static_synchronization();
		Static_synchronization d2=new Static_synchronization();
		BD t = new BD(d);
		BE t1 = new BE(d1);
		BF t2 = new BF(d2);
		
		t.setName("A");
		t1.setName("B");
		t2.setName("c");
		
		t.start();
		t1.start();
		t2.start();

	}

}

