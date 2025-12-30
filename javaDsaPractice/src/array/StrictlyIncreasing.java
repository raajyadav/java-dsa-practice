package array;

public class StrictlyIncreasing {
	
/*  WAJP to check if an array is strictly increasing.
	i/p: [2, 3, 7, 8, 9]
	o/p: Array is strictly increasing
*/
	public static void main(String[] args) {
		int[] arr = {2,3,7,8,9};
		System.out.print("Array : ");
		for(int n:arr) {
			System.out.print(n+" ");
		}
		System.out.println();
		boolean increasing = isIncreasing(arr);
		if(increasing)
		  System.out.print("Array is strictly increasing");
		else 
		  System.out.print("Array is not strictly increasing");
		
	}

	public static boolean isIncreasing(int[] arr) {
		for(int i = 1; i<arr.length;i++) {
			if(arr[i] <= arr[i-1])
				return false;
		}
		return true;
	}
}
