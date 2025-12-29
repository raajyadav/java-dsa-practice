package flowControl;

import java.util.Scanner;

public class ValidTriangleCheck {
	
	public static void main(String[] args) {
//		WAJP to take three angles of a triangle from user and print triangle is valid or not using if else statement.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first angle of Triangle");
		int angle1 =sc.nextInt();
		System.out.println("Enter second angle of Triangle");
		int angle2 = sc.nextInt();
		System.out.println("Enter third angle of Triangle");
		int angle3 =sc.nextInt();
		
		if((angle1 + angle2 + angle3 == 180) && (angle1 >0 && angle2>0 && angle3>0)) {
			System.out.println("valid Triangle");
		}else {
			System.out.println("Not a valid Triangle");
		}
	}

}
