package array;

public class ProductOfArrayExceptSelf {

	public static void main(String[] args) {

//		Example 1:
//
//			Input: nums = [1,2,3,4]
//			Output: [24,12,8,6]
		
		int[] arr = {1,2,3,4};
		int[] prod = productExceptSelf(arr);
		for(int x:prod) {
			System.out.print(x+" ");
		}
		
	}
	public static int[] productExceptSelf(int[] arr) {
		int prod = 1;
		for(int x:arr) {
			prod = prod * x;
		}
		for(int i=0; i<arr.length;i++) {
			arr[i] = prod /arr[i];
		}
		return arr;
	}
}
