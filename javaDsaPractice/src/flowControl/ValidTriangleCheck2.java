package flowControl;

import java.util.Scanner;

public class ValidTriangleCheck2 {

	public static void main(String[] args) {
//		WAJP to take three sides of a triangle and print it is a valid triangle or not using if else statement.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first side of Triangle");
		int side1 =sc.nextInt();
		System.out.println("Enter second side of Triangle");
		int side2 = sc.nextInt();
		System.out.println("Enter third side of Triangle");
		int side3 =sc.nextInt();
		
		if((side1 + side2 >side3) && (side2 + side3 > side1) && (side3 + side1 > side2) ) {
			System.out.println("Valid Triangle");
		}else 
			System.out.println("Invalid Triangle");
	}
}
