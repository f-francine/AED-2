package application.recursive;

import entities.recursive.SumItems;

public class SumItemsApp {

	public static void main(String [] args) {
		
		int [] numbers = {1, 2, 3, 4, -10};
		SumItems sumItems = new SumItems(numbers);
		
		int result = sumItems.sumItems();
		System.out.println(result);
	}
}
