package application.recursive;

import entities.recursive.Table;

public class TableApp {
	
	public static void main(String [] args) {
		
		Table table = new Table(5);
		int maxSize = 5;
		
		for(int i = 1; i <= maxSize; i++) {
			table.insert(i);
		}
		
		int target = table.linearSearch(table.getNumbers(), 2);
		System.out.println(target);
		
		int targetBinary = table.binarySearch(table.getNumbers(), table.getInit(), table.getCurrentSize(), 2);
		System.out.println(targetBinary);
	}

}
