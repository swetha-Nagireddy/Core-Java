package com.multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Task_A implements Callable<String>{

	@Override
	public String call() throws Exception {
		for(int i=1;i<=500;i++) {
			continue;
		}
		return "Task_A completed" ;
	}
	
}

class Task_B implements Callable<String>{

	@Override
	public String call() throws Exception {
		for(int i=1;i<=500;i++) {
			continue;
		}
		return "Task_B completed" ;
	}
	
}

class Task_C implements Callable<String>{

	@Override
	public String call() throws Exception {
		for(int i=1;i<=400;i++) {
			continue;
		}
		return "Task_C completed" ;
	}
	
}
public class Test9 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executor = Executors.newFixedThreadPool(2);
		
		Future<String> taskA = executor.submit(new Task_A());
		Future<String> taskB = executor.submit(new Task_B());
		Future<String> taskC = executor.submit(new Task_C());
	
		List<Future<String>>  tasks = new ArrayList<>();
		
		tasks.add(taskA);
		tasks.add(taskB);
		tasks.add(taskC);
       
		for(Future<String> task:tasks) {
			System.out.println(task.get());
		}
		executor.shutdown();
	}

}
