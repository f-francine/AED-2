package application.recursive;

import entities.recursive.LinearSearch;

public class LinearSearchListApp {
	
	public static void main(String [] args) {
		
		int [] list = {1,2,3,4,5,6,7};
		
		LinearSearch ls = new LinearSearch();
		int result = ls.search(list, 2);
		System.out.println(result);
	}

}
