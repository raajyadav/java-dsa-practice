package method;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();
		
		int fact = getFactorial(n);
		System.out.println("Factorial of "+n +" is "+fact);
		
	}
	public static int getFactorial(int n) {
		int fact = 1;
		
		for(int i = 1; i<=n;i++) {
			fact = fact *i;
		}
		return fact;
	}
}
