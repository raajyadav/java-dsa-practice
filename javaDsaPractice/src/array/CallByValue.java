package array;

public class CallByValue {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };

		change(arr[0]);
		System.out.println(arr[0]);
	}

	public static void change(int x) {
		x = 100;
	}
}
