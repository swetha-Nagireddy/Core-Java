package com.multithreading;
//implementing thread using Runnable Interface
//Runnable interface: it is a functional interface
//functional interface is having one exactly one abstract method
class D implements Runnable{
	@Override
	public void run() {
		System.out.println("currently executing thread inside run method: " + Thread.currentThread().getName());

	}
}
public class Implementing_interface {

	public static void main(String[] args) {
		D b = new D();
		Thread th = new Thread(b);
	    th.start();
	}

}
