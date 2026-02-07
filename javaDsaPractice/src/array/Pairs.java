package array;

public class Pairs {

	public static void main(String[] args) {
		int arr[] = {2,3,4,5,6,7};
		printPairs(arr);
	}
	public static void printPairs(int[] arr) {
	  int countPairs = 0;
		for(int i=0;i<arr.length;i++) {
			int current = arr[i];//2,3,4,5,6,7
			for(int j= i+1;j<arr.length;j++) {
				System.out.print("("+current+","+arr[j]+")"+",");
				countPairs++;
			}
			System.out.println();
		
		}
		System.out.println("Total pairs = "+countPairs);
	}
}
