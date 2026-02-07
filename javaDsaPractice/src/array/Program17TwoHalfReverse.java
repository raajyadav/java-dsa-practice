package array;

public class Program17TwoHalfReverse {

	public static void main(String[] args) {
//		Q:17) WAJP to reverse 1st half and 2nd half elements of array.	
//		--------------------------------------------------
//		Original array: 10 | 20 | 30 | 40 | 50 | 60 | 70 |
//		----------------------------------------------------
//		Reversed array: 40 | 30 | 20 | 10 | 70 | 60 | 50 |
//		---------------------------------------------------
		int[] arr = {10, 20, 30, 40, 50, 60, 70};
		int mid = arr.length/2;

		reverse(arr, 0, mid);
		reverse(arr, mid+1, arr.length-1);
		for(int x:arr) {
			System.out.print(x+" ");
		}
		
		
	}
	public static int[] reverse(int[] arr , int start, int end) {
		
		while(start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			
			start++; 
			end--;
		}

		return arr;
		
	}
}
