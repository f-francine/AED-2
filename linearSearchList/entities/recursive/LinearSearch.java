package entities.recursive;

public class LinearSearch {
	
	private int index = -1;
	
	public int search(int [] list, int target) {
		index++;
		if(index < list.length) {
			return (list[index] == target) ? index : search(list, target);
		}
		return -1;
	}
}
