package array;

public class ProofCallByValue {

	public static void main(String[] args) {

		int[] arr = { 10, 20, 30 };

		change(arr);
		System.out.println(arr[0]);
	}

	public static void change(int[] a) {
		a = new int[] { 1, 2, 3 };
	}
}
