package application.iteractive;

import entities.iteractive.Factorial;

public class FactorialApp {

	public static void main(String[] args) {
		
		int entry = 4;
		
		Factorial factorial = new Factorial();
		int result = factorial.factorial(entry);
		System.out.println(result);
	}
}
