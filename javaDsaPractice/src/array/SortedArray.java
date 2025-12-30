package array;

public class SortedArray {

	/*
	 * 31) WAJP to check whether a given array is in sorted order or not. 
	 * i/p: [2, 7, 7, 8, 9] 
	 * o/p: Array is sorted
	 */
	public static void main(String[] args) {
		int[] arr = { 2, 7, 7, 8, 9 };
		System.out.print("Array : ");
		for (int n : arr) {
			System.out.print(n + " ");
		}
		System.out.println();
		boolean sorted = isSorted(arr);
		if (sorted)
			System.out.print("Array is sorted");
		else
			System.out.print("Array is not sorted");

	}

	public static boolean isSorted(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < arr[i - 1])
				return false;
		}
		return true;
	}
}
