package entities.recursive;

public class Table {
	

	private int [] numbers;
	private Integer currentSize;
	private Integer maxSize;
	private int index = -1;
	private int init = 0;

	public Table(int maxSize) {
		numbers = new int[maxSize];
		this.currentSize = 0;
		this.maxSize = maxSize;
	}
	
	public int [] getNumbers() {
		return numbers;
	}
	
	public Integer getCurrentSize() {
		return currentSize;
	}
	
	public int getInit() {
		return init;
	}
	
	public boolean isEmpty() {
		return this.currentSize == 0;
	}

	public boolean isFull() {
		return this.currentSize == maxSize;
	}
	
	public String insert(int number) {
		for (int i = 0; i < this.currentSize; i++) {
			if (number == numbers[i]) {
				numbers[i] = number;
				return numbers[i] + "has been sucessfully changed!";
			}
		}
		if (!isFull()) {
			numbers[this.currentSize++] = number;
			bubbleOrder();
			return number + "was sucessfully added!";
		}
		return number + "was not found";
	}
	
	public Integer linearSearch(int [] numbers, int target) {
		index++;
		if(index < numbers.length) {
			return (numbers[index] == target) ? index : linearSearch(numbers, target);
		}
		return -1;
	}
	
	public Integer binarySearch(int [] numbers, int init, int end, int target) {
		if(!isEmpty()) {
			if(init <= end) {
				int half = (init + end)/2;
				if(numbers[half] == target) {
					return half;
				} else if (target > numbers[half]) {
					return binarySearch(numbers, half+1, end, target);
				} else {
					return binarySearch(numbers, init, half-1, target);
				}
			}
		}
		return -1;
	}
	
	public String bubbleOrder() {
		if (this.currentSize <= 1) {
			return "Cannot ordered! There is just one element in the table";
		} else {
			int aux;
			for (int i = 0; i < numbers.length; i++) { //Ordering 2 by 2
				for (int j = 0; j < this.currentSize - 1; j++) {
					if (numbers[j] > numbers[j + 1]) { 
						aux = numbers[j];
						numbers[j] = numbers[j + 1];
						numbers[j + 1] = aux;
					}
				}
			}
			return "Table sucessfull ordered!";
		}
	}
}
