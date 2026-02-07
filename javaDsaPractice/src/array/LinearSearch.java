package array;

public class LinearSearch {

	public static void main(String[] args) {
		int[] marks = { 10, 20, 30, 40, 50, 60, 70,50, 80 };
		int key = 50;
		int index = linearSearch(marks, key);
		if(index == -1) {
			System.out.println("NOT found");
		}else {
			System.out.println("Key is at index : "+index);
		}
	}

	public static int linearSearch(int[] arr, int key) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				return i;
			}
		}
		return -1;
	}

}
