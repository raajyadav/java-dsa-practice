package array;

public class CallByReference {

	public static void main(String[] args) {

		int[] arr = { 10, 20, 30, 40 };

		change(arr);

		System.out.println(arr[0]);
		System.out.println(arr[1]);
	}

	public static void change(int[] a) {
		a[0] = 100;
	}
}
