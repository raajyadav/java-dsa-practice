package array;

public class SmallestNumber {

	public static void main(String[] args) {
		int[] numbers = {10,13,25,2,57,388};
		int smallest = getSmallest(numbers);
		System.out.println("Smallest number is : "+smallest);
	}
	public static int getSmallest(int[] numbers) {
		int smallest = Integer.MAX_VALUE;
		for(int i=0;i<numbers.length;i++) {
			if(smallest > numbers[i]) {
				smallest = numbers[i];
			}
		}
		return smallest;
	}
}
