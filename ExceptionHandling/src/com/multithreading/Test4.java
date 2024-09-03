package com.multithreading;
//deadlock creation
class WritingResource{
	static String resource1="Pen";
	static String resource2="Paper";
}

class ThreadA extends Thread{
	public void run() {
		System.out.println(Thread.currentThread().getName()+" started");
		synchronized(WritingResource.resource1) {
			System.out.println(Thread.currentThread().getName()+" acquired pen");
			System.out.println("waiting for paper to complete the task");
			synchronized(WritingResource.resource2) {
				System.out.println("Acquired paper. writing task completed");
			}
		}
	}
}

class ThreadB extends Thread{
	public void run() {
		System.out.println(Thread.currentThread().getName()+" started");
		synchronized(WritingResource.resource2) {
			System.out.println(Thread.currentThread().getName()+" acquired paper");
			System.out.println("waiting for pen to complete the task");
			synchronized(WritingResource.resource1) {
				System.out.println("Acquired pen. writing task completed");
			}
		}
	}
}
public class Test4  {

	public static void main(String[] args) throws InterruptedException {
		ThreadA t = new ThreadA();
		ThreadB t1 = new ThreadB();
		
		t.setName("A");
		t1.setName("B");
		
		t.start();
		//t.join();
		t1.start();

	}

}


//by using the join() function we can solve the deadlock situation
//by using the same order we can solve the deadlock situation
