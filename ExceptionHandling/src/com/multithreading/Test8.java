package com.multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Task_1 implements Callable<String>{

	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		return "Task_1 is Completed";
	}
	
}
public class Test8 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService th= Executors.newSingleThreadExecutor();
		Future<String> result = th.submit(new Task_1());
		System.out.println(result.get());
		th.shutdown();

	}

}
