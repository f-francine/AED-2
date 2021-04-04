package entities.iteractive;

public class SumItems {

	private int sum;

	public Integer Sum(Integer [] numbers) {
		for (int i : numbers) {
			sum += i;
		}
		return sum;
	}
}
