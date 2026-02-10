package array;

public class BruteForceMaxSubArraySum {

	public static void main(String[] args) {
		int[] arr = {1, -2, 6, -1, 3};
		maxSum(arr);
	}
	public static void maxSum(int[] arr) {
	
		int maxSum = Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			int start = i;
			for(int j=i;j<arr.length;j++) {
				int sum = 0;
				int end = j;
				for(int k = start; k<=end;k++ ) {
					sum = sum +arr[k];
				}
				if(maxSum < sum) {
					maxSum = sum;
				}
			}
		}
		System.out.println("Max Sum of Subarrays : "+maxSum);
	}
}
