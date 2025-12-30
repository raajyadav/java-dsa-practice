package array;

public class MissingNumber {
//  WAJP find missing element from a given array which has a missing element in a range of n.
//	-------------------------------------------------
//	N=7
//	i/p: [7, 4,3, 0, 5, 1, 6]
//	o/p: 2	
//	-------------------------------------------
	public static void main(String[] args) {
		int[] arr = {7,4,3,0,5,1,6};
		System.out.print("Array : ");
		for(int n:arr) {
			System.out.print(n+" ");
		}
		System.out.println();
		int missingNumber = missingNumber(arr);
		System.out.println("Missing Number is : "+missingNumber);
	}

	public static int missingNumber(int[] arr) {
		int sum = 0;
		for(int n:arr)
			sum+=n;
		int n = arr.length;
		return n*(n+1)/2-sum;
	}
}
