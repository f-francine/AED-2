package application.recursive;

import java.util.ArrayList;

import entities.recursive.Fibonacci;

public class FibonacciApp {

	public static void main(String[] args) {

		Fibonacci fibonacci = new Fibonacci();
		
		ArrayList<Integer> resultSet = new ArrayList<>();
		
		resultSet = fibonacci.fibonacciList(10);
		
		for(int i : resultSet) {
			System.out.println(i);
		}
	}

}
