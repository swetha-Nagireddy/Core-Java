package com.multithreading;
//executorservice where completing the tasks without creating threads and assigning no of threads to the executor
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class TaskA implements Runnable{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+"started the task");
		for(int i=0;i<=700;i++) {
			continue;
		}
		System.out.println(Thread.currentThread().getName()+"completed the task");
	}
	
}

class TaskB implements Runnable{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+"started the task");
		for(int i=0;i<=500;i++) {
			continue;
		}
		System.out.println(Thread.currentThread().getName()+"completed the task");
	}
	
}

class TaskC implements Runnable{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+"started the task");
		for(int i=0;i<=100;i++) {
			continue;
		}
		System.out.println(Thread.currentThread().getName()+"completed the task");
	}
	
}
public class Test7 {

	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(2);
		
		executor.execute(new TaskA());
		executor.execute(new TaskB());
		executor.execute(new TaskC());
		
		executor.shutdown();

	}

}
