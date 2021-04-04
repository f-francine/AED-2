package entities.iteractive;

public class Factorial {
	
	int factorial = 1;

	public int factorial(int number) {
		for(int i = number; i > 1; i--) {
			factorial *= i;
		}
		return factorial;
	}
}
