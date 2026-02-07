package array;

public class SubArray {

	public static void main(String[] args) {
		int arr[] = { 2, 4, 6, 8, 10 };
		printSubarrays(arr);
	}

	public static void printSubarrays(int arr[]) {
		
		int count = 0;
	
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			int start = i;
			for (int j = i; j < arr.length; j++) {
				int end = j;
				int sum = 0;
				for (int k = start; k <= end; k++) { // print
					System.out.print(arr[k] + " ");// sub array
					sum = sum + arr[k];
					
				}
				System.out.println(" : sum = "+sum);
				if(sum > max) {
					max = sum;
				}
				if(sum < min){
					min = sum;
				}
				count++;
				System.out.println();
			}
			System.out.println();
		}
		System.out.println("Total Subarrays are : "+count);
	    System.out.println("Maximum sum is : "+max);
	    System.out.println("Minimum sum is : "+min);
	}
}
