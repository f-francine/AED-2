package application.iteractive;

import entities.iteractive.SumItems;

public class SumItemsApp {

	public static void main(String[] args) {
		
		Integer [] numbers = {1,2,3,4};
		
		SumItems sumItems = new SumItems();
		int sum = sumItems.Sum(numbers);
		System.out.println(sum);
	}

}
