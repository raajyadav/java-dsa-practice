package array;

public class Program19CheckPalindrome {

	public static void main(String[] args) {

//		Q:18) WAJP to check array is a palindromic array or not. Return true or false accordingly.	
//		----------------------------------------------------
//		Original array : 10 | 20 | 30 | 40 | 30 | 20 | 10 |
//		--------------
//		Output: true	
//		---------------------------------------------------
//		Original array : 10 | 20 | 30 | 40 | 30 | 50 | 10 |
//		--------------
//		Output: false
//		--------------------------------------------------

		int[] arr = { 10, 20, 30, 40, 30, 20, 10 };
		int mid = arr.length / 2;

		reverse(arr, 0, mid);
		reverse(arr, mid + 1, arr.length - 1);
		System.out.println();

	}

	public static boolean reverse(int[] arr, int start, int end) {

		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;

			start++;
			end--;
		
		}

		return true;

	}

}
