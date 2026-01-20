package array;

public class SumExceptItself {

	public static void main(String[] args) {
//		6) WAJP for below requirements Sum except itself:
//		----------------------------
//		|  2  | 5  |  4  |  3 |  6 |
//		============================
//      | 18  | 15 |  16 | 17 | 14 |
//      ----------------------------
		
		int[] arr = {2,5,4,3,6};
		int[] sum = sumExceptItSelf(arr);
		for(int x:sum) {
			System.out.print(x+" ");
		}
		
	}
	
	public static int[] sumExceptItSelf(int[] arr) {
		int sum = 0;
		
		for(int x :arr) {
			sum = sum + x;
		}
		for(int i = 0; i<arr.length;i++) {
			arr[i] = sum - arr[i];
		}
		return arr;
	}
}
