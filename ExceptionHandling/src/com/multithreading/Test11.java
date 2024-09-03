package com.multithreading;
// we can use invokeAny() and it will return result which completed first

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


class Task_G implements Callable<String>{

	@Override
	public String call() throws Exception {
		for(int i=1;i<=500;i++) {
			continue;
		}
		return "Task_A completed" ;
	}
	
}

class Task_H implements Callable<String>{

	@Override
	public String call() throws Exception {
		for(int i=1;i<=300;i++) {
			continue;
		}
		return "Task_B completed" ;
	}
	
}

class Task_I implements Callable<String>{

	@Override
	public String call() throws Exception {
		for(int i=1;i<=400;i++) {
			continue;
		}
		return "Task_C completed" ;
	}
	
}
public class Test11 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executor = Executors.newFixedThreadPool(2);
		

		
		List<Callable<String>> tasks = Arrays.asList(new Task_G(), new Task_H(), new Task_I());
		//invokeAny()
		
		String completedTask = executor.invokeAny(tasks);
		System.out.println(completedTask);
         executor.shutdown();
	}

}

