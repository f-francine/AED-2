package entities.recursive;

public class SumItems {

	private int length;
	private int [] numbers;
	private int sum;
	
	public SumItems(int [] numbers) {
		this.length = numbers.length;
		this.numbers = numbers;
		
	}
	
	public int sumItems() {;
		sum += numbers[length - 1];
		length--;
		return (length > 0) ? sumItems() : sum;
	}
}
