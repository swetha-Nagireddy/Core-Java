package com.multithreading;

 class K extends Thread{
	public void run() {
		//running
		System.out.println("thread started...");
		try {
			Thread.sleep(2000);//Blocked or waiting
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println("thread ended...");
	}
	
}
public class LifeCycle {

	public static void main(String[] args) {
		K k = new K();//new 
		k.start();//Runnable
	}

}
