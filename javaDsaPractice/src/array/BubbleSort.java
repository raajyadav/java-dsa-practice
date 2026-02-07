package array;

public class BubbleSort {

	public static void main(String[] args) {
		  int[] a = {5, 2, 9, 1, 3};
		  bubbleSort(a);
	}
	public static void bubbleSort(int[] a) {
		for(int i = 0; i<a.length;i++) {
			for(int j = i+1; j<a.length;j++) {
				if(a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			
			}
		for(int x:a) {
			System.out.print(x+" ");
		}
	}
}
