package entities.iteractive;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

	private int limit;
	int currentNumber;
	int previousNumber;
	List<Integer> fibonacciList = new ArrayList<>();
	
	public Fibonacci(int limit) {
		this.limit = limit;
	}
	
	public ArrayList<Integer> fibonacci() {
		for(int i = 1; i <= limit; i++) {
			if(i == 1) {
				currentNumber = 1;
			}
			else {
				currentNumber += previousNumber;
				previousNumber = currentNumber - previousNumber; 
			}
			fibonacciList.add(currentNumber);
		}
		
		return (ArrayList<Integer>) fibonacciList;
	}

}
