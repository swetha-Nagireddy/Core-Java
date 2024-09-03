package com.multithreading;
//instead of submit() we can use invokeAll()
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Task_D implements Callable<String>{

	@Override
	public String call() throws Exception {
		for(int i=1;i<=500;i++) {
			continue;
		}
		return "Task_A completed" ;
	}
	
}

class Task_E implements Callable<String>{

	@Override
	public String call() throws Exception {
		for(int i=1;i<=500;i++) {
			continue;
		}
		return "Task_B completed" ;
	}
	
}

class Task_F implements Callable<String>{

	@Override
	public String call() throws Exception {
		for(int i=1;i<=400;i++) {
			continue;
		}
		return "Task_C completed" ;
	}
	
}
public class Test10 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executor = Executors.newFixedThreadPool(2);
		

		
		List<Callable<String>> tasks = Arrays.asList(new Task_D(), new Task_E(), new Task_F());
		//invokeAll()
		
		List<Future<String>> result = executor.invokeAll(tasks);
		for(int i=0;i<result.size();i++) {
			System.out.println(result.get(i).get());
		}
         executor.shutdown();
	}

}

