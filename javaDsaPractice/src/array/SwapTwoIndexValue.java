package array;

public class SwapTwoIndexValue {

	public static void main(String[] args) {
//		Q:15) WAJP to swap two index values of the array.
//		---------------------------------------------------
//		Original array: 10 | 20 | 30 | 40 | 50 | 60 | 70 |
//		---------------------------------------------------
//		Swapped array:	10 | 60 | 30 | 40 | 50 | 20 | 70 |
//		---------------------------------------------------
		
		int[] arr = {10, 20, 30, 40, 50, 60, 70};
		int[] swap = swapTwoIndexValue(arr);
		for(int n:swap) {
			System.out.print(n+" ");
		}
	}
	
	public static int[] swapTwoIndexValue(int[] arr) {
		int temp = arr[1];
		for(int i = 0; i< arr.length;i++) {
			temp = arr[1];
			arr[1] = arr[5];
			arr[5] = temp;
		}
		return arr;
	}
}
