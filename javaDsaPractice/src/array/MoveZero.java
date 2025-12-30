package array;

public class MoveZero {

	/*
	 * Q:32) WAJP to move all zeroes of an array to the end. 
	 * i/p: [7, 0, 2, 6, 0, 4]
	 * o/p: [7, 2, 6, 4, 0, 0]
	 */
	public static void main(String[] args) {
		int[] arr = { 7, 0, 2, 6, 0, 4 };
		int[] moveZeroes = moveZeroes(arr);
		for (int n : moveZeroes) {
			System.out.print(n + " ");
		}

	}

	public static int[] moveZeroes(int[] arr) {
		for (int i = 0, j = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				if (i != j) {
					arr[j] = arr[i];
					arr[i] = 0;
				}
				j++;
			}
		}
		return arr;
	}
}
