package method;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter binary number: ");
		int binNum = sc.nextInt();
		binToDec(binNum);
	}
	public static void binToDec(int binNum) {
		int myNum = binNum;
		int pow = 0;
		int decNum = 0;
		
		while(binNum > 0) {
			int lastDigit = binNum % 10;
			decNum = decNum + (int)(lastDigit *Math.pow(2, pow));
			pow++;
			binNum = binNum / 10;
		}
		System.out.println("Decimal of "+myNum + " is: " +decNum);
	}
}
