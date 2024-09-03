package com.multithreading;
//InterThread Communication

class Multiplex{
	static int totalAmount=1100;
	
	
	public synchronized void bookTicket() throws InterruptedException{
		if(totalAmount<1500) {
			System.out.println("waiting for amount to credit");
			wait();
		}
		System.out.println("amount credited to your account");
		System.out.println("Booking a ticket");
		System.out.println("Enjoying the movie");
	}
	
	public synchronized void depositingAmount(int amount) {
		System.out.println("Depositing the amount....");
		totalAmount += amount;
		System.out.println("amount deposted");
		notify();
	}
}

class John extends Thread{
	private Multiplex multiplex;
	
	John(Multiplex multiplex){
		this.multiplex = multiplex;
	}
	
	public void run() {
		try {
		this.multiplex.bookTicket();
	}catch(InterruptedException ie) {
      
		ie.printStackTrace();
	
      }
	} 
	
}
class Peter extends Thread{
	private Multiplex multiplex;
	
	Peter(Multiplex multiplex){
		this.multiplex = multiplex;
	}
	
	public void run() {
		
			this.multiplex.depositingAmount(1000);
		
	}
}

public class Test5 {

	public static void main(String[] args) {
		Multiplex multiplex = new Multiplex();
		
		John j = new John(multiplex);
		Peter p = new Peter(multiplex);
		
		j.start();
		p.start();

	}

}

