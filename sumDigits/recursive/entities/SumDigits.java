package recursive.entities;

public class SumDigits {
	
	public static int sumDigits(int number) {
		return (number < 10) ? number : sumDigits(number/10) + number%10;
	}	
}
