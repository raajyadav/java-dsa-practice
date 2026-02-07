package method;

import java.util.Scanner;

public class PrimeNumberOptimized {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = sc.nextInt();
	     System.out.println(isPrime(n));
	}
	
	public static boolean isPrime(int n) {
		
		if(n <= 0) {
			return false;
		}
		
		if(n == 1 || n == 2) {
			return true;
		}
	
		
		for(int i = 2; i<=Math.sqrt(n);i++) {
			if(n % i == 0)
				return false;	
		}
		return true;
	}
}
