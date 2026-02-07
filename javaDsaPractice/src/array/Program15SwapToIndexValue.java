package array;

public class Program15SwapToIndexValue {

	public static void main(String[] args) {
		
//		Q:15) WAJP to swap two index values of the array.
//		---------------------------------------------------
//		Original array: 10 | 20 | 30 | 40 | 50 | 60 | 70 |
//		---------------------------------------------------
//		Swapped array:	10 | 60 | 30 | 40 | 50 | 20 | 70 |
//		---------------------------------------------------
		
		int[] arr = {10, 20, 30, 40, 50, 60, 70};
		
		int temp = arr[1];
		    arr[1] = arr[5];
		    arr[5] = temp;
		    
	    for(int x: arr) {
	    	System.out.print(x+" ");
	    }
	}
}
