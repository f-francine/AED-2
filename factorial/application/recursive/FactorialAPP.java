package application.recursive;

import entities.recursive.Factorial;

public class FactorialAPP {

	public static void main(String[] args) {
		
		int entry = 3;
		
		int result = Factorial.factorial(entry);
		System.out.println(result);
	}
}
