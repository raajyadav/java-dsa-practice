package array;

public class ArrayDivideByItself {

	public static void main(String[] args) {
		
//Q:10) WAJP for below requirements:
//  ---------------------------------------------------------------
//  Original array:    |  2   |  5   |  4   |   3   |   6  |
//	---------------------------------------------------------
//  resultant array:   |  360 |  144 |  180 |   240 |  120 |
//	---------------------------------------------------------
		
		int[] arr = {2,5,4,3,6};
		int sum = 1;
		
		for(int x:arr) {
			sum*=x;
		}
		System.out.println(sum);
		for(int i = 0; i < arr.length;i++) {
			arr[i] = sum/arr[i];
		}
		for(int x:arr) {
			System.out.print(x+" ");
		}
	}
}
