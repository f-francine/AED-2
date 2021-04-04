package application.iteractive;

import java.util.ArrayList;
import java.util.List;

import entities.iteractive.Fibonacci;

public class FibonacciApp {
	
	public static void main(String [] args) {
		
		List<Integer> resultSet = new ArrayList<>();
		
		Fibonacci fibonacci = new Fibonacci(10);
		resultSet = fibonacci.fibonacci();
		
		for(int i : resultSet) {
			System.out.println(i);
		}
	}	
}
