package com.multithreading;
//creating thread and checking which thread is executing
class A extends Thread{
	public void run() {
		System.out.println("currently executing thread inside run method: " + Thread.currentThread().getName());

	}
}

class B extends Thread{
	public void run(){
	System.out.println("currently executing thread in second : " + Thread.currentThread().getName());

}
}



public class Test14 {

	public static void main(String[] args) {
		System.out.println("currently executing thread: " + Thread.currentThread().getName());
         A a = new A();
         a.start();
         B b = new B();
         b.start();

	}

}
