package forLoop;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();
		int rev= 0;
		
	   while(n > 0) {
		   rev = n% 10;
		   System.out.print(rev);
		   n/=10;
	   }
	}
}
