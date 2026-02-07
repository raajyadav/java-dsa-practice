package flowControl;

public class LargestNumberAmongThree {

	public static void main(String[] args) {
		
		int A = 2, B= 9, C=4;
		
		if(A >= B && A>= C) {
			System.out.println("largest is : "+A );
		}else if(B >= C) {
			System.out.println("Largest is : "+B);
		}else {
			System.out.println("Largest is : "+C);
		}
	}
}
