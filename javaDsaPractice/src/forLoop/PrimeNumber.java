package forLoop;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		do {
			
			System.out.println("Enter number: ");
			int n = sc.nextInt();
			
			if(n == 1) {
				System.out.println(n+" is not prime");
			}
			else {
			
				boolean isPrime = true;
				for(int i = 2; i<Math.sqrt(n);i++) {
					if(n % i == 0) {
						isPrime = false;
					}	
				}
				
				if(isPrime == true) {
					System.out.println(n+" is prime number");
				}else {
					System.out.println(n+" is not prime number");
				}
			}
			
		}while(true);
		
		
	}
}
