package array;

public class BinarySearch {

	public static void main(String[] args) {
		int numbers[] = {2,4,5,6,7,8,9};
		int key = 5;
		int index = binarySearch(numbers,key);
		if(index == -1) {
			System.out.println("Number NOT found");
		}else {
			System.out.println("Index of number is : "+index);
		}
	}
	public static int binarySearch(int numbers[], int key) {
		
		int start = 0, end = numbers.length-1;
		
		while(start <= end) {
			int mid = (start + end)/2;
			
			if(numbers[mid] == key) {
				return mid;
			}
			if(numbers[mid] < key) {
				start = mid + 1;
			}else {
				end = mid - 1;
			}
		}
		return -1;
	}
}
