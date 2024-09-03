package com.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task1 implements Runnable{

	@Override
	public void run() {
		System.out.println("Task1 started....");
		for(int i=0;i<=10;i++) {
			try {
				Thread.sleep(100);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Task1 completed");
	}
	
}
public class Test6 {

	public static void main(String[] args) {
		ExecutorService executor = Executors.newSingleThreadExecutor();
		
		Task1 t1 = new Task1();
		
		
		
		executor.execute(t1);
		executor.shutdown();

	}

}
