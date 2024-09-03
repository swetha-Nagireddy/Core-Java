package com.multithreading;

import java.util.Scanner;

class Tickets_Available{
	static  int avaliable_seats=10;
	 
}

class User extends Thread{
	private String username;
	private int  req_seats;
	private Booking booking;
	
	public  User(String username,int req_seats,Booking booking) {
		super();
		this.username=username;
		this.req_seats=req_seats;
		this.booking=booking;
	}
		public void run() {
			try {
				this.booking.getBooking(username,req_seats);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}


class Booking{
     Scanner sc = new Scanner(System.in);
     
     public static synchronized void getBooking(String username,int req_seats) throws InterruptedException {
    	 Thread.sleep(2000);
    	 System.out.println("welcome"+username+"to IRCTC");
    	 System.out.println("Requested seats"+req_seats);
    	 System.out.println("please wait checking for the availability....");
    	 Thread.sleep(2000);
    	 
    	 if(req_seats<=Tickets_Available.avaliable_seats) {
    		 Tickets_Available.avaliable_seats -= req_seats;
    		 System.out.println("Hi"+username+"seats booked successfullt");
    	 }else {
    		 System.out.println("hi"+username+"seats are not avaliable. sorry for the inconvenience");
    	 }
    	 
     }
}
public class Test12 {

	public static void main(String[] args) {
		Booking booking = new Booking();
		User user1 = new User("swetha",6,booking);
		User user2 = new User("satish",4,booking);
		
		user1.start();
		user2.start();

	}

}
