package method;

import java.util.Scanner;

public class PrimeNumberRange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n =sc.nextInt();
		primeRange(n);
	}
	public static boolean primeRange(int n) {
		for(int i = 2; i<=n ;i++) {
			if(isPrime(i)) {
				System.out.print(i+" ");
			}
		}
		return false;
	}
	public static boolean isPrime(int n) {
		if(n <= 0) {
			return false;
		}
		if(n == 1 || n == 2) {
			return true;
		}
		
		for(int i = 2; i<=Math.sqrt(n);i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
