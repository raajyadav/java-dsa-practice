package array;

public class Swap {

	public static void main(String[] args) {
		int[] arr1 = {10,20,30,40};
		int[] arr2 = {50,60,70,80};
		
		System.out.println("Before Swap array are : ");
		System.out.println("--------------------------------");
		System.out.print("arr1 : ");
		for(int n:arr1) {
			System.out.print(n+" ");
		}
		System.out.println();
		System.out.print("arr2 : ");
		for(int n:arr2) {
			System.out.print(n+" ");
		}
		System.out.println();
		System.out.println();
		System.out.println("After Swap array are : ");
		
		int[] temp = arr1;
		arr1 = arr2;
		arr2 = temp;
		System.out.println("----------------------------------");
		System.out.print("arr1 : ");
		for(int n:arr1) {
			System.out.print(n+" ");
		}
		System.out.println();
		System.out.print("arr2 : ");
		for(int n:arr2) {
			System.out.print(n+" ");
		}
		
	}
	

	
}
