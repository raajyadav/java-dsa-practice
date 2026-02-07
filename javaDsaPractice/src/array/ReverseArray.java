package array;

public class ReverseArray {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		int[] reverse = reverse(arr);
		for (int i : reverse) {
			System.out.print(i+" ");
		}
	
	}
	public static int[] reverse(int[] arr) {
		int start = 0,  end = arr.length-1;
		while(start < end) {
			int temp = arr[end];
			arr[end] = arr[start];
			arr[start] = temp;
			
			start++;
			end--;
		}
		return arr;
	}
}
