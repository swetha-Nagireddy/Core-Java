package com.multithreading;


class Table{
	public void print(int num) {
		for(int i=0;i<=10;i++) {
			System.out.println(num+" x "+i+" = "+ (num*i)+" ------> "+Thread.currentThread().getName());
			}
	}
}

class MyThread extends Thread{
	private Table table;
	
	public MyThread(Table table) {
		super();
		this.table=table;
	}
	public void run() {
		this.table.print(2);
		
	}
}


class MyThread2 extends Thread{
	private Table table;
	
	public MyThread2(Table table) {
		super();
		this.table=table;
	}
	public void run() {
		this.table.print(5);
		
	}
}
public class Test {

	
	public static void main(String[] args) {
		
    Table t = new Table();
    MyThread t1= new MyThread(t);
    MyThread2 t2= new MyThread2(t);
    
    
    t1.setName("Thread-A");
    t2.setName("Thread-B");
    
    
    t1.start();
    t2.start();
    
	}

}
