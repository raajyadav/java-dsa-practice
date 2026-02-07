package forLoop;

import java.util.Scanner;

public class ContinueKeyword2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("Enter any number:");
			int n = sc.nextInt();
			if(n % 10 ==0) {
				continue;
			}
			System.out.println("Your number was "+n);
			
		}while(true);
	}
}
