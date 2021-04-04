package entities.recursive;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

	List<Integer> fibonacciList = new ArrayList<>();
	
	public int fibonacciGenerator(int limit) {
		return (limit < 2) ? limit : fibonacciGenerator(limit - 1) + fibonacciGenerator(limit - 2);
	}
	
	// This function will transform each fibonacci generation into a unique list
	public ArrayList<Integer> fibonacciList(int limit) {
		for(int i = 1; i <= 10; i++) {
			fibonacciList.add(fibonacciGenerator(i));
		}
		return (ArrayList<Integer>) fibonacciList; 
	}
}
