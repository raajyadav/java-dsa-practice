package array;

public class Program16ReverseEachElement {

	public static void main(String[] args) {
//		Q:16) WAJP to reverse each element of the array.
//		--------------------------------------------------
//		Original array: 10 | 20 | 30 | 40 | 50 | 60 | 70 |
//	    --------------------------------------------------
//		Reversed array: 70 | 60 | 50 | 40 | 30 | 20 | 10 |
//		---------------------------------------------------
		int[] arr = {10, 20, 30, 40, 50, 60, 70};
		int[] reverse = reverseEachElement(arr);
		for(int x:reverse) {
			System.out.print(x+" ");
		}
		
	}
	
	public static int[] reverseEachElement(int[] arr) {
		int start = 0;
		int end = arr.length-1;
		
		while(start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			
		 start++; end--;	
		}
		return arr;
	}
}
