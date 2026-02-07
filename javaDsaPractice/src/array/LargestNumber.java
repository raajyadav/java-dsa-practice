package array;

public class LargestNumber {

	public static void main(String[] args) {
		int[] number = { 10,20,300,40,50};
		int largest = getLargest(number);
	    System.out.println("largest number is: "+largest);
	}
	public static int getLargest(int[] arr) {
		int largest = Integer.MIN_VALUE;
		for(int i =0;i<arr.length;i++) {
			if(largest < arr[i]) {
				largest = arr[i];
			
			}
		}
		return largest;
	}
}
